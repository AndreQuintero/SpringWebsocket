package com.chat.chat.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ChatMessage {

    private MessageType messageType;

    private String content;

    private String sender;

    private String time;
}