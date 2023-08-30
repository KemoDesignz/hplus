package com.learning.springex.springexample.exceptions;

import com.learning.springex.springexample.util.LoggerUtil;
import org.apache.juli.logging.Log;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

@ControllerAdvice
public class ApplpicationExceptionHandler {
    private Log log = LoggerUtil.getLogger();

    @ExceptionHandler({ApplicationException.class, AsyncRequestTimeoutException.class})
    public String handleException() {
        return "error";
    }
}
