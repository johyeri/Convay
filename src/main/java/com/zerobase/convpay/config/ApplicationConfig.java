package com.zerobase.convpay.config;

import com.zerobase.convpay.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
public class ApplicationConfig {

    //Bean이란? Spring Container에 의해서 관리되는 Bean을 생성해주는 Method.
    //해당 설정을 활용하여 생성된 객체를 DI Container(Application Context)에 담는다.
    @Bean
    public ConveniencePayService conveniencePayService() {
        return new ConveniencePayService(
                new HashSet<>(
                        Arrays.asList(moneyAdapter(), cardAdapter())
                ),
                discountByConvenience()
        );
    }

    @Bean
    public CardAdapter cardAdapter() {
        return new CardAdapter();
    }

    @Bean
    public MoneyAdapter moneyAdapter() {
        return new MoneyAdapter();
    }

    @Bean
    public DiscountByConvenience discountByConvenience() {
        return new DiscountByConvenience();
    }
}
