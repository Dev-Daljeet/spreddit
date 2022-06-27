package com.devdaljeet.spreddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import com.devdaljeet.spreddit.config.SwaggerConfiguration;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpredditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpredditApplication.class, args);
	}

}
