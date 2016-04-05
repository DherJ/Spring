package com.objis.demomaven.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet
extends javax.servlet.http.HttpServlet
implements javax.servlet.Servlet {
 protected void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   out.println("Projet Maven la centrale-web : Servlet Lancée");
   out.flush();
   out.close();
 }                                 
}