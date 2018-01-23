package br.com.krustytm.controller.configuration;

import br.com.krustytm.service.configuration.ServiceModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.controller.endpoint"})
@Import(ServiceModuleConfiguration.class)
public class ControllerModuleConfiguration {
}
