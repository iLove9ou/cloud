package com.cloud.gateway.common;

public interface MessageSender {

    DetailRes send(Object message);

    DetailRes send(MessageWithTime messageWithTime);
}
