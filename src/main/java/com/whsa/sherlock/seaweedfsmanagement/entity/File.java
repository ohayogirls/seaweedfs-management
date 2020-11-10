package com.whsa.sherlock.seaweedfsmanagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "FILE")
public class File {
    @Id
    private String id;

    private String name;

    private String path;

    private String number;

    private String size;

    @Column(columnDefinition = "TINYINT",length = 2)
    private Integer status;

    @CreatedDate
    @Column(name = "create_time")
    private Date creatTime;

    @LastModifiedDate
    @Column(name="modify_time")
    private Date modifyTime;
}
