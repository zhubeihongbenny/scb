package jp.co.dk.ip.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

public class MapSort {

    /**.
     * key和value的map
     */
    private static Map<String, String> map = new HashMap<String, String>();

    /**.
     * HashMapキー名とバリューのマップ取得
     * @return map キー名とバリューのマップ
     */
    private static Map<String, String> getMap() {

        // HashMapにキー名とバリューを入れる(DBフィールド)
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(Const.DBFieldName.BUILDING_ID_BUTURIMEI, Const.DBFieldName.BUILDING_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.BUILDING_NAME_BUTURIMEI, Const.DBFieldName.BUILDING_NAME_RORIMEI);
        hashMap.put(Const.DBFieldName.ADDRESS_NUMBER_BUTURIMEI, Const.DBFieldName.ADDRESS_NUMBER_RORIMEI);
        hashMap.put(Const.DBFieldName.ADDRESS_CITY_BUTURIMEI, Const.DBFieldName.ADDRESS_CITY_RORIMEI);
        hashMap.put(Const.DBFieldName.ADDRESS_PREFECTURE_BUTURIMEI, Const.DBFieldName.ADDRESS_PREFECTURE_RORIMEI);
        hashMap.put(Const.DBFieldName.USER_ID_BUTURIMEI, Const.DBFieldName.USER_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.PROJECT_ID_BUTURIMEI, Const.DBFieldName.PROJECT_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.BIG_PROCESS_ID_BUTURIMEI, Const.DBFieldName.BIG_PROCESS_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.PROCESS_ID_BUTURIMEI, Const.DBFieldName.PROCESS_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.PROCESSES_BUTURIMEI, Const.DBFieldName.PROCESSES_RORIMEI);
        hashMap.put(Const.DBFieldName.UPDATED_BY_BUTURIMEI, Const.DBFieldName.UPDATED_BY_RORIMEI);
        hashMap.put(Const.DBFieldName.DRAWING_ID_BUTURIMEI, Const.DBFieldName.DRAWING_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.UNIT_ID_BUTURIMEI, Const.DBFieldName.UNIT_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.MODEL_KBN_BUTURIMEI, Const.DBFieldName.MODEL_KBN_RORIMEI);
        hashMap.put(Const.DBFieldName.POSITION_X_BUTURIMEI, Const.DBFieldName.POSITION_X_RORIMEI);
        hashMap.put(Const.DBFieldName.POSITION_Y_BUTURIMEI, Const.DBFieldName.POSITION_Y_RORIMEI);
        hashMap.put(Const.DBFieldName.INSTALLED_FLG_BUTURIMEI, Const.DBFieldName.INSTALLED_FLG_RORIMEI);
        hashMap.put(Const.DBFieldName.ENTRY_USER_BUTURIMEI, Const.DBFieldName.ENTRY_USER_RORIMEI);
        hashMap.put(Const.DBFieldName.PIN_ID_BUTURIMEI, Const.DBFieldName.PIN_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.UPDATE_DATETIME_BUTURIMEI, Const.DBFieldName.UPDATE_DATETIME_RORIMEI);
        hashMap.put(Const.DBFieldName.UPDATE_USER_BUTURIMEI, Const.DBFieldName.UPDATE_USER_RORIMEI);
        hashMap.put(Const.DBFieldName.UPDATE_REQ_USER_BUTURIMEI, Const.DBFieldName.UPDATE_REQ_USER_RORIMEI);
        hashMap.put(Const.DBFieldName.WORK_NAME_BUTURIMEI, Const.DBFieldName.WORK_NAME_RORIMEI);
        hashMap.put(Const.DBFieldName.DISPLAY_ORDER_BUTURIMEI, Const.DBFieldName.DISPLAY_ORDER_RORIMEI);
        hashMap.put(Const.DBFieldName.CREATED_BY_BUTURIMEI, Const.DBFieldName.CREATED_BY_RORIMEI);
        hashMap.put(Const.DBFieldName.PROCESS_NAME_BUTURIMEI, Const.DBFieldName.PROCESS_NAME_RORIMEI);
        hashMap.put(Const.DBFieldName.WORK_ID_BUTURIMEI, Const.DBFieldName.WORK_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.WORKS_BUTURIMEI, Const.DBFieldName.WORKS_RORIMEI);
        hashMap.put(Const.DBFieldName.SERIAL_NO_BUTURIMEI, Const.DBFieldName.SERIAL_NO_RORIMEI);
        hashMap.put(Const.DBFieldName.IS_ACCOUNT_LOCK_BUTURIMEI, Const.DBFieldName.IS_ACCOUNT_LOCK_RORIMEI);
        hashMap.put(Const.DBFieldName.SORT_ITEM_BUTURIMEI, Const.DBFieldName.SORT_ITEM_RORIMEI);
        hashMap.put(Const.DBFieldName.ORDER_BUTURIMEI, Const.DBFieldName.ORDER_RORIMEI);
        hashMap.put(Const.DBFieldName.MODELTYPE_BUTURIMEI, Const.DBFieldName.MODELTYPE_RORIMEI);
        hashMap.put(Const.DBFieldName.SERIALNUMBER_BUTURIMEI, Const.DBFieldName.SERIALNUMBER_RORIMEI);
        hashMap.put(Const.DBFieldName.PRODUCTIONDATE_BUTURIMEI, Const.DBFieldName.PRODUCTIONDATE_RORIMEI);
        hashMap.put(Const.DBFieldName.FLOOR_ID_BUTURIMEI, Const.DBFieldName.FLOOR_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.UPDATED_USERID_BUTURIMEI, Const.DBFieldName.UPDATED_USERID_RORIMEI);
        hashMap.put(Const.DBFieldName.ACCOUNTLIST_BUTURIMEI, Const.DBFieldName.ACCOUNTLIST_RORIMEI);
        hashMap.put(Const.DBFieldName.AUTHORITY_ID_BUTURIMEI, Const.DBFieldName.AUTHORITY_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.USE_FUNCTION_ID_BUTURIMEI, Const.DBFieldName.USE_FUNCTION_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTOS_BUTURIMEI, Const.DBFieldName.PHOTOS_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_TERMINAL_NUMBER_BUTURIMEI, Const.DBFieldName.PHOTO_TERMINAL_NUMBER_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_DATE_BUTURIMEI, Const.DBFieldName.PHOTO_DATE_RORIMEI);
        hashMap.put(Const.DBFieldName.TERMINAL_ID_BUTURIMEI, Const.DBFieldName.TERMINAL_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.MACHINE_ID_BUTURIMEI, Const.DBFieldName.MACHINE_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.TIMING_ID_BUTURIMEI, Const.DBFieldName.TIMING_ID_RORIMEI);
        hashMap.put(Const.DBFieldName.WITNESS_BUTURIMEI, Const.DBFieldName.WITNESS_RORIMEI);
        hashMap.put(Const.DBFieldName.FREE_BUTURIMEI, Const.DBFieldName.FREE_RORIMEI);
        hashMap.put(Const.DBFieldName.IS_BLACKBOARD_DISPLAY_BUTURIMEI, Const.DBFieldName.IS_BLACKBOARD_DISPLAY_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_USER_BUTURIMEI, Const.DBFieldName.PHOTO_USER_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_PATH_BUTURIMEI, Const.DBFieldName.PHOTO_PATH_RORIMEI);
        hashMap.put(Const.DBFieldName.IS_OUTPUT_PHOTO_BOOK_BUTURIMEI, Const.DBFieldName.IS_OUTPUT_PHOTO_BOOK_RORIMEI);
        hashMap.put(Const.DBFieldName.IS_DELETED_BUTURIMEI, Const.DBFieldName.IS_DELETED_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_TERMINAL_NUM_BUTURIMEI, Const.DBFieldName.PHOTO_TERMINAL_NUM_RORIMEI);
        hashMap.put(Const.DBFieldName.DELETEPHOTOS_BUTURIMEI, Const.DBFieldName.DELETEPHOTOS_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_FILE_BUTURIMEI, Const.DBFieldName.PHOTO_FILE_RORIMEI);
        hashMap.put(Const.DBFieldName.DEVICE_CODE_BUTURIMEI, Const.DBFieldName.DEVICE_CODE_RORIMEI);
        hashMap.put(Const.DBFieldName.UPDATE_USER_LIST_BUTURIMEI, Const.DBFieldName.UPDATE_USER_LIST_RORIMEI);
        hashMap.put(Const.DBFieldName.IS_ACCESS_APPROVAL_BUTURIMEI, Const.DBFieldName.IS_ACCESS_APPROVAL_RORIMEI);
        hashMap.put(Const.DBFieldName.OUTPUT_ORDER_PATTERN_BUTURIMEI, Const.DBFieldName.OUTPUT_ORDER_PATTERN_RORIMEI);
        hashMap.put(Const.DBFieldName.CSV_FILE_BUTURIMEI, Const.DBFieldName.CSV_FILE_RORIMEI);
        hashMap.put(Const.DBFieldName.DELETE_PHOTO_LIST_BUTURIMEI, Const.DBFieldName.DELETE_PHOTO_LIST_RORIMEI);
        hashMap.put(Const.DBFieldName.PROCESS_DISPLAY_ORDER_BUTURIMEI, Const.DBFieldName.PROCESS_DISPLAY_ORDER_RORIMEI);
        hashMap.put(Const.DBFieldName.WORK_DISPLAY_ORDER_BUTURIMEI, Const.DBFieldName.WORK_DISPLAY_ORDER_RORIMEI);
        hashMap.put(Const.DBFieldName.PROCESSLIST_BUTURIMEI, Const.DBFieldName.PROCESSLIST_RORIMEI);
        hashMap.put(Const.DBFieldName.WORKLIST_BUTURIMEI, Const.DBFieldName.WORKLIST_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO_LIST_BUTURIMEI, Const.DBFieldName.PHOTO_LIST_RORIMEI);
        hashMap.put(Const.DBFieldName.IS_INSTALLED_BUTURIMEI, Const.DBFieldName.IS_INSTALLED_RORIMEI);
        hashMap.put(Const.DBFieldName.ACCOUNT_INFO_LIST_BUTURIMEI, Const.DBFieldName.ACCOUNT_INFO_LIST_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO.BUILDINGPROJECT_BUTURIMEI, Const.DBFieldName.PHOTO.BUILDINGPROJECT_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO.OUTPUTPERPAGE_BUTURIMEI, Const.DBFieldName.PHOTO.OUTPUTPERPAGE_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO.REPORTOUTPUTCLASS_BUTURIMEI, Const.DBFieldName.PHOTO.REPORTOUTPUTCLASS_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO.OUTPUT_RAYOUT_REQ_BUTURIMEI, Const.DBFieldName.PHOTO.OUTPUT_RAYOUT_REQ_RORIMEI);
        hashMap.put(Const.DBFieldName.PHOTO.OUTPUT_INFO_LIST_BUTURIMEI, Const.DBFieldName.PHOTO.OUTPUT_INFO_LIST_RORIMEI);
        hashMap.put(Const.DBFieldName.FIRST_LOGIN_FAIL_COUNT_BUTURIMEI, Const.DBFieldName.FIRST_LOGIN_FAIL_COUNT_RORIMEI);

        // Excelのセル文字行数と文字サイズ
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_1),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_18));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_2),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_16_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_3),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_15_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_4),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_14_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_5),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_13_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_6),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_12_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_7),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_11_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_8),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_10_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_9),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_9_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_10),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_8_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_11),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_7_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_12),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_6_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_13),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_5_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_14),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_4_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_15),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_3_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_16),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_2_5));
        hashMap.put(Const.EXCEL_OUTPUT.EXCEL_LINE + String.valueOf(Const.EXCEL_OUTPUT.ITEM_COUNT_17),
                String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_1_5));

        // Excelのセル文字サイズと一行の桁数
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_18), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_35_1));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_16_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_35_2));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_15_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_39_3));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_14_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_44_4));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_13_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_44_5));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_12_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_50_6));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_11_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_50_7));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_10_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_59_8));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_9_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_59_9));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_8_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_71_10));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_7_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_71_11));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_6_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_87_12));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_5_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_114_13));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_4_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_133_14));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_3_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_160_15));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_2_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_268_16));
        hashMap.put(String.valueOf(Const.EXCEL_OUTPUT.FONT_POINT_1_5), String.valueOf(Const.EXCEL_OUTPUT.LINE_NUM_424_17));

        // suyuan
        hashMap.put(Const.DBFieldName.CORPID_BUTURIMEI, Const.DBFieldName.CORPID_RORIMEI);
        hashMap.put(Const.DBFieldName.REQID_BUTURIMEI, Const.DBFieldName.REQID_RORIMEI);
        hashMap.put(Const.DBFieldName.TS_BUTURIMEI, Const.DBFieldName.TS_RORIMEI);
        hashMap.put(Const.DBFieldName.MONEY_BUTURIMEI, Const.DBFieldName.MONEY_RORIMEI);
        hashMap.put(Const.DBFieldName.SPID_BUTURIMEI, Const.DBFieldName.SPID_RORIMEI);
        hashMap.put(Const.DBFieldName.PROVID_BUTURIMEI, Const.DBFieldName.PROVID_RORIMEI);
        hashMap.put(Const.DBFieldName.NUMBER_BUTURIMEI, Const.DBFieldName.NUMBER_RORIMEI);
        hashMap.put(Const.DBFieldName.RETURL_BUTURIMEI, Const.DBFieldName.RETURL_RORIMEI);
        hashMap.put(Const.DBFieldName.SIGN_BUTURIMEI, Const.DBFieldName.SIGN_RORIMEI);
        hashMap.put(Const.DBFieldName.MERID_BUTURIMEI, Const.DBFieldName.MERID_RORIMEI);
        hashMap.put(Const.DBFieldName.TYPE_BUTURIMEI, Const.DBFieldName.TYPE_RORIMEI);
        hashMap.put(Const.DBFieldName.RECHARGENO_BUTURIMEI, Const.DBFieldName.RECHARGENO_RORIMEI);
        hashMap.put(Const.DBFieldName.AMOUNT_BUTURIMEI, Const.DBFieldName.AMOUNT_RORIMEI);
        hashMap.put(Const.DBFieldName.CALLBACKURL_BUTURIMEI, Const.DBFieldName.CALLBACKURL_RORIMEI);
        hashMap.put(Const.DBFieldName.CARRIER_BUTURIMEI, Const.DBFieldName.CARRIER_RORIMEI);
        hashMap.put(Const.DBFieldName.PROVINCE_BUTURIMEI, Const.DBFieldName.PROVINCE_RORIMEI);
        
        hashMap.put(Const.PRODUCT_STATUS.ON, Const.PRODUCT_STATUS.ONE);
        hashMap.put(Const.PRODUCT_STATUS.OFF, Const.PRODUCT_STATUS.ZERO);
        
        map = hashMap;
        return map;
    }

    /**.
         * マップバリューを取得
     * @param key キー
     * @return バリュー
     */
    public static String getMapValue(String key) {

        String value = Const.EMPTY_STRING;
        // マップにデータを入れる
        if (map.size() == Const.COUNT_0) {
            getMap();
        }
        // キー値を取得
        String[] keyArr = key.split(Const.SLASH_DOT);
        String getKey = keyArr[keyArr.length - Const.COUNT_1];
        // HashMapからバリューを取得
        value = map.get(getKey);
        if (StringUtils.isEmpty(value)) {
            // HashMapからバリューを取得できない場合は、HashMapをもう一回で取得
            map.clear();
            getMap();
        } else {
            return value;
        }
        value = map.get(key);
        return value;
    }
}
