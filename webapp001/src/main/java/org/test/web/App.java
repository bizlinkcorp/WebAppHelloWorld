package org.test.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class App extends SpringBootServletInitializer {
	public static void main(String[] args) {
		// コメントを入れました
		SpringApplication.run(AppConfiguration.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// さらに修正しました。直したよー
		return application.sources(AppConfiguration.class);
	}
}
