package com.didispace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {
    @Autowired
    private RestTemplate restTemplate;

    public String add(int a, int b) {
        return restTemplate.getForObject("http://COMPUTE-SERVICE/add?a=" + a + "&b=" + b, String.class);
    }
}
