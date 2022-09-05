package com.qf.ec.common.ex;

import com.qf.lz.common.result.ResponseCode;
import lombok.Getter;

@Getter
public class ServiceException extends BaseException{

    public ServiceException(ResponseCode responseCode) {
        super(responseCode);
    }
}
