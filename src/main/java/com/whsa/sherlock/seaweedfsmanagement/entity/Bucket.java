package com.whsa.sherlock.seaweedfsmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "BUCKET")
public class Bucket {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Column(columnDefinition = "TINYINT",length = 1)
    private boolean isPublic;

    private Timestamp modifyTime;

    private Timestamp createTime;

}
