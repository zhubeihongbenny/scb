package jp.co.dk.ip.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**.
 * 環境変数
 */
@Getter
@Setter
@Component
public class SettingContext {

    @Value("${setting.lang}")
    private String lang;

    @Value("${setting.addMapping}")
    private String addMapping;

    @Value("${setting.allowedOrigins}")
    private String allowedOrigins;

    @Value("${setting.allowedMethods}")
    private String allowedMethods;

    @Value("${setting.allowedHeaders}")
    private String allowedHeaders;

    @Value("${setting.s3.buildFlg}")
    private Integer s3BbuildFlg;

    @Value("${setting.s3.accessKey}")
    private String s3AccessKey;

    @Value("${setting.s3.secretKey}")
    private String s3SecretKey;

    @Value("${setting.s3.region}")
    private String s3Region;

    @Value("${setting.s3.photoBucketName}")
    private String s3PhotoBucketName;

    @Value("${setting.photoBookPath}")
    private String photoBookPath;

    @Value("${setting.photoListJsonPath}")
    private String photoListJsonPath;

    @Value("${setting.findDeviceAccessLimit}")
    private String findDeviceAccessLimit;

    @Value("${setting.multipartFileMaxSize}")
    private String multipartFileMaxSize;

    @Value("${setting.multipartFileMaxRequestSize}")
    private String multipartFileMaxRequestSize;

    @Value("${setting.findDataLimit}")
    private String findDataLimit;
    
    @Value("${setting.faceplusplus.urlDetect}")
    private String facePlusPlusUrlDetect;
    
    @Value("${setting.faceplusplus.urlCompare}")
    private String facePlusPlusUrlCompare;

    @Value("${setting.faceplusplus.apiKey}")
    private String facePlusPlusApiKey;

    @Value("${setting.faceplusplus.apiSecret}")
    private String facePlusPlusApiSecret;
    
    @Value("${setting.langZh}")
    private String langZh;
    
    @Value("${setting.inputDataPath}")
    private String inputDataPath;
    
//    @Value("${setting.aliyunSSH.username}")
//    private String username;
//    
//    @Value("${setting.aliyunSSH.password}")
//    private String password;
//    
//    @Value("${setting.aliyunSSH.host}")
//    private String host;
//    
//    @Value("${setting.aliyunSSH.port}")
//    private String port;
//    
//    @Value("${setting.aliyunDB.aliyunDBPort}")
//    private String aliyunDBPort;
//    
//    @Value("${setting.aliyunDB.aliyunLocalhost}")
//    private String aliyunLocalhost;
//    
//    @Value("${setting.aliyunDB.aliyunLocalPort}")
//    private String aliyunLocalPort;
}
