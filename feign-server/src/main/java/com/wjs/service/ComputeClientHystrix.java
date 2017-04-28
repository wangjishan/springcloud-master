package com.wjs.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by user on 2017/4/25.
 */

@Component
public class ComputeClientHystrix implements ComputeClient {


    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {

        System.out.println("走了没=====");

        return -100;
    }


}
