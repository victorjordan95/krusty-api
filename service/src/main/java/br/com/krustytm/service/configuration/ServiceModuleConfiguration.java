package br.com.krustytm.service.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"br.com.krustytm.service.services"})
public class ServiceModuleConfiguration {
}
