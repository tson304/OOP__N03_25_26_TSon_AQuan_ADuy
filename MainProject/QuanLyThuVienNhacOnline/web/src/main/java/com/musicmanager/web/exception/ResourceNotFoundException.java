// Đặt file này trong một package mới, ví dụ: com.musicmanager.web.exception
package com.musicmanager.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Annotation này sẽ tự động trả về mã lỗi 404 NOT FOUND
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}