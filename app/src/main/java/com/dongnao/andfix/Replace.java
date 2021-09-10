package com.dongnao.andfix;

import android.annotation.TargetApi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//a
public @interface Replace {
    //  目的
//    地方  在哪里      14号   多少钱
    String clazz();
    String method();
}
