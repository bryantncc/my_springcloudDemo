package com.ncc.cloud.payment.service.impl;


import com.ncc.cloud.api.provider.beans.Payment;
import com.ncc.cloud.payment.dao.PaymentDao;
import com.ncc.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}