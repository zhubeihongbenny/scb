package jp.co.dk.ip.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import jp.co.dk.ip.application.request.data.SortReq;
import jp.co.dk.ip.application.response.data.ErrorRes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.util.CollectionUtils;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.fastjson.JSONArray;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet; 
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;

/**.
 * ��ͨ�I���`�ƥ���ƥ��`
 */
public class Utils {

    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    /**.
     * �����Ф���ǩ`�Ȥ�ܞ�Q
     *
     * @param dateString ������
     * @return �ǩ`��
     */
    public static Date stringToDate(String dateString) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STRING);
        Date date = new Date();
        try {
            date = Utils.localDateTimetoDate(LocalDateTime.parse(dateString, dateFormat));
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return null;
        }
        return date;
    }

    /**.
     * ���`���ո���ȡ��
     * @return �ǩ`��
     */
    public static String getCurrentData() {

        // ���`���ո���ȡ��
        Date date = new Date();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STYLE_DATE);
        String dateString = dateFormat.format(Utils.toLocalDateTime(date));
        return dateString;
    }

    /**.
     * ���`�Еr�g��ȡ��
     * @return �ǩ`��
     */
    public static String getCurrentTime() {

        // ���`���ո���ȡ��
        Date date = new Date();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STYLE_TIME);
        String dateString = dateFormat.format(Utils.toLocalDateTime(date));
        return dateString;
    }

    /**.
     * �����Ф���ǩ`�Ȥ�ܞ�Q
     *
     * @param dateString ������
     * @return �ǩ`��
     */
    public static Date dateStringToDateMillSecond(String dateString) {

        // �����Ф��ո������O��
        String dateTransfer = setDateString(dateString);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STRING_UPPER);
        Date date = new Date();
        try {
            LocalDateTime localDateTime = null;
            localDateTime = LocalDateTime.parse(dateTransfer, dateFormat);
            ZoneId zoneId = ZoneId.systemDefault();
            ZonedDateTime zdt = localDateTime.atZone(zoneId);
            date = Date.from(zdt.toInstant());
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return null;
        }
        return date;
    }
    
    /**.
     * �����Ф���ǩ`�Ȥ�ܞ�Q
     *
     * @param dateString ������
     * @return �ǩ`��
     */
    public static Date dateStringToDateMillSecondByUpper(String dateString) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STRING_UPPER);
        Date date = new Date();
        try {
            LocalDateTime localDateTime = null;
            if (dateString.length() > Const.DATE_STRING_UPPER_LENGTH) {
            	dateString = dateString.substring(Const.COUNT_0, Const.DATE_STRING_UPPER_LENGTH);
            }
            localDateTime = LocalDateTime.parse(dateString, dateFormat);
            ZoneId zoneId = ZoneId.systemDefault();
            ZonedDateTime zdt = localDateTime.atZone(zoneId);
            date = Date.from(zdt.toInstant());
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return null;
        }
        return date;
    }

    /**.
     * �����Ф��ո������O��
     *
     * @param dateString ������
     * @return �����Хǩ`��
     */
    public static String setDateString(String dateString) {

        String dateTransfer = Const.EMPTY_STRING;
        if (Objects.equals(dateString.length(), Const.DATE_STRING_SECOND_MILL_LENGTH)) {
            dateTransfer = dateString.substring(Const.COUNT_0, Const.COUNT_4)
                    + Const.PATH_HAIFUN + dateString.substring(Const.COUNT_4, Const.COUNT_6)
                    + Const.PATH_HAIFUN + dateString.substring(Const.COUNT_6, Const.COUNT_8)
                    + Const.HANKAKU_SPACE + dateString.substring(Const.COUNT_8, Const.COUNT_10)
                    + Const.PATH_COLON + dateString.substring(Const.COUNT_10, Const.COUNT_12)
                    + Const.PATH_COLON + dateString.substring(Const.COUNT_12, Const.COUNT_14)
                    + Const.DOT + dateString.substring(Const.COUNT_14, dateString.length());
        }
        return dateTransfer;
    }

    /**.
     * �ǩ`�Ȥ��������Ф�ܞ�Q
     *
     * @param date �ǩ`��
     * @return ������
     */
    public static String dataToString(Date date) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STRING);
        String dateString = dateFormat.format(Utils.toLocalDateTime(date));
        return dateString;
    }

    /**.
     * �ߥ���Ĥ��Υǩ`�Ȥ��������Ф�ܞ�Q
     *
     * @param date �ǩ`��
     * @return ������
     */
    public static String dataToStringMillSecond(Date date) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STRING_SECOND);
        String dateString = dateFormat.format(Utils.toLocalDateTime(date));
        return dateString;
    }

    /**.
     * �ǩ`�Ȥ��������Ф�ܞ�Q
     *
     * @param date �ǩ`��
     * @return ������
     */
    public static String dataToStringNoTime(Date date) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(Const.DATE_STRING_NO_TIME);
        String dateString = dateFormat.format(Utils.toLocalDateTime(date));

        return dateString;
    }

    /**.
     * �ꥯ�����ȥ��`�ȥꥹ�Ȥ���JPA���`�Ȥ؉�Q
     *
     * @param sortReqList �ꥯ�����ȥ��`�ȥꥹ��
     * @param defaultSort �ǥ��ե���ȥ��`��
     * @return ���`��
     */
    public static Sort editSort(List<SortReq> sortReqList, Sort defaultSort) {

        if (CollectionUtils.isEmpty(sortReqList)) {
            return defaultSort;
        }

        List<Order> orderList = new ArrayList<Order>();
        for (SortReq sortReq : sortReqList) {
            orderList.add(
                    new Order(
                            !StringUtils.isEmpty(sortReq.getOrder()) && Const.SORT_ORDER_DESC.equals(sortReq.getOrder())
                                    ? Sort.Direction.DESC
                                    : Sort.Direction.ASC,
                            sortReq.getSortItem()));
        }

        return Sort.by(orderList);
    }

    /**.
     * JPA���`�Ȥ���SQL�Ĥ؉�Q
     *
     * @param sort ���`��
     * @return ���`��SQL��
     */
    public static String editSortSql(Sort sort) {

        if (sort == null || sort.isEmpty()) {
            return Const.EMPTY_STRING;
        }

        return Const.DBFieldName.ORDER_BY + sort.stream()
                .map(s -> decamelize(s.getProperty()) + Const.HANKAKU_SPACE + s.getDirection())
                .collect(Collectors.joining(Const.COMMA));
    }

    /**.
     * ������ӛ����_ӛ���ˉ�Q���ޤ���
     *
     * @param s �ƥ�����
     * @return �Y����������
     */
    private static String decamelize(final String s) {
        if (StringUtils.isEmpty(s)) {
            return null;
        }
        if (s.length() == 1) {
            return s.toLowerCase();
        }
        StringBuffer buf = new StringBuffer(40);
        int pos = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (Character.isUpperCase(s.charAt(i))) {
                if (buf.length() != 0) {
                    buf.append(Const.UNDERBAR_SINGLE_QUOTATION);
                }
                buf.append(s.substring(pos, i).toLowerCase());
                pos = i;
            }
        }
        if (buf.length() != 0) {
            buf.append(Const.UNDERBAR_SINGLE_QUOTATION);
        }
        buf.append(s.substring(pos, s.length()).toLowerCase());
        return buf.toString();
    }

    /**.
     * �������ՕrSQL�Ĥ�����
     *
     * @return �������ՕrSQL��
     */
    public static String editCurrentDateTimeSql() {

        return Const.STR_TO_DATE + Const.PARENTHESIS_LEFT + Const.SINGLE_QUOTATION_LEFT
                + LocalDateTime.now().format(DateTimeFormatter.ofPattern(Const.DATE_STYLE))
                + Const.SINGLE_QUOTATION_RIGHT + Const.COMMA + Const.HANKAKU_SPACE
                + Const.DATE_PARAMETER + Const.PARENTHESIS_RIGHT + Const.HANKAKU_SPACE;
    }

    /**.
     * @return boolean
     * @Description �ǩ`���쥳�`�ɤΥХ�ǩ`���������å� �����ͥ����å�
     * @Param value �ե���������
     **/
    public static boolean isNumeric(String value) {

        boolean result = true;
        Pattern pattern = Pattern.compile("[0-9]*");
        result = pattern.matcher(value).matches();
        return result;
    }

    /**.
     * @return boolean
     * @Description �ǩ`���쥳�`�ɤΥХ�ǩ`���������å�  ������å�
     * @Param value �ե��������ݣ�num ��
     **/
    public static boolean checkLength(String value, int num) {

        if (!StringUtils.isEmpty(value) && value.length() > num) {
            return true;
        }
        return false;
    }

    /**.
     * @return boolean
     * @Description �ǩ`���쥳�`�ɤΥХ�ǩ`���������å� �ո��ͥ����å�
     * @Param value �ե���������
     **/
    public static boolean isValidTime(String value) {

        boolean result = true;
        Pattern pattern = Pattern.compile(
                "[1-9]\\d{3}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])+(20|21|22|23|[0-1]\\d)[0-5]\\d[0-5]\\d");
        result = pattern.matcher(value).matches();
        return result;
    }

    /**.
     * @return boolean
     * @Description �ǩ`���쥳�`�ɤΥХ�ǩ`���������å� �ո��ͥ����å�
     * @Param value �ե���������
     **/
    public static boolean isValidTimeWithMs(String value) {

        boolean result = true;
        Pattern pattern = Pattern.compile(
                "[1-9]\\d{3}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])+(20|21|22|23|[0-1]\\d)[0-5]\\d[0-5]\\d[0-9]{3}");
        result = pattern.matcher(value).matches();
        return result;
    }

    /**.
     * @return boolean
     * @Description ��ʾ혥���`�����å�
     * @Param value ��ʾ�����
     **/
    public static boolean isValidDisplayOrder(String value) {

        long num = Long.valueOf(value);
        if (num < Const.DisplayOrderCheck.DISPLAY_ORDER_MIN || num > Const.DisplayOrderCheck.DISPLAY_ORDER_MAX) {
            return false;
        }
        return true;
    }

    /**.
     * URLEncoder
     *
     * @param value �I�킎
     * @return ��å��`��
     */
    public static String urlEncoder(String value) {

        if (StringUtils.isEmpty(value)) {
            return Const.EMPTY_STRING;
        }
        String result = value.replaceAll(Const.CSV_FILE_HANKAKU_SPACE, Const.CSV_FILE_PROCENT_20);
        try {
            result = URLEncoder.encode(result, Const.CSV_CREATE_UTF8);
        } catch (UnsupportedEncodingException e) {
            result = Const.EMPTY_STRING;
        }
        return result;
    }

    /**.
     * ����a��
     *
     * @param id ID���num ����
     * @return ������
     */
    public static String complementString(Long id, int num) {

        String str = id.toString();
        for (int i = str.length(); i < num; i++) {
            str = Const.ID_VALUE_0 + str;
        }
        return str;

    }

    /**.
     * combine string to csv field
     *
     * @param str csv field
     * @return csv field
     */
    public static String combinationString(String str, int num) {

        String resStr = Const.EMPTY_STRING;
        for (int i = Const.COUNT_0; i < num; i++) {
            resStr = str + Const.COMMA + resStr;
        }
        resStr = resStr.substring(Const.STRING_BEGIN, resStr.length() - Const.MANAGEMENTFILE.MINUS_1);
        return resStr;
    }

    /**.
     * �ꥹ�Ȥ��������Ф�����
     *
     * @param list �ρ㤹��ꥹ�ȡ�num ����
     * @return ������
     */
    public static String combinationListString(List<String> list) {

        // ����ޤ�׷��
        String resStr = Const.EMPTY_STRING;
        for (String str : list) {
            resStr += str + Const.COMMA;
        }
        // ĩβ�Υ���ޤ�����
        resStr = resStr.substring(Const.STRING_BEGIN, resStr.length() - Const.MANAGEMENTFILE.MINUS_1);
        return resStr;
    }

    /**.
    * �ե��`�������Ӌ��
    *
    * @param str ������Ӌ�㤹�댝��������
    * @return int ����
    */
    public static int getRowCount(String str) {

        String[] arrRN = new String[] {};
        String[] arrN = new String[] {};
        int countRN = Const.COUNT_0;

        arrRN = str.split(Const.NEW_LINE_SEPARATOR_RN);
        arrN = str.split(Const.NEW_LINE_SEPARATOR);
        int countN = Const.COUNT_0;
        countRN = arrRN.length;
        countN = arrN.length;

        if (countRN >= countN) {
            return countRN;
        } else {
            return countN;
        }
    }

    /**.
     * �ե��`��������ݤ�ȡ��
    *
     * @param str ������Ӌ�㤹�댝��������
    * @return String[] �ե��`��������ݤ�����
    */
    public static String[] getRowContent(String str) {

        String[] arrRN = new String[] {};
        String[] arrN = new String[] {};
        int countRN = Const.COUNT_0;

        arrRN = str.split(Const.NEW_LINE_SEPARATOR_RN);
        arrN = str.split(Const.NEW_LINE_SEPARATOR);
        int countN = Const.COUNT_0;
        countRN = arrRN.length;
        countN = arrN.length;

        if (countRN >= countN) {
            return arrRN;
        } else {
            return arrN;
        }
    }

    /**.
     * ���ȫ�����֤ˤ�ꡢ����������Ӌ��
    *
     * @param str ������Ӌ�㤹�댝��������
    * @return ����
    */
    public static int getValueRowCount(String str, int row, int lineNum) {

        int num = Const.COUNT_0;
        int rowCount = Const.COUNT_0;
        int count = Const.COUNT_0;
        double rowMath = Const.COUNT_0_00;
        String rowStr = Const.EMPTY_STRING;
        String[] rowArr = new String[] {};
        rowArr = getRowContent(str);
        for (int j = Const.COUNT_0; j < rowArr.length; j++) {
            rowStr = Const.EMPTY_STRING;
            rowStr = rowArr[j];
            num = Const.COUNT_0;
            for (int i = Const.COUNT_0; i < rowStr.length(); i++) {
                // һ��һ�����֤���
                char c = str.charAt(i);
                if (String.valueOf(c).getBytes().length > String.valueOf(c).length()) {
                    num++;
                    num++;
                } else if (String.valueOf(c).getBytes().length == String.valueOf(c).length()) {
                    num++;
                }
            }
            rowMath = (num - Const.COUNT_1) / lineNum;
            rowCount = (int) Math.ceil(rowMath) + Const.COUNT_1;
            count = count + rowCount;
        }

        if (count >= row) {
            return count;
        } else {
            return row;
        }
    }

    /**.
     * SQL���󥸥���������ֹ
    *
     * @param str SQL������
    * @return ����ܞ�Q���SQL������
    */
    public static String escapeSql(String str) {

        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() == Const.COUNT_1) {
            char strChar = str.charAt(Const.COUNT_0);
            switch (strChar) {
                case Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.SINGLE_QUOTATION_BEGORE:
                    sb.append(Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.SINGLE_QUOTATION_AFTER);
                    break;
                case Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.DOUBLE_QUOTATION_BEGORE:
                    sb.append(Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.DOUBLE_QUOTATION_AFTER);
                    break;
                case Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.PERCENT_BEGORE:
                    sb.append(Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.PERCENT_AFTER);
                    break;
                case Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.UNDERLINE_BEGORE:
                    sb.append(Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.UNDERLINE_AFTER);
                    break;
                case Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.LEFT_SLASH_BEGORE:
                    sb.append(Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.LEFT_SLASH_AFTER);
                    break;
                case Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.RIGHT_SLASH_BEGORE:
                    sb.append(Const.SQL_INJECTION.SQL_TRANSFERRED_MEANING.RIGHT_SLASH_AFTER);
                    break;
                default:
                    sb.append(strChar);
                    break;
            }
            return sb.toString();
        } else {
            return str;
        }
    }

    /**.
     * SQL�Υѥ��`���΂���ȡ��
    *
     * @param str �ѥ��`���΂�, split �����Ф�֤��륭�`��`��
    * @return String[] SQL�Υѥ��`���΂�������
    */
    public static String[] sqlParameterValue(String str, String split) {

        String[] arrStr = new String[] {};
        arrStr = str.split(split);
        return arrStr;
    }

    /**.
     * @Description �ԥ����ˤ΅g�Ŀ�ΥХ�ǩ`���������å�
     * @Param value �g�Ŀ����
     * @return ������ ����`���`��
     **/
    public static String checkPositionXY(String value) {

        String errCode = Const.EMPTY_STRING;

        boolean result2Keta = true;
        int maxLength2Keta = Const.P_2_KETA_9;
        Pattern pattern2Keta = Pattern.compile("\\d*\\.\\d{2}");

        boolean result1Keta = true;
        int maxLength1Keta = Const.P_1_KETA_8;
        Pattern pattern1Keta = Pattern.compile("\\d*\\.\\d{1}");

        boolean result0Keta = true;
        int maxLength0Keta = Const.P_0_KETA_6;
        Pattern pattern0Keta = Pattern.compile("\\d*");

        // ����������å�
        result2Keta = pattern2Keta.matcher(value).matches();
        result1Keta = pattern1Keta.matcher(value).matches();
        result0Keta = pattern0Keta.matcher(value).matches();

        // ����`���`�ɤ��O��
        if (result2Keta) {
            if (value.length() > maxLength2Keta) {
                errCode = Const.ECT010;
            }
        }
        if (result1Keta) {
            if (value.length() > maxLength1Keta) {
                errCode = Const.ECT010;
            }
        }
        if (result0Keta) {
            if (value.length() > maxLength0Keta) {
                errCode = Const.ECT010;
            }
        }

        // 2�졢1�졢0�������Έ���
        if (!result2Keta && !result1Keta && !result0Keta) {
            if (Const.EMPTY_STRING.equals(errCode)) {
                try {
                    Double.valueOf(value);
                } catch (RuntimeException e) {
                    logger.error(e.getMessage(), e);
                    errCode = Const.ECT009;
                }
            }
        }
        return errCode;
    }
    
    /**.
     * �Օr����LocalDateTime��ܞ�Q
     *
     * @param date �Օr
     * @return LocalDateTime
     */
    public static LocalDateTime toLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.of(Const.TIMEZONE_JST, ZoneId.SHORT_IDS)).toLocalDateTime();
    }

    /**.
     * LocalDateTime�����Օr��ܞ�Q
     *
     * @param localDateTime ��`����r�g
     * @return �Օr
     */
    public static Date localDateTimetoDate(LocalDateTime localDateTime) {

        return Date.from(localDateTime.atZone(ZoneId.of(Const.TIMEZONE_JST, ZoneId.SHORT_IDS)).toInstant());

    }

    /**.
     * ��ͨ����`����I��
     *
     * @param resultCode �I���`��
     * @param count �I�����
     * @param messageCode �I���å��`�����`��
     * @param message �I���å��`��
     * @param messageContent �I���å��`���ѥ��`��
     * @return ��ͨ����`
     */
    @SuppressWarnings("rawtypes")
    public static ErrorRes customHandleException(
            String resultCode,
            Integer count,
            String messageCode,
            String message,
            String... messageContent) {

        ErrorRes errorRes = new ErrorRes();
        errorRes.setResultCode(resultCode);
        errorRes.setResultCnt(count);
        errorRes.setMessageCode(messageCode);
        errorRes.setMessage(message);
        if (!Objects.equals(messageContent, null)) {
            errorRes.setMessageContent(messageContent);
        }
        return errorRes;
    }
    
	/**
	 * MultipartFile to File
	 *
	 * @param file
	 * @throws Exception
	 */
	public static File convertToFile(MultipartFile multipartFile) throws IOException {
		
		File file = null;
        file = new File(multipartFile.getOriginalFilename());
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(multipartFile.getBytes());
		fos.close();
		return file;
	}
 
    /**
     * delete temp file
     * @param file
     */
    public static void deleteTempFile(File file) {
    	
        if (file != null) {
            File del = new File(file.toURI());
            del.delete();
        }
    }
    
	public static void httpAsncClient() {

		CloseableHttpAsyncClient httpAsyncClient = HttpAsyncClients.createDefault();
		httpAsyncClient.start();

		final CountDownLatch latch = new CountDownLatch(1);
		final HttpGet request = new HttpGet("https://www.alipay.com/");

		System.out.println(" caller thread id is : " + Thread.currentThread().getId());

		httpAsyncClient.execute(request, new FutureCallback<HttpResponse>() {
			@Override
			public void completed(final HttpResponse response) {
				latch.countDown();
				System.out.println(" callback thread id is : " + Thread.currentThread().getId());
				System.out.println(request.getRequestLine() + "->" + response.getStatusLine());
				try {
					String content = EntityUtils.toString(response.getEntity(), "UTF-8");
					System.out.println(" response content is : " + content);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			@Override
			public void failed(final Exception ex) {
				latch.countDown();
				System.out.println(request.getRequestLine() + "->" + ex);
				System.out.println(" callback thread id is : " + Thread.currentThread().getId());
			}

			@Override
			public void cancelled() {
				latch.countDown();
				System.out.println(request.getRequestLine() + " cancelled");
				System.out.println(" callback thread id is : " + Thread.currentThread().getId());
			}

		});
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			httpAsyncClient.close();
		} catch (IOException ignore) {

		}
	}
	
	// booking queue
	private static List<Object> bookingList = new ArrayList<Object>();
	
	// room queue
	private static List<Object> roomList = new ArrayList<Object>();
	
    /**
     * enter into booking stack
     * @param obj object
     */
	public static void jinZhanBookingQueue(Object obj) {
		
		// 进栈处理
		bookingList.add(obj);
	}

    /**
     * get out of booking stack
     * @param t object
     */
	public static <T> void removeBookingQueue(T t) {
		
		// 出栈处理
		bookingList.remove(t);
	}
	
    /**
     * get out of booking stack
     * @param t object
     */
	@SuppressWarnings("unchecked")
	public static <T> T chuZhanBookingQueue() {
		
		// 出栈处理
		return (T) bookingList;
	}
	
    /**
     * enter into booking stack
     * @param obj object
     */
	public static int getBookingListSize() {
		
		// get array call back list size 
		int size = Const.COUNT_0;
		size = bookingList.size();
		
		return size;
	}
	
    /**
     * enter into room stack
     * @param obj object
     */
	public static void jinZhanRoomQueue(Object obj) {
		
		// 进栈处理
		roomList.add(obj);
	}

    /**
     * get out of room stack
     * @param t object
     */
	public static <T> void removeRoomQueue(T t) {
		
		// 出栈处理
		roomList.remove(t);
	}
	
    /**
     * get out of room stack
     * @param t object
     */
	@SuppressWarnings("unchecked")
	public static <T> T chuZhanRoomQueue() {
		
		// 出栈处理
		return (T) roomList;
	}
	
    /**
     * enter into room stack
     * @param obj object
     */
	public static int getRoomListSize() {
		
		// get array room list size 
		int size = Const.COUNT_0;
		size = roomList.size();
		
		return size;
	}
	
    /**
     * object transfer
     * @param dest object, orig object
	 * @throws InvocationTargetException, IllegalAccessException
     * @return none
     */
	public static void copyProperties(Object dest, Object orig)
			throws InvocationTargetException, IllegalAccessException {
		BeanUtils.copyProperties(dest, orig);
	}
	
	/**
	 * create MD5 code by 16bit
	 */
	public static String stringToMD5Bit16(String inStr) {

		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance(Const.SIGN_MD5);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return Const.EMPTY_STRING;
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			byteArray[i] = (byte) charArray[i];
		}
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append(Const.STRING_0);
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	/**
	 * create MD5 code by 32bit
	 */
    public static String stringToMD5Bit32(String inStr) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance(Const.SIGN_MD5).digest(inStr.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = Const.STRING_0 + md5code;
        }
        return md5code;
    }
    
	/**
	 * spring自带的工具DigestUtils实现 
	 */
    public static String stringToMD5(String inStr) {
    	
    	String md5Str = Const.EMPTY_STRING;
    	if (!StringUtils.isEmpty(inStr)) {
    		md5Str = DigestUtils.md5DigestAsHex(inStr.getBytes());	
    	} else {
    		md5Str = Const.EMPTY_STRING;
    	}
    	return md5Str;
    }

	// 根据Unicode编码完美的判断中文汉字和符号
	public static boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
			return true;
		}
		return false;
	}

	// 判断是否为空
	@SuppressWarnings("rawtypes")
	public static boolean isObjectEmpty(Object obj) {
		if (obj == null) {
			return true;
		} else if (obj instanceof String && (obj.toString().trim().equals(""))) {
			return true;
		} else if (obj instanceof Number && ((Number) obj).doubleValue() < 0) {
			return true;
		} else if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Map && ((Map) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Object[] && ((Object[]) obj).length == 0) {
			return true;
		}
		return false;
	}

	// decode字符串
	public static String getDecode(Map<String, String[]> map, String field) {
		String decodeStr = Const.EMPTY_STRING;
		String value = Const.EMPTY_STRING;
		try {
			if (!isEmpty(map)) {
				value = String.valueOf(map.get(field)[0]);
			}
			if (!StringUtils.isEmpty(value)) {
				decodeStr = URLDecoder.decode(value, "UTF-8");
			}
		} catch (Exception e) {
			return null;
		}
		return decodeStr;
	}

	// 获取redis的数组插入对象
	public static String getRedisArrStr(String str) {
		JSONArray jsonArr = new JSONArray();
		jsonArr = JSONArray.parseArray(str);
		String getStr = Const.EMPTY_STRING;
		if (!CollectionUtils.isEmpty(jsonArr)) {
			for (int i = 0; i < jsonArr.size(); i++) {
				getStr += String.valueOf(jsonArr.get(i)) + ",";
			}
			getStr = getStr.substring(0, getStr.length() - 1);
		}
		return getStr;
	}

	// decode字符串
	public static String getStringDecode(String value) {
		String decodeStr = Const.EMPTY_STRING;
		try {
			if (!StringUtils.isEmpty(value)) {
				decodeStr = URLDecoder.decode(value, "UTF-8");
			}
		} catch (Exception e) {
			return null;
		}
		return decodeStr;
	}
	
	// 判断是否为空
	public static boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		} else if (obj instanceof String && (obj.toString().trim().equals(""))) {
			return true;
		} else if (obj instanceof Number && ((Number) obj).doubleValue() < 0) {
			return true;
		} else if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Map && ((Map) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Object[] && ((Object[]) obj).length == 0) {
			return true;
		}
