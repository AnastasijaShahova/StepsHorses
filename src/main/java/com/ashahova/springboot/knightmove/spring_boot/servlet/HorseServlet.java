package com.ashahova.springboot.knightmove.spring_boot.servlet;

import com.ashahova.springboot.knightmove.spring_boot.service.HorseService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HorseServlet extends HttpServlet {

    @Autowired
    HorseService horseService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String widthAsString = request.getParameter("width");
        String heightAsString = request.getParameter("height");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        try {
            PrintWriter writer = response.getWriter();
            writer.write(String.valueOf(horseService.getNumber(Integer.parseInt(widthAsString), Integer.parseInt(heightAsString), start, end)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
