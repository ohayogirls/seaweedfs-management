package com.whsa.sherlock.seaweedfsmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SeaweedFsManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaweedFsManagementApplication.class, args);
    }

}
