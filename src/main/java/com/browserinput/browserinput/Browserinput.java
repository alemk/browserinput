package com.browserinput.browserinput;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

@RestController
public class Browserinput
{
   @RequestMapping ("/")
    public String showinput()
   {
        Scanner keyboard = new Scanner(System.in);
        String username = keyboard.nextLine();
        String great = "Hello " + username;
        System.out.println(great);
        return great;
    }
    @RequestMapping("/getname")
    public String showwithname(@RequestParam("name") String name, @RequestParam("age") int age)
    {
        return name + "  " + age;
    }
    @RequestMapping("/getothername")
    public String showwithname(HttpServletRequest param)
    {
        String withname = param.getParameter("yourname");
        if (withname==null)
            return "just hello";
        else return "Hello   " + withname;
    }
}

