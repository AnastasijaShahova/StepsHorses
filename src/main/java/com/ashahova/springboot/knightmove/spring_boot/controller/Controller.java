package com.ashahova.springboot.knightmove.spring_boot.controller;

import com.ashahova.springboot.knightmove.spring_boot.service.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    HorseService horseService;

    @GetMapping("/horse/rest/count")
    public int getNumber(@RequestParam("width") int width,
                         @RequestParam("height") int height,
                         @RequestParam("start") String start,
                         @RequestParam("end") String end) {
    return horseService.getNumber(width, height, start, end);
    }




}
