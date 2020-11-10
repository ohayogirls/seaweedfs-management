package com.whsa.sherlock.seaweedfsmanagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "FOLDER")
public class Folder {

    @Id
    @GeneratedValue
    private Integer Id;

    private String name;

    private String path;

    private Timestamp creatTime;

    private Timestamp modifyTime;
}
