package cn.kdjlyy.studentmanagementsys.exception;

import cn.kdjlyy.studentmanagementsys.common.ResultCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    static private final Integer INTERNAL_SERVER_ERROR = 500;
    private final Integer code;

    public CustomException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public CustomException(String msg) {
        super(msg);
        this.code = INTERNAL_SERVER_ERROR;
    }
}
