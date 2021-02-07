package es.myorg.trm.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}	

    /*
     * @Bean public WebServerFactoryCustomizer<NettyReactiveWebServerFactory>
     * customizer() { return new
     * WebServerFactoryCustomizer<NettyReactiveWebServerFactory>() {
     * 
     * @Override public void customize(NettyReactiveWebServerFactory factory) { Ssl
     * ssl = new Ssl(); // Your SSL Cusomizations ssl.setEnabled(true);
     * ssl.setKeyStore("gateway.keystore.p12");
     * ssl.setKeyPassword("gatewaypassword"); factory.setSsl(ssl); } }; }
     */
	
}
