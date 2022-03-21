package jp.co.dk.ip.common;

/**..
 * common const
 */
public class Const {

    /**. face++ api key */
    public static final String API_KEY = "api_key";
    /**. face++ api secret */
    public static final String API_SECRET = "api_secret";
    /**. face++ image_file */
    public static final String IMAGE_FILE = "image_file";
    /**. face++ property */
    public static final String RETURN_ATTRIBUTES = "return_attributes";
    /**. face++ face token 1 */
    public static final String FACE_TOKEN_1 = "face_token1";
    /**. face++ face token 2 */
    public static final String FACE_TOKEN_2 = "face_token2";
    /**. face++ connect time out */
    public static final int CONNECT_TIME_OUT_30000 = 30000;
    /**. face++ read out time */
    public static final int READ_OUT_TIME_50000 = 50000;
    /**. face++ confidence */
    public static final int CONFIDENCE_NUM_90 = 90;
    /**. http request connect time out */
    public static final int CONN_TIME_OUT_30000 = 30000;
    /**. http request socket time out */
    public static final int SOCKET_TIME_OUT_50000 = 50000;
    /**. http request connect request time out */
    public static final int CONN_REQUEST_TIME_OUT_1000 = 1000;
    /**. http request max total and route */
    public static final int MAX_TOTAL_ROUTE_100 = 100;
    /**. agent request number 100 */
    public static final int REQUEST_NUMBER_100 = 100;
    /**. agent request number 3 */
    public static final int REQUEST_NUMBER_3 = 3;
    /**. agent request number 1 */
    public static final int REQUEST_NUMBER_1 = 1;
    /**. agent request number 0 */
    public static final int REQUEST_NUMBER_0 = 0;
	/** . agent request data */
	public static final String AGENT_REQUEST_DATA_CSV = "agent_data";
	/** . sign MD5 */
	public static final String SIGN_MD5 = "MD5";
	/** . random max */
	public static final int RANDOM_89 = 89;
	/** . random param */
	public static final int RANDOM_10 = 10;
	/** . order id prefix */
	public static final String ORDER_ID_D = "D";
	/** . all agent names */
	public static final String ALL_AGENT_NAMES = "全部";
    /**. 回复完了OK */
    public static final String DATA_OK = "OK";
	/** . redis lock timeout */
	public static final Long REDIS_TIMEOUT = 200L;
	/** . micro weiwei */
	public static final String M = "M";
	/** . agent weiwei */
	public static final String A = "A";
	/** . charge status */
	public static final String CHARGE_SUCCESS = "1";
	/** . micro weiwei */
	public static final String CHARGE_FAILURE = "0";
	/** . lock */
	public static final String LOCK = "1";
	/** . unlock */
	public static final String UNLOCK = "0";
	/** . run */
	public static final String RUN = "1";
	/** . no run */
	public static final String NORUN = "0";
	/** . run run */
	public static final String PART_RUN = "2";
	/** . money exception */
	public static final String MONEY_EXCEPTION = "0";
    /**. register 1 */
    public static final String REGISTER_1 = "1";
    /**. login 2 */
    public static final String LOGIN_2 = "2";
    /**. is balance 1 */
    public static final String ISBANLANCE = "1";
    /**. is not balance 0 */
    public static final String ISNOTBANLANCE = "0";
    /**. is not balance 0 */
    public static final String XIAOCHENGXU = "xiaochengxu";
	/** . 订单状态 '1'成功 '0'失败 '2'充值中（只有在'0'或者'1'的情况下才能确认是失败或者成功） */
	public static final String STATUS_1 = "1";
	public static final String STATUS_2 = "2";
	public static final String STATUS_0 = "0";
	
	/** . agent charge */
	public class AGENT_CHARGE_API {
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
		/** . orderid 本地流水号 */
		public static final String ORDERID = "orderId";
		/** . accountId 用户账号 */
		public static final String ACCOUNTID = "accountId";
		/** . ts 时间戳，格式为：yyyyMMddHHmmss */
		public static final String TS = "ts";
	    /**. money 充值面值（元） */
	    public static final String MONEY = "money";
	    /**. amount 充值金额（元） */
	    public static final String AMOUNT = "amount";
		/** . spid 运营商：1-移动，2-联通，3-电信，4-中石化 */
		public static final String SPID = "spId";
		/** . provid 省份编码（详见附录） */
		public static final String PROVID = "provId";
	    /**. number 充值号码 */
	    public static final String NUMBER = "number";
		/** . order info url 订单信息回调地址 */
		public static final String ORDERINFOURL = "orderInfoUrl";
		/** . order result url 订单结果回调地址 */
		public static final String ORDERRESULTURL = "orderResultUrl";
		/** . is balance 是否余额支付（1-是，0-否） */
		public static final String ISBALANCE = "isBalance";
		/** . sign 签名 */
		public static final String SIGN = "sign";
		
		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";

		/** . ok */
		public static final String OK = "ok";
	}
	
	/** . agent charge */
	public class AGENT_ORDER_CHARGE_API {
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
		/** . orderid 平台交易单号 */
		public static final String ORDERID = "orderId";
		/** . price 价格 */
		public static final String PRICE = "price";
		/** . sign 签名 */
		public static final String SIGN = "sign";
		
		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . balance charge */
	public class BALANCE_CHARGE_API {
	    /**. interface name */
	    public static final String INTERFACENAME = "MicroUserBalanceCharge";
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
	    /**. corpid 账号 */
	    public static final String ACCOUNTID = "accountId";
		/** . ts 时间戳，格式为：yyyyMMddHHmmss */
		public static final String TS = "ts";
	    /**. 充值金额 */
	    public static final String AMOUNT = "amount";
	    /**. number 充值号码 */
	    public static final String NUMBER = "number";
		/** . sign 签名 */
		public static final String SIGN = "sign";
		
		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . balance select */
	public class BALANCE_SELECT_API {
	    /**. interface name */
	    public static final String INTERFACENAME = "MicroUserBalanceSelect";
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
	    /**. corpid 账号 */
	    public static final String ACCOUNTID = "accountId";
		/** . ts 时间戳，格式为：yyyyMMddHHmmss */
		public static final String TS = "ts";
	    /**. number 充值号码 */
	    public static final String NUMBER = "number";
		/** . sign 签名 */
		public static final String SIGN = "sign";
		
		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . charge return */
	public class CHARGE_RETURN_API {
	    /**. interface name */
	    public static final String INTERFACENAME = "MicroUserChargeReturn";
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
	    /**. corpid 账号 */
	    public static final String ACCOUNTID = "accountId";
		/** . ts 时间戳，格式为：yyyyMMddHHmmss */
		public static final String TS = "ts";
	    /**. money 充值面额 */
	    public static final String MONEY = "money";
	    /**. number 充值号码 */
	    public static final String NUMBER = "number";
		/** . sign 签名 */
		public static final String SIGN = "sign";
		
		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . micro login */
	public class MICRO_LOGIN_API {
	    /**. interface name */
	    public static final String INTERFACENAME = "MicroUserLogin";
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
	    /**. username 用户名 */
	    public static final String USERNAME = "username";
		/** . password 密码 */
		public static final String PASSWORD = "password";
	    /**. tel 用户手机号 */
	    public static final String TEL = "tel";
		/** . ts 时间戳，格式为：yyyyMMddHHmmss */
		public static final String TS = "ts";
	    /**. gender 用户性别 */
	    public static final String GENDER = "gender";
	    /**. loginType 登录方式（1-注册，2-登录） */
	    public static final String LOGINTYPE = "loginType";
		/** . sign 签名 */
		public static final String SIGN = "sign";
		
		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . authory 001 call back */
	public class AUTHORY_001_CALL_BACK_API {
		/** . 商户订单编号 */
		public static final String MERCHANTORDERID = "merchantorderId";
		/** . 平台订单号 */
		public static final String PLATFORMORDERID = "platformorderid";
		/** . 充值平台凭证号 */
		public static final String ORDERID = "orderId";
		/** . 充值号码 */
		public static final String RECHARGENO = "rechargeno";
		/** . 充值面值 */
		public static final String AMOUNT = "amount";
		/** . 充值状态 */
		public static final String RECHARGESTATE = "rechargestate";
		/** . sign 签名 */
		public static final String SIGN = "sign";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . authory 002 call back */
	public class AUTHORY_002_CALL_BACK_API {
		/** . 平台订单流水号 */
		public static final String BILLID = "billId";
		/** . 运营商凭证号（可空） */
		public static final String CARRIERORDERID = "carrierOrderId";
		/** . 用户id（平台分配） */
		public static final String COMPANYID = "companyId";
		/** . 时间（格式yyyy-MM-dd hh:mm:ss) */
		public static final String COMPLETETIME = "completeTime";
		/** . 商户订单流水号 */
		public static final String ORDERID = "orderId";
		/** . 手机号码 */
		public static final String PHONE = "phone";
		/** . 订单状态 '1'成功 '0'失败 '2'充值中（只有在'0'或者'1'的情况下才能确认是失败或者成功） */
		public static final String STATUS = "status";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}	
	
	/** . authory 001 video charge */
	public class AUTHORY_001_VIDEO_CHARGE_API {
		/** . 产品编码 */
		public static final String PRODUCTCODE = "productcode";
		/** . 回调地址 */
		public static final String CALLBACKURL = "callbackurl";
		/** . 商户编号 */
		public static final String MERID = "merid";
		/** . 商户订单编号 */
		public static final String ORDERID = "orderid";
		/** . 充值帐号 */
		public static final String RECHARGENO = "rechargeno";
		/** . 时间戳 */
		public static final String TS = "ts";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . authory 001 charge */
	public class AUTHORY_001_CHARGE_API {
		/** . 产品编码 */
		public static final String AMOUNT = "amount";
		/** . 回调地址 */
		public static final String CALLBACKURL = "callBackUrl";
		/** . 商户编号 */
		public static final String AUTHORYID = "authoryId";
	    /**. corpid 账号 */
	    public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
		/** . 商户订单编号 */
		public static final String ORDERID = "orderId";
		/** . 充值帐号 */
		public static final String NUMBER = "number";
		/** . 时间戳 */
		public static final String TS = "ts";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . authory 002 charge */
	public class AUTHORY_002_CHARGE_API {
		/** . 回调地址 */
		public static final String CALLBACKURL = "callBackUrl";
		/** . 用户id（平台分配） */
		public static final String AUTHORYID = "authoryId";
		/** . 订单流水号(长度不超过32) */
		public static final String ORDERID = "orderId";
		/** . 需要充值的手机号 */
		public static final String NUMBER = "number";
		/** . 产品编号 */
		public static final String PRODUCTID = "productId";
		/** . 用户id（平台分配） */
		public static final String COMPANYID = "companyId";
		/** . 用户id（平台分配） */
		public static final String PHONE = "phone";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	/** . authory call back */
	public class AUTHORY_CALL_BACK_API {
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}

	/** . agent order info call back */
	public class AGENT_ORDER_INFO_CALL_BACK_API {
		/**. corpid 账号 */
		public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
		/** . orderid 我司流水号 */
		public static final String ORDERID = "orderId";
		/** . ts 时间戳，格式为：yyyyMMddHHmmss */
		public static final String TS = "ts";
		/** . 商户订单流水号 */
		public static final String PRICE = "price";
		/** . spid 运营商：1-移动，2-联通，3-电信，4-中石化 */
		public static final String SPID = "spId";
//		/** . 订单状态 '1'成功 '0'失败 '2'充值中（只有在'0'或者'1'的情况下才能确认是失败或者成功） */
//		public static final String STATUS = "status";

		/** . url */
		public static final String URL = "http://192.168.101.26:8090";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";

		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}

	/** . agent order result call back */
	public class AGENT_ORDER_RESULT_CALL_BACK_API {
		/**. corpid 账号 */
		public static final String CORPID = "corpId";
		/** . reqid 代理商流水号 */
		public static final String REQID = "reqId";
		/** . orderid 我司流水号 */
		public static final String ORDERID = "orderId";
		/** . 订单充值结果 */
		public static final String RESULT = "result";

		/** . url */
		public static final String URL = "http://192.168.101.26:8090";

		/** . equal */
		public static final String EQUAL = "=";
		/** . and */
		public static final String AND = "&";

		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}

	/** . orders status */
	public class ORDERS_STATUS {
		/** . 代理商下单成功，处理中 */
		public static final int TWO = 2;
		/** . 代理商下单失败 */
		public static final int ZERO = 0;
		/** . 渠道商下单成功，处理中 */
		public static final int ONE = 1;
		/** . 渠道商下单失败 */
		public static final int FOUR = 4;
		/** . 渠道商充值成功，处理中 */
		public static final int FIVE = 5;
		/** . 渠道商充值失败 */
		public static final int SIX = 6;
		/** . 最终充值成功 */
		public static final int SEVEN = 7;
		/** . 最终充值失败 */
		public static final int EIGHT = 8;
	}
	
	/** . on sale status */
	public class ON_SALE_STATUS {
		/** . on sale */
		public static final int ON = 1;
		/** . not on sale */
		public static final int OFF = 0;
	}
	
	/** . on interface status */
	public class ON_INTERFACE_STATUS {
		/** . on sale */
		public static final int ON = 1;
		/** . not on sale */
		public static final int OFF = 0;
	}
	
	/** . capital status */
	public class CAPITAL_STATUS {
		/** . capital status 1 */
		public static final String ONE = "1";
		/** . capital status 2 */
		public static final String TWO = "2";
	}
	
	/** . authory 001 url */
	public static final String AUTHORY_001_LOCAL_URL = "http://10.5.2.125:8090/api/APIAUTHORY001FAKE";
	public static final String AUTHORY_001_HUAWEICLOUD_URL = "http://119.3.2.109:8080/api/APIAUTHORY001FAKE";
	/** . authory 002 url */
	public static final String AUTHORY_002_URL = "http://10.5.2.125:8090/api/APIAUTHORY002FAKE";
//	/** . agent 001 call backup url */
//	public static final String AGENT_001_URL = "http://192.168.1.121:8080/api/APIAgentCALLBACKFAKE";
//	/** . agent 002 call backup url */
//	public static final String AGENT_002_URL = "http://192.168.1.121:9090/api/APIAgentCALLBACKFAKE";
	
	/** . authory 001 merid */
	public static final String AUTHORY_001_MERID = "6";
	/** . authory 002 companyid */
	public static final String AUTHORY_002_COMPANYID = "6";
	
	/** . authory 001 type phone */
	public static final String AUTHORY_001_TYPE_PHONE = "phone";
	/** . authory 002 type all country 1 */
	public static final int AUTHORY_002_TYPE_1 = 1;
	/** . authory 002 type all country 2 */
	public static final int AUTHORY_002_TYPE_2 = 2;
	
    /**. capital 0.0 */
    public static final double COUNT_0_000 = 0.00;

	/** . our call back url */
	public static final String OUR_CALL_BACK_URL = "http://192.168.1.107:8080/api/APIAGENT";
    
    /**. recharge clients url */
    public static final String RECHARGE_CLIENT_URL = "http://ip:port/home/recharge"; 
    
//	/** . agent id */
//	public class AGENT_ID {
//		/** . no 1 */
//		public static final String NO_1 = "1";
//		/** . no 2 */
//		public static final String NO_2 = "2";
//		
//		/** . agent order no.1 */
//		public static final String D_1 = "1";
//		/** . agent order no.2 */
//		public static final String D_2 = "2";
//	}
	
	/** . authory id */
	public class AUTHORY_ID {
		/** . no 1 */
		public static final String NO_1 = "1";
		/** . no 2 */
		public static final String NO_2 = "2";
	}
	
    /**. MD5 initial */
    public static final String STRING_0 = "0";
    
	/** . product status */
	public class PRODUCT_STATUS {
		/** . ON */
		public static final String ON = "开启";
		/** . OFF */
		public static final String OFF = "关闭";

		/** . ONE */
		public static final String ONE = "1";
		/** . ZERO */
		public static final String ZERO = "0";
	}
	
	/** . authory response code */
	public class AUTHORY_RES_CODE {
		/** . success: code 200 */
		public static final int CODE_200 = 200;
		/** . success: code 000 */
		public static final String CODE_000 = "000";
		/** . success: resultcode 0 */
		public static final String RESULTCODE_0 = "0";
		/** . failure: code 201 */
		public static final int CODE_201 = 201;
		/** . failure: code 001 */
		public static final String CODE_001 = "001";
		
		/** . success: 提交成功 */
		public static final String MSG_SUCCESS = "提交成功";
		/** . failure: 提交失败 */
		public static final String MSG_FAILURE = "提交失敗";
		
		/** . success: 提交成功 */
		public static final String OK = "ok";
		/** . failure: 提交失败 */
		public static final String NG = "ng";
		
		/** . success */
		public static final String SUCCESS = "SUCCESS";
		/** . failure */
		public static final String FAILURE = "FAILURE";
	}
	
	public static final String STRING_ZERO = "0";
	public static final String STRING_ONE = "1";
	public static final String STRING_TWO = "2";
	
    /**. パスワード暗号化KEY */
    public static final byte[] DES_KEY = { 21, 1, -110, 82, -32, -98, -85, 19 };
    public static final String DES = "DES";

    /**. 10MBのデータ容量 */
    public static final int DATA_VOLUMN_10MB = 10485760;

    /**. 処理タスクの数 */
    public static final int TASK_NUMBER = 3000;

    /**. システム管理者の連絡先メールアドレス */
    public static final String ADMIN_MAIL_ADDRESS = "admin@daikin.jp";

    /**. メッセージソース情報 */
    public static class MESSAGE_SOURCE {
        /**. クラスパス、バリデーションメッセージ */
        public static final String CLASSPATH_VALIDATIONMESSAGE = "classpath:ValidationMessages";
    }

    /**. ビルドフラグ：ローカル */
    public static final int BUILD_FLG_LOCAL = 0;
    /**. ビルドフラグ：開発環境 */
    public static final int BUILD_FLG_DEVELOP = 1;
    /**. ビルドフラグ：本番環境 */
    public static final int BUILD_FLG_RELEASE = 2;

    /**. 削除フラグ=ON */
    public static final String DELETE_FLG_ON = "1";
    /**. 削除フラグ=OFF */
    public static final String DELETE_FLG_OFF = "0";

    /**. 削除フラグ=ON */
    public static final int INT_DELETE_FLG_ON = 1;
    /**. 削除フラグ=OFF */
    public static final int INT_DELETE_FLG_OFF = 0;

    /**.配置フラグ未設定 */
    public static final String INSTALLED_FLG_ON = "0";
    /**. 配置フラグ設定済み */
    public static final String INSTALLED_FLG_OFF = "1";

    /**. 状況設定コード 施工前 */
    public static final long TIMING_ID_1 = 1;
    /**. 状況設定コード 施工中 */
    public static final long TIMING_ID_2 = 2;
    /**. 状況設定コード 施工後 */
    public static final long TIMING_ID_3 = 3;
    /**. 状況設定コード 運用中 */
    public static final long TIMING_ID_4 = 4;
    /**. 状況設定コード - */
    public static final long TIMING_ID_5 = 5;
    /**. 状況設定コード 専有部 */
    public static final long TIMING_ID_6 = 6;
    /**. 状況設定コード 共有部 */
    public static final long TIMING_ID_7 = 7;

    /**. 事前設定撮影必須項目選択  室外機のみ必要 */
    public static final String NEED_PHOTO_1 = "1";
    /**. 事前設定撮影必須項目選択  室内機のみ必要 */
    public static final String NEED_PHOTO_2 = "2";
    /**. 事前設定撮影必須項目選択  室外機、室内機ともに必要 */
    public static final String NEED_PHOTO_3 = "3";
    /**. 事前設定撮影必須項目選択  必要なし */
    public static final String NEED_PHOTO_4 = "4";

    /**. アカウントロックフラグ設定 */
    public static final String IS_ACCOUNT_LOCK_ON = "1";
    /**. アカウントロックフラグ未設定 */
    public static final String IS_ACCOUNT_LOCK_OFF = "0";

    /**. 写真帳出力フラグ */
    public static final int IS_OUTPUT_PHOTO_BOOK_0 = 0;
    public static final int IS_OUTPUT_PHOTO_BOOK_1 = 1;

    /**. 黒板表示フラグ 非表示 */
    public static final String IS_BLACK_BOARD_DISPLAY_ON = "1";
    /**. 黒板表示フラグ 表示 */
    public static final String IS_BLACK_BOARD_DISPLAY_OFF = "0";

    /**. アクセス許可フラグ */
    public static final int ACCESS_APPROVA_1 = 1;

    /**. 数字型チェック */
    public static final String CHECK_NUM = "[0-9]*";

    /**. 写真帳出力情報取得のレスポンス編集キー */
    public static final String PROCESS_EMPTY_ID = "process_empty_id";

    /**. ピン情報登録のレスポンス編集キー */
    public static final String PINS_FLAG_KEY = "pins_flag";
    public static final String PINS_VALUE_KEY = "pins_value";

