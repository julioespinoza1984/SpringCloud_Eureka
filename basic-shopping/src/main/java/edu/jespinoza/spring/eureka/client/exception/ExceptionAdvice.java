package edu.jespinoza.spring.eureka.client.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {
    private static final String TECHNICAL_ERROR = "TECHNICAL ERROR: ";
    private static final String APPLICATION_ERROR = "APPLICATION ERROR: ";
    private static final String UNKNOWN_ERROR = "UNKNOWN ERROR: ";

    @ExceptionHandler(TechnicalException.class)
    public ResponseEntity<CustomMessage> technicalException(TechnicalException ex) {
        log.error("TechnicalException -> {}", ex.getMessage());
        ex.printStackTrace();
        CustomMessage message = new CustomMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                TECHNICAL_ERROR + ex.getMessage());
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<CustomMessage> applicationException(ApplicationException ex) {
        log.error("ApplicationException -> {}", ex.getMessage());
        ex.printStackTrace();
        CustomMessage message = new CustomMessage(HttpStatus.BAD_REQUEST.value(),
                APPLICATION_ERROR + ex.getMessage());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomMessage> Exception(Exception ex) {
        log.error("Exception -> {}", ex.getMessage());
        ex.printStackTrace();
        CustomMessage message = new CustomMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                UNKNOWN_ERROR + ex.getMessage());
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}