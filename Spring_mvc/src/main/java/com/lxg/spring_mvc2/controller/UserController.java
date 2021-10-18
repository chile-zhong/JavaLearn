package com.lxg.spring_mvc2.controller;

import com.lxg.spring_mvc2.domain.User;
import com.lxg.spring_mvc2.domain.VO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author lxg
 * @description 控制层
 * @date 2021/10/9
 */
@Controller
//@RequestMapping("/user")
public class UserController {

    /**
     * @RequestMapping("/quick"):
     * 作用：用于建立请求URL和处理方法之间的对应关系
     * 位置：
     *   类上：请求URL的第一季访问目录。此处不写的话，就相当于应用于根目录
     *   方法上：请求URL的第二级访问目录，与类上使用@RequestMapping标注的一级目录一起组成访问虚拟路径
     * 属性：
     *    value:用于指定请求的URL，他和path属性的作用是一样的
     *    method:用于指定请求的方法
     *    params:用于指定限制请求参数的条件。它支持简单的表达式。要求请求参数的key和value必须和配置一摸一样
     * @return
     */
    @RequestMapping("/quick")
    public String save(){
        System.out.println("controller save running...");
        //返回要跳转到的视图
        return "/success.jsp";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        /**
         * Model:模型。封装数据
         * View：视图，展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置Model数据
        modelAndView.addObject("username","zhangsan");
        //设置视图名称
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }


    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        //设置Model数据
        modelAndView.addObject("username","李四");
        //设置视图名称
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","wangwu");
        return "success.jsp";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","张三丰");
        return "success.jsp";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello Spring MVC");
    }

    @RequestMapping("/quick7")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转，直接进行数据响应
    public String save7() {
        return "hello Spring MVC";
    }

    @RequestMapping("/quick8")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转，直接进行数据响应
    public String save8() {
        return "{\"username\":\"张三\",\"age\":18}";
    }

   /* @RequestMapping("/quick9")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转，直接进行数据响应
    public String save9() throws JsonProcessingException {
        User user = new User();
        user.setUsername("李四");
        user.setAge(20);
        //使用json的转换工具将对象转换成json格式字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }*/

    @RequestMapping("/quick10")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转，直接进行数据响应
    //期望SpringMVC自动将User转换成
    public User save10(){
        User user = new User();
        user.setUsername("李四");
        user.setAge(20);
        return user;
    }

    //获得请求参数
    /**
     * 获得简单类型参数
     * @param username
     * @param age
     */
    @RequestMapping("/quick11")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转，直接进行数据响应
    public void save11(String username,int age){
        System.out.println(username);
        System.out.println(age);
    }

    /**
     * 获得POJO类型参数
     * Controller中业务方法的POJO参数的属性与请求参数的name一致，参数值会被自动映射
     */
    @RequestMapping("/quick12")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转，直接进行数据响应
    public void save12(User user){

        System.out.println(user);
    }

    /**
     * 获得数组类型参数
     * Controller中业务方法的数组名称与请求参数的name一致，参数值会被自动映射
     * http://localhost:8080/Spring_mvc/quick13?strs=111&strs=222&strs=333
     */
    @RequestMapping("quick13")
    @ResponseBody
    public void save13(String[] strs){

        System.out.println(Arrays.asList(strs));
    }

    /**
     * 获得集合类型参数
     * 获得集合参数时，要将集合参数包装到一个POJO中才可以
     * 此处当传递的参数是一个User类型的集合时，与VO类的属性一致，参数值会被自动映射
     */
    @RequestMapping("/quick14")
    @ResponseBody
    public void save14(VO vo){

        System.out.println(vo);
    }

    /**
     * 获得集合类型参数
     * 当使用ajax提交时，可以指定contentType为json形式，那么再方法参数位置使用@RequestBody可以
     * 直接接收集合数据而无需使用pojo进行包装
     */
    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList){
        System.out.println(userList);
        System.out.println("quick15");
    }


    /**
     * 当请求的参数名称与Controller的业务方法参数名称不一致时，
     * 就需要通过@RequestParam注解显示的绑定。
     * @param username
     */
    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestParam("name") String username){
        System.out.println(username);
    }

    /**
     * 可以配置不用必须传递参数
     * 和设置默认值，如果没有传递参数，则使用默认值
     * @param username
     */
    @RequestMapping("/quick17")
    @ResponseBody
    public void save17(@RequestParam(value = "name",required = false,defaultValue = "李四") String username){
        System.out.println(username);
    }

    /**
     * 在SpringMVC中可以使用占位符进行参数绑定。地址/user/1可以写成
     * /user/{id}，占位符{id}对应的就是1的值。在业务方法中我们可以使
     * 用@PathVariable注解进行占位符的匹配获取工作。
     * @param username
     */
    @RequestMapping("/quick18/{name}")
    @ResponseBody
    public void save18(@PathVariable(value = "name",required = true) String username){
        System.out.println(username);
    }

    /**
     * SpringMVC支持使用原始ServletAPI对象作为控制器方法的参数进行注入，
     * @param httpRequest
     * @param httpResponse
     * @param httpSession
     */
    @RequestMapping("/quick19")
    @ResponseBody
    public void save19(HttpServletRequest httpRequest, HttpServletResponse httpResponse, HttpSession httpSession){
        System.out.println(httpRequest);
        System.out.println(httpResponse);
        System.out.println(httpSession);
    }

    @RequestMapping("/quick20")
    @ResponseBody
    public void save20(
            @RequestHeader(value = "User-Agent",required = false) String
                    headerValue){
        System.out.println(headerValue);
    }

    @RequestMapping("/quick21")
    @ResponseBody
    public void save21(
            @CookieValue(value = "JSESSIONID",required = false) String jsessionid){
        System.out.println(jsessionid);
    }


    /**
     * 接收单文件上传文件
     */
    @RequestMapping("/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile upload) throws IOException {
        //获得文件名称
        String originalFilename = upload.getOriginalFilename();
        //保存文件
        upload.transferTo(new File(originalFilename));
    }

    /**
     * 接收多文件上传文件
     */
    @RequestMapping("/quick23")
    @ResponseBody
    public void save23(String username, MultipartFile[] upload) throws IOException {
        for (MultipartFile file : upload) {
            String filename = file.getOriginalFilename();
            System.out.println(filename);
        }
    }
}
