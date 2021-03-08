package com.ashahova.springboot.knightmove.spring_boot.service;

import com.ashahova.springboot.knightmove.spring_boot.service.algorithm.BreadthFirstTraversal;
import com.ashahova.springboot.knightmove.spring_boot.service.algorithm.Converter;
import org.springframework.stereotype.Service;

@Service
public class HorseServiceImp implements HorseService {


    @Override
    public int getNumber(int width, int height, String start, String end) {

        int startX = Converter.getNumericCoorinate(start);
        int startY = Converter.getNumericFromValue(start);

        int endX = Converter.getNumericCoorinate(end);
        int endY = Converter.getNumericFromValue(end);

        return BreadthFirstTraversal.searchAlgorithm(width,height,startX,startY,endX,endY);
    }
}
