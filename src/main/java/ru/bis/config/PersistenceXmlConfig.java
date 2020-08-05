package ru.bis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ImportResource({"classpath:hibernate5Config.xml"})
@ComponentScan(basePackages = {"ru.bis.dao.model"})
public class PersistenceXmlConfig {
    public PersistenceXmlConfig() {
        super();
    }
}