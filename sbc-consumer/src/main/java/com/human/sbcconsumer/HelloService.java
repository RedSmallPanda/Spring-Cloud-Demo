package com.human.sbcconsumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "myError")
    public  String hello()
    {
        return  restTemplate.getForEntity("http://cloud-simple-service/",String.class).getBody();
    }

    public String myError() {
        return "Sorry,error!";
    }
}