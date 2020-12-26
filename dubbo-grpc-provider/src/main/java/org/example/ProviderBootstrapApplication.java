package org.example;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * ProviderBootstrapApplication:
 * </p>
 *
 * @author lzb
 */
@SpringBootApplication
@DubboComponentScan(basePackages = {"org.example.service.impl"})
public class ProviderBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootstrapApplication.class, args);
    }
}