    /**. ソート順エラー設定 */
    public static final String SORT_ORDER_ERROR = "0";
    /**. ソート昇順設定 */
    public static final String SORT_ORDER_ASC = "1";
    /**. ソート降順設定 */
    public static final String SORT_ORDER_DESC = "2";

    /**. リストが空白 */
    public static final int LIST_SIZE_ZERO = 0;

    /**. 一行のデータ登録 */
    public static final int ONE_RECORD_INSERT = 1;

    /**. 表示順登録 */
    public static final int DIPLAY_ORDER_1 = 1;

    /**. 単件数結果 1 */
    public static final Integer RESULT_CNT_1 = 1;
    /**. 単件数結果 0 */
    public static final Integer RESULT_CNT_0 = 0;
    /**. 単件数結果 null */
    public static final Integer RESULT_CNT_NULL = null;

    /**. 工程数の閾値 */
    public static final int PROCESS_NO = 99;

    /**. 出力パターン A */
    public static final String OUTPUT_ORDER_PATTERN_A = "A";
    /**. 出力パターン B */
    public static final String OUTPUT_ORDER_PATTERN_B = "B";

    /**. 不明出力フラグ 1 */
    public static final String UNKNOWN_OUTPUT_1 = "1";
    /**. 不明出力フラグ 0 */
    public static final String UNKNOWN_OUTPUT_0 = "0";

    /**. 出力3件フラグ 1 */
    public static final Integer TOP_3_1 = 1;
    /**. 出力3件フラグ 0 */
    public static final Integer TOP_3_0 = 0;

    /**. デート文字列：yyyy-MM-dd HH:mm:ss */
    public static final String DATE_STYLE = "yyyy-MM-dd HH:mm:ss";
    /**. デート文字列：YYYY-MM-DD HH:mm:ss.SSS */
    public static final String DATE_STYLE_UPPER = "YYYY-MM-DD HH:mm:ss.SSS";
    /**. デート文字列：yyyyMMddHHmmss */
    public static final String DATE_STRING = "yyyyMMddHHmmss";
    /**. デート文字列：yyyy-MM-dd */
    public static final String DATE_STYLE_DATE = "yyyy-MM-dd";
    /**. デート文字列：HH:mm */
    public static final String DATE_STYLE_TIME = "HH:mm";
    /**. デート文字列：yyyyMMdd */
    public static final String DATE_STRING_NO_TIME = "yyyyMMdd";
    /**. デート文字列： カレント日時SQL文 */
    public static final String STR_TO_DATE = "STR_TO_DATE";
    /**. デート文字列： カレント日時SQL文 */
    public static final String DATE_PARAMETER = "'%Y-%m-%d %H:%i:%s'";
    /**. デート文字列： カレント日時SQL文 */
    public static final String DATE_PARAMETER_INJECTION = "%Y-%m-%d %H:%i:%s";
    /**. デート文字列：yyyy-MM-dd HH:mm:ss.SSS */
    public static final String DATE_STRING_UPPER = "yyyy-MM-dd HH:mm:ss.SSS";
    /**. デート文字列：yyyyMMddHHmmssSSS */
    public static final String DATE_STRING_SECOND = "yyyyMMddHHmmssSSS";
    /**. デート文字列：yyyyMMddHHmmssSSSの桁数 */
    public static final int DATE_STRING_SECOND_MILL_LENGTH = 17;
    /**. デート文字列：YYYY/MM/dd HH:mm:ss.SSS */
    public static final String DATE_STRING_OUTPUT_PATTERN = "YYYY/MM/dd HH:mm:ss.SSS";
    /**. デート文字列： カレント日時SQL文 */
    public static final String DATE_PARAMETER_PATTERN = "%Y-%m-%d %H:%i:%s.%f";
    /**. length yyyy-MM-dd HH:mm:ss.SSS */
    public static final int DATE_STRING_UPPER_LENGTH = 23;

    /**. agent data post status: 1.post available */
    public static final String AGENT_DATA_POST_STATUS_1 = "1";
    /**. agent data post status: 2.post order info */
    public static final String AGENT_DATA_POST_STATUS_2 = "2";
    /**. agent data post status: 3.post order result */
    public static final String AGENT_DATA_POST_STATUS_3 = "3";
	/**. agent data post status: 3.post failure */
	public static final String AGENT_DATA_POST_STATUS_4 = "4";

    /**. order form */
    public static final String ORDER_FORM_ACCOUNT = "账户";
    /**. order type pay */
    public static final String ORDER_TYPE_PAY = "支付";
    /**. order type return */
    public static final String ORDER_TYPE_REFUND = "退款";
    
    /**. レスポンスのresultCode 正常 */
    public static final String RESULT_CODE_0 = "0";
    /**. レスポンスのresultCode 情報 */
    public static final String RESULT_CODE_1 = "1";
    /**. レスポンスのresultCode 警告 */
    public static final String RESULT_CODE_2 = "2";
    /**. レスポンスのresultCode 業務エラー */
    public static final String RESULT_CODE_3 = "3";
    /**. レスポンスのresultCode システムエラー */
    public static final String RESULT_CODE_9 = "9";

    /**. 物件登録区分が"1"登録 */
    public static final String UP_DIF_BUILDINGS_1 = "1";
    /**. 物件登録区分が"2"更新 */
    public static final String UP_DIF_BUILDINGS_2 = "2";
    /**. 物件登録区分が"3"削除 */
    public static final String UP_DIF_BUILDINGS_3 = "3";
    /**. 物件登録区分が"4"変更なし */
    public static final String UP_DIF_BUILDINGS_4 = "4";

    /**. ユーザ登録区分が"1"登録 */
    public static final String UP_DIF_USERS_1 = "1";
    /**. ユーザ登録区分が"2"更新 */
    public static final String UP_DIF_USERS_2 = "2";
    /**. ユーザ登録区分が"3"削除 */
    public static final String UP_DIF_USERS_3 = "3";
    /**. ユーザ登録区分が"4"変更なし */
    public static final String UP_DIF_USERS_4 = "4";

    /**. 会社登録区分が"1"登録 */
    public static final String UP_DIF_COMPANIES_1 = "1";
    /**. 会社登録区分が"2"更新 */
    public static final String UP_DIF_COMPANIES_2 = "2";
    /**. 会社登録区分が"3"削除 */
    public static final String UP_DIF_COMPANIES_3 = "3";
    /**. 会社登録区分が"4"変更なし */
    public static final String UP_DIF_COMPANIES_4 = "4";

    /**. 登録区分が"1"登録 */
    public static final String UP_DIF_1 = "1";
    /**. 登録区分が"1"更新 */
    public static final String UP_DIF_2 = "2";
    /**. 登録区分が"3"削除 */
    public static final String UP_DIF_3 = "3";
    /**. 登録区分が"4"変更 */
    public static final String UP_DIF_4 = "4";

    /**. 図面登録区分が"1"登録 */
    public static final String UP_DIF_DRAWING_1 = "1";
    /**. 図面登録区分が"2"更新 */
    public static final String UP_DIF_DRAWING_2 = "2";
    /**. 図面登録区分が"3"削除 */
    public static final String UP_DIF_DRAWING_3 = "3";
    /**. 図面登録区分が"4"変更なし */
    public static final String UP_DIF_DRAWING_4 = "4";

    /**. 機器登録区分が"1"登録 */
    public static final String UP_DIF_UNIT_1 = "1";
    /**. 機器登録区分が"2"更新 */
    public static final String UP_DIF_UNIT_2 = "2";
    /**. 機器登録区分が"3"削除 */
    public static final String UP_DIF_UNIT_3 = "3";
    /**. 機器登録区分が"4"変更なし */
    public static final String UP_DIF_UNIT_4 = "4";

    /**. 立会人登録区分が"1"登録 */
    public static final String UP_DIF_WITNESS_1 = "1";
    /**. 立会人登録区分が"2"更新 */
    public static final String UP_DIF_WITNESS_2 = "2";
    /**. 立会人登録区分が"3"削除 */
    public static final String UP_DIF_WITNESS_3 = "3";
    /**. 立会人登録区分が"4"変更なし */
    public static final String UP_DIF_WITNESS_4 = "4";

    /**. 物件登録区分 */
    public static final String UP_DIF_BUILDINGS = "物件登録区分";
    /**. フロア登録区分 */
    public static final String UP_DIF_FLOOR = "フロア登録区分";
    /**. 部屋登録区 */
    public static final String UP_DIF_ROOMS = "部屋登録区分";
    /**. 場所フロア登録区 */
    public static final String UP_DIF_PLEACESES = "場所フロア登録区";
    /**. ユーザ登録区 */
    public static final String UP_DIF_USERS = "ユーザ登録区";

    /**. フラグ */
    public static final String FLAG_FALSE = "false";
    public static final String FLAG_TRUE = "true";

    /**. ID桁チェック */
    public static final int CHECK_COUNT_ID = 10;

    /**. 区分桁チェック */
    public static final int CHECK_COUNT_KIND = 1;

    /**. データ文字検索失敗 */
    public static final int COUNT_MINUS_1 = -1;

    /**. IDの補充値 */
    public static final String ID_VALUE_0 = "0";

    /**. データ登録初期数が100 */
    public static final int COUNT_100 = 100;
    
    /**. データ登録初期数が1000 */
    public static final int COUNT_1000 = 1000;
    
    /**. データ登録初期数が16 */
    public static final int COUNT_16 = 16;

    /**. データ登録初期数が15 */
    public static final int COUNT_15 = 15;

    /**. データ登録初期数が14 */
    public static final int COUNT_14 = 14;

    /**. データ登録初期数が13 */
    public static final int COUNT_13 = 13;

    /**. データ登録初期数が12 */
    public static final int COUNT_12 = 12;

    /**. データ登録初期数が11 */
    public static final int COUNT_11 = 11;

    /**. データ登録初期数が10 */
    public static final int COUNT_10 = 10;

    /**. データ登録初期数が9 */
    public static final int COUNT_9 = 9;

    /**. データ登録初期数が8 */
    public static final int COUNT_8 = 8;

    /**. データ登録初期数が7 */
    public static final int COUNT_7 = 7;

    /**. データ登録初期数が6 */
    public static final int COUNT_6 = 6;

    /**. データ登録初期数が5 */
    public static final int COUNT_5 = 5;

    /**. データ登録初期数が4 */
    public static final int COUNT_4 = 4;

    /**. データ登録初期数が3 */
    public static final int COUNT_3 = 3;

    /**. データ登録初期数が2 */
    public static final int COUNT_2 = 2;

    /**. データ登録初期数が1 */
    public static final int COUNT_1 = 1;
    
    /**. データ登録初期数が0.5 */
    public static final double COUNT_0_5 = 0.5;
    
    /**. データ登録初期数が0.4 */
    public static final double COUNT_0_4 = 0.4;

    /**. データ登録初期数が0.3 */
    public static final double COUNT_0_3 = 0.3;

    /**. データ登録初期数が0.2 */
    public static final double COUNT_0_2 = 0.2;

    /**. データ登録初期数が0.1 */
    public static final double COUNT_0_1 = 0.1;
    
    /**. データ登録初期数が0 */
    public static final int COUNT_0 = 0;

    /**. ダブルデータ登録初期数が0.0 */
    public static final double COUNT_0_00 = 0.00;

    /**. ダブルデータの小数保留設定 */
    public static final String PERCENT_2F = "%.2f";

    /**. データ登録初期エラー数 */
    public static final int NUM_0 = 0;

    /**. データ登録初期数 */
    public static final int STRING_BEGIN = 0;

    /**. ピン座標データの最大桁数 */
    public static final int P_MAX_LENGTH = 9;

    /**. ピン座標少数2桁の場合は、最大桁数 */
    public static final int P_2_KETA_9 = 9;

    /**. ピン座標少数1桁の場合は、最大桁数 */
    public static final int P_1_KETA_8 = 8;

    /**. ピン座標少数0桁の場合は、最大桁数 */
    public static final int P_0_KETA_6 = 6;

    /**. CSV登録ファイルタイトル */
    public static final int STRING_TITLE = 0;

    /**. CSVレコード処理開始 0 */
    public static final int CSV_RECORD_BEGIN_0 = 0;

    /**. CSVレコード処理開始 2 */
    public static final int CSV_RECORD_BEGIN_2 = 2;

    /**. CSVレコードLineNum */
    public static class LINE_NUM {
        public static final int LINE_0 = 0;
        public static final int LINE_1 = 1;
        public static final int LINE_2 = 2;
        public static final int LINE_3 = 3;
        public static final int LINE_4 = 4;
        public static final int LINE_5 = 5;
        public static final int LINE_6 = 6;
        public static final int LINE_7 = 7;
        public static final int LINE_8 = 8;

        public static final int LINE_COUNT = 8;
    }

    /**.会社ユーザCSV */
    public static class CSV_COMPANIES_USER {

        /**. ユーザ登録区分 */
        public static final int CSV_RECORD_USER = 0;
        /**. ユーザID */
        public static final int CSV_RECORD_USER_ID = 1;
        /**. 担当者名 */
        public static final int CSV_RECORD_USER_NAME = 2;
        /**. メールアドレス */
        public static final int CSV_RECORD_MAIL_ADDRESS = 3;
        /**. パスワード */
        public static final int CSV_RECORD_PASSWORD = 4;
        /**. 会社名 */
        public static final int CSV_RECORD_COMPANIES_NAME = 5;
        /**. 権限ID */
        public static final int CSV_RECORD_AUTHORITY_ID = 6;
        /**. 処理メッセージ */
        public static final int CSV_RECORD_ERR_MESSAGE = 7;

        /**. 会社情報フィールド桁 */
        public static final int COMPANIES_FIELD_COUNT = 0;
    }
    
    /**.会社ユーザCSV */
    public static class CSV_AGENTS {
        /**. 账号 */
        public static final int CSV_RECORD_CORP_ID = 0;
        /**. 代理商流水号 */
        public static final int CSV_RECORD_REQ_ID = 1;
        /**. 时间戳，格式为：yyyyMMddHHmmss */
        public static final int CSV_RECORD_TS = 2;
        /**. 面值（元） */
        public static final int CSV_RECORD_MONEY = 3;
        /**. 运营商：1-移动，2-联通，3-电信，4-中石化 */
        public static final int CSV_RECORD_SP_ID = 4;
        /**. 省份编码（详见附录） */
        public static final int CSV_RECORD_PROV_ID = 5;
        /**. 充值号码 */
        public static final int CSV_RECORD_NUMBER = 6;
        /**. 回调地址 */
        public static final int CSV_RECORD_RET_URL = 7;
        /**. 签名 */
        public static final int CSV_RECORD_SIGN = 8;
    }

    /**.物件フロア 部屋 場所CSV */
    public static class CSV_FLOORS_ROOMS_PLACESES {
        /**.案件CSV登録ファイルタイトル */
        public static final String FLOORS_ROOMS_PLACESES_NUMBER = "3";
        public static final String FLOORS_ROOMS_PLACESES_TITLE = "物件フロア・部屋・場所CSV";

        /**. 物件ID */
        public static final int CSV_RECORD_BUILDING_ID = 0;
        /**. 物件名 */
        public static final int CSV_RECORD_BUILDING_NAME = 1;
        /**. フロア登録区分 */
        public static final int CSV_RECORD_FLOOR = 2;
        /**. フロアID */
        public static final int CSV_RECORD_FLOOR_ID = 3;
        /**. フロア名 */
        public static final int CSV_RECORD_FLOOR_NAME = 4;
        /**. 部屋登録区分 */
        public static final int CSV_RECORD_ROOM = 5;
        /**. 部屋ID */
        public static final int CSV_RECORD_ROOM_ID = 6;
        /**. 部屋名 */
        public static final int CSV_RECORD_ROOM_NAME = 7;
        /**. 場所登録区分 */
        public static final int CSV_RECORD_PLACESES = 8;
        /**. 場所ID */
        public static final int CSV_RECORD_PLACESES_ID = 9;
        /**. 場所名 */
        public static final int CSV_RECORD_PLACESES_NAME = 10;
        /**. 処理メッセージ */
        public static final int CSV_RECORD_ERR_MESSAGE = 11;
        /**. 登録区分相関判定 */
        public static final String CSV_DIF_A = "A";
        public static final String CSV_DIF_B = "B";
        public static final String CSV_DIF_C = "C";
        public static final String CSV_DIF_D = "D";
        public static final String CSV_DIF_E = "E";
        /**. 登録区分内容 */
        public static final String[] CSV_DIF_CONTENT = new String[] { "フロア区分", "部屋区分", "場所区分" };
    }

    /**. 案件CSV */
    public static class PROJECTS {
        /**.案件CSV登録ファイルタイトル */
        public static final String PROJECTS_NUMBER = "4";
        public static final String PROJECTS_TITLE = "案件CSV";

        /**. 案件CSV登録の案件ID桁 */
        public static final int CSV_RECORD_PROJECTID = 0;

        /**. 案件CSV登録の案件名桁 */
        public static final int CSV_RECORD_PROJECTNAME = 1;

        /**. 案件CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 2;

        /**. 案件CSV登録の列数 */
        public static final int CSV_COLUMN_PROJECTNAME = 2;
    }

    /**. ユーザ担当管理CSV */
    public static class USERS {
        /**. ユーザ担当管理CSV登録ファイルタイトル */
        public static final String USERS_NUMBER = "5";
        public static final String USERS_TITLE = "ユーザ担当管理CSV";

        /**. ユーザ担当管理CSV登録のユーザ登録区桁 */
        public static final int CSV_RECORD_KUBUN = 0;

        /**. ユーザ担当管理CSV登録のユーザID桁 */
        public static final int CSV_RECORD_USER_ID = 1;

        /**. ユーザ担当管理CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 2;

        /**. ユーザ担当管理CSVフィールド値桁目 */
        public static final int USERS_FIELD_VALUE_POSITION = 2;
    }

    /**. 物件図面情報CSV */
    public static class DRAWINGS {
        public static final String DRAWINGS_NUMBER = "6";
        public static final String DRAWINGS_TITLE = "物件図面情報CSV";

        /**. 物件図面情報CSVフロア名桁 */
        public static final int CSV_RECORD_IMAGE_KUBUN = 0;

        /**. 物件図面情報CSVフロア名桁 */
        public static final int CSV_RECORD_FLOOR_NAME = 1;

        /**. 物件図面情報CSV図面パス桁 */
        public static final int CSV_RECORD_IMAGE_PATH = 2;

        /**. 物件図面情報CSV図面名桁 */
        public static final int CSV_RECORD_IMAGE_NAME = 3;

        /**. 物件図面情報CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 4;

        /**. 物件図面情報CSV登録のフロアID数 */
        public static final int CSV_FLOOR_ID_COUNT = 1;

        /**. 物件図面情報CSV登録のファイル名称数 */
        public static final int CSV_FILE_NAME_COUNT = 1;
    }

    /**. 機器情報CSV */
    public static class UNITS {
        public static final String UNITS_NUMBER = "7";
        public static final String UNITS_TITLE = "機器情報CSV";

        /**. 機器情報CSV機器登録区分桁 */
        public static final int CSV_RECORD_SYS_KUBUN = 0;

        /**. 機器情報CSV系統名桁 */
        public static final int CSV_RECORD_SYS_NAME = 1;

        /**. 機器情報CSV記号桁 */
        public static final int CSV_RECORD_UNIT_MARK = 2;

        /**. 機器情報CSV室外機桁 */
        public static final int CSV_RECORD_OUT_MACHINE = 3;

        /**. 機器情報CSV室内機桁 */
        public static final int CSV_RECORD_IN_MACHINE = 4;

        /**. 機器情報CSVフロア名桁 */
        public static final int CSV_RECORD_FLOOR_NAME = 5;

        /**. 機器情報CSV部屋名桁 */
        public static final int CSV_RECORD_ROOM_NAME = 6;

        /**. 機器情報CSV場所名桁 */
        public static final int CSV_RECORD_PLACE_NAME = 7;

        /**. 機器情報CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 8;

        /**. 機器情報CSV室外機の機種区分桁 */
        public static final String CSV_RECORD_MODELTYPE_DIVISION_OUT_MACHINE = "1";

        /**. 機器情報CSV室内機の機種区分桁 */
        public static final String CSV_RECORD_MODELTYPE_DIVISION_IN_MACHINE = "2";

        /**. 機器情報CSV登録のフロアID数 */
        public static final int CSV_FLOOR_ID_COUNT = 1;

        /**. 機器情報CSV登録の部屋ID数 */
        public static final int CSV_ROOM_ID_COUNT = 1;

        /**. 機器情報CSV登録の場所ID数 */
        public static final int CSV_PLACE_ID_COUNT = 1;

        /**. 機器情報CSV登録の機器ID数 */
        public static final int CSV_UNIT_ID_COUNT = 1;
    }

    /**. 工程作業情報CSV */
    public static class PWS {
        public static final String PWS_NUMBER = "8";
        public static final String PWS_TITLE = "工程作業情報CSV";