//		else if (checkObjAllFieldsIsNull(obj)) {
//			return true;
//		}
		return false;
	}
	
	// 判断对象中的属性值是否都为null
	// f.get(object) 获取属性值
	public static boolean checkObjAllFieldsIsNull(Object object) {
	    if (null == object) {
		      return true;
		}
	    try {
			for (Field f : object.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				if (f.get(object) != null && !StringUtils.isEmpty(f.get(object).toString())) {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return true;
	}
	
	// 判断是否为空
	public static boolean isAllEmpty(Object obj) {
		if (obj == null) {
			return true;
		} else if (obj instanceof String && (obj.toString().trim().equals(""))) {
			return true;
		} else if (obj instanceof Number && ((Number) obj).doubleValue() < 0) {
			return true;
		} else if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Map && ((Map) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Object[] && ((Object[]) obj).length == 0) {
			return true;
		} else if (checkObjAllFieldsIsNull(obj)) {
			return true;
		}
		return false;
	}

	// decode字符串
	public static String getRedisDecode(Map<String, String[]> map, String field) {
		String decodeStr = Const.EMPTY_STRING;
		String value = Const.EMPTY_STRING;
		Object object = new Object();
		try {
			if (!isEmpty(map)) {
				if (!isEmpty(map.get(field))) {
					value = String.valueOf(map.get(field)[0]);
				}
			}
			if (!StringUtils.isEmpty(value)) {
				decodeStr = URLDecoder.decode(value, "UTF-8");
			}
		} catch (Exception e) {
			return null;
		}
		return decodeStr;
	}

    /**
     * 获取redis的数组插入对象
     * @param str
     * @return String
     */
	public static String getArrStr(String str) {
		JSONArray jsonArr = new JSONArray();
		jsonArr = JSONArray.parseArray(str);
		String getStr = Const.EMPTY_STRING;
		if (!CollectionUtils.isEmpty(jsonArr)) {
			for (int i = 0; i < jsonArr.size(); i++) {
				getStr += String.valueOf(jsonArr.get(i)) + ",";
			}
			getStr = getStr.substring(0, getStr.length() - 1);
		}
		return getStr;
	}

    /**
     * decode字符串
     * @param value
     * @return String
     */
	public static String getDecode(String value) {
		String decodeStr = Const.EMPTY_STRING;
		try {
			if (!StringUtils.isEmpty(value)) {
				decodeStr = URLDecoder.decode(value, "UTF-8");
			} else {
				decodeStr = null;
			}
		} catch (Exception e) {
			return null;
		}
		return decodeStr;
	}
	
    /**
     * 获取redis的数组插入对象
     * @param str
     * @return String
     */
	public static String getArrStrBySet(Set<Integer> setInt) {
		String getStr = Const.EMPTY_STRING;
		for (Integer num: setInt) {
			getStr += String.valueOf(num) + ",";
		}
		if (!StringUtils.isEmpty(getStr)) {
			getStr = getStr.substring(0, getStr.length() - 1);
		}
		return getStr;
	}
	
    /**
     * 非null属性的对象copy
     * @param src
     * @param target
     * @return String
     */
    public static void copyPropertiesIgnoreNull(Object src, Object target) {
    	BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
    }
    
    /**
     * 获取null的数组对象
     * @param source
     * @return String
     */
    private static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();
 
        Set<String> emptyNames = new HashSet<String>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
	
    /**
     * sleep
     * @param millseconds
     * @return
     */
	public static void sleep(Long millSeconds) {
		try {
			Thread.sleep(millSeconds);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}
	
    /**
     * get num
     * @param input
     * @return Integer
     */
	public static Integer getIntegerByNull(String input) {
		
		Integer num = 0;
		if (!StringUtils.isEmpty(input)) {
			num = Integer.valueOf(input);
		} else {
			num = 0;
		}
		return num;
	}
	
	/**
	 * 空值设定
	 * @param value
	 * @return String
	 */
	public static String setEmpty(String value) {
		String result = "";
		if (StringUtils.isEmpty(value)) {
			result = "";
		} else {
			result = value;
		}
		return result;
	}
}
