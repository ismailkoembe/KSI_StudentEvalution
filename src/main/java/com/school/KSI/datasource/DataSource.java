package com.school.KSI.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class DataSource {
    @Configuration
    public class Datasource {

        @Bean
        @ConfigurationProperties("application.properties")
        public HikariDataSource hikariDataSource() {
            return DataSourceBuilder
                    .create()
                    .type(HikariDataSource.class)
                    .build();
        }

    }



}
