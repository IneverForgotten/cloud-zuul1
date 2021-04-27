package com.fanlm.cloudzuul.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sun.deploy.security.BlockedException;
import org.springframework.stereotype.Service;

/**
 * @author
 * @date
 */
//@Service
public class SentinelService {

    @SentinelResource(value = "resourceLimit1",blockHandler = "block")
    public String call(){
        System.out.println("go");
        return "go";
    }

    public String block(BlockedException ex){
        System.out.println("block");
        return "block";
    }
}
