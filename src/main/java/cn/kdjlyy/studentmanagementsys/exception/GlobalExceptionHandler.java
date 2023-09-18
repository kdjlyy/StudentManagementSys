package cn.kdjlyy.studentmanagementsys.exception;

import cn.kdjlyy.studentmanagementsys.common.Result;
import cn.kdjlyy.studentmanagementsys.common.ResultCode;
import cn.kdjlyy.studentmanagementsys.common.ResultGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    // Runtime exception
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result exceptionHandler() {
        return ResultGenerator.ERROR();
    }

    // Custom exception
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public Result customExceptionHandler(CustomException e) {
        log.error("occurs custom exception:{} {}", e.getCode(), e.getMessage());
        return ResultGenerator.ERROR(e.getCode(), e.getMessage());
    }
}
