package com.zerobase.convpay.config;

import com.zerobase.convpay.ConvpayApplication;
import com.zerobase.convpay.service.ConveniencePayService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.zerobase.convpay")
@ComponentScan(basePackageClasses = ConvpayApplication.class)
public class ApplicationConfig {

}
