package com.ncc.cloud.payment.service;

import com.ncc.cloud.api.provider.beans.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment);

    Payment queryById(@Param("id")long id);

}
