package com.cloud.gateway.common;

public interface MessageProcess<T> {

    DetailRes process(T message);
}
