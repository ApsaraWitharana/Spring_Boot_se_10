package com.example.sachini.controller;

import org.springframework.web.bind.annotation.*;

//
@RestController
//mapping  req clss run
//    http://localhost:8080/blog
@RequestMapping("blog")
public class BlogController {
    //    http://localhost:8080/blog/hellow
    @GetMapping("/hellow")
    public String hellow(){
        return "HELLO WORLD!!";
    }

    @PostMapping("/number")
//    http://localhost:8080/blog/number =>colling postman =req type post
    public int getNumber(){
        return 9;
    }

    //Spring boot path variable request
//http://localhost:8080/blog/api/employees/C001
    //pass every id:string,boolean,double,int ==@PathVariable String id=>{id} -url eke path eke den ekt
    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID: " + id;
    }
}
