package org.example;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * ConsumerBootstrapApplication:
 * </p>
 *
 * @author lzb
 */
@SpringBootApplication
@DubboComponentScan(basePackages = {"org.example.web.controller"})
public class ConsumerBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBootstrapApplication.class, args);
    }
}
