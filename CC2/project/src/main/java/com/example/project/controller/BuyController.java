package com.example.project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Buy;

import com.example.project.service.BuyService;

@RestController
public class BuyController {
    @Autowired
    BuyService buyService;

    @PostMapping("/postbuy")
    public Buy addbuy(@RequestBody Buy buy) {
        //TODO: process POST request
        
        return buyService.addbuy(buy);
    }
    @GetMapping("/getbuy")
    public List<Buy> getbuy() {
        return buyService.getbuy();
    }

    @GetMapping("/buy/{name}")
    public List<Buy> getBuysByName(@PathVariable String name) {
        return buyService.getBuysByName(name);
    }

    @PutMapping("putbuy/{plotno}")
    public  Buy putbuy(@PathVariable Long plotno, @RequestBody Buy buy) {
        //TODO: process PUT request
        
        return buyService.putbuy(plotno,buy);
    }
    
    @DeleteMapping("/deletebuy/{plotno}")
    public String deletebuy(@PathVariable Long plotno)
    {
        return buyService.deletebuy(plotno);
    }
}
