package com.didispace.web;

import com.didispace.service.ComputeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ClientController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/helloworld" ,method = RequestMethod.GET)
    public String helloworld() throws Exception {
        try{
            return computeService.add(2,3);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