        /**. 工程作業情報CSV大工程桁 */
        public static final int CSV_RECORD_BIGPROCESS = 0;

        /**. 工程作業情報CSV工程ID桁 */
        public static final int CSV_RECORD_PROCESS_ID = 1;

        /**. 工程作業情報CSV工程名桁 */
        public static final int CSV_RECORD_PROCESS_NAME = 2;

        /**. 工程作業情報CSV作業ID桁 */
        public static final int CSV_RECORD_WORK_ID = 3;

        /**. 工程作業情報CSV作業名桁 */
        public static final int CSV_RECORD_WORK_NAME = 4;

        /**. 工程作業情報CSV施工前桁 */
        public static final int CSV_RECORD_WORK_BEFORE = 5;

        /**. 工程作業情報CSV施工中桁 */
        public static final int CSV_RECORD_WORKING = 6;

        /**. 工程作業情報CSV施工後桁 */
        public static final int CSV_RECORD_WORK_AFTER = 7;

        /**. 工程作業情報CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 8;
    }

    /**. 立会人情報CSV */
    public static class WITNESS {
        public static final String WITNESS_NUMBER = "9";
        public static final String WITNESS_TITLE = "立会人情報CSV";

        /**. 立会人情報CSV立会人登録区分桁 */
        public static final int CSV_WITNESS_KUBUN = 0;

        /**. 立会人情報CSV立会人ID桁 */
        public static final int CSV_WITNESS_ID = 1;

        /**. 立会人情報CSV立会人名桁 */
        public static final int CSV_WITNESS_NAME = 2;

        /**. 立会人情報CSV施工会社ID桁 */
        public static final int CSV_COMPANY_ID = 3;

        /**. 立会人情報CSV施工会社名桁 */
        public static final int CSV_COMPANY_NAME = 4;

        /**. 立会人情報CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 5;
    }

    /**. 黒板表示項目情報CSV */
    public static class BLACKBOARDDISPLAY {
        public static final String BLACKBOARDDISPLAY_NUMBER = "10";
        public static final String BLACKBOARDDISPLAY_TITLE = "黒板表示項目情報CSV";

        /**. 黒板表示項目情報CSV大工程桁 */
        public static final int CSV_RECORD_BIGPROCESS = 0;

        /**. 黒板表示項目情報CSV案件表示フラグ桁 */
        public static final int CSV_RECORD_PROJECT_SHOW_FLG = 1;

        /**. 黒板表示項目情報CSVフロア表示フラグ桁 */
        public static final int CSV_RECORD_FLOOR_SHOW_FLG = 2;

        /**. 黒板表示項目情報CSV部屋表示フラグ桁 */
        public static final int CSV_RECORD_ROOM_SHOW_FLG = 3;

        /**. 黒板表示項目情報CSV場所表示フラグ桁 */
        public static final int CSV_RECORD_PLACE_SHOW_FLG = 4;

        /**. 黒板表示項目情報CSV系統表示フラグ桁 */
        public static final int CSV_RECORD_LINE_SHOW_FLG = 5;

        /**. 黒板表示項目情報CSV機器表示フラグ桁 */
        public static final int CSV_RECORD_UNIT_SHOW_FLG = 6;

        /**. 黒板表示項目情報CSV工程表示フラグ桁 */
        public static final int CSV_RECORD_PROCESS_SHOW_FLG = 7;

        /**. 黒板表示項目情報CSV作業表示フラグ桁 */
        public static final int CSV_RECORD_WORK_SHOW_FLG = 8;

        /**. 黒板表示項目情報CSV自由欄表示フラグ桁 */
        public static final int CSV_RECORD_REMARKS_SHOW_FLG = 9;

        /**. 黒板表示項目情報CSV立会者表示フラグ桁 */
        public static final int CSV_RECORD_WITNESS_SHOW_FLG = 10;

        /**. 黒板表示項目情報CSV施工会社表示フラグ桁 */
        public static final int CSV_RECORD_WORK_COMPANY_SHOW_FLG = 11;

        /**. 黒板表示項目情報CSV日付表示フラグ桁 */
        public static final int CSV_RECORD_DATE_SHOW_FLG = 12;

        /**. 黒板表示項目情報CSV時刻表示フラグ桁 */
        public static final int CSV_RECORD_TIME_SHOW_FLG = 13;

        /**. 黒板表示項目情報CSV登録のフィールド数 */
        public static final int CSV_COLUMN_COUNT = 14;

        /**. 黒板表示項目情報CSV登録のフラグデフォルト値 */
        public static final String CSV_FLG_VALUE_1 = "1";
    }

    /**. 案件マスタ登録 */
    public static class PROJECTINSERT {
        /**. タイトル */
        public static final String TITLE = "案件マスタ登録";

        /**. 案件マスタ登録の行数制限 */
        public static final int CSV_PROJECTS_ROW_MAX = 1;

        /**. 案件マスタ登録フィールド値桁目 */
        public static final int PROJECTS_FIELD_COUNT = 0;
    }

    /**. 物件関連ファイル情報登録 */
    public static class DRAWINGSINSERT {
        /**. タイトル */
        public static final String TITLE = "物件関連ファイル情報登録";

        /**. 物件関連ファイル情報登録の行数制限 */
        public static final int CSV_DRAWINGS_ROW_MAX = 1;

        /**. 物件関連ファイル情報登録フィールド値桁目 */
        public static final int DRAWINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 機器場所マスタ登録 */
    public static class UNITINSERT {
        /**. タイトル */
        public static final String TITLE = "機器場所マスタ登録";

        /**. 機器場所マスタ登録の行数制限 */
        public static final int CSV_UNIT_ROW_MAX = 1;

        /**. 機器場所マスタ登録フィールド値桁目 */
        public static final int UNIT_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 機器情報登録 */
    public static class PROJECTUNITSINSERT {
        /**. タイトル */
        public static final String TITLE = "機器情報登録";

        /**. 機器情報登録の行数制限 */
        public static final int CSV_UNIT_ROW_MAX = 1;

        /**. 機器情報登録フィールド値桁目 */
        public static final int UNIT_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 提案前現地調査工程情報登録 */
    public static class BEFOREAPPLYPROJECTINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "01";

        /**. 工程名 */
        public static final String PROCESS_NAME_VALUE = "提案前現地調査";

        /**. 表示順 */
        public static final long DISPLAY_ORDER_VALUE = 1;

        /**. 提案前現地調査工程情報登録 */
        public static final String BEFOREPROJECTINSERT_TITLE = "提案前現地調査工程情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 提案前現地調査作業情報登録 */
    public static class BEFOREAPPLYWORKINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "01";

        /**. 作業名 */
        public static final String WORK_NAME_VALUE = "現地調査";

        /**. 表示順 */
        public static final long DISPLAY_ORDER_VALUE = 1;

        /**. 提案前現地調査作業情報登録 */
        public static final String BEFOREWORKINSERT_TITLE = "提案前現地調査作業情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 提案前現地調査空状況情報登録 */
    public static class BEFOREAPPLYEMPTYTIMINGSINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "01";

        /**. 状況名 */
        public static final String WORK_TIMINGS_NAME = "-";

        /**. 撮影必須 */
        public static final String TIMINGS_NEED_PHOTO = "3";

        /**. 提案前現地調査空状況情報登録 */
        public static final String BEFOREEMPTYTIMINGSINSERT_TITLE = "提案前現地調査空状況情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. 提案前現地調査空状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**. 提案前現地調査空状況情報登録値桁目 */
        public static final int TIMINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 提案前現地調査専有部状況情報登録 */
    public static class BEFOREAPPLYWORKTIMINGSPRIVATEINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "01";

        /**. 状況名 */
        public static final String WORK_TIMINGS_NAME = "専有部";

        /**. 撮影必須 */
        public static final String TIMINGS_NEED_PHOTO = "3";

        /**. 提案前現地調査工程情報登録 */
        public static final String BEFOREWORKTIMINGSINSERT_TITLE = "提案前現地調査専有部状況情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. 提案前現地調査専有部状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**. 提案前現地調査専有部状況情報登録値桁目 */
        public static final int TIMINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 提案前現地調査共有部状況情報登録 */
    public static class BEFOREAPPLYWORKTIMINGSPUBLICINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "01";

        /**. 状況名 */
        public static final String WORK_TIMINGS_NAME = "共有部";

        /**. 撮影必須 */
        public static final String TIMINGS_NEED_PHOTO = "3";

        /**. 提案前現地調査工程情報登録 */
        public static final String BEFOREWORKTIMINGSINSERT_TITLE = "提案前現地調査共有部状況情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. 提案前現地調査共有部状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**.提案前現地調査共有部状況情報登録値桁目 */
        public static final int TIMINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 工事前現地調査工程情報登録 */
    public static class BEFOREWORKPROJECTINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "02";

        /**. 工程名 */
        public static final String PROCESS_NAME_VALUE = "工事前現地調査";

        /**. 表示順 */
        public static final long DISPLAY_ORDER_VALUE = 1;

        /**. 提案前現地調査工程情報登録 */
        public static final String BEFOREPROJECTINSERT_TITLE = "工事前現地調査工程情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 工事前現地調査作業情報登録 */
    public static class BEFOREWORKWORKINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "02";

        /**. 作業名 */
        public static final String WORK_NAME_VALUE = "現地調査";

        /**. 表示順 */
        public static final long DISPLAY_ORDER_VALUE = 1;

        /**. 工事前現地調査工程情報登録 */
        public static final String BEFOREWORKINSERT_TITLE = "工事前現地調査作業情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 工事前現地調査空状況情報登録 */
    public static class BEFOREEMPTYWORKTIMINGSPRIVATEINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "02";

        /**. 状況名 */
        public static final String WORK_TIMINGS_NAME = "-";

        /**. 撮影必須 */
        public static final String TIMINGS_NEED_PHOTO = "3";

        /**. 工事前現地調査空状況情報登録 */
        public static final String BEFOREWORKTIMINGSINSERT_TITLE = "工事前現地調査空状況情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. 工事前現地調査空状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**.　工事前現地調査空状況情報登録値桁目 */
        public static final int TIMINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 工事前現地調査専有部状況情報登録 */
    public static class BEFOREWORKWORKTIMINGSPRIVATEINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "02";

        /**. 状況名 */
        public static final String WORK_TIMINGS_NAME = "専有部";

        /**. 撮影必須 */
        public static final String TIMINGS_NEED_PHOTO = "3";

        /**. 工事前現地調査工程情報登録 */
        public static final String BEFOREWORKTIMINGSINSERT_TITLE = "工事前現地調査専有部状況情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. 工事前現地調査専有部状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**.　工事前現地調査専有部状況情報登録値桁目 */
        public static final int TIMINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 工事前現地調査共有部状況情報登録 */
    public static class BEFOREWORKWORKTIMINGSPUBLICINSERT {
        /**. 大工程ID */
        public static final String BIGPROCESS_VALUE = "02";

        /**. 状況名 */
        public static final String WORK_TIMINGS_NAME = "共有部";

        /**. 撮影必須 */
        public static final String TIMINGS_NEED_PHOTO = "3";

        /**. 工事前現地調査工程情報登録 */
        public static final String BEFOREWORKTIMINGSINSERT_TITLE = "工事前現地調査共有部状況情報登録";

        /**. 行数 */
        public static final int ROW_NO = 1;

        /**. 工事前現地調査共有部状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**.工事前現地調査共有部状況情報登録値桁目 */
        public static final int TIMINGS_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 工程情報登録 */
    public static class PROCESSINSERT {
        /**. タイトル */
        public static final String TITLE = "工程情報登録";

        /**. 工程情報登録の行数制限 */
        public static final int CSV_PROJECTINSERT_ROW_MAX = 1;

        /**. 工程情報登録フィールド値桁目 */
        public static final int PROJECTINSERT_FIELD_COUNT = 0;

        /**. 工程 */
        public static final String PROCESS_INFO = "工程";
    }

    /**. 作業情報登録 */
    public static class WORKINSERT {
        /**. タイトル */
        public static final String TITLE = "作業情報登録";

        /**. 作業情報登録の行数制限 */
        public static final int CSV_WORKINSERT_ROW_MAX = 1;

        /**. 作業情報登録フィールド値桁目 */
        public static final int WORKINSERT_FIELD_COUNT = 0;

        /**. 作業 */
        public static final String WORK_INFO = "作業";
    }

    /**. 施工前状況情報登録 */
    public static class BEFOREWORKTIMINGINSERT {
        /**. タイトル */
        public static final String TITLE = "施工前状況情報登録";

        /**. 施工前状況情報登録の行数制限 */
        public static final String WORK_TIMINGS_NAME = "施工前";

        /**. 施工前状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**. 施工前状況情報登録フィールド値桁目 */
        public static final int TIMINGSINSERT_FIELD_COUNT = 0;
    }

    /**. 施工中状況情報登録 */
    public static class MIDDLEWORKTIMINGINSERT {
        /**. タイトル */
        public static final String TITLE = "施工中状況情報登録";

        /**. 施工中状況情報登録の行数制限 */
        public static final String WORK_TIMINGS_NAME = "施工中";

        /**. 施工中状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**. 施工中状況情報登録フィールド値桁目 */
        public static final int TIMINGSINSERT_FIELD_COUNT = 0;
    }

    /**. 施工後状況情報登録 */
    public static class AFTERWORKTIMINGINSERT {
        /**. タイトル */
        public static final String TITLE = "施工後状況情報登録";

        /**. 施工後状況情報登録の行数制限 */
        public static final String WORK_TIMINGS_NAME = "施工後";

        /**. 施工後状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**. 施工後状況情報登録フィールド値桁目 */
        public static final int TIMINGSINSERT_FIELD_COUNT = 0;
    }

    /**. 運用中状況情報登録 */
    public static class RUNNINGWORKTIMINGINSERT {
        /**. タイトル */
        public static final String TITLE = "運用中状況情報登録";

        /**. 運用中状況情報登録の行数制限 */
        public static final String WORK_TIMINGS_NAME = "運用中";

        /**. 運用中状況情報登録の行数制限 */
        public static final int CSV_TIMINGS_ROW_MAX = 1;

        /**. 運用中状況情報登録フィールド値桁目 */
        public static final int TIMINGSINSERT_FIELD_COUNT = 0;

        /**. 撮影必須 */
        public static final String NEED_PHOTO = "4";
    }

    /**. 立会人情報登録 */
    public static class WITNESSINSERT {
        /**. タイトル */
        public static final String TITLE = "立会人情報登録";

        /**. 立会人情報登録の行数制限 */
        public static final int CSV_WITNESS_ROW_MAX = 1;

        /**. 立会人情報登録フィールド値桁目 */
        public static final int WITNESSINSERT_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 黒板表示項目指定情報登録 */
    public static class BLACKBOARDDISPLAYINSERT {
        /**. タイトル */
        public static final String TITLE = "黒板表示項目指定情報登録";

        /**. 黒板表示項目指定情報登録の行数制限 */
        public static final int CSV_BLACKBOARDDISPLAY_ROW_MAX = 1;

        /**. 黒板表示項目指定情報登録フィールド値桁目 */
        public static final int BLACKBOARDDISPLAYINSERT_FIELD_COUNT = 0;

        /**. エラー初期行目 */
        public static final int ERR_ROW_NO = 2;
    }

    /**. 物件フロアマスタ登録 */
    public static class FLOORSINSERT {
        /**. タイトル */
        public static final String TITLE = "物件フロアマスタ登録";

        /**. 物件フロアマスタの行数制限 */
        public static final int CSV_FLOORS_ROW_MAX = 1;

        /**. 物件フロアマスタフィールド値桁目 */
        public static final int FLOORS_FIELD_COUNT = 0;
    }

    /**. 物件部屋マスタ登録 */
    public static class ROOMSINSERT {
        /**. タイトル */
        public static final String TITLE = "物件部屋マスタ登録";

        /**. 物件部屋マスタの行数制限 */
        public static final int CSV_ROOMS_ROW_MAX = 1;

        /**. 物件部屋マスタフィールド値桁目 */
        public static final int ROOMS_FIELD_COUNT = 0;
    }

    /**. 物件場所マスタ登録 */
    public static class PLACESESINSERT {
        /**. タイトル */
        public static final String TITLE = "物件場所マスタ登録";

        /**. 物件場所マスタの行数制限 */
        public static final int CSV_PLACESES_ROW_MAX = 1;

        /**. 物件場所マスタフィールド値桁目 */
        public static final int PLACESES_FIELD_COUNT = 0;
    }

    /**. CSVファイルリスポンス */
    public class CSV_FILE_RESPONSE {
        /**. index 1 */
        public static final int INDEX_0 = 0;
        /**. index 2 */
        public static final int INDEX_1 = 1;
    }

    /**. CSV処理区分、1.登録、2.更新、3.削除 */
    public static final String CSV_RECORD_KUBUN_INSERT = "1";
    public static final String CSV_RECORD_KUBUN_UPDATE = "2";
    public static final String CSV_RECORD_KUBUN_DELETE = "3";
    /**. CSVファイルセッションキー */
    public static final String API1404_CSV_FILE_SESSION_PROG_ERROR = "api1404ProgErr";
    public static final String API1404_CSV_FILE_SESSION_RESINFO = "api1404ResInfo";
    public static final String API1404_CSV_FILE_SESSION_NO = "api1404No";
    public static final String API1404_CSV_FILE_SESSION_TITLE = "api1404Title";
    public static final String API1404_CSV_FILE_SESSION_TABLE = "api1404Table";
    public static final String API1404_CSV_FILE_SESSION_ERRKBN = "api1404Errkbn";
    public static final String API1404_CSV_FILE_SESSION_NUM = "api1404Num";
    public static final String API1403_CSV_FILE_SESSION_NUM = "api1403Num";
    public static final String API1403_CSV_FILE_SESSION_NO = "api1403No";
    public static final String API1403_CSV_FILE_SESSION_TITLE = "api1403Title";
    public static final String API1403_CSV_FILE_SESSION_PROG_ERROR = "api1403ProgErr";
    public static final String API1403_CSV_FILE_SESSION_RESINFO = "api1403ResInfo";
    public static final String API1403_CSV_FILE_SESSION_ERRKBN = "api1403Errkbn";
    public static final String API1403_CSV_FILE_SESSION_ERRTABLE = "api1403ErrTable";
    public static final String API1402_CSV_FILE_SESSION_NUM = "api1402Num";
    public static final String API1401_CSV_FILE_SESSION_NUM = "api1401Num";
    public static final String API1401_CSV_FILE_SESSION_RESINFO = "api1401ResInfo";
    public static final String API1401_CSV_FILE_SESSION_PROG_ERROR = "api1401ProgErr";
    public static final String API1402_CSV_FILE_SESSION_RESINFO = "api1402ResInfo";
    public static final String API1402_CSV_FILE_SESSION_PROG_ERROR = "api1402ProgErr";
    /**. CSV新規IDセッションキー */
    public static final String API1403_CSV_FLOOR_ROOM_PLACE_LIST = "api1403FloorRoomPlaceList";
    /**. API1401サービスセッションエラー情報 */
    public static final String API1401_CSV_COMPANIES_EMTY_ERROR = "会社が存在ない、異常終了発生。";
    public static final String API1401_CSV_COMPANIES_SAVE_ERROR = "会社が存在、異常終了発生。";
    public static final String API1401_CSV_COMPANIES_UPDATE_ERROR = "会社IDが存在しない、異常終了発生。";
    public static final String API1401_CSV_COMPANIES_DELETE_ERROR = "会社IDが存在しない、異常終了発生。";
    public static final String API1401_CSV_USERS_SAVE_ERROR = "ユーザーが存在、異常終了発生。";
    public static final String API1401_CSV_USERS_EMTY_ERROR = "ユーザーが存在、異常終了発生。";
    public static final String API1401_CSV_USERS_ERROR = "会社IDが存在しない、異常終了発生。";
    /**. API1402サービスセッションエラー情報 */
    public static final String API1402_CSV_BUILDINGS_SAVE_ERROR = "物件が存在、異常終了発生。";
    public static final String API1402_CSV_BUILDINGS_EMTY_ERROR = "物件が存在しない、異常終了発生。";
    /**. エクセプションエラー種類 */
    public static final String THROWS_RUNTIMEEXCEPTION = "throws runtimeexception";
    public static final String THROWS_EXCEPTION = "throws exception";

    /**. マップの値を分ける */
    public static final String SLASH_DOT = "\\.";

    /**. 新規行 */
    public static final String NEW_LINE_SEPARATOR_RN = "\r\n";

    /**. 新規行 */
    public static final String NEW_LINE_SEPARATOR = "\n";

    /**. 半角空白 */
    public static final String HANKAKU_SPACE = " ";

    /**. コンマ */
    public static final String COMMA = ",";

    /**. オウンドバー ダブルクォーテーション */
    public static final String UNDERBAR_DOUBLE_QUOTATION = "_";

