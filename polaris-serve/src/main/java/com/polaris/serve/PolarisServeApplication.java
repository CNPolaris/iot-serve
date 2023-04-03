package com.polaris.serve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author polaris
 */
@SpringBootApplication()
@MapperScan("com.polaris.mbg.mapper")
@EnableScheduling
@EnableTransactionManagement
public class PolarisServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolarisServeApplication.class, args);
    }

}
