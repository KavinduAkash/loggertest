package com.ceyentra.loggertest.loggertest.controller;

import com.ceyentra.loggertest.loggertest.dto.ResponseDTO;
import org.springframework.web.bind.annotation.*;
import lombok.extern.log4j.Log4j2;

/**
 * @author hp
 */
@RestController
@CrossOrigin
@Log4j2
@RequestMapping("v1/test")
public class TestController {

    @GetMapping
    public ResponseDTO testMethod() {
        log.info("testMethod INFO Called");
        log.error("testMethod ERROR Called");
        return new ResponseDTO(200, true, "Ok");
    }

}
