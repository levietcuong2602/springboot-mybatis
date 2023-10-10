package com.smartosc.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Swagger Documents
 * @author Cuonglv
 */
@Configuration
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.smartosc.controller";

    /**
     * 服务器路径
     */
    private static final String SERVICE_URL = "http://localhost:8080";
    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(SERVICE_URL);
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("contact@smartosc.com");
        contact.setName("CuongLV");
        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Demo Service API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage demo.").termsOfService("https://www.pasanabeysekara.com")
                .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}

