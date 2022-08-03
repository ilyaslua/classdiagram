package com.example.classdiagram.models;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class AuditModel {
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    Date createdAt;

    Date updateAt;
    String createdBy;
    String updatedBy;
}
