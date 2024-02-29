package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.mapping.CusMap;
import com.example.project.service.CusMapService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CusMapController {
    @Autowired
    CusMapService cusMapService;

    @PostMapping("/post")  
    public CusMap post(@RequestBody CusMap cusMap)
    {
        return cusMapService.post(cusMap);
    }

    @GetMapping("/get")
    public List<CusMap> get()
    {
        return cusMapService.get();
    }

    @GetMapping("/getsorting/{location}")
    public List<CusMap> getsort(@PathVariable String location)
    {
        return cusMapService.sorts(location);
    }

    @GetMapping("/pages/{offset}/{pagenumber}")
    public List<CusMap> getpage(@PathVariable int  offset,@PathVariable int pagenumber)
    {
        return cusMapService.page(offset,pagenumber);
    }
    @GetMapping("/query")
    public List<CusMap> getquery(@PathVariable String cusName)
    {
        return cusMapService.query(cusName);
    }
}
