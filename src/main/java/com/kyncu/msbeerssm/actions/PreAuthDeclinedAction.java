package com.kyncu.msbeerssm.actions;

import com.kyncu.msbeerssm.domain.PaymentEvent;
import com.kyncu.msbeerssm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class PreAuthDeclinedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Pre AUTH Declined event feed!");
    }
}
