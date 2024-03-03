//package com.shopicode.courseapi.course.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//public class GlobalErrorHandler {
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleException(Exception ex) {
//        // Log the exception
//        ex.printStackTrace();
//        // Return an appropriate response
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
//    }
//
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
//        // Log the exception
//        ex.printStackTrace();
//        // Return a 404 response
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found");
//    }
//}
