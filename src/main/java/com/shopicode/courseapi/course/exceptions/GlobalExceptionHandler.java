//package com.shopicode.courseapi.course.exceptions;
//
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//public class GlobalExceptionHandler implements ErrorController {
//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
//
//    @RequestMapping("/error")
//    public ResponseEntity<String> handleError() {
//        // Handle errors here and return an appropriate response
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
//    }
//}
