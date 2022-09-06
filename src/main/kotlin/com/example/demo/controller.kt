package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller{
    @GetMapping(
        value = ["/"],
        produces = ["application/json"]
    )
    fun getProduct(): WebResponse<Any>{
        return WebResponse(
            code = 200,
            status = "OK",
            data = "Hello Try"
        )
    }
    @GetMapping(
        value = ["/api/{id}"],
        produces = ["application/json"]
    )
    fun getApi(@PathVariable("id") id:String): WebResponse<Any>{
        return WebResponse(
            code = 200,
            status = "OK",
            data = "Hello Try $id"
        )
    }
}