    /**. オウンドバー シングルクォーテーション */
    public static final char UNDERBAR_SINGLE_QUOTATION = '_';

    /**. 読点 */
    public static final String TOTEN = "、";

    /**. クエスチョンマーク */
    public static final String QUESTION_MARK = "?";

    /**. ドット */
    public static final String DOT = ".";

    /**. ドット使用 */
    public static final String DOT_USING = "\\.";

    /**. スラッシュ */
    public static final String PATH_SLASH = "/";

    /**. ハイフン */
    public static final String PATH_HAIFUN = "-";

    /**. ハイフン */
    public static final String PATH_ATOMARK = "@";

    /**. 半角コロン */
    public static final String PATH_COLON = ":";

    /**. 全角コロン */
    public static final String PATH_COLON_ZENKAKU = "：";

    /**. アステリスク */
    public static final String PATH_ASTERISK = "*";

    /**. ダブルアステリスク */
    public static final String PATH_DOUBLE_ASTERISK = "**";

    /**. 入力CSVのS3相対パスの前半 */
    public static final String PATH_CSV_FILE = "presetting-upload";

    /**. API1401名 */
    public static final String API1401_NAME = "API1401";

    /**. API1402名 */
    public static final String API1402_NAME = "API1402";

    /**. API1403名 */
    public static final String API1403_NAME = "API1403";

    /**. API1404名 */
    public static final String API1404_NAME = "API1404";

    /**. データ変更件数： */
    public static final String LOGGER_UPDATE_DATE_COUNT = "データ変更件数： ";

    /**. データ削除件数： */
    public static final String LOGGER_DELETE_DATE_COUNT = "データ削除件数： ";

    /**. 繰り返しに処理開始位置 */
    public static final int FOR_BEGIN_0 = 0;

    /**. 文字列処理開始位置 */
    public static final int SUBSTRING_BEGIN_INDEX_0 = 0;

    /**. 変数値 */
    public static final int VARIABLE_INITIAL = 0;

    /**. 増大値 */
    public static final int INCREMENT_VALUE = 1;

    /**. 間違い行数 */
    public static final int ERROR_ROW_NO = 0;

    /**. リストインデックス */
    public static final int LIST_INDEX_0 = 0;

    public class TOKEN_INFO {
        /**. トークンキーファイルのパス */
        public static final String JWK_FILE_PREFIX = "json/";

        /**. トークンキーファイルの拡張子 */
        public static final String JWK_FILE_SUFFIX = ".json";

        /**. トークンキー送信データファイルの拡張子 */
        public static final String JWK_FILE_SUFFIX_JSON_QUOTE = ".json'";

        /**. 写真一覧JSONファイル名 */
        public static final String JSON_FILE_NAME = "'json'_yyyyMMdd_HHmmss'";

        /**. 写真一覧JSONファイル名 */
        public static final String API0501_JSON = "API0501_JSON";

        /**. トークン情報の構成のパーツ数 */
        public static final int JWT_PARTS = 3;

        /**. トークンタイトル */
        public static final String TOKEN_TITLE = "?X-Amz-Security-Token";
    }

    /**. 写真ファイルの拡張子 */
    public static final String GZ_FILE_SUFFIX = ".jpeg";

    /**. 写真ファイルの一時ファイルの拡張子 */
    public static final String GZ_FILE_SUFFIX_JPEG = "jpeg";

    /**. 写真パース：オウンドバー */
    public static final String PATH_UNDERBAR = "_";

    /**. 写真パース：スラッシュ */
    public static final String PATH_SPLIT_1 = "/";

    /**. 写真パスの最大桁数 */
    public static final int MAX_PHOTO_PATH_LENGTH = 500;

    /**. DBにphotoの数値 */
    public static final String LIMIT = "9999999999999999999";

    /**. タイムゾーン：JST */
    public static final String TIMEZONE_JST = "JST";

    /**. 空文字列 */
    public static final String EMPTY_STRING = Const.EMPTY_STRING;

    /**. NULL文字列 */
    public static final String NULL_STRING = "null";

    /**. リクエスト属性(ユーザID) */
    public static final String REQ_ATTR_USER_ID = "X-USER-ID";
    /**. リクエスト属性(権限ID) */
    public static final String REQ_ATTR_AUTHOR_ID = "X-AUTHOR_ID";

    /**. アップロードファイルがAWSに存在 */
    public static final String FILE_EXISTENCE = "file existence";

    /**. CSVファイルのAWSのパス */
    public static final String CSV_FILE_PATH = Const.EMPTY_STRING;

    /**. CSVファイルの拡張子 */
    public static final String CSV_FILE_SUFFIX = ".csv";

    /**. CSVファイルの拡張子の値 */
    public static final String CSV_FILE_SUFFIX_VALUE = "csv";

    /**. 出力CSVファイル名の前半 */
    public static final String CSV_FILE_PREFIX_OUTPUT = "output_";

    /**. 入力CSVファイル名の前半 */
    public static final String CSV_FILE_PREFIX_INPUT = "input_";

    /**. CSVファイル名の%20 */
    public static final String CSV_FILE_PROCENT_20 = "%20";

    /**. CSVファイル名の半角空白 */
    public static final String CSV_FILE_HANKAKU_SPACE = " ";

    /**. CSVファイル生成フォーマット */
    public static final String CSV_CREATE_UTF8 = "UTF-8";

    /**. CSVファイル生成バイナリ */
    public static final int CSV_CREATE_BINARY = 1024;

    /**. 同期CSVファイルパス */
    public static final String SYNC_CSV_PATH = "sync-csv/";

    /**. 同期CSVファイル名（ユーザマスタ） */
    public static final String SYNC_CSV_FILE_USERS = "users";
    
    /**. CSV File Name（agents csv） */
    public static final String SYNC_CSV_FILE_AGENTS = "agents";

    /**. 同期CSVファイル名（ユーザ担当管理マスタ） */
    public static final String SYNC_CSV_FILE_USER_CHARGE_MANAGEMENT = "user_charge_management";

    /**. ユーザCSV登録 */
    public static final String UPLOAD_CSV_API1401 = "ユーザCSV登録";
    /**. 物件CSV登録 */
    public static final String UPLOAD_CSV_API1402 = "物件CSV登録";
    /**. 物件フロア・部屋・場所CSV登録 */
    public static final String UPLOAD_CSV_API1403 = "物件フロア・部屋・場所CSV登録";
    /**. 案件情報CSV登録 */
    public static final String UPLOAD_CSV_API1404 = "案件情報CSV登録";

    /**. CSVファイルヘッダ設定 */
    public class CSVHEADER {
        public static final String CSV_CONTENT_DISPOSITION = "Content-Disposition";
        public static final String CSV_ACCESS_HEADERS = "Access-Control-Expose-Headers";
        public static final String CSV_ATTACHMENT_FILENAME = "attachment;filename=";
        public static final String CSV_CONTENT_LENGTH = "Content-Length";
        public static final String CSV_CONTENT_STEAM = "application/octet-stream";
        public static final String CSV_HEADER_RESULT_CODE = "x-resultCode";
        public static final String CSV_HEADER_MESSAGE_CODE = "x-messageCode";
        public static final String CSV_HEADER_MESSAGE = "x-message";
        public static final String CSV_HEADER_FILE_NAME = "attachment; filename=";
    }

    /**. Excelファイルヘッダ設定 */
    public class EXCELHEADER {
        public static final String EXCEL_CONTENT_DISPOSITION = "Content-Disposition";
        public static final String EXCEL_ACCESS_HEADERS = "Access-Control-Expose-Headers";
        public static final String EXCEL_ATTACHMENT_FILENAME = "attachment;filename=";
        public static final String EXCEL_CONTENT_LENGTH = "Content-Length";
        public static final String EXCEL_CONTENT_STEAM = "application/octet-stream";
        public static final String EXCEL_HEADER_RESULT_CODE = "x-resultCode";
        public static final String EXCEL_HEADER_MESSAGE_CODE = "x-messageCode";
        public static final String EXCEL_HEADER_MESSAGE = "x-message";
        public static final String EXCEL_HEADER_FILE_NAME = "attachment; filename=";
    }

    public class MANAGEMENTFILE {

        /**. Agents CSV Info */
        public class CSV_AGENTS_FIELD {
            public static final String CORP_ID = "corpId";
            public static final String REQ_ID = "reqId";
            public static final String TS = "ts";
            public static final String MONEY = "money";
            public static final String SP_ID = "spId";
            public static final String PROV_ID = "provId";
            public static final String NUMBER = "number";
            public static final String RET_URL = "retUrl";
            public static final String SIGN = "sign";
        }
    	
        /**. 同期ファイルフィールド */
        public class CSV_DOUKI_FIELD {
            public static final String SHORI_KUBUN = "処理区分";
            public static final String USER_ID = "ユーザID";
            public static final String USER_NAME = "ユーザ名";
            public static final String PASSWORD = "パスワード";
            public static final String COMPANY_ID = "会社ID";
            public static final String KENGEN_ID = "権限ID";
            public static final String MAIL_ADDRESS = "メールアドレス";
            public static final String COMPANY_NAME = "会社名";
            public static final String BUILDING_ID = "物件ID";
            public static final String PROJECT_ID = "案件ID";
            public static final String USER_KUBUN = "ユーザ処理区分";
            public static final String COMPANY_KUBUN = "会社処理区分";
        }

        /**. %sのマーク */
        public static final String PDF_FOLDER = "pdf";

        /**. %sのマーク */
        public static final String S_MARK = "%s";

        /**. ユーザ担当管理マスタ登録処理同期ファイルのフィールド数 */
        public static final int USER_CHARGE_NUM = 4;

        /**. ユーザマスタ登録処理同期ファイルのフィールド数13 */
        public static final int USER_NUM_13 = 13;
        
        /**. ユーザマスタ登録処理同期ファイルのフィールド数9 */
        public static final int USER_NUM_9 = 9;
        
        /**. ユーザマスタ登録処理同期ファイルのフィールド数7 */
        public static final int USER_NUM = 7;

        /**. マイナス1 */
        public static final int MINUS_1 = 1;

        /**. データ登録初期数 */
        public static final int STRING_BEGIN = 1;

        public class FIELD {
            /**. ユーザID桁 */
            public static final int CSV_USER_ID = 0;

            /**. 登録CSVファイル名桁 */
            public static final int CSV_FILE_NAME = 1;

            /**. 登録CSV仕様桁 */
            public static final int CSV_DESIGN = 2;

            /**. CSVナンバー桁 */
            public static final int CSV_NO = 3;

            /**. CSVタイトル桁 */
            public static final int CSV_TITLE = 4;

            /**. 回数桁 */
            public static final int CSV_TIMES = 5;

            /**. 復帰完了桁 */
            public static final int CSV_RETURN = 6;

            /**. エラー行目桁 */
            public static final int CSV_ERROR_NO = 7;

            /**. 処理コード桁 */
            public static final int CSV_RESULT_CODE = 8;

            /**. 処理メッセージ桁 */
            public static final int CSV_RESULT_MSG = 9;
        }

        /**. 復帰完了OK */
        public static final String CSV_RETURN_OK = "OK";

        /**. 復帰完了NG */
        public static final String CSV_RETURN_NG = "NG";

        /**. 回数値1 */
        public static final String CSV_TIMES_1 = "1";

        /**. 回数値2 */
        public static final String CSV_TIMES_2 = "2";
    }

    /**. CSV区分(登録、更新、削除など) */
    public class CsvKuBun {
        public static final String UP_DIF_INSERT = "登録";
        public static final String UP_DIF_UPDATE = "更新";
        public static final String UP_DIF_DELETE = "削除";
        public static final String UP_DIF_NASI = "変更なし";
    }

    /**. 大工程コード設定の妥当性チェック */
    public class BigProcessIdCheck {
        /**. 提案前現地調査 */
        public static final String CHECK_1 = "01";
        /**. 工事前現地調査 */
        public static final String CHECK_2 = "02";
        /**. 施工試運転 */
        public static final String CHECK_3 = "03";
        /**. 運用中 */
        public static final String CHECK_4 = "04";
    }

    /**. 工程削除フラグコード設定の妥当性チェック */
    public class IsProcessDeleteCheck {
        /**. 工程削除有 */
        public static final String CHECK_1 = "1";
        /**. 工程削除無 */
        public static final String CHECK_0 = "0";
    }

    /**. 黒板出力有無コード設定の妥当性チェック */
    public class BlackboardDisplayCheck {
        /**. 黒板出力有無=ON */
        public static final String CHECK_ON = "1";
        /**. 黒板出力有無=OFF */
        public static final String CHECK_OFF = "2";
    }

    /**. 作業判定コード設定の妥当性チェック */
    public class WorksCheck {
        /**. 作業判定が不要な場合 */
        public static final String CHECK_FLAG = "1";
        /**. 作業判定=OK */
        public static final String CHECK_OK = "2";
        /**. 作業判定=NG */
        public static final String CHECK_NG = "3";
    }

    /**. フラッシュ機能制御コード設定の妥当性チェック */
    public class FlashCheck {
        /**. 撮影時、端末のフラッシュ機能を使用する */
        public static final String CHECK_ON = "1";
        /**. 端末のフラッシュ機能を使用しない */
        public static final String CHECK_OFF = "2";
        /**. 撮影時、端末の写真撮影機能が判断してフラッシュを作動させる */
        public static final String CHECK_AUTO = "3";
    }

    /**. 写真一覧処理選択の妥当性チェック */
    public class PhotostTreatCheck {
        /**. アップロードの場合 */
        public static final String CHECK_UPDATE = "1";
        /**. 削除の場合 */
        public static final String CHECK_DEL = "2";
    }

    /**. 写真一覧表示方法選択の妥当性チェック */
    public class PhotosChooseCheck {
        /**. フィルタの場合 */
        public static final String CHECK_PARAM = "1";
        /**. ソートの場合 */
        public static final String CHECK_SORT = "2";
        /**. 表示形式 */
        public static final String CHECK_DISPLAY = "3";
    }

    /**. 写真一覧ソートパターンの妥当性チェック */
    public class PhotosSortCheck {
        /**. 工程 */
        public static final String CHECK_PROCESSES = "1";
        /**. 機器 */
        public static final String CHECK_UNITS = "2";
        /**. 日付 */
        public static final String CHECK_DATE = "3";
        /**. フロア */
        public static final String CHECK_FLOOR = "4";
    }

    /**. ソート設定の妥当性チェック */
    public class SortCheck {
        /**. 昇順の場合 */
        public static final String CHECK_ASC = "1";
        /**. 降順の場合 */
        public static final String CHECK_DESC = "2";
    }

    /**. 写真一覧表示形式の妥当性チェック */
    public class PhotosDisplayCheck {
        /**. グリッドの場合 */
        public static final String CHECK_1 = "1";
        /**. リストの場合 */
        public static final String CHECK_2 = "2";
    }

    /**. 写真帳レイアウト配置選択の妥当性チェック */
    public class PhotoReportLayoutCheck {
        /**. 項目名(セレクトボックスの対象項目名) */
        public static final String CHECK_PROJECT_NAME = "1";
        /**. 配置1 */
        public static final String CHECK_CONFIG_1 = "2";
        /**. 配置2 */
        public static final String CHECK_CONFIG_2 = "3";
        /**. 配置3 */
        public static final String CHECK_CONFIG_3 = "4";
        /**. 配置4 */
        public static final String CHECK_CONFIG_4 = "5";
        /**. 配置5 */
        public static final String CHECK_CONFIG_5 = "6";
        /**. 配置6 */
        public static final String CHECK_CONFIG_6 = "7";
        /**. 配置7 */
        public static final String CHECK_CONFIG_7 = "8";
        /**. 配置8 */
        public static final String CHECK_CONFIG_8 = "9";
        /**. 空欄 */
        public static final String CHECK_BLANK = "10";
    }

    /**. 写真帳全体出力順の妥当性チェック */
    public class PhotosOutOrderCheck {
        /**. 工程優先パターン */
        public static final String CHECK_PROCESS = "A";
        /**. フロア優先パターン */
        public static final String CHECK_FLOOR = "B";
    }

    /**. 写真帳1頁出力数の妥当性チェック */
    public class PhotosPageNumCheck {
        /**. 1ページの表示数"2" */
        public static final String CHECK_PAGE_2 = "2";
        /**. 1ページの表示数"3" */
        public static final String CHECK_PAGE_3 = "3";
    }

    /**. PDF、EXCEL両方S3にアップロードするフラグ、1：スマホ　0：PCの妥当性チェック */
    public class PhotosIsMobileCheck {
        /**. 1：スマホ */
        public static final String CHECK_MOBILE_1 = "1";
        /**. 0：PC */
        public static final String CHECK_MOBILE_0 = "0";
    }

    /**. 工事写真メニューコードの妥当性チェック */
    public class PhotosMenuCodeCheck {
        /**. 案件表示 */
        public static final String CHECK_PROJECT = "1";
        /**. 写真撮影 */
        public static final String CHECK_PHOTO = "2";
        /**. 写真一覧 */
        public static final String CHECK_PHOTO_LIST = "3";
        /**. 図面表示 */
        public static final String CHECK_DRAWING = "4";
        /**. 写真帳出力 */
        public static final String CHECK_PHOTO_OUT = "5";
        /**. 工程登録 */
        public static final String CHECK_PROCESS_LOGIN_IN = "6";
        /**. チャットルーム一覧 */
        public static final String CHECK_CHAT_ROOM = "7";
    }

    /**. CSV登録対象設定の妥当性チェック */
    public class CVSLoginInObjectOutCheck {
        /**. ユーザCSV */
        public static final String CHECK_USER_CSV = "01";
        /**. 物件CSV */
        public static final String CHECK_BUILDING_CSV = "02";
        /**. 物件フロア・部屋・場所CSV */
        public static final String CHECK_BUILDING_PLACE_CSV = "03";
        /**. 案件CSV */
        public static final String CHECK_PROJECT_CSV = "04";
        /**. ユーザ担当管理CSV */
        public static final String CHECK_USER_MANAGER_CSV = "05";
        /**. 物件情報CSV */
        public static final String CHECK_BUILDING_INFO_CSV = "06";
        /**. 機器情報CSV */
        public static final String CHECK_UNITS_CSV = "07";
        /**. 工程作業CSV */
        public static final String CHECK_PROCESS_CSV = "08";
        /**. 立会人情報CSV */
        public static final String CHECK_WITNESS_CSV = "09";
        /**. 黒板表示項目情報CSV */
        public static final String CHECK_BLACKBOARD_CSV = "10";
        /**. 案件情報CSV */
        public static final String CHECK_PROJECT_INFO_CSV = "11";
    }

    /**. 権限の妥当性チェック */
    public class AuthorCheck {
        /**. システム管理者 */
        public static final String CHECK_AUTHOR_01 = "1";
        /**. DAT/サービス工事担当課長 */
        public static final String CHECK_AUTHOR_02 = "2";
        /**. DAT/サービス工事担当 */
        public static final String CHECK_AUTHOR_03 = "3";
        /**. 協力店 職長(主)・作業者(副) */
        public static final String CHECK_AUTHOR_04 = "4";
    }

    /**. 表示フラグの妥当性チェック */
    public class DisplayFlagCheck {
        /**. 非表示 */
        public static final String CHECK_DISPLAY_FLAG_OFF = "0";
        /**. 表示 */
        public static final String CHECK_DISPLAY_FLAG_ON = "1";
    }

    /**. 削除フラグの妥当性チェック */
    public class DeleteFlagCheck {
        /**. 未削除 */
        public static final String CHECK_DEL_FLAG_0 = "0";
        /**. 削除済み */
        public static final String CHECK_DEL_FLAG_1 = "1";
    }

    /**. アカウントロックフラグの妥当性チェック */
    public class AccountLockFlagCheck {
        /**. ロックなし */
        public static final String CHECK_NO_LOCK = "0";
        /**. ロック中 */
        public static final String CHECK_LOCKING = "1";
    }

    /**. 配置フラグの妥当性チェック */
    public class InstallFlagCheck {
        /**. 未設定 */
        public static final String CHECK_NO_SETTING = "0";
        /**. 設定済み */
        public static final String CHECK_SETTING = "1";
    }

    /**. 写真帳出力フラグの妥当性チェック */
    public class AppropriateCheck {
        /**. 出力対象外 */
        public static final String CHECK_OUTPUT_PHOTO_0 = "0";
        /**. 出力対象 */
        public static final String CHECK_OUTPUT_PHOTO_1 = "1";
    }

    /**. 機種区分の妥当性チェック */
    public class ModeltypeDivisionCheck {
        /**. 室外機 */
        public static final String CHECK_ROOM_OUT = "1";
        /**. 室内機 */
        public static final String CHECK_ROOM_IN = "2";
    }

