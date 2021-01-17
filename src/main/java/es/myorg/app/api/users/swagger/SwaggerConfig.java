package es.myorg.app.api.users.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.oas.annotations.EnableOpenApi;

@Configuration
@EnableOpenApi
@Profile("QA")
public class SwaggerConfig {
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("es.myorg.trm.api.users"))
                .paths(PathSelectors.regex("/users/*"))  
                .build().apiInfo(apiEndPointInfo());
    }
    
     private ApiInfo apiEndPointInfo() {
         // WARNING: to be reviewed
            return new ApiInfoBuilder().title("My API")
                .description("REST API")
                .contact(new Contact("BCF", "https://acme.com", "contact@me.com"))
                .license("ACME")
                .licenseUrl("https://opensource.org/licenses/ACME")
                .version("0.0.1")
                .build();
        }
}