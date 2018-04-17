package com.yibo.bean;
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}