    /**. 事前設定撮影必須項目選択の妥当性チェック */
    public class MustInputItemCheck {
        /**. 室外機のみ必要 */
        public static final String CHECK_ONLY_ROOM_OUT = "1";
        /**. 室内機のみ必要 */
        public static final String CHECK_ONLY_ROOM_IN = "2";
        /**. 室外機、室内機ともに必要 */
        public static final String CHECK_ROOM_OUT_IN = "3";
        /**. 必要なし */
        public static final String CHECK_NONE = "4";
    }

    /**. アクセス許可フラグの妥当性チェック */
    public class AccessFlagCheck {
        /**. 無効 */
        public static final String CHECK_INVALID = "0";
        /**. 有効 */
        public static final String CHECK_VALID = "1";
    }

    /**. 状況設定の妥当性チェック */
    public class TimingSetCheck {
        /**. 施工前 */
        public static final String CHECK_TIMING_SET_1 = "1";
        /**. 施工中 */
        public static final String CHECK_TIMING_SET_2 = "2";
        /**. 施工後 */
        public static final String CHECK_TIMING_SET_3 = "3";
        /**. 運用中 */
        public static final String CHECK_TIMING_SET_4 = "4";
        /**. 専有部 */
        public static final String CHECK_TIMING_SET_5 = "5";
        /**. 共有部 */
        public static final String CHECK_TIMING_SET_6 = "6";
    }

    /**. 登録区分の妥当性チェック */
    public class LoginInDivisionCheck {
        /**. 登録 */
        public static final String CHECK_LOGIN_IN = "1";
        /**. 更新 */
        public static final String CHECK_UPDATE = "2";
        /**. 削除 */
        public static final String CHECK_DELETE = "3";
        /**. 変更なし */
        public static final String CHECK_NONE = "4";
    }

    /**. 処理結果コードの妥当性チェック */
    public class ResultCheck {
        /**. 正常終了 */
        public static final String CHECK_DONE = "1";
        /**. エラー終了 */
        public static final String CHECK_ERROE = "2";
        /**. 異常終了 */
        public static final String CHECK_EXCEPTION = "3";
    }

    /**. 表示順の範囲チェック */
    public class DisplayOrderCheck {
        /**. 表示順の最小値 */
        public static final int DISPLAY_ORDER_MIN = 1;
        /**. 表示順の最大値 */
        public static final int DISPLAY_ORDER_MAX = 99;
    }

    /**. 操作端末区分チェック */
    public class DeviceCodeCheck {
        /**. PC */
        public static final String PC_DEVICE = "1";
        /**. スマホ(モバイル端末) */
        public static final String SP_DEVICE = "2";
    }

    /**. 文字列Unitcodeタイプ */
    public class UNITCODE_TYPE {
        /**. ISO-8859-1 */
        public static final String ISO_8859_1 = "ISO-8859-1";
        /**. UTF-8 */
        public static final String UTF_8 = "UTF-8";
        /**. GB2312 */
        public static final String GB2312 = "GB2312";
        /**. GBK */
        public static final String GBK = "GBK";
    }

    /**. 处理正常结束。 */
    public static final String I000001 = "I000001"; 

    /**. 单项目错误确认。 */
    public static final String E000001 = "E000001";
    
    /**. 图片上传失败。 */
    public static final String E000005 = "E000005";
    
    /**. 必填项。 */
    public static final String E000008 = "E000008";  
    
    /**. 人脸图片有误。 */
    public static final String E000009 = "E000009"; 
    
    /**. 人脸检测失败。 */
    public static final String E000010 = "E000010"; 
    
    /**. 人脸识别对比失败。 */
    public static final String E000011 = "E000011";
    
    /**. 数据库连接发生错误。 */
    public static final String E000015 = "E000015";
    
    /**. 发送数据准备发生错误。 */
    public static final String E000016 = "E000016";
    
    /**. redis报错。 */
    public static final String E000017 = "E000017";
    
    /**. sign编码不正确。 */
    public static final String E000018 = "E000018";
    
    /**. 该用户已存在。 */
    public static final String E000019 = "E000019";
    
    /**. 该用户不存在。 */
    public static final String E000020 = "E000020";
    
    /**. 其他人正在编辑中，请稍后再试。 */
    public static final String E000048 = "E000048";
    
    /**. 処理が正常に終了しました */
    public static final String I00001 = "I00001";

    /**. 登録が完了しました */
    public static final String I00002 = "I00002";

    /**. 更新が完了しました */
    public static final String I00003 = "I00003";

    /**. 削除が完了しました */
    public static final String I00004 = "I00004";

    /**. アップロードが完了しました */
    public static final String I00005 = "I00005";

    /**. 選択されたピンは既に図面に登録されています */
    public static final String I00020 = "I00020";

    /**. 検索結果が{0}件を超えたため表示されていないデータがあります。条件検索してください */
    public static final String I00026 = "I00026";

    /**. 出力対象の工程・作業数が多過ぎます。（選択した工程・作業の写真数：{0}枚）写真帳帳票に出力可能な写真数は一度に2,000枚迄です */
    public static final String E00003 = "E00003";

    /**. 対象のアップロードに失敗しました */
    public static final String E00005 = "E00005";

    /**. {1}の値が不正です */
    public static final String E00009 = "E00009";

    /**. エラーが発生しました。写真をアップロードできません */
    public static final String E00016 = "E00016";

    /**. ユーザID、または現在パスワードが不正です。再度入力してください */
    public static final String E00019 = "E00019";

    /**. {1}行目:入力項目の列数に誤りがあります。 */
    public static final String E00032 = "E00032";

    /**. 更新対象がありません */
    public static final String E00044 = "E00044";

    /**. 追加登録できませんでした。登録できる{0}は99件までです */
    public static final String E00045 = "E00045";

    /**. システムエラーが発生しました */
    public static final String E00024 = "E00024";

    /**. 他の人が編集作業中です。時間をおいてから再度処理をおこなってください */
    public static final String E00048 = "E00048";

    /**. リクエストのヘッダートークンが不正です。(リクエストヘッダー = {0}) */
    public static final String E00049 = "E00049";

    /**. 必須項目に値が設定されていません。(CSVパス = {0}、 エラー項目 = {1}) */
    public static final String E00050 = "E00050";

    /**. 登録用CSVファイルが存在しません。(ファイルパス = {0}) */
    public static final String E00052 = "E00052";

    /**. CSVファイルにレコードが存在しません。(ファイルパス = {0}) */
    public static final String E00053 = "E00053";

    /**. 値の設定は必須です。(対象項目 = {0}) */
    public static final String E00054 = "E00054";

    /**. 値の形式が不正です。(対象項目 = {0}) */
    public static final String E00055 = "E00055";

    /**. 桁数数が不正です。(対象項目 = {0}) */
    public static final String E00056 = "E00056";

    /**. 機器名複数設定エラー。室外機、室内機両方に名称が設定されています */
    public static final String E00058 = "E00058";

    /**. 登録区分が不正です。(フロア登録区分 = {0}、部屋登録区分 = {1}、場所登録区分 = {2}) */
    public static final String E00059 = "E00059";

    /**. 登録区分が全て変更無しと設定されています。(対象項目 = {0}) */
    public static final String E00060 = "E00060";

    /**. 取得時に異常終了発生。(エラー発生テーブル名 = {0}) */
    public static final String E00063 = "E00063";

    /**. 写真帳出力対象の変更に失敗しました */
    public static final String E00064 = "E00064";

    /**. 選択したファイルがPDFファイルではありません。PDFファイルを選択してください */
    public static final String E00071 = "E00071";

    /**. 指定したPDFファイルが存在しません */
    public static final String E00072 = "E00072";

    /**. CSVで指定したPDFファイルをすべて参照してください */
    public static final String E00073 = "E00073";

    /**. 選択された工程の写真が存在しません。出力対象を再度ご確認ください */
    public static final String E00074 = "E00074";

    /**. 新しいパスワードは現在のパスワードと異なるパスワードとしてください */
    public static final String E00075 = "E00075";

    /**. オフライン状態のため処理できません。オンライン状態の時に操作してください */
    public static final String E00076 = "E00076";

    /**. 対象物件を選択してください */
    public static final String E00078 = "E00078";

    /**. CSVファイルを選択してください */
    public static final String E00079 = "E00079";

    /**. 選択した図面ファイルサイズが上限を超えています。8MB以下の図面ファイルを指定してください */
    public static final String E00080 = "E00080";

    /**. 図面ファイルのアップロード処理に失敗しました。再度実行しても同じエラーが発生する場合は、システム管理者({0})にお問い合わせください */
    public static final String E00081 = "E00081";

    /**. AWSサービスにおいて、予期せぬエラーが発生しました。システム管理者にお問い合わせ下さい */
    public static final String E00082 = "E00082";

    /**. 対象データが0件のため、実行できませんでした */
    public static final String E00083 = "E00083";

    /**. {0}データ取込時に{1}の不正が1件以上ありました */
    public static final String E00084 = "E00084";

    /**. {0}登録時に{1}でデータ抽出が失敗しました */
    public static final String E00085 = "E00085";

    /**. {0}が失敗しました */
    public static final String E00086 = "E00086";

    /**. CSVダウンロードファイル生成に失敗しました */
    public static final String E00087 = "E00087";

    /**. 登録データが既にテーブルに存在したため、登録に失敗しました。対象テーブル名：{0}、対象項目名：{1} */
    public static final String E00088 = "E00088";

    /**. 削除データがテーブルに存在しないため、削除に失敗しました。対象テーブル名：{0}、対象項目名：{1} */
    public static final String E00089 = "E00089";

    /**. 対象テーブル{0}の操作エラー発生 */
    public static final String E00090 = "E00090";

    /**. 図面ファイルの削除に失敗しました */
    public static final String E00091 = "E00091";

    /**. 自動同期の写真のため、削除できません */
    public static final String E00092 = "E00092";

    /**. 自動同期の写真が選択されていますが、自動同期以外の写真のみ削除します */
    public static final String E00093 = "E00093";

    /**. オフライン状態のため、実行できません。オンライン状態になってから、もう一度実行してください */
    public static final String E00094 = "E00094";

    /**. 写真が選択されていませんので、写真を選択後、もう一度実行してください */
    public static final String E00095 = "E00095";

    /**. 写真帳の対象に変更がありませんでした。写真を１つ以上変更後、もう一度実行してください */
    public static final String E00096 = "E00096";

    /**. オフライン状態で、全てのデータはまだ取得できていませんので、オフライン機能の利用はできません */
    public static final String E00099 = "E00099";

    /**. 登録に必要な情報を取得できません */
    public static final String E00102 = "E00102";

    /**. ログインに失敗した回数が上限を超えた為、一時的にログインを制限しています */
    public static final String E00104 = "E00104";

    /**. 写真をアップロードできませんでした。アップロードできなかった写真を確認するには、写真一覧画面の写真が赤枠で囲まれています。確認してください */
    public static final String E00105 = "E00105";

    /**. アプリでは利用できません。ブラウザをご利用ください */
    public static final String E00106 = "E00106";

    /**. ブラウザでは利用できません。アプリから起動してください */
    public static final String E00107 = "E00107";

    /**. 別のタブで工事写真アプリを開いているため表示できません */
    public static final String E00108 = "E00108";

    /**. 更新データがテーブルに存在しないため、更新に失敗しました。対象テーブル名：{0}、対象項目名：{1} */
    public static final String E00109 = "E00109";

    /**. ユーザID、またはパスワードが不正です。再度入力してください */
    public static final String E00110 = "E00110";

    /**. データ送受信時において、容量制限エラーが発生しました。システム管理者({1})にお問い合わせください */
    public static final String E00113 = "E00113";

    /**. CSVファイルのアップロード処理に失敗しました。再度実行しても同じエラーが発生する場合は、システム管理者({0})にお問い合わせください */
    public static final String E00116 = "E00116";

    /**. 図面ファイルのアップロード処理に失敗しました。再度実行しても同じエラーが発生する場合は、システム管理者({0})にお問い合わせください。 */
    public static final String E00126 = "E00126";

    /**. 図面ファイルのアップロード処理に失敗しました。再度実行しても同じエラーが発生する場合は、システム管理者({0})にお問い合わせください。 */
    public static final String E00127 = "E00127";

    /**. {0}名が重複しています。別の名称を使用してください */
    public static final String E00129 = "E00129";

    /**. 写真帳出力対象の変更に失敗しました。 */
    public static final String E00132 = "E00132";

    /**. 写真帳出力対象の変更に失敗しました。 */
    public static final String E00133 = "E00133";

    /**. CSVファイルのアップロード処理に失敗しました。再度実行しても同じエラーが発生する場合は、システム管理者({0})にお問い合わせください。 */
    public static final String E00151 = "E00151";

    /**. CSVファイルのアップロード処理に失敗しました。再度実行しても同じエラーが発生する場合は、システム管理者({0})にお問い合わせください。 */
    public static final String E00152 = "E00152";

    /**. 登録時に異常終了しました。(エラー発生テーブル名 = {0}) */
    public static final String E00159 = "E00159";

    /**. 登録時に異常終了しました。(エラー発生テーブル名 = {0}) */
    public static final String E00160 = "E00160";

    /**. 削除時に異常終了発生。(エラー発生テーブル名 = {0}) */
    public static final String E00161 = "E00161";

    /**. 削除時に異常終了発生。(エラー発生テーブル名 = {0}) */
    public static final String E00162 = "E00162";

    /**. 更新時に異常終了発生。(エラー発生テーブル名 = {0}) */
    public static final String E00163 = "E00163";

    /**. 更新時に異常終了発生。(エラー発生テーブル名 = {0}) */
    public static final String E00164 = "E00164";

    /**. 単項目チェックエラー */
    public static final String EIF001 = "EIF001";

    /**. 検索時に異常終了発生 */
    public static final String EIF004 = "EIF004";

    /**. 登録時に異常終了発生 */
    public static final String EIF006 = "EIF006";

    /**. 排他エラー */
    public static final String EIF007 = "EIF007";

    /**. 更新時に異常終了発生 */
    public static final String EIF008 = "EIF008";

    /**. 削除時に異常終了発生 */
    public static final String EIF009 = "EIF009";

    /**. 更新時にシステム時間と一致する */
    public static final String EIF010 = "EIF010";

    /**. 工程数は100を超過不可 */
    public static final String EIF011 = "EIF011";

    /**. ダウンロード写真ファイルが作成失敗、ファイル名：{0} */
    public static final String EIF012 = "EIF012";

    /**. ダウンロード写真一時ファイルが削除失敗、ファイル名：{0} */
    public static final String EIF013 = "EIF013";

    /**. 写真帳票生成端末のフラグが不正 */
    public static final String EIF014 = "EIF014";

    /**. データアクセス例外発生 */
    public static final String EIF015 = "EIF015";

    /**. アマゾンS3へのファイルアップロード失敗、ファイル名：{0}。 */
    public static final String EIF016 = "EIF016";

    /**. API上での予期せぬ例外。 */
    public static final String EIF017 = "EIF017";

    /**. 物件情報提供データ取得時のエラー */
    public static final String EIF020 = "EIF020";

    /**. 黒板表示項目指定データ取得時のエラー */
    public static final String EIF021 = "EIF021";

    /**. 状況一覧データ取得時のエラー */
    public static final String EIF022 = "EIF022";

    /**. 立会人情報一覧データ取得時のエラー */
    public static final String EIF023 = "EIF023";

    /**. 写真一覧提供データ（写真一覧リストを抽出時の例外）取得時のエラー */
    public static final String EIF024 = "EIF024";

    /**. 写真一覧提供データ（撮影予定リストを抽出時の例外）取得時のエラー */
    public static final String EIF025 = "EIF025";

    /**. 機器情報データ取得時のエラー */
    public static final String EIF026 = "EIF026";

    /**. 図面情報データ取得時のエラー */
    public static final String EIF027 = "EIF027";

    /**. ピン情報一覧データ取得時のエラー */
    public static final String EIF028 = "EIF028";

    /**. フロア情報一覧データ取得時のエラー */
    public static final String EIF029 = "EIF029";

    /**. 工程・作業情報一覧データ（工程・作業の削除記録を取得する時の例外）取得時のエラー */
    public static final String EIF030 = "EIF030";

    /**. 工程・作業情報一覧データ（工程・作業情報一覧取得の例外）取得時のエラー */
    public static final String EIF031 = "EIF031";

    /**. リクエストのソート設定値チェック */
    public static final String EIF061 = "EIF061";

    /**. リクエストの大工程設定値チェック */
    public static final String EIF068 = "EIF068";

    /**. アクセス許可フラグ妥当性不正. */
    public static final String ECT004 = "ECT004";

    /**. アカウントロックフラグ妥当性が不正. */
    public static final String ECT005 = "ECT005";

    /**. ピン情報配置フラグ妥当性が不正。 */
    public static final String ECT006 = "ECT006";

    /** 半角英数とオウンドバーのみ. */
    public static final String ECT007 = "ECT007";

    /**. 必須項目. */
    public static final String ECT008 = "ECT008";

    /** 半角数字のみ. */
    public static final String ECT009 = "ECT009";

    /** 桁数が範囲外. */
    public static final String ECT010 = "ECT010";

    /** ソート妥当性が不正. */
    public static final String ECT011 = "ECT011";

    /**. 写真帳出力フラグ妥当性が不正. */
    public static final String ECT013 = "ECT013";

    /**. 工程IDと相応する作業IDの一方のみ設定に違反. */
    public static final String ECT014 = "ECT014";

    /**. 黒板表示フラグ妥当性が不正。 */
    public static final String ECT016 = "ECT016";

    /** 大工程ID妥当性が不正. */
    public static final String ECT018 = "ECT018";

    /**. 日付のみ. */
    public static final String ECT019 = "ECT019";

    /**. 大工程IDのコード値が「03」と「04」のみ. */
    public static final String ECT020 = "ECT020";

    /** 出力パターン妥当性が不正. */
    public static final String ECT021 = "ECT021";

    /**. 帳票出力異常終了発生 */
    public static final String ECT025 = "ECT025";

    /**. テーブルのキーが衝突します. */
    public static final String ECT026 = "ECT026";

    /** CSV読み込みが失敗しました. */
    public static final String ECT027 = "ECT027";

    /**. エクセル生成時のエラー */
    public static final String ECT029 = "ECT029";

    /**. エクセル生成のテンプレートファイル取得失敗 */
    public static final String ECT030 = "ECT030";

    /**. アマゾンS3からファイルダウンロード失敗、ファイル名：{0} */
    public static final String ECT031 = "ECT031";

    /**. 対象の物件が存在しません。 */
    public static final String ECT041 = "ECT041";

    /**. 対象のユーザが存在しません。 */
    public static final String ECT042 = "ECT042";

    /**. 不明出力フラグの妥当性が不正です。 */
    public static final String ECT043 = "ECT043";

    /**. 不明出力フラグ妥当性不正。 */
    public static final String ECT048 = "ECT048";

    /**. 対象データが0件のため、実行できませんでした */
    public static final String W00001 = "W00001";

    /**. テンプレートから工程・作業が取得できません。工程登録画面から追加してください */
    public static final String W00006 = "W00006";

