package me.snikit.tryouts.advice;

import me.snikit.tryouts.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({EmployeeNotFoundException.class})
    protected ResponseEntity<String> handleNotFound(RuntimeException e, WebRequest request) {
        return ResponseEntity.notFound().build();
    }

}
