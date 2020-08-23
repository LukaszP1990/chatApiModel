package com.rabbitmq.chat.model.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
@Getter
@Builder
public class Message implements Serializable {

    @Id
    private String id;
    private String sender;
    private String receiver;
    private String message;
    private Date createdDate;
}
