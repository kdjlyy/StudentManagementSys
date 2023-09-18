package cn.kdjlyy.studentmanagementsys.common;

public enum ResultCode {
    SUCCESS(200),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public final int code;

    ResultCode(int code) {
        this.code = code;
    }
}
