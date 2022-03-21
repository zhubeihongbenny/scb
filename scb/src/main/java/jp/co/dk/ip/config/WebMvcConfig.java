package jp.co.dk.ip.config;

import javax.servlet.MultipartConfigElement;

import jp.co.dk.ip.common.Const;
import jp.co.dk.ip.common.SettingContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.unit.DataSize;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**.
 * ウェブコンフィグレーション
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private SettingContext settingContext;

    /**.
     * CORSコンフィグレーション
     *
     * @param registry CORSを登録
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(settingContext.getAddMapping())
                .allowedOrigins(settingContext.getAllowedOrigins())
                .allowedMethods(settingContext.getAllowedMethods())
                .allowedHeaders(settingContext.getAllowedHeaders());
    }

    /**.
     * インターセプターを追加
     *
     * @param registry インターセプターを登録
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new IdTokenInterceptor());
    }

    /**.
     * 非同期プール設定
     *
     * @return  AsyncTaskExecutor
     */
    @Bean
    public AsyncTaskExecutor asyncTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        return executor;
    }

    /**.
     * 非同期処理タイムアウト設定
     *
     * @param configurer 非同期サポート配置
     */
    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setTaskExecutor(asyncTaskExecutor());
        configurer.setDefaultTimeout(300000L);
    }

    /**.
     * ファイルリクエスト配置
     *
     * @return MultipartConfigElement
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // データサイズを定義
        DataSize maxFileSize = DataSize.parse(settingContext.getMultipartFileMaxSize());
        DataSize maxRequestSize = DataSize.parse(settingContext.getMultipartFileMaxRequestSize());
        // 単一のファイルのデータサイズ KB,MB
        factory.setMaxFileSize(maxFileSize);
        // すべてのファイルのデータサイズ KB,MB
        factory.setMaxRequestSize(maxRequestSize);
        return factory.createMultipartConfig();
    }

    /**.
     * メッセージソースのUTF8に設定
     *
     * @return Validator
     */
    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        // メッセージファイルを読込むための設定
        ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        // ベースネームを使用することで任意のファイル名に変更することも可能
        reloadableResourceBundleMessageSource.setBasename(Const.MESSAGE_SOURCE.CLASSPATH_VALIDATIONMESSAGE);
        // デフォルトコーディングを行い、任意の文字コードに変更することも可能
        reloadableResourceBundleMessageSource.setDefaultEncoding(Const.UNITCODE_TYPE.UTF_8);
        validator.setValidationMessageSource(reloadableResourceBundleMessageSource);
        return validator;
    }
}
