package com.learning.controller;

import com.learning.model.SmsRequest;
import com.learning.service.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
//@CrossOrigin("*")
@RequestMapping("/api/v1/sms")
public class SmsController {

    @Autowired
    private SmsSender smsSender;

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
