package com.learning.service;

import com.learning.model.SmsRequest;

public interface SmsSender {

    void sendSms(SmsRequest smsRequest);

}
