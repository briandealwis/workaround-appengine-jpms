package com.example.yasson;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAppEngine extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    javax.json.Json.createArrayBuilder();
    response.setContentType("text/plain");
    response.getWriter().print("Hello App Engine!\r\n");

  }
}