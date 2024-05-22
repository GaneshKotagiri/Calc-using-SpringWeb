package com.chopchop.springbootwebmvn;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "index.jsp";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session) throws Exception{
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));
        int result=num1+num2;
        System.out.println(result);
        session.setAttribute("result",result);
        return "result.jsp";
    }
    @RequestMapping("/sub")
    public String sub(HttpServletRequest req, HttpSession session) throws Exception{
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));
        int result=num1-num2;
        System.out.println(result);
        session.setAttribute("result",result);
        return "result.jsp";
    }
    @RequestMapping( "/calc")
    public String calc(HttpServletRequest req,HttpSession session){
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));
        String operation=req.getParameter("operation");
        int result=0;
        if("add".equals(operation)){
            result=num1+num2;
        }else if("sub".equals(operation)){
            result=num1-num2;
        }else if("mul".equals(operation)){
            result=num1*num2;
        }else{
            result=num1/num2;
        }
        System.out.println(result);
        session.setAttribute("result",result);
        return "result.jsp";
    }
}
