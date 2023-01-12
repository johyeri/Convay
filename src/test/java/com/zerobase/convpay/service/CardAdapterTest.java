package com.zerobase.convpay.service;

import com.zerobase.convpay.type.CardUseCancelResult;
import com.zerobase.convpay.type.CardUseResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardAdapterTest {

    private CardAdapter cardAdapter = new CardAdapter();

    @Test
    void capture_success() {

        //given
        Integer payAmount = 99;

        //when
        CardUseResult cardUseResult = cardAdapter.capture(payAmount);

        //then
        assertEquals(CardUseResult.USE_SUCCESS, cardUseResult);
    }

    @Test
    void cancelCapture_success() {
        //given
        Integer cancelAmount = 1001;

        //when
        CardUseCancelResult cardUseCancelResult = cardAdapter.cancelCapture(cancelAmount);

        //then
        assertEquals(CardUseCancelResult.USE_CANCEL_SUCCESS, cardUseCancelResult);
    }

}