    /**. DBテーブルの論理名と物理名 */
    public static class DBTableName {
        /**. 案件マスタの物理名 */
        public static final String PROJECTS_BUTURIMEI = "Projects";
        /**. 案件マスタの論理名 */
        public static final String PROJECTS_RORIMEI = "案件マスタ";
        /**. ユーザ担当管理マスタの物理名 */
        public static final String USER_CHARGE_MANAGERMENT_BUTURIMEI = "UserChargeManagerment";
        /**. ユーザ担当管理マスタの論理名 */
        public static final String USER_CHARGE_MANAGERMENT_RORIMEI = "ユーザ担当管理マスタ";
        /**. 物件関連ファイルマスタの物理名 */
        public static final String DRAWINGS_MANAGERMENT_BUTURIMEI = "Drawings";
        /**. 物件関連ファイルマスタの論理名 */
        public static final String DRAWINGS_MANAGERMENT_RORIMEI = "物件関連ファイルマスタ";
        /**. 機器マスタの物理名 */
        public static final String UNITS_MANAGERMENT_BUTURIMEI = "Units";
        /**. 機器マスタの論理名 */
        public static final String UNITS_MANAGERMENT_RORIMEI = "機器マスタ";
        /**. 機器場所マスタの物理名 */
        public static final String UNIT_LOCATIONS_MANAGERMENT_BUTURIMEI = "UnitLocations";
        /**. 機器場所マスタの論理名 */
        public static final String UNIT_LOCATIONS_MANAGERMENT_RORIMEI = "機器場所マスタ";
        /**. 機器記号情報の物理名 */
        public static final String UNIT_MARK_MANAGERMENT_BUTURIMEI = "UnitMark";
        /**. 機器記号情報の論理名 */
        public static final String UNIT_MARK_MANAGERMENT_RORIMEI = "機器記号情報";
        /**. 機器情報の物理名 */
        public static final String PROJECTS_UNITS_MANAGERMENT_BUTURIMEI = "ProjectsUnits";
        /**. 機器情報の論理名 */
        public static final String PROJECTS_UNITS_MANAGERMENT_RORIMEI = "機器情報";
        /**. 工程情報の物理名 */
        public static final String PROCESSES_MANAGERMENT_BUTURIMEI = "Processes";
        /**. 工程情報の論理名 */
        public static final String PROCESSES_MANAGERMENT_RORIMEI = "工程情報";
        /**. 作業情報の物理名 */
        public static final String WORKS_MANAGERMENT_BUTURIMEI = "Works";
        /**. 作業情報の論理名 */
        public static final String WORKS_MANAGERMENT_RORIMEI = "作業情報";
        /**. 状況情報の物理名 */
        public static final String WORKSTIMINGS_MANAGERMENT_BUTURIMEI = "WorksTimings";
        /**. 状況情報の論理名 */
        public static final String WORKSTIMINGS_MANAGERMENT_RORIMEI = "状況情報";
        /**. 状況マスタの物理名 */
        public static final String TIMINGS_MANAGERMENT_BUTURIMEI = "Timings";
        /**. 状況マスタの論理名 */
        public static final String TIMINGS_MANAGERMENT_RORIMEI = "状況マスタ";
        /**. 立会人情報の物理名 */
        public static final String WITNESS_MANAGERMENT_BUTURIMEI = "Witness";
        /**. 立会人情報の論理名 */
        public static final String WITNESS_MANAGERMENT_RORIMEI = "立会人情報";
        /**. 立会人情報の物理名 */
        public static final String BLACKBOARDS_DISPLAY_MANAGERMENT_BUTURIMEI = "BlackboardsDisplay";
        /**. 立会人情報の論理名 */
        public static final String BLACKBOARDS_DISPLAY_MANAGERMENT_RORIMEI = "黒板表示項目指定情報";
        /**. 物件フロアマスタの物理名 */
        public static final String FLOORS_BUTURIMEI = "floors";
        /**. 物件フロアマスタの論理名 */
        public static final String FLOORS_RORIMEI = "物件フロアマスタ";
        /**. 物件部屋マスタの物理名 */
        public static final String ROOMS_BUTURIMEI = "Rooms";
        /**. 物件部屋マスタの論理名 */
        public static final String ROOMS_RORIMEI = "物件部屋マスタ";
        /**. 物件場所マスタの物理名 */
        public static final String PLACESES_BUTURIMEI = "Placeses";
        /**. 物件場所マスタの論理名 */
        public static final String PLACESES_RORIMEI = "物件場所マスタ";
        /**. 会社マスタの物理名 */
        public static final String COMPANIES_BUTURIMEI = "Companies";
        /**. 会社マスタの論理名 */
        public static final String COMPANIES_RORIMEI = "会社マスタ";
        /**. ユーザマスタの物理名 */
        public static final String USERS_BUTURIMEI = "Users";
        /**. ユーザマスタの論理名 */
        public static final String USERS_RORIMEI = "ユーザマスタ";
        /**. 物件マスタの物理名 */
        public static final String BUILDINGS_BUTURIMEI = "Buildings";
        /**. 物件マスタの論理名 */
        public static final String BUILDINGS_RORIMEI = "物件マスタ";
        /**. 工程テーブル名称 */
        public static final String TABLE_TP = "tp.";
        public static final String TABLE_P = "p.";
        /**. 作業テーブル名称 */
        public static final String TABLE_TW = "tw.";
        public static final String TABLE_W = "w.";
    }

    /**. DB字段的中文名和英文名 */
    public static class DBFieldName {

        /**. 账号英文名 */
        public static final String CORPID_BUTURIMEI = "corpid";
        /**. 账号中文名*/
        public static final String CORPID_RORIMEI = "账号";
    	
        /**. 代理商流水号英文名 */
        public static final String REQID_BUTURIMEI = "reqid";
        /**. 代理商流水号中文名 */
        public static final String REQID_RORIMEI = "代理商流水号";
        
        /**. 时间戳英文名 */
        public static final String TS_BUTURIMEI = "ts";
        /**. 时间戳中文名 */
        public static final String TS_RORIMEI = "时间戳";
        
        /**. 面值（元）英文名 */
        public static final String MONEY_BUTURIMEI = "money";
        /**. 面值（元）中文名 */
        public static final String MONEY_RORIMEI = "面值（元）";
        
        /**. 运营商英文名 */
        public static final String SPID_BUTURIMEI = "spid";
        /**. 运营商中文名 */
        public static final String SPID_RORIMEI = "运营商";
        
        /**. 省份编码英文名 */
        public static final String PROVID_BUTURIMEI = "provid";
        /**. 省份编码中文名 */
        public static final String PROVID_RORIMEI = "省份编码";
        
        /**. 充值号码英文名 */
        public static final String NUMBER_BUTURIMEI = "number";
        /**. 充值号码中文名 */
        public static final String NUMBER_RORIMEI = "充值号码";
        
        /**. 回调地址英文名 */
        public static final String RETURL_BUTURIMEI = "returl";
        /**. 回调地址中文名 */
        public static final String RETURL_RORIMEI = "回调地址";
        
        /**. 签名英文名 */
        public static final String SIGN_BUTURIMEI = "sign";
        /**. 签名中文名 */
        public static final String SIGN_RORIMEI = "签名";
     
        /**. 商户编号 联系运营获取英文名 */
        public static final String MERID_BUTURIMEI = "merid";
        /**. 商户编号 联系运营获取中文名 */
        public static final String MERID_RORIMEI = "商户编号 联系运营获取";
        
        /**. 产品类型英文名 */
        public static final String TYPE_BUTURIMEI = "type";
        /**. 产品类型中文名 */
        public static final String TYPE_RORIMEI = "产品类型";
        
        /**. 充值号码英文名 */
        public static final String RECHARGENO_BUTURIMEI = "rechargeno";
        /**. 充值号码中文名 */
        public static final String RECHARGENO_RORIMEI = "充值号码";
        
        /**. 面值英文名 */
        public static final String AMOUNT_BUTURIMEI = "amount";
        /**. 面值中文名 */
        public static final String AMOUNT_RORIMEI = "面值";
        
        /**. 回调地址英文名 */
        public static final String CALLBACKURL_BUTURIMEI = "callbackurl";
        /**. 回调地址中文名 */
        public static final String CALLBACKURL_RORIMEI = "回调地址";
        
        /**. 运营商编码英文名 */
        public static final String CARRIER_BUTURIMEI = "carrier";
        /**. 运营商编码中文名 */
        public static final String CARRIER_RORIMEI = "运营商编码";
        
        /**. 充值号码所属省份编码英文名 */
        public static final String PROVINCE_BUTURIMEI = "province";
        /**. 充值号码所属省份编码中文名 */
        public static final String PROVINCE_RORIMEI = "充值号码所属省份编码";
        
        /**. 商户订单编号英文名 */
        public static final String ORDERID_BUTURIMEI = "orderid";
        /**. 商户订单编号中文名 */
        public static final String ORDERID_RORIMEI = "商户订单编号";
        
        /**. ソート順キーワード */
        public static final String ORDER_BY = "ORDER BY ";

        /**. 物件ID物理名 */
        public static final String BUILDING_ID_BUTURIMEI = "buildingId";
        /**. 物件ID論理名 */
        public static final String BUILDING_ID_RORIMEI = "物件ID";

        /**. 物件名物理名 */
        public static final String BUILDING_NAME_BUTURIMEI = "buildingName";
        /**. 物件名論理名 */
        public static final String BUILDING_NAME_RORIMEI = "物件名";

        /**. 物件住所(番地)物理名 */
        public static final String ADDRESS_NUMBER_BUTURIMEI = "addressNumber";
        /**. 物件住所(番地)論理名 */
        public static final String ADDRESS_NUMBER_RORIMEI = "物件住所(番地)";

        /**. 物件住所(市区町村)物理名 */
        public static final String ADDRESS_CITY_BUTURIMEI = "addressCity";
        /**. 物件住所(市区町村)論理名 */
        public static final String ADDRESS_CITY_RORIMEI = "物件住所(市区町村)";

        /**. 物件住所(都道府県)物理名 */
        public static final String ADDRESS_PREFECTURE_BUTURIMEI = "addressPrefecture";
        /**. 物件住所(都道府県)論理名 */
        public static final String ADDRESS_PREFECTURE_RORIMEI = "物件住所(都道府県)";

        /**. ユーザID物理名 */
        public static final String USER_ID_BUTURIMEI = "userId";
        /**. ユーザID論理名 */
        public static final String USER_ID_RORIMEI = "ユーザID";
        /**. 一段階ログイン失敗回数物理名 */
        public static final String FIRST_LOGIN_FAIL_COUNT_BUTURIMEI = "firstLoginFailCount";
        /**. 一段階ログイン失敗回数論理名 */
        public static final String FIRST_LOGIN_FAIL_COUNT_RORIMEI = "一段階ログイン失敗回数";

        /**. 部屋ID物理名 */
        public static final String ROOM_ID_BUTURIMEI = "roomId";
        /**. 部屋ID論理名 */
        public static final String ROOM_ID_RORIMEI = "部屋ID";
        /**. 部屋ID物理名 */
        public static final String ROOM_NAME_BUTURIMEI = "roomName";
        /**. 部屋ID論理名 */
        public static final String ROOM_NAME_RORIMEI = "部屋名";
        /**. 場所ID物理名 */
        public static final String PLACE_ID_BUTURIMEI = "placeId";
        /**. 場所ID論理名 */
        public static final String PLACE_ID_RORIMEI = "場所ID";
        /**. 場所名物理名 */
        public static final String PLACE_NAME_BUTURIMEI = "placeName";
        /**. 場所名論理名 */
        public static final String PLACE_NAME_RORIMEI = "場所名";

        /**. フロアID物理名 */
        public static final String FLOOR_ID_BUTURIMEI = "floorId";
        /**. フロアID論理名 */
        public static final String FLOOR_ID_RORIMEI = "フロアID";
        /**. フロア名物理名 */
        public static final String FLOOR_NAME_BUTURIMEI = "floorName";
        /**. フロア名論理名 */
        public static final String FLOOR_NAME_RORIMEI = "フロア名";

        /**. 案件ID物理名 */
        public static final String PROJECT_ID_BUTURIMEI = "projectId";
        /**. 案件ID論理名 */
        public static final String PROJECT_ID_RORIMEI = "案件ID";
        /**. 案件名物理名 */
        public static final String PROJECT_NAME_BUTURIMEI = "projectName";
        /**. 案件名論理名 */
        public static final String PROJECT_NAME_RORIMEI = "案件名";

        /**. 工程ID物理名 */
        public static final String PROCESS_ID_BUTURIMEI = "processId";
        /**. 工程ID論理名 */
        public static final String PROCESS_ID_RORIMEI = "工程ID";
        /**. 工程名の物理名 */
        public static final String PROCESS_NAME_BUTURIMEI = "processName";
        /**. 工程名の論理名 */
        public static final String PROCESS_NAME_RORIMEI = "工程名";

        /**. 工程リスト物理名 */
        public static final String PROCESSES_BUTURIMEI = "processes";
        /**. 工程リスト論理名 */
        public static final String PROCESSES_RORIMEI = "工程リスト";

        /**. 大工程ID物理名 */
        public static final String BIG_PROCESS_ID_BUTURIMEI = "bigProcessId";
        /**. 大工程ID論理名 */
        public static final String BIG_PROCESS_ID_RORIMEI = "大工程ID";

        /**. 更新ユーザ物理名 */
        public static final String UPDATED_BY_BUTURIMEI = "updatedBy";
        /**. 更新ユーザ論理名 */
        public static final String UPDATED_BY_RORIMEI = "更新ユーザ";

        /**. 作業名物理名 */
        public static final String WORK_NAME_BUTURIMEI = "workName";
        /**. 作業名論理名 */
        public static final String WORK_NAME_RORIMEI = "作業名";

        /**. 作業ID物理名 */
        public static final String WORK_ID_BUTURIMEI = "workId";
        /**. 作業ID論理名 */
        public static final String WORK_ID_RORIMEI = "作業ID";

        /**. CSVファイル物理名 */
        public static final String CSV_FILE_BUTURIMEI = "csvFile";
        /**. CSVファイル論理名 */
        public static final String CSV_FILE_RORIMEI = "CSVファイル";

        /**. 表示順物理名 */
        public static final String DISPLAY_ORDER_BUTURIMEI = "displayOrder";
        /**. 表示順論理名 */
        public static final String DISPLAY_ORDER_RORIMEI = "表示順";

        /**. 工程表示順物理名 */
        public static final String DISPLAY_ORDER_TP_BUTURIMEI = "display_order_tp";
        /**. 工程表示順論理名 */
        public static final String DISPLAY_ORDER_TP_RORIMEI = "工程表示順";

        /**. 作業表示順物理名 */
        public static final String DISPLAY_ORDER_TW_BUTURIMEI = "display_order_tw";
        /**. 作業表示順論理名 */
        public static final String DISPLAY_ORDER_TW_RORIMEI = "作業表示順";

        /**. 登録ユーザ物理名 */
        public static final String CREATED_BY_BUTURIMEI = "createdBy";
        /**. 登録ユーザ論理名 */
        public static final String CREATED_BY_RORIMEI = "登録ユーザ";

        /**. 図面ID物理名 */
        public static final String DRAWING_ID_BUTURIMEI = "drawingId";
        /**. 図面ID論理名 */
        public static final String DRAWING_ID_RORIMEI = "図面ID";

        /**. ファイル名称物理名 */
        public static final String FILE_NAME_BUTURIMEI = "fileName";
        /**. ファイル名称論理名 */
        public static final String FILE_NAME_RORIMEI = "ファイル名称";

        /**. ファイルイメージ物理名 */
        public static final String FILE_IMAGE_BUTURIMEI = "fileImage";
        /**. ファイルイメージ論理名 */
        public static final String FILE_IMAGE_RORIMEI = "ファイルイメージ";

        /**. 郵便番号物理名 */
        public static final String BUILDING_ZIP_CODE_BUTURIMEI = "buildingZipCode";
        /**. 郵便番号論理名 */
        public static final String BUILDING_ZIP_CODE_RORIMEI = "郵便番号";

        /**. 都道府県物理名 */
        public static final String BUILDING_ADDRESS_PREFECTURE_BUTURIMEI = "buildingAddressPrefecture";
        /**. 都道府県論理名 */
        public static final String BUILDING_ADDRESS_PREFECTURE_RORIMEI = "都道府県";

        /**. 市区町村物理名 */
        public static final String BUILDING_ADDRESS_CITY_BUTURIMEI = "buildingAddressCity";
        /**. 市区町村論理名 */
        public static final String BUILDING_ADDRESS_CITY_RORIMEI = "市区町村";

        /**. 町名・番地物理名 */
        public static final String BUILDING_ADDRESS_NUMBER_BUTURIMEI = "buildingAddressNumber";
        /**. 町名・番地論理名 */
        public static final String BUILDING_ADDRESS_NUMBER_RORIMEI = "町名・番地";

        /**. 電話番号物理名 */
        public static final String BUILDING_TELEPHONE_NUMBER_BUTURIMEI = "buildingTelephoneNumber";
        /**. 電話番号論理名 */
        public static final String BUILDING_TELEPHONE_NUMBER_RORIMEI = "電話番号";

        /**. 系統名物理名 */
        public static final String LINE_NAME_BUTURIMEI = "lineName";
        /**. 系統名論理名 */
        public static final String LINE_NAME_RORIMEI = "系統名";

        /**. 機種名物理名 */
        public static final String MODEL_TYPE_BUTURIMEI = "modelType";
        /**. 機種名論理名 */
        public static final String MODEL_TYPE_RORIMEI = "機種名";

        /**. 機種区分物理名 */
        public static final String MODEL_KBN_BUTURIMEI = "modelKbn";
        /**. 機種区分論理名 */
        public static final String MODEL_KBN_RORIMEI = "機種区分";

        /**. 記号物理名 */
        public static final String UNIT_MARK_BUTURIMEI = "unitMark";
        /**. 記号論理名 */
        public static final String UNIT_MARK_RORIMEI = "記号";

        /**. 機器ID物理名 */
        public static final String UNIT_ID_BUTURIMEI = "unitId";
        /**. 機器ID論理名 */
        public static final String UNIT_ID_RORIMEI = "機器ID";
        /**. ピンID物理名 */
        public static final String PIN_ID_BUTURIMEI = "pinId";
        /**. ピンID論理名 */
        public static final String PIN_ID_RORIMEI = "ピンID";

        /**. X座標物理名 */
        public static final String POSITION_X_BUTURIMEI = "positionX";
        /**. X座標論理名 */
        public static final String POSITION_X_RORIMEI = "X座標";

        /**. Y座標物理名 */
        public static final String POSITION_Y_BUTURIMEI = "positionY";
        /**. Y座標論理名 */
        public static final String POSITION_Y_RORIMEI = "Y座標";

        /**. 配置フラグ物理名 */
        public static final String INSTALLED_FLG_BUTURIMEI = "installedFlg";
        /**. 配置フラグ論理名 */
        public static final String INSTALLED_FLG_RORIMEI = "配置フラグ";

        /**. 登録ユーザー物理名 */
        public static final String ENTRY_USER_BUTURIMEI = "entryUser";
        /**. 登録ユーザー論理名 */
        public static final String ENTRY_USER_RORIMEI = "登録ユーザー";

        /**. テンプレート工程ID物理名 */
        public static final String TEMPLATE_PROCESSID_BUTURIMEI = "templateProcessId";
        /**. テンプレート工程ID論理名 */
        public static final String TEMPLATE_PROCESSID_RORIMEI = "テンプレート工程ID";

        /**. テンプレート作業ID物理名 */
        public static final String TEMPLATE_WORKID_BUTURIMEI = "templateWorkId";
        /**. テンプレート作業ID論理名 */
        public static final String TEMPLATE_WORKID_RORIMEI = "テンプレート作業ID";

        /**. 作業リスト物理名 */
        public static final String WORKS_BUTURIMEI = "works";
        /**. 作業リスト論理名 */
        public static final String WORKS_RORIMEI = "作業リスト";

        /**. 更新ユーザー物理名 */
        public static final String UPDATE_USER_BUTURIMEI = "updateUser";
        /**. 更新ユーザー論理名 */
        public static final String UPDATE_USER_RORIMEI = "更新ユーザー";

        /**. request更新ユーザー物理名 */
        public static final String UPDATE_REQ_USER_BUTURIMEI = "modifiedUser";
        /**. request更新ユーザー論理名 */
        public static final String UPDATE_REQ_USER_RORIMEI = "更新ユーザー";

        /**. 更新日時物理名 */
        public static final String UPDATE_DATETIME_BUTURIMEI = "updatedDatetime";
        /**. 更新日時論理名 */
        public static final String UPDATE_DATETIME_RORIMEI = "更新日時";

        /**. 連番物理名 */
        public static final String SERIAL_NO_BUTURIMEI = "serialNo";
        /**. 連番論理名 */
        public static final String SERIAL_NO_RORIMEI = "連番";

        /**. アカウントロックフラグ物理名 */
        public static final String IS_ACCOUNT_LOCK_BUTURIMEI = "isAccountlocked";
        /**. アカウントロックフラグ論理名 */
        public static final String IS_ACCOUNT_LOCK_RORIMEI = "アカウントロックフラグ";

        /**. 黒板表示項目指定情報ID物理名 */
        public static final String BLACKBOARD_DISPLAY_ITEM_ID_BUTURIMEI = "blackboardDisplayItemId";
        /**. 黒板表示項目指定情報ID論理名 */
        public static final String BLACKBOARD_DISPLAY_ITEM_ID_RORIMEI = "黒板表示項目指定情報ID";

        /**. ソート項目物理名 */
        public static final String SORT_ITEM_BUTURIMEI = "sortItem";
        /**. ソート項目論理名 */
        public static final String SORT_ITEM_RORIMEI = "ソート項目";

        /**. 昇順/降順物理名 */
        public static final String ORDER_BUTURIMEI = "order";
        /**. 昇順/降順論理名 */
        public static final String ORDER_RORIMEI = "昇順/降順";

        /**. 機種物理名 */
        public static final String MODELTYPE_BUTURIMEI = "modeltype";
        /**. 機種論理名 */
        public static final String MODELTYPE_RORIMEI = "機種";

        /**. 機番物理名 */
        public static final String SERIALNUMBER_BUTURIMEI = "serialNumber";
        /**. 機番論理名 */
        public static final String SERIALNUMBER_RORIMEI = "機番";

        /**. 製造年月物理名 */
        public static final String PRODUCTIONDATE_BUTURIMEI = "productionDate";
        /**. 製造年月論理名 */
        public static final String PRODUCTIONDATE_RORIMEI = "製造年月";

        /**. 更新ユーザID物理名 */
        public static final String UPDATED_USERID_BUTURIMEI = "updatedUserId";
        /**. 更新ユーザID論理名 */
        public static final String UPDATED_USERID_RORIMEI = "更新ユーザID";

