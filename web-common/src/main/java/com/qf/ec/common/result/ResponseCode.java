package com.qf.ec.common.result;

import lombok.Getter;

/**
 *  状态码
 */
@Getter
public enum ResponseCode {
    /**
     *  成功
     */
    SUCCESS(20000,"success"),
    /**
     *系统异常
     */
    SYS_Error(40000,"error"),
    /**
     *  ====账号信息错误====
     */
     MEMBER_NO_EXIST_ERROR(400005,"account no exist"),

    MEMBER_PASSWORD_ERROR(400006, "password error"),

    /**
     *  ====文件上传错误====
     */
    FILE_UPLOAD_ERROR(400101,"file upload error"),

    /**
     *  ====添加错误====
     */
    ADD_ERROR(400201,"add error"),

    /**
     *  ====修改错误====
     */
    UPDATE_ERROR(400301,"update error"),

    /**
     *  ====删除错误====
     */
    DELETE_ERROR(400401,"delete error"),

    /**
     * ====创建订单错误====
     */
    CREATE_ORDER_ERROR(400203,"create order error");

    private final int status;
    private final String msg;

    ResponseCode(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
