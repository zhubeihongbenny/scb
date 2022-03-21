package jp.co.dk.ip.application.controller;

import javax.validation.Valid;

import jp.co.dk.ip.application.request.APIBookingReq;
import jp.co.dk.ip.application.response.APIBookingRes;
import jp.co.dk.ip.common.*;
import jp.co.dk.ip.domain.service.APIBookingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * book controller
 */
@RestController
@RequestMapping("/api")
public class APIBookingController {

    private static final Logger logger = LoggerFactory.getLogger(APIBookingController.class);

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private SettingContext settingContext;
    
    @Autowired
    private APIBookingService apiBookingService;

    @PostMapping("/APIBOOKING")
	private APIBookingRes agentDataProcess(@RequestBody @Valid APIBookingReq apiBookingReq, BindingResult bindingResult) {
    	
        logger.debug("APIAgentFakeRes agentDataProcess");

        APIBookingRes apiBookingRes = new APIBookingRes();

        // 单项目验证
        if (bindingResult.hasErrors()) {
            WrapperUtils wrapperUtils = new WrapperUtils();
            bindingResult.getFieldErrors().stream().forEach(fieldError -> {
                String fieldName = String.valueOf(fieldError.getField());
                String message = Const.BRACKET_LEFT + fieldName + Const.BRACKET_RIGHT + fieldError.getDefaultMessage();
                wrapperUtils.setErrMsg(message);
                logger.error(Const.FIELD_ERROR + Const.ERROR_CODE + fieldError.getCode());
                logger.error(Const.FIELD_ERROR + Const.ERROR_MSG + wrapperUtils.getErrMsg());
            });
            return apiBookingService.getErrRes(new String[] {}, Const.RESULT_CODE_9, Const.E000001, Const.FIELD_ERROR, wrapperUtils.getErrMsg());
        }

        try {
        	// response获取
        	apiBookingRes = apiBookingService.bookingProcess(apiBookingReq);
        } catch (CustomHandleException e) {
            logger.error(Const.ERRRES_APIAGENT + e.getMessage(), e);
            apiBookingRes = apiBookingService.setErrRes(e);
        } catch (Exception e) {
            logger.error(Const.ERRRES_APIAGENT + e.getMessage(), e);
            apiBookingRes = apiBookingService.getErrRes(new String[] {}, Const.RESULT_CODE_9, Const.E000016, Const.ERRRES_APIAGENTORDERRESULT);
        }

        return apiBookingRes;
    }
}
