package br.com.krustytm.controller.configuration;

import br.com.krustytm.dto.configuration.DTOModuleConfiguration;
import br.com.krustytm.service.configuration.ServiceModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "br.com.krustytm.controller.endpoint",
        "br.com.krustytm.controller.security"})
@Import({
        ServiceModuleConfiguration.class,
        DTOModuleConfiguration.class})
public class ControllerModuleConfiguration {
}
