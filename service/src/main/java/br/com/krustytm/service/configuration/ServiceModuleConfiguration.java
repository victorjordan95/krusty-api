package br.com.krustytm.service.configuration;

import br.com.krustytm.dto.configuration.DTOModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.service.services"})
@Import(DTOModuleConfiguration.class)
public class ServiceModuleConfiguration {
}