        /**. アカウント情報リスト物理名 */
        public static final String ACCOUNTLIST_BUTURIMEI = "accountList";
        /**. アカウント情報リスト論理名 */
        public static final String ACCOUNTLIST_RORIMEI = "アカウント情報リスト";

        /**. 権限ID物理名 */
        public static final String AUTHORITY_ID_BUTURIMEI = "authorityId";
        /**. 権限ID論理名 */
        public static final String AUTHORITY_ID_RORIMEI = "権限ID";

        /**. 利用機能ID物理名 */
        public static final String USE_FUNCTION_ID_BUTURIMEI = "useFunctionId";
        /**. 利用機能ID論理名 */
        public static final String USE_FUNCTION_ID_RORIMEI = "利用機能ID";

        /**. ロック日時物理名 */
        public static final String LOCK_DATETIME_BUTURIMEI = "lockDatetime";
        /**. ロック日時論理名 */
        public static final String LOCK_DATETIME_RORIMEI = "ロック日時";

        /**. 写真リスト物理名 */
        public static final String PHOTOS_BUTURIMEI = "photos";
        /**. 写真リスト論理名 */
        public static final String PHOTOS_RORIMEI = "写真リスト";

        /**. 写真リスト物理名 */
        public static final String DELETEPHOTOS_BUTURIMEI = "deletePhotos";
        /**. 写真リスト論理名 */
        public static final String DELETEPHOTOS_RORIMEI = "写真リスト";

        /**. 撮影端末番号物理名 */
        public static final String PHOTO_TERMINAL_NUMBER_BUTURIMEI = "photoTerminalNo";
        /**. 撮影端末番号論理名 */
        public static final String PHOTO_TERMINAL_NUMBER_RORIMEI = "撮影端末番号";

        /**. 写真ファイル物理名 */
        public static final String PHOTO_FILE_BUTURIMEI = "photoFile";
        /**. 写真ファイル論理名 */
        public static final String PHOTO_FILE_RORIMEI = "写真ファイル";

        /**. 撮影日物理名 */
        public static final String PHOTO_DATE_BUTURIMEI = "photoDate";
        /**. 撮影日論理名 */
        public static final String PHOTO_DATE_RORIMEI = "撮影日";

        /**. 通信端末ID物理名 */
        public static final String TERMINAL_ID_BUTURIMEI = "terminalId";
        /**. 通信端末ID論理名 */
        public static final String TERMINAL_ID_RORIMEI = "通信端末ID";

        /**. 機器ID物理名 */
        public static final String MACHINE_ID_BUTURIMEI = "machineId";
        /**. 機器ID論理名 */
        public static final String MACHINE_ID_RORIMEI = "機器ID";

        /**. 状況ID物理名 */
        public static final String TIMING_ID_BUTURIMEI = "timingId";
        /**. 状況ID論理名 */
        public static final String TIMING_ID_RORIMEI = "状況ID";
        /**. 状況名物理名 */
        public static final String TIMING_NAME_BUTURIMEI = "timingName";
        /**. 状況名論理名 */
        public static final String TIMING_NAME_RORIMEI = "状況名";

        /**. 施工会社ID物理名 */
        public static final String COMPANY_ID_BUTURIMEI = "companyId";
        /**. 施工会社ID論理名 */
        public static final String COMPANY_ID_RORIMEI = "施工会社ID";
        /**. 施工会社名物理名 */
        public static final String COMPANY_NAME_BUTURIMEI = "companyName";
        /**. 施工会社名論理名 */
        public static final String COMPANY_NAME_RORIMEI = "施工会社名";

        /**. 立会者物理名 */
        public static final String WITNESS_BUTURIMEI = "witness";
        /**. 立会者論理名 */
        public static final String WITNESS_RORIMEI = "立会者";

        /**. 立会人ID物理名 */
        public static final String WITNESS_ID_BUTURIMEI = "witnessId";
        /**. 立会人ID論理名 */
        public static final String WITNESS_ID_RORIMEI = "立会人ID";

        /**. 自由欄物理名 */
        public static final String FREE_BUTURIMEI = "free";
        /**. 自由欄論理名 */
        public static final String FREE_RORIMEI = "自由欄";

        /**. 黒板表示フラグ物理名 */
        public static final String IS_BLACKBOARD_DISPLAY_BUTURIMEI = "isBlackBoardDisplay";
        /**. 黒板表示フラグ論理名 */
        public static final String IS_BLACKBOARD_DISPLAY_RORIMEI = "黒板表示フラグ";

        /**. 撮影者物理名 */
        public static final String PHOTO_USER_BUTURIMEI = "photoUser";
        /**. 撮影者論理名 */
        public static final String PHOTO_USER_RORIMEI = "撮影者";

        /**. 写真パス物理名 */
        public static final String PHOTO_PATH_BUTURIMEI = "photoPath";
        /**. 写真パス論理名 */
        public static final String PHOTO_PATH_RORIMEI = "写真パス";

        /**. 写真帳出力フラグ物理名 */
        public static final String IS_OUTPUT_PHOTO_BOOK_BUTURIMEI = "isOutputPhotoBook";
        /**. 写真帳出力フラグ論理名 */
        public static final String IS_OUTPUT_PHOTO_BOOK_RORIMEI = "写真帳出力フラグ";

        /**. 削除フラグ物理名 */
        public static final String IS_DELETED_BUTURIMEI = "isDeleted";
        /**. 削除フラグ論理名 */
        public static final String IS_DELETED_RORIMEI = "削除フラグ";

        /**. 撮影端末番号物理名 */
        public static final String PHOTO_TERMINAL_NUM_BUTURIMEI = "photoTerminalNumber";
        /**. 撮影端末番号論理名 */
        public static final String PHOTO_TERMINAL_NUM_RORIMEI = "撮影端末番号";

        /**. 更新対象リスト物理名 */
        public static final String UPDATE_USER_LIST_BUTURIMEI = "updateUserList";
        /**. 更新対象リスト論理名 */
        public static final String UPDATE_USER_LIST_RORIMEI = "更新対象リスト";

        /**. 端末コード物理名 */
        public static final String DEVICE_CODE_BUTURIMEI = "deviceCode";
        /**. 端末コード論理名 */
        public static final String DEVICE_CODE_RORIMEI = "端末コード";

        /**. アクセス許可フラグ物理名 */
        public static final String IS_ACCESS_APPROVAL_BUTURIMEI = "isAccessApproval";
        /**. アクセス許可フラグ論理名 */
        public static final String IS_ACCESS_APPROVAL_RORIMEI = "アクセス許可フラグ";

        /**. 出力パターン物理名 */
        public static final String OUTPUT_ORDER_PATTERN_BUTURIMEI = "outputOrderPattern";
        /**. 出力パターン論理名 */
        public static final String OUTPUT_ORDER_PATTERN_RORIMEI = "出力パターン";

        /**. 工程表示順物理名 */
        public static final String PROCESS_DISPLAY_ORDER_BUTURIMEI = "processDisplayOrder";
        /**. 工程表示順論理名 */
        public static final String PROCESS_DISPLAY_ORDER_RORIMEI = "工程表示順";

        /**. 作業表示順物理名 */
        public static final String WORK_DISPLAY_ORDER_BUTURIMEI = "workDisplayOrder";
        /**. 作業表示順論理名 */
        public static final String WORK_DISPLAY_ORDER_RORIMEI = "作業表示順";

        /**. フロア表示順物理名 */
        public static final String FLOOR_DISPLAY_ORDER_BUTURIMEI = "floorDisplayOrder";
        /**. フロア表示順論理名 */
        public static final String FLOOR_DISPLAY_ORDER_RORIMEI = "フロア表示順";

        /**. 部屋表示順物理名 */
        public static final String ROOM_DISPLAY_ORDER_BUTURIMEI = "roomDisplayOrder";
        /**. 部屋表示順論理名 */
        public static final String ROOM_DISPLAY_ORDER_RORIMEI = "部屋表示順";

        /**. 場所表示順物理名 */
        public static final String PLACE_DISPLAY_ORDER_BUTURIMEI = "placeDisplayOrder";
        /**. 場所表示順論理名 */
        public static final String PLACE_DISPLAY_ORDER_RORIMEI = "場所表示順";

        /**. 状況表示順物理名 */
        public static final String TIMING_DISPLAY_ORDER_BUTURIMEI = "timingDisplayOrder";
        /**. 状況表示順論理名 */
        public static final String TIMING_DISPLAY_ORDER_RORIMEI = "状況表示順";

        /**. 工程リスト物理名 */
        public static final String PROCESSLIST_BUTURIMEI = "processList";
        /**. 工程リスト論理名 */
        public static final String PROCESSLIST_RORIMEI = "工程リスト";

        /**. 作業リスト物理名 */
        public static final String WORKLIST_BUTURIMEI = "workList";
        /**. 作業リスト論理名 */
        public static final String WORKLIST_RORIMEI = "作業リスト";

        /**. 写真帳帳票物理名 */
        public static final String PHOTO_BOOK_REPORT_BUTURIMEI = "photoBookReport";
        /**. 写真帳帳票論理名 */
        public static final String PHOTO_BOOK_REPORT_RORIMEI = "写真帳帳票";

        /**. 写真帳ファイル名物理名 */
        public static final String PHOTO_REPORT_NAME_BUTURIMEI = "photoReportName";
        /**. 写真帳ファイル名論理名 */
        public static final String PHOTO_REPORT_NAME_RORIMEI = "写真帳ファイル名";

        /**. 削除写真リスト物理名 */
        public static final String DELETE_PHOTO_LIST_BUTURIMEI = "deletePhotoList";
        /**. 削除写真リスト論理名 */
        public static final String DELETE_PHOTO_LIST_RORIMEI = "削除写真リスト";

        /**. 写真リスト物理名 */
        public static final String PHOTO_LIST_BUTURIMEI = "photoList";
        /**. 写真リスト論理名 */
        public static final String PHOTO_LIST_RORIMEI = "写真リスト";

        /**. 配置フラグ物理名 */
        public static final String IS_INSTALLED_BUTURIMEI = "isInstalled";
        /**. 配置フラグ論理名 */
        public static final String IS_INSTALLED_RORIMEI = "配置フラグ";

        /**. アカウント情報リスト物理名 */
        public static final String ACCOUNT_INFO_LIST_BUTURIMEI = "accountInfoList";
        /**. アカウント情報リスト論理名 */
        public static final String ACCOUNT_INFO_LIST_RORIMEI = "アカウント情報リスト";

        public static final class PHOTO {
            /**. 帳票出力区分物理名 */
            public static final String REPORTOUTPUTCLASS_BUTURIMEI = "reportOutputClass";
            /**. 帳票出力区分論理名 */
            public static final String REPORTOUTPUTCLASS_RORIMEI = "帳票出力区分";

            /**. 1ページ表示数物理名 */
            public static final String OUTPUTPERPAGE_BUTURIMEI = "outputPerPage";
            /**. 1ページ表示数論理名 */
            public static final String OUTPUTPERPAGE_RORIMEI = "1ページ表示数";

            /**. 物件案件名物理名 */
            public static final String BUILDINGPROJECT_BUTURIMEI = "buildingProjectName";
            /**. 物件案件名論理名 */
            public static final String BUILDINGPROJECT_RORIMEI = "物件案件名";

            /**. 出力レイアウト物理名 */
            public static final String OUTPUT_RAYOUT_REQ_BUTURIMEI = "outputRayout";
            /**. 出力レイアウト論理名 */
            public static final String OUTPUT_RAYOUT_REQ_RORIMEI = "出力レイアウト";

            /**. 出力情報リスト物理名 */
            public static final String OUTPUT_INFO_LIST_BUTURIMEI = "outputInfoList";
            /**. 出力情報リスト論理名 */
            public static final String OUTPUT_INFO_LIST_RORIMEI = "出力情報リスト";
        }
        
        /**. 人脸图片英文名 */
        public static final String PICTURE_ENGLISH = "pictureFile";
        /**. 人脸图片中文名 */
        public static final String PICTURE_CHINESE = "人脸图片";
    }

    /**. コード表示 */
    public static final String ERROR_CODE = "code: ";
    /**. メッセージ表示 */
    public static final String ERROR_MSG = "message: ";
    /**. 項目エラー */
    public static final String FIELD_ERROR = "wrong field";
    /**. 中かっこ */
    public static final String BRACKET_LEFT = "「";
    public static final String BRACKET_RIGHT = "」";
    /**. 丸かっこ */
    public static final String PARENTHESIS_LEFT = "(";
    public static final String PARENTHESIS_RIGHT = ")";
    /**. シングルクォーテーション */
    public static final String SINGLE_QUOTATION_LEFT = "'";
    public static final String SINGLE_QUOTATION_RIGHT = "'";
    /**. 不明データが最後にする */
    public static final String FUMEI_ORDER_DATA = "zzzzzzzzzzzzzzzzzzzz";

    /**. データ取得件数： */
    public static final String FIND_DATA_COUNT = "データ取得件数： ";
    /**. データ取得件数が2000件 */
    public static final int FIND_DATA_COUNT_2000 = 2000;

    /**. アクセス許可フラグ妥当性チェックエラー */
    public static final String IS_ACCESS_APPROVAL_CHECK_ERROR = "アクセス許可フラグ妥当性チェックエラー";
    /**. 大工程妥当性チェックエラー */
    public static final String BIGPROCESS_CHECK_ERROR = "大工程妥当性チェックエラー";
    /**. 表示順範囲チェックエラー */
    public static final String DISPLAY_ORDER_RANGE_CHECK_ERROR = "表示順範囲チェックエラー";
    /**. 出力パターン妥当性チェックエラー */
    public static final String OUTPUT_ORDER_PATTERN_CHECK_ERROR = "出力パターン妥当性チェックエラー";
    /**. 不明工程出力フラグ妥当性チェックエラー */
    public static final String UNKNOWN_PROCESS_OUTPUT_CHECK_ERROR = "不明工程出力フラグ妥当性チェックエラー";
    /**. 不明作業出力フラグ妥当性チェックエラー */
    public static final String UNKNOWN_WORK_OUTPUT_CHECK_ERROR = "不明作業出力フラグ妥当性チェックエラー";
    /**. アカウントロックフラグ妥当性チェックエラー */
    public static final String IS_ACCOUNTLOCKED_CHECK_ERROR = "アカウントロックフラグ妥当性チェックエラー";
    /**. アカウントロックユニーコードチェックエラー */
    public static final String ACCOUNTLOCKED_UNICODE_CHECK_ERROR = "アカウントロックユニーコードチェックエラー";
    /**. ピン情報配置フラグ妥当性チェックエラー */
    public static final String INSTALLED_FLG_CHECK_ERROR = "ピン情報配置フラグ妥当性チェックエラー";
    /**. ピン情報配置フラグ妥当性チェックエラー */
    public static final String PINS_UNICODE_FLG_CHECK_ERROR = "ピン情報文字コード妥当性チェックエラー";
    /**. 帳票出力区分妥当性チェックエラー */
    public static final String OUTPUT_REPORT_OUTPUT_CHECK_ERROR = "帳票出力区分妥当性チェックエラー";
    /**. 写真帳出力フラグ妥当性チェックエラー */
    public static final String OUTPUT_PHOTO_BOOK_CHECK_ERROR = "写真帳出力フラグ妥当性チェックエラー";
    /**. 配置フラグ妥当性チェックエラー */
    public static final String INSTALL_CHECK_ERROR = "配置フラグ妥当性チェックエラー";
    /**. 黒板表示フラグ妥当性チェックエラー */
    public static final String IS_BLACK_BOARD_DISPLAY_CHECK_ERROR = "黒板表示フラグ妥当性チェックエラー";
    /**. ソート妥当性チェックエラー */
    public static final String SORT_CHECK_ERROR = "ソート妥当性チェックエラー";

    /**. 図面情報エラー */
    public static final String ERRRES_IF0108 = "図面情報エラー";
    /**. 写真帳情報エラー */
    public static final String ERRRES_IF0109 = "写真帳情報エラー";
    /**. 機番情報登録エラー */
    public static final String ERRRES_IF0110 = "機番情報登録エラー";
    /**. 機番情報登録情報 */
    public static final String INFO_IF0110 = "機番情報登録情報：";
    /**. 立会人情報一覧取得エラー */
    public static final String ERRRES_API0304 = "立会人情報一覧取得エラー";
    /**. 写真情報登録エラー */
    public static final String ERRRES_API0301 = "写真情報登録エラー";
    /**. 写真情報登録単項目チェックエラー */
    public static final String ERRRES_CHECK_API0301 = "写真情報登録単項目チェックエラー";
    /**. 写真アップロードエラー */
    public static final String ERRRES_UPLOAD_API0301 = "写真アップロードエラー";
    /**. 写真帳出力情報取得リスポンス */
    public static final String INFOS_API0901 = "写真帳出力情報取得：";
    /**. 写真帳帳票生成エラー */
    public static final String ERRRES_API0902 = "写真帳帳票生成エラー";
    /**. 写真帳帳票生成ファイルパス */
    public static final String FILE_PATH_API0902 = "写真帳帳票生成テンプレートファイルパス：";
    /**. 写真帳帳票生成リスポンス */
    public static final String INFOS_API0902 = "写真帳帳票生成：";
    /**. 写真帳帳票登録件数 */
    public static final String INFOS_COUNT_API0902 = "写真帳帳票登録件数：";
    /**. 写真アップロードURL取得リスポンス */
    public static final String INFOS_API0903 = "写真帳出力対象数取得：";
    /**. 作業情報一覧取得エラー */
    public static final String ERRRES_API0305 = "作業情報一覧取得エラー";
    /**. 写真削除エラー */
    public static final String ERRRES_API0504 = "写真削除エラー";
    /**. フロア情報一覧エラー */
    public static final String ERRRES_API0605 = "フロア情報一覧エラー";
    /**. ピン情報登録エラー */
    public static final String ERRRES_API0602 = "ピン情報登録エラー";
    /**. 工程・作業情報一覧エラー */
    public static final String ERRRES_API0801 = "工程・作業情報一覧エラー";
    /**. 作業登録エラー */
    public static final String ERRRES_API0806 = "作業登録エラー";
    /**. 工程名変更エラー */
    public static final String ERRRES_API0808 = "工程名変更エラー";
    /**. 作業名変更エラー */
    public static final String ERRRES_API0809 = "作業名変更エラー";
    /**. 工程・作業削除エラー */
    public static final String ERRRES_API0810 = "工程・作業削除エラー";
    /**. 写真帳出力情報取得エラー */
    public static final String ERRRES_API0901 = "写真帳出力情報取得エラー";
    /**. 写真アップロードURL取得エラー */
    public static final String ERRRES_API0903 = "写真アップロードURL取得エラー";
    /**. アカウントロック対象者情報一覧エラー */
    public static final String ERRRES_API1107 = "アカウントロック対象者情報一覧エラー";
    /**. アカウントロック情報更新エラー */
    public static final String ERRRES_API1108 = "アカウントロック情報更新エラー";
    /**. デバイスアクセス情報取得エラー */
    public static final String ERRRES_API1110 = "デバイスアクセス情報取得エラー";
    /**. デバイスアクセス情報更新エラー */
    public static final String ERRRES_API1112 = "デバイスアクセス情報更新エラー";
    /**. 工程・作業情報一括登録エラー */
    public static final String ERRRES_API0805 = "工程・作業情報一括登録エラー";
    /**. ピン情報座標更新エラー */
    public static final String ERRRES_API0603 = "ピン情報座標更新エラー";
    /**. 権限利用機能情報取得エラー */
    public static final String ERRRES_API0701 = "権限利用機能情報取得エラー";
    /**. 物件CSV登録エラー */
    public static final String ERRRES_API1402 = "物件CSV登録エラー";
    /**. 物件フロア・部屋・場所CSV登録エラー */
    public static final String ERRRES_API1403 = "物件フロア・部屋・場所CSV登録エラー";
    /**. 物件フロア・部屋・場所CSV登録リスポンス */
    public static final String INFOS_API1403 = "物件フロア・部屋・場所CSV登録：";
    /**. 物件全件取得エラー */
    public static final String ERRRES_API1405 = "物件全件取得エラー";
    /**. 工程情報一覧エラー */
    public static final String ERRRES_API0306 = "工程情報一覧エラー";
    /**. 黒板表示項目指定エラー */
    public static final String ERRRES_API0302 = "黒板表示項目指定エラー";
    /**. 状況一覧エラー */
    public static final String ERRRES_API0303 = "状況一覧エラー";
    /**. 物件一覧 */
    public static final String ERRRES_IF0101 = "物件一覧エラー";
    /**. 物件情報提供 */
    public static final String ERRRES_IF0102 = "物件情報提供エラー";
    /**. 案件一覧 */
    public static final String ERRRES_IF0103 = "案件一覧エラー";
    /**. 写真ダウンロードエラー */
    public static final String ERRRES_API0502 = "写真ダウンロードエラー";
    /**. 写真帳出力対象変更 */
    public static final String ERRRES_API0505 = "写真帳出力対象変更エラー";
    /**. ユーザーCSV登録 */
    public static final String ERRORS_API1401 = "ユーザーCSV登録エラー";
    /**. 案件CSV登録 */
    public static final String ERRORS_API1404 = "案件CSV登録エラー";
    /**. 案件CSV登録の図の削除 */
    public static final String ERRORS_DRAWS_API1404 = "図面ファイル削除エラー：";
    /**. 案件CSV登録ログ出力 */
    public static final String INFOS_API1404 = "案件CSV登録：";
    /**. 案件CSV登録処理件数 */
    public static final String INFOS_API1404_COUNT = "案件CSV登録処理件数：";
    /**. 案件PDF登録エラー */
    public static final String ERRORS_API1407 = "案件PDF登録エラー";
    /**. 案件PDF登録 */
    public static final String INFOS_API1407 = "案件PDF登録：";
    /**. CSV登録ログ出力 */
    public static final String INFOS_API1408 = "CSV登録：";

