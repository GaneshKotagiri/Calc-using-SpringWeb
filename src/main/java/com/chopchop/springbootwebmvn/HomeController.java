package com.chopchop.springbootwebmvn;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        return "result";
    }
    @RequestMapping("/sub")
    public String sub(HttpServletRequest req, HttpSession session) throws Exception{
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));
        int result=num1-num2;
        System.out.println(result);
        session.setAttribute("result",result);
        return "result";
    }
    //we are using HttpServletRequest-req and HttpSession-session to getting the parameters and storing in them and session to store the result which will be viewed in the redirected page
    //we can also use other methods to get the attributes and store them
    @RequestMapping( "/calc")
    public String calc(HttpServletRequest req,HttpSession session){
        long num1= Long.parseLong(req.getParameter("num1"));
        long num2= Long.parseLong(req.getParameter("num2"));
        String operation=req.getParameter("operation");
        long result=0;
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
        return "result";
    }
    // In this instead of using HttpServletRequest and Session we have used int variables
    //to store the data and Model object to view the result int the servlet page
    //we can also use ModelAndView instead of Model and the methods will change from addAttributes to addObject


//    @RequestMapping( "/calc")
//    public String calc(int num1, int num2,int operation, ModelAndView mv){
//
//        int result=0;
//        if("add".equals(operation)){
//            result=num1+num2;
//        }else if("sub".equals(operation)){
//            result=num1-num2;
//        }else if("mul".equals(operation)){
//            result=num1*num2;
//        }else{
//            result=num1/num2;
//        }
//        System.out.println(result);
//        mv.addObject("result",result);
//        mv.setViewName(result);
//        return "result.jsp";
//    }
//}
