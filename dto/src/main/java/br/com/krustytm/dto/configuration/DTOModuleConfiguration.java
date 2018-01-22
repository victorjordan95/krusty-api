package br.com.krustytm.dto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.dto.dtos"})
public class DTOModuleConfiguration {
}
