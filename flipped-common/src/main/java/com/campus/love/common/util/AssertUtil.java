package com.campus.love.common.util;

import com.campus.love.common.api.IErrorCode;
import com.campus.love.common.exception.ApiException;

public class AssertUtil {

    public void failed(String message) {
        throw new ApiException(message);
    }

    public void failed(IErrorCode error) {
        throw new ApiException(error);
    }
}
