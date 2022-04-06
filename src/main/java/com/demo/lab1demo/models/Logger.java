package com.demo.lab1demo.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Logger {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int transactionId;
    private String date;
    private String time;
    private String principle;
    private String operation;


}
