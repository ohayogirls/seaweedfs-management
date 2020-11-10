package com.whsa.sherlock.seaweedfsmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "FILE_CHUNK")
public class FileChunk {
    @Id
    @GeneratedValue
    private Integer Id;

    private String number;

    private Integer offset;

    private Integer size;

    private Timestamp createTime;

    private Timestamp ModifyTime;

}
