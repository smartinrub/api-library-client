package com.sergiomartinrubio.apilibraryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.sergiomartinrubio.demoapplicationclient"})
//@EnableFeignClients(basePackageClasses = com.sergiomartinrubio.demoapplicationclient.ToUppercaseClient.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
