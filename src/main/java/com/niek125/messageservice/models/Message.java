package com.niek125.messageservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "message")
public class Message {
    @Id
    private String id;
    @Column(name = "senderid")
    private String senderId;
    @Column(name = "content")
    private String content;
    @Column(name = "sendtime")
    private String sendTime;
    @Column(name = "projectid")
    private String projectId;
}
