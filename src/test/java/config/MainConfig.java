package config;

import client.RestAssuredClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource({"classpath:common.properties", "classpath:${propFile}"})
public class MainConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainConfig.class);

    @Value("${base.url}")
    private String baseUrl;

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "restAssuredClient")
    public RestAssuredClient getRestClient() {
        return new RestAssuredClient(baseUrl);
    }

}
