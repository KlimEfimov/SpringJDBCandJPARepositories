package com.ex1.intellektaspringwebex1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ex1")
public class SpringConfig {

    private final String datasourceUrl = "jdbc:mysql://localhost:3306/intellekta";
    private final String datasourceUsername = "admin";
    private final String datasourcePassword = "1111";

    @Bean
    public DataSource dataSource() {
        DataSource ds = new DriverManagerDataSource(datasourceUrl, datasourceUsername, datasourcePassword);
        return ds;
    }

    @Bean
    JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    SalesJPARepositoryImplementation testImpl(SalesJPARepository repository) {
        return new SalesJPARepositoryImplementation(repository);
    }

}
