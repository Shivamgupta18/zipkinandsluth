package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {
	@Bean
	public Sampler createSamples() {
		return Sampler.ALWAYS_SAMPLE;
	}
	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
}
