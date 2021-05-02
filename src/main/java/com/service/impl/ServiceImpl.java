package com.service.impl;

import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

@Service("Service")
public class ServiceImpl implements Service{

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
