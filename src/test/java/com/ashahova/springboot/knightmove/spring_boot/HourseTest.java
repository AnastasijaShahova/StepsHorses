package com.ashahova.springboot.knightmove.spring_boot;

import com.ashahova.springboot.knightmove.spring_boot.service.HorseServiceImp;
import org.junit.Test;

import static org.junit.Assert.*;

public class HourseTest {

    @Test
    public void getNumberTest1() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 10;
        int height = 14;
        String start = "B1";
        String end = "A3";
        assertEquals(1, horseService.getNumber(width, height, start, end));
    }

    @Test
    public void getNumerTest2() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 20;
        int height = 20;
        String start = "B3";
        String end = "S20";
        assertEquals("12", Integer.toString(horseService.getNumber(width, height, start, end)));
    }

    @Test
    public void getNumberTest3() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 2;
        int height = 2;
        String start = "A1";
        String end = "A2";
        assertEquals("-1", Integer.toString(horseService.getNumber(width, height, start, end)));
    }

    @Test
    public void getNumberTest4() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 12;
        int height = 12;
        String start = "E6";
        String end = "J10";
        assertEquals(3, horseService.getNumber(width, height, start, end));
    }

    @Test
    public void getNumberTest5() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 3;
        int height = 3;
        String start = "A1";
        String end = "A1";
        assertEquals(0, horseService.getNumber(width, height, start, end));
    }

    @Test
    public void getNumberTest6() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 12;
        int height = 12;
        String start = "E6";
        String end = "A2";
        assertEquals(4, horseService.getNumber(width, height, start, end));
    }

    @Test
    public void getNumberTest7() throws Exception {
        HorseServiceImp horseService = new HorseServiceImp();
        int width = 7;
        int height = 7;
        String start = "A1";
        String end = "C1";
        assertEquals(2, horseService.getNumber(width, height, start, end));
    }
}
