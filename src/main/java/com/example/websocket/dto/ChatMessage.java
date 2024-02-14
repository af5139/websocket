package com.example.websocket.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    public enum MessageType{
        ENTER,TALK,QUIT
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;

}
