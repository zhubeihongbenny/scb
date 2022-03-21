package jp.co.dk.ip.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

import jp.co.dk.ip.application.request.APIBookingReq;
import jp.co.dk.ip.application.response.APIBookingRes;
import jp.co.dk.ip.application.response.data.BookingModelRes;
import jp.co.dk.ip.application.response.data.ErrorRes;
import jp.co.dk.ip.common.Const;
import jp.co.dk.ip.common.CustomHandleException;
import jp.co.dk.ip.common.SettingContext;
import jp.co.dk.ip.common.Utils;
import jp.co.dk.ip.domain.model.BookingModel;
import jp.co.dk.ip.domain.model.RoomModel;

/**
 * book service
 */
@Service
public class APIBookingService {

    private static final Logger logger = LoggerFactory.getLogger(APIBookingService.class);

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private SettingContext settingContext;
    
    /**
     * booking process
     *
     * @param apiBookingReq
     * @return clients result
     */
	public APIBookingRes bookingProcess(APIBookingReq apiBookingReq) throws Exception {

        logger.debug("APIBookingService bookingProcess");

        try {
        	APIBookingRes apiBookingRes = new APIBookingRes();

			// check booking is available or not
        	List<RoomModel> roomModels = new ArrayList<RoomModel>();
			List<BookingModelRes> bookingModelResList = new ArrayList<BookingModelRes>();
        	if (Objects.equals(Utils.getRoomListSize(), Const.COUNT_0)) {
        		roomModels = Utils.chuZhanRoomQueue();
        		for (RoomModel roomModel : roomModels) {
        			if (Objects.equals(roomModel.getHotelName(), apiBookingReq.getHotelName()) 
        					&& Objects.equals(roomModel.getRoomNumber(), apiBookingReq.getRoomNumber())) {
        				if (Long.valueOf(apiBookingReq.getCheckInDate()) < Long.valueOf(roomModel.getDateBegin())
        						&& Long.valueOf(apiBookingReq.getCheckOutDate()) > Long.valueOf(roomModel.getDateEnd())) {
        					BookingModelRes bookingModelRes = new BookingModelRes();
        					Utils.copyPropertiesIgnoreNull(apiBookingReq, bookingModelRes);
        					bookingModelResList.add(bookingModelRes);
        					
        		        	// save book
        					BookingModel bookingModel = new BookingModel();
        					Utils.copyPropertiesIgnoreNull(apiBookingReq, bookingModel);
        					Utils.jinZhanBookingQueue(bookingModel);
        				}
        			}
        		}
        	}
			
			apiBookingRes.setResultCode(Const.RESULT_CODE_0);
			apiBookingRes.setResultCnt(bookingModelResList.size());
			apiBookingRes.setBookingModelResList(bookingModelResList);
			return apiBookingRes;
        } catch (PessimisticLockingFailureException plfEx) {
            // DB排他
            logger.error(plfEx.getMessage(), plfEx);
            ErrorRes errorRes = new ErrorRes();
            String message = Const.EMPTY_STRING;
            message = messageSource.getMessage(
            		Const.E000048,
            		new String[] {},
                    Locale.forLanguageTag(settingContext.getLangZh()));
            logger.error(Const.ERRRES_APIAUTHORY + Const.ERROR_MSG + message);
            errorRes = Utils.customHandleException(Const.RESULT_CODE_3, Const.RESULT_CNT_0, Const.E000048, message);
            throw new CustomHandleException(errorRes);
        } catch (DataAccessException daEx) {
            logger.error(daEx.getMessage(), daEx);
            ErrorRes errorRes = new ErrorRes();
            String message = Const.EMPTY_STRING;
            message = messageSource.getMessage(
            		Const.E000015, 
            		new String[] {},
                    Locale.forLanguageTag(settingContext.getLangZh()));
            logger.error(Const.ERRRES_APIAUTHORY + Const.ERROR_MSG + message);
            errorRes = Utils.customHandleException(Const.RESULT_CODE_9, Const.RESULT_CNT_0, Const.E000015, message);
            throw new CustomHandleException(errorRes);
		} catch (RuntimeException runEx) {
            logger.error(runEx.getMessage(), runEx);
			ErrorRes errorRes = new ErrorRes();
            String message = Const.EMPTY_STRING;
			message = messageSource.getMessage(
					Const.E000005, 
					new String[] {},
					Locale.forLanguageTag(settingContext.getLangZh()));
            logger.error(Const.ERRRES_APIAUTHORY + Const.ERROR_MSG + message);
            errorRes = Utils.customHandleException(Const.RESULT_CODE_9, Const.RESULT_CNT_0, Const.E000005, message);
            throw new CustomHandleException(errorRes);	
		}
    }

    /**.
     * 错误信息取得
     *
     * @param param 错误参数
     * @param resultCode 返回code
     * @param errorCode 错误code
     * @param logError 错误log说明
     * @return response class
     */
    public APIBookingRes getErrRes(String[] param, String resultCode, String errorCode, String logError, String... message) {

        logger.debug("APIMicroLoginService getErrRes");

        APIBookingRes apiAgentOrderInfoCallBackFakeRes = new APIBookingRes();
        String errMsg = Const.EMPTY_STRING;
        if (Utils.isEmpty(message)) {
            errMsg = messageSource.getMessage(errorCode, param, Locale.forLanguageTag(settingContext.getLangZh()));
        } else {
            errMsg = message[Const.COUNT_0];
        }
        logger.error(logError + Const.ERROR_CODE + errorCode);
        logger.error(logError + Const.ERROR_MSG + errMsg);
        apiAgentOrderInfoCallBackFakeRes.setResultCode(resultCode);
        apiAgentOrderInfoCallBackFakeRes.setMessageCode(errorCode);
        apiAgentOrderInfoCallBackFakeRes.setMessage(errMsg);
        return apiAgentOrderInfoCallBackFakeRes;
    }
    
    /**.
     * 单项目错误信息取得
     *
     * @param param 错误参数
     * @param errorCode 错误code
     * @param fieldName 字段中文名
     * @return APIClientRes response class
     */
    public APIBookingRes getReqErr(String[] param, String errorCode, String fieldName) {

        logger.debug("APIAgentFakeService getReqErr");

        String errMsg = messageSource.getMessage(errorCode, param, Locale.forLanguageTag(settingContext.getLangZh()));
        String msg = Const.BRACKET_LEFT + fieldName + Const.BRACKET_RIGHT + errMsg;
        logger.error(Const.FIELD_ERROR + Const.ERROR_CODE + errorCode);
        logger.error(Const.FIELD_ERROR + Const.ERROR_MSG + msg);
        return getErrRes(new String[] {}, Const.RESULT_CODE_9, Const.EIF001, Const.FIELD_ERROR);
    }

    /**.
     * 错误信息设定
     *
     * @param e 自定义错误获取类
     * @return response class
     */
    public APIBookingRes setErrRes(CustomHandleException e) {

        logger.debug("APIAgentFakeService setErrRes");

        APIBookingRes apiBookingRes = new APIBookingRes();
        apiBookingRes.setResultCode(e.getErrorMessage().getResultCode());
        apiBookingRes.setResultCnt(e.getErrorMessage().getResultCnt());
        apiBookingRes.setMessageCode(e.getErrorMessage().getMessageCode());
        apiBookingRes.setMessage(e.getErrorMessage().getMessage());
        return apiBookingRes;
    }
}
