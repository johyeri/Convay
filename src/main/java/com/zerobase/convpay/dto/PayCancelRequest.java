package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.type.PayMethodType;

public class PayCancelRequest {
    // 결제수단
    PayMethodType payMethodType;

    // 편의점 종류
    ConvenienceType convenienceType;

    // 결제 취소 금액
    Integer payCancelAmount;

    public PayCancelRequest(PayMethodType payMethodType, ConvenienceType convenienceType, Integer payCancelAmount) {
        this.payMethodType = payMethodType;
        this.convenienceType = convenienceType;
        this.payCancelAmount = payCancelAmount;
    }

    public PayMethodType getPayMethodType() {
        return payMethodType;
    }

    public Integer getPayCancelAmount() {
        return payCancelAmount;
    }

    @Override
    public String toString() {
        return "PayCancelRequest{" +
                "convenienceType=" + convenienceType +
                ", payCancelAmount=" + payCancelAmount +
                '}';
    }
}