    /**. 機器情報 */
    public static final String ERRRES_IF0106 = "機器情報エラー";
    /**. ピン情報一覧 */
    public static final String ERRRES_API0601 = "ピン情報一覧エラー";
    /**. ピン情報配置フラグ更新 */
    public static final String ERRRES_API0604 = "ピン情報配置フラグ更新エラー";
    /**. テンプレート工程・作業情報 */
    public static final String ERRRES_API0802 = "テンプレート工程・作業情報エラー";
    /**. 工程情報登録 */
    public static final String ERRRES_API0803 = "工程情報登録エラー";
    /**. 工程情報登録する工程名が存在する */
    public static final String ERRRES_API0803_DUPLICATE = "工程情報登録する工程名が存在する";
    /**. 工程情報登録する表示順登録不可 */
    public static final String ERRRES_API0803_DISPLAYORDER = "工程情報登録する表示順登録不可";
    /**. 工程情報更新する工程名が存在する */
    public static final String ERRRES_API0808_DUPLICATE = "工程情報更新する工程名が存在する";
    /**. 工程情報更新する表示順更新不可 */
    public static final String ERRRES_API0808_DISPLAYORDER = "工程情報更新する表示順更新不可";
    /**. 作業情報登録する作業名が存在する */
    public static final String ERRRES_API0806_DUPLICATE = "作業情報登録する作業名が存在する";
    /**. 作業情報登録する表示順登録不可 */
    public static final String ERRRES_API0806_DISPLAYORDER = "作業情報登録する表示順登録不可";
    /**. 作業情報更新する作業名が存在する */
    public static final String ERRRES_API0809_DUPLICATE = "作業情報更新する作業名が存在する";
    /**. 作業情報更新する表示順更新不可 */
    public static final String ERRRES_API0809_DISPLAYORDER = "作業情報更新する表示順更新不可";
    /**. デバイスアクセス情報登録 */
    public static final String ERRRES_API1109 = "デバイスアクセス情報登録エラー";
    /**. デバイスアクセス情報一覧取得 */
    public static final String ERRRES_API1111 = "デバイスアクセス情報一覧取得エラー";
    /**. チャット写真情報取得 */
    public static final String ERRRES_API1201 = "チャット写真情報取得エラー";
    /**. 物件検索 */
    public static final String ERRRES_API1406 = "物件検索エラー";
    /**. 写真一覧取得 */
    public static final String ERRRES_API0501 = "写真一覧取得エラー";
    /**. 一段階ログイン情報更新 */
    public static final String ERRRES_API1113 = "一段階ログイン情報更新エラー";
    /**. 一段階ログイン情報取得 */
    public static final String ERRRES_API1114 = "一段階ログイン情報取得エラー";
    /**. CSVアップロードURL取得エラー */
    public static final String ERRRES_API1401_CSV = "ユーザCSVアップロードURL取得エラー";
    public static final String ERRRES_API1402_CSV = "物件CSVアップロードURL取得エラー";
    public static final String ERRRES_API1403_CSV = "物件フロア・部屋・場所CSVアップロードURL取得エラー";
    public static final String ERRRES_API1404_CSV = "案件CSVアップロードURL取得エラー";
    /**. CSV登録 */
    public static final String ERRORS_API1408 = "CSV登録エラー";
    /**. 登录页面人脸识别报错 */
    public static final String ERRRES_API0101 = "登录页面人脸识别报错";
    /**. 员工信息取得报错 */
    public static final String ERRRES_API0102 = "员工信息取得报错";
    /**. 商品信息取得报错 */
    public static final String ERRRES_API0103 = "商品信息取得报错";
    /**. 代理商开户报错 */
    public static final String ERRRES_API0104 = "代理商开户报错";
    /**. 渠道商开户报错 */
    public static final String ERRRES_API0106 = "渠道商开户报错";
    /**. 资金流量信息取得报错 */
    public static final String ERRRES_API0109 = "资金流量信息取得报错";
    /**. 代理商信息取得报错 */
    public static final String ERRRES_API0110 = "代理商信息取得报错";
    /**. 所有代理商名取得报错 */
    public static final String ERRRES_API0111 = "所有代理商名取得报错";
    /**. 所有代理商汇总信息取得报错 */
    public static final String ERRRES_API0112 = "所有代理商汇总信息取得报错";
    /**. 所有货架信息取得报错 */
    public static final String ERRRES_API0202 = "所有货架信息取得报错";
    /**. 所有销售货架信息取得报错 */
    public static final String ERRRES_API3007 = "所有代理商汇总信息取得报错";
    /**. 所有零点余额信息取得报错 */
    public static final String ERRRES_API3008 = "所有零点余额信息取得报错";
    /**. 所有资金记录信息取得报错 */
    public static final String ERRRES_API3002 = "所有资金记录信息取得报错";
    /**. 所有代理商汇总信息取得报错 */
    public static final String ERRRES_API3003 = "所有加减款信息取得报错";
    /**. 所有代理商汇总信息取得报错 */
    public static final String ERRRES_API0113 = "所有渠道商汇总信息取得报错";
    /**. 所有代理商汇总信息取得报错 */
    public static final String ERRRES_API3004 = "所有代理商情报信息取得报错"; 
    /**. 所有资金记录 */
    public static final String ERRRES_API3005 = "所有代理商资金记录取得报错";   
    /**. 增加渠道商 */
    public static final String ERRRES_API3006 = "所有增加渠道商取得报错";  
    /**. 所有订单管理信息取得报错 */
    public static final String ERRRES_API3011 = "所有订单管理信息取得报错";
    /**. 渠道信息 */
    public static final String ERRRES_API3012 = "所有渠道信息取得报错";
    /**. 渠道信息 */
    public static final String ERRRES_API3009 = "订单信息取得报错";
    /**. 代理商数据接收报错 */
    public static final String ERRRES_APIAGENT = "代理商数据接收报错";
    /**. 代理商订单信息发送报错 */
    public static final String ERRRES_APIAGENTORDERINFO = "代理商订单信息报错";
    /**. 代理商订单结果发送报错 */
    public static final String ERRRES_APIAGENTORDERRESULT = "代理商订单结果发送报错";
    /**. 渠道商数据接收报错 */
    public static final String ERRRES_APIAUTHORY = "渠道商数据接收报错";
    /**. 用户余额充值报错 */
    public static final String ERRRES_APIBALANCECHARGE = "用户余额充值报错";
    /**. 用户余额查询报错 */
    public static final String ERRRES_APIBALANCESELECT = "用户余额查询报错";
    /**. 用户充值返金报错 */
    public static final String ERRRES_APICHARGERETURN = "用户充值返金报错";
    /**. 用户登录报错 */
    public static final String ERRRES_APIMICROLOGIN = "用户登录报错";
    /**. S3 */
    public static final String ERRORS_S3 = "S3エラー";
    /**. データ出力エラー */
    public static final String ERRRES_OUTPUT = "データ出力エラー：";
    /**. データ出力件数 */
    public static final String OUTPUT_COUNT = "データ出力件数：";
    /**. 実行開始 */
    public static final String RUN_BEGIN = "実行開始";
    /**. 実行終了 */
    public static final String RUN_END = "実行終了";
    /**. 作業更新できるかの判断開始 */
    public static final String PROCESS_UPDATE_BEGIN = "工程更新できるかの判断開始";
    /**. 作業更新できるかの判断終了 */
    public static final String PROCESS_UPDATE_END = "工程更新できるかの判断終了";
    /**. 作業更新できるかの判断開始 */
    public static final String WORK_UPDATE_BEGIN = "作業更新できるかの判断開始";
    /**. 作業更新できるかの判断終了 */
    public static final String WORK_UPDATE_END = "作業更新できるかの判断終了";

    /**. Excel出力定数定義 */
    public class EXCEL_OUTPUT {

        /**. ExcelCreater：出力帳票のタイプ、xlsx */
        public static final String OUTPUT_FILE_XLSX = "xlsx";

        /**. ExcelCreater：出力帳票のタイプ、xls */
        public static final String OUTPUT_FILE_XLS = "xls";

        /**. ExcelCreater：出力帳票のタイプ、pdf */
        public static final String OUTPUT_FILE_PDF = "pdf";

        /**. ExcelCreater：出力PDFのサイズフラグ */
        public static final int PDF_SIZE_A4 = 2;

        /**. ExcelCreater：フォント */
        public static final String EXCEL_FONT = "MSゴシック";

        /**. ExcelCreater：行数のキー */
        public static final String EXCEL_LINE = "LineNum";

        /**. ExcelCreater：初期ダブル値 */
        public static final double DOUBLE_0_0 = 0.0;

        /**. ExcelCreater：文字サイズ 1項目 */
        public static final int ITEM_COUNT_1 = 1;
        public static final double FONT_POINT_18 = 18;
        public static final double LINE_NUM_35_1 = 35;

        /**. ExcelCreater：文字サイズ 2項目 */
        public static final int ITEM_COUNT_2 = 2;
        public static final double FONT_POINT_16_5 = 16.5;
        public static final double LINE_NUM_35_2 = 35;

        /**. ExcelCreater：文字サイズ 3項目 */
        public static final int ITEM_COUNT_3 = 3;
        public static final double FONT_POINT_15_5 = 15.5;
        public static final double LINE_NUM_39_3 = 39;

        /**. ExcelCreater：文字サイズ 4項目 */
        public static final int ITEM_COUNT_4 = 4;
        public static final double FONT_POINT_14_5 = 14.5;
        public static final double LINE_NUM_44_4 = 44;

        /**. ExcelCreater：文字サイズ 5行 */
        public static final int ITEM_COUNT_5 = 5;
        public static final double FONT_POINT_13_5 = 13.5;
        public static final double LINE_NUM_44_5 = 44;

        /**. ExcelCreater：文字サイズ 6行 */
        public static final int ITEM_COUNT_6 = 6;
        public static final double FONT_POINT_12_5 = 12.5;
        public static final double LINE_NUM_50_6 = 50;

        /**. ExcelCreater：文字サイズ 7行 */
        public static final int ITEM_COUNT_7 = 7;
        public static final double FONT_POINT_11_5 = 11.5;
        public static final double LINE_NUM_50_7 = 50;

        /**. ExcelCreater：文字サイズ 8行 */
        public static final int ITEM_COUNT_8 = 8;
        public static final double FONT_POINT_10_5 = 10.5;
        public static final double LINE_NUM_59_8 = 59;

        /**. ExcelCreater：文字サイズ 9行 */
        public static final int ITEM_COUNT_9 = 9;
        public static final double FONT_POINT_9_5 = 9.5;
        public static final double LINE_NUM_59_9 = 59;

        /**. ExcelCreater：文字サイズ 10行 */
        public static final int ITEM_COUNT_10 = 10;
        public static final double FONT_POINT_8_5 = 8.5;
        public static final double LINE_NUM_71_10 = 71;

        /**. ExcelCreater：文字サイズ 11行 */
        public static final int ITEM_COUNT_11 = 11;
        public static final double FONT_POINT_7_5 = 7.5;
        public static final double LINE_NUM_71_11 = 71;

        /**. ExcelCreater：文字サイズ 12行 */
        public static final int ITEM_COUNT_12 = 12;
        public static final double FONT_POINT_6_5 = 6.5;
        public static final double LINE_NUM_87_12 = 87;

        /**. ExcelCreater：文字サイズ 13行 */
        public static final int ITEM_COUNT_13 = 13;
        public static final double FONT_POINT_5_5 = 5.5;
        public static final double LINE_NUM_114_13 = 114;

        /**. ExcelCreater：文字サイズ 14行 */
        public static final int ITEM_COUNT_14 = 14;
        public static final double FONT_POINT_4_5 = 4.5;
        public static final double LINE_NUM_133_14 = 133;

        /**. ExcelCreater：文字サイズ 15行 */
        public static final int ITEM_COUNT_15 = 15;
        public static final double FONT_POINT_3_5 = 3.5;
        public static final double LINE_NUM_160_15 = 160;

        /**. ExcelCreater：文字サイズ 16行 */
        public static final int ITEM_COUNT_16 = 16;
        public static final double FONT_POINT_2_5 = 2.5;
        public static final double LINE_NUM_268_16 = 268;

        /**. ExcelCreater：文字サイズ 17行 */
        public static final int ITEM_COUNT_17 = 17;
        public static final double FONT_POINT_1_5 = 1.5;
        public static final double LINE_NUM_424_17 = 424;

        /**. ExcelCreater：一行の文字数 */
        public static final int LINE_NUM = 35;

        /**. ExcelCreater：印刷範囲設定 */
        public static final int printAreaBeginX = 0;
        public static final int printAreaBeginY = 0;
        public static final int printAreaEndX = 2;

        /**. ExcelファイルのXLSX拡張子 */
        public static final String EXCEL_FILE_SUFFIX_XLSX = ".xlsx";
        public static final String EXCEL_FILE_SUFFIX_XLSX_QUOTE = ".xlsx'";

        /**. ExcelファイルのXLS拡張子 */
        public static final String EXCEL_FILE_SUFFIX_XLS = ".xls";

        /**. クラスパス */
        public static final String EXCEL_FILE_CLASSPATH = "classpath:";

        /**. 出力ファイル名 */
        public static final String OUTPUT_FILENAME = "'photo'_yyyyMMdd_HHmmss'";

        /**. テンプレートファイルパス */
        public static final String TEMPLATE_OUTPUT_FILENAME_NET = "file/templateExcel";

        /**. テンプレートファイルパス */
        public static final String TEMPLATE_OUTPUT_FILENAME_DISK = "\\file\\templateExcel";

        /**. エクセルテンプレートのセル名 */
        public static final String START_TITLE = "A1";
        public static final String START_ITEM = "A2";
        public static final String FINISH_ITEM = "C9";

        /**. エクセルテンプレートの設定行数 */
        public static final int FIRST_EXCEL_ROW = 1;
        public static final int SECOND_EXCEL_ROW = 10;
        public static final int THIRD_EXCEL_ROW = 18;
        public static final int FINISH_SHEET = 25;

        /**. エクセルテンプレートのセルサイズ */
        public static final double TITLE_HEIGHT = 37.50;
        public static final double ITEM_HEIGHT = 75.00;
        public static final int PICTURE_WIDTH = 1200;
        public static final int PICTURE_HEIGHT = 800;

        /**. エクセルテンプレートのセル数 */
        public static final int ITEM_NUM = 8;

        /**. エクセルテンプレートの定数定義(2枚出力用) */
        public static final int FINISH_SHEET_FOR_TWO = 17;
        public static final double ITEM_HEIGHT_FOR_TWO = 110.00;
        public static final int PICTURE_HEIGHT_FOR_TWO = 1184;

        /**. ファイルパス分けるキーワード */
        public static final String FILE_PATH_SPLIT_2 = "\\";
        public static final String FILE_PATH_SPLIT_4 = "\\\\";

        /**. エクセルのセル編集 */
        public static final String COMBINATION_A = ":A";
        public static final String CELL_A = "A";
        public static final String CELL_B = "B";
        public static final String CELL_C = "C";
        public static final int CELL_7 = 7;
        public static final int CELL_MINUS_1 = -1;

        /**. エクセルエクスポートページ数 */
        public static final int OUTPUT_2 = 2;
        public static final int OUTPUT_3 = 3;
        public static final String OUTPUT_VALUE_2 = "2";
        public static final String OUTPUT_VALUE_3 = "3";

        /**. 半分で処理 */
        public static final int HANBUN = 2;

        /**. 3をわく処理 */
        public static final int DIVIDE_THREE = 3;

        /**. エクセル図の長さマイナス1 */
        public static final int MINUS_1 = 1;

        /**. エクセル行目プラス1 */
        public static final int PLUS_1 = 1;
        /**. エクセル行目プラス2 */
        public static final int PLUS_2 = 2;
        /**. エクセル行目プラス3 */
        public static final int PLUS_3 = 3;
        /**. エクセル行目プラス4 */
        public static final int PLUS_4 = 4;
        /**. エクセル行目プラス5 */
        public static final int PLUS_5 = 5;
        /**. エクセル行目プラス6 */
        public static final int PLUS_6 = 6;
        /**. エクセル行目プラス7 */
        public static final int PLUS_7 = 7;

        /**. エクセル文字列分ける開始桁 */
        public static final int BEGIN_0 = 0;

        /**. 縦横の幅を99%にサイズダウン */
        public static final double PROCENT_0_99 = 0.99;

        /**. パターン1 */
        public static final int PATTERN_0 = 0;

        /**. パターン2 */
        public static final int PATTERN_1 = 1;

        /**. パターン3 */
        public static final int PATTERN_2 = 2;

        /**. excel出力項目 */
        public class EXCEL_FIELD {

            /**. 物件 */
            public static final String EXCEL_BUILDING = "building";
            public static final String EXCEL_BUKEN = "物件";

            /**. フロア */
            public static final String EXCEL_FLOOR = "floor";
            public static final String EXCEL_FUROA = "フロア";

            /**. 部屋 */
            public static final String EXCEL_ROOM = "room";
            public static final String EXCEL_HEYA = "部屋";

            /**. 場所 */
            public static final String EXCEL_PLACE = "place";
            public static final String EXCEL_BASHO = "場所";

            /**. 大工程 */
            public static final String EXCEL_LARGEPROCESS = "largeProcess";
            public static final String EXCEL_DAIKOUTEI = "大工程";

            /**. 工程 */
            public static final String EXCEL_PROCESS = "process";
            public static final String EXCEL_KOUTEI = "工程";

            /**. 作業 */
            public static final String EXCEL_WORK = "work";
            public static final String EXCEL_SAGYOU = "作業";

            /**. 状況 */
            public static final String EXCEL_SITUATION = "situation";
            public static final String EXCEL_JYOUKYOU = "状況";

            /**. 日時 */
            public static final String EXCEL_DATETIME = "dateTime";
            public static final String EXCEL_NICHIJI = "日時";

            /**. 時間 */
            public static final String EXCEL_TIME = "time";
            public static final String EXCEL_JIKAN = "時間";

            /**. 機器 */
            public static final String EXCEL_UNITMARKMODELTYPE = "unitMarkModelType";
            public static final String EXCEL_KIGOUANDKISYU = "機器";

            /**. 機番 */
            public static final String EXCEL_MACHINENUMBER = "machineNumber";
            public static final String EXCEL_KIBAN = "機番";

            /**. 立会人 */
            public static final String EXCEL_WITNESS = "witness";
            public static final String EXCEL_RIKAIJIN = "立会人";

            /**. 施工会社 */
            public static final String EXCEL_CONSTRUCTIONCOMPANY = "constructionCompany";
            public static final String EXCEL_SIKOUKAISYA = "施工会社";

            /**. 自由欄 */
            public static final String EXCEL_FREECOLUMN = "freeColumn";
            public static final String EXCEL_JIYURAN = "自由欄";
        }
    }

    /**. SQLインジェクション処理 */
    public class SQL_INJECTION {

        /**. SQLインジェクション文字の転義 */
        public class SQL_TRANSFERRED_MEANING {

            /**. 「'」文字の転義 */
            public static final char SINGLE_QUOTATION_BEGORE = '\'';
            public static final String SINGLE_QUOTATION_AFTER = "''";

            /**. 「\"」文字の転義 */
            public static final char DOUBLE_QUOTATION_BEGORE = '\"';
            public static final String DOUBLE_QUOTATION_AFTER = "\\";

            /**. 「%」文字の転義 */
            public static final char PERCENT_BEGORE = '%';
            public static final String PERCENT_AFTER = "\\%";

            /**. 「_」文字の転義 */
            public static final char UNDERLINE_BEGORE = '_';
            public static final String UNDERLINE_AFTER = "\\_";

            /**. 「/」文字の転義 */
            public static final char LEFT_SLASH_BEGORE = '/';
            public static final String LEFT_SLASH_AFTER = "//";

            /**. 「\\」文字の転義 */
            public static final char RIGHT_SLASH_BEGORE = '\\';
            public static final String RIGHT_SLASH_AFTER = "\\\\";
        }
    }
}
