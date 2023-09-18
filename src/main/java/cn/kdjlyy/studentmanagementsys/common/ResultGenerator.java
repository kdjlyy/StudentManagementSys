package cn.kdjlyy.studentmanagementsys.common;

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "操作成功";
    private static final String SERVER_FAILED_MESSAGE = "系统错误，请联系管理员";

    public static Result SUCCESS() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result SUCCESS(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    // System error
    public static Result ERROR() {
        return new Result()
                .setCode(ResultCode.INTERNAL_SERVER_ERROR)
                .setMessage(SERVER_FAILED_MESSAGE);
    }

    // Custom error
    public static Result ERROR(ResultCode errCode, String message) {
        return new Result()
                .setCode(errCode)
                .setMessage(message);
    }
    public static Result ERROR(Integer errCode, String message) {
        return new Result()
                .setCode(errCode)
                .setMessage(message);
    }
}
