package br.com.krustytm.business.configuration;

import br.com.krustytm.model.configuration.ModelModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.business.business"})
@Import(ModelModuleConfiguration.class)
public class BusinessModuleConfiguration {
}
