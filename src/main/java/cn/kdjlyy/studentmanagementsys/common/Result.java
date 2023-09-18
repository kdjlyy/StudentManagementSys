package cn.kdjlyy.studentmanagementsys.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)  // 若被注解的字段值为 null，则序列化时忽略该字段。
public class Result {
    private int code;
    private String message = "success";
    private Object data;

    public Result setCode(ResultCode resultCode){
        this.code = resultCode.code;
        return this;
    }

    public Result setCode(Integer resultCode){
        this.code = resultCode;
        return this;
    }

    public Result setMessage(String message){
        this.message = message;
        return this;
    }

    public Result setData(Object data){
        this.data = data;
        return this;
    }
}