//package com.learn.controller;
//
//import com.learn.bean.User;
//import org.springframework.aop.scope.ScopedProxyUtils;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Map;
//
///**
// * 一些声明信息
// * Description: <br/>
// * date: 2020/7/22 12:26<br/>
// *
// * @author ${李佳乐}<br/>
// * @since JDK 1.8
// */
//@Controller
//public class ParamController {
//    @RequestMapping(value = "/param",method = RequestMethod.POST)
//    public String paramDemo(@RequestParam(value = "username",required = false,defaultValue = "admin")
//                                      String username, String password, String address){
//        System.out.println("username="+username+",password="+password+",address="+address);
//        return "3";
//    }
//
//    @RequestMapping(value = "/param",method = RequestMethod.POST)
//    public String paramHeader(@RequestHeader("Accept-Language") String AcceptLanguage){
//        System.out.println("AcceptLanguage"+AcceptLanguage);
//        return "3";
//    }
//
//    @RequestMapping(value = "/param",method = RequestMethod.POST)
//    public String paramCooKie(@CookieValue("JSESSIONID") String JSESSIONID){
//        System.out.println("JSESSIONID"+JSESSIONID);
//        return "3";
//    }
//
//    @RequestMapping(value = "/param",method = RequestMethod.POST)
//    public String paramPOJO(User user, HttpServletRequest request){
//        String username = request.getParameter("username");
//        System.out.println(username);
//        System.out.println(user);
//        return "3";
//    }
//
//    @RequestMapping(value = "/param",method = RequestMethod.POST)
//    public ModelAndView param(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("username","admin");
//        modelAndView.setViewName("3");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/param",method = RequestMethod.POST)
//    public String paramMap(Map<String,Object> map){
//        map.put("username","李佳乐");
//        return "3";
//    }
//
//     @RequestMapping(value = "/param",method = RequestMethod.POST)
//     public String paramModel(Model model,String username){
//         System.out.println(username);
//         model.addAttribute("username","徐欣裕");
//         return "3";
//     }
//}
