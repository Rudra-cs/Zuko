package com.zuko.dormitory;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Dormitory Management API",
                version = "1.0",
                description = "API documentation for dormitory system"
        )
)

@SpringBootApplication
public class ZukoDormitoryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZukoDormitoryManagementApplication.class, args);
    }

}
