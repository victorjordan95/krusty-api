package br.com.krustytm.service.configuration;

import br.com.krustytm.model.configuration.ModelModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.service.services"})
@Import(ModelModuleConfiguration.class)
public class ServiceModuleConfiguration {
}
