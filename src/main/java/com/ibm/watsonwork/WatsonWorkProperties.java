package com.ibm.watsonwork;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties
public class WatsonWorkProperties {

    @Value("${watsonwork.webhook.secret}")
    private String webhookSecret;

    @Value("${watsonwork.app.id}")
    private String appId;

    @Value("${watsonwork.app.secret}")
    private String appSecret;

    @Value("${watsonwork.api.uri}")
    private String apiUri;

    @Value("${watsonwork.api.uri}" + "${watsonwork.api.oauth}")
    private String oauthApi;
}
