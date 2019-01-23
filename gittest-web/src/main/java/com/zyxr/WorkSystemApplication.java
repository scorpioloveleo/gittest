package com.zyxr;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @Autohor: scorpio
 * @Description:
 * @Date: Created in 2018/9/17 0017 下午 15:18
 * @Modified By:
 */
@Configuration
@EnableApolloConfig
@SpringBootApplication
public class WorkSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkSystemApplication.class, args);
    }
}