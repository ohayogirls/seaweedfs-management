package com.whsa.sherlock.seaweedfsmanagement.vo;

import lombok.Data;



@Data
public class ResultVO<T> {

    /** 返回码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 时间 */
    private String time;

    /** 具体内容 */
    private T data;


}
