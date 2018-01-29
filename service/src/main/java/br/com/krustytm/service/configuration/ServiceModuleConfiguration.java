package br.com.krustytm.service.configuration;

import br.com.krustytm.business.configuration.BusinessModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.service.services"})
@Import(BusinessModuleConfiguration.class)
public class ServiceModuleConfiguration {
}
