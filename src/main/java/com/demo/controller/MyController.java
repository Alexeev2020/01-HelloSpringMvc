package com.demo.controller;

import com.demo.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @Controller :创建控制器对象，将对象放在springmvc容器中
 * 位置：在类的上面
 * 和spring 中的@service，@Component类似 都是用来创建对象
 */
@Controller
@RequestMapping("/user")
public class    MyController {

    /**
     * 使用dosome方法处理some.do请求
     * @RequestMapping 请求映射，作用是把一个请求地址与一个方法绑定在一起
     *                  一个请求由一个方法处理
     *      属性：1.value 是一个String 表示请求的uri地址 (some.do)
     *             value的值必须是唯一的，不能重复，使用时建议使用 /
     *      位置：2.方法的上面或者类的上面
     *
     *      使用@RequestMapping修饰的方法叫处理器方法或者控制器方法，是可以处理请求的
     *      返回值：ModelAndView ：表示请求处理完成后返回的结果
     *              Model：数据
     *              View：视图
     */
    @RequestMapping (value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用springMvc进行web开发");
        mv.addObject("fun","执行了doSome方法");
        mv.setViewName("show");
        return mv;

    }
    @RequestMapping (value = "/other.do")
    public ModelAndView doOther(HttpServletRequest request,
                                HttpServletResponse response,
                                HttpSession session) throws UnsupportedEncodingException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        mv.addObject("msg","提交的参数姓名为："+request.getParameter("name"));
        mv.addObject("fun","提交的参数年龄为："+request.getParameter("age"));
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping (value = "/first.do")
    public ModelAndView doFirst(String name,int age) throws UnsupportedEncodingException {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",name);
        mv.addObject("fun",age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping (value = "/receiveObject.do")
    public ModelAndView receiveObject(Student mystudent) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",mystudent.getName());
        mv.addObject("myage",mystudent.getAge());
        mv.addObject("mystudent",mystudent);
        mv.setViewName("show2");
        return mv;
    }
}
