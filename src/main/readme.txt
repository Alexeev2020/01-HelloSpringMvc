01-helloSpringMvc
第一个springMvc项目
需求：用户在页面发起一个请求，将请求交给springMvc的Controller对象处理，并返回结果

实现步骤
1.创建一个maven项目（web）

2.加入Spring-webmvc依赖
  间接加入Spring依赖，jsp，servlet依赖

3.重点 在web.xml中 创建SpringMvc框架核心对象 DispatcherServlet对象
  1）. DispatcherServlet 中央控制器是一个Servlet 其父类继承Servlet
  2）. DispatcherServlet接收用户请求，调用其他的控制器，并将结果返回给用户界面
  3）. DispatcherServlet也叫做前端控制器（front Controller）

4.创建一个发起请求的页面index.jsp

5.创建一个控制器类
  1).在类的上面使用@Controller注解，创建对象并放入SpringMvc容器中
  2).在类的方法上面使用@RequestMapping注解

6.创建一个结果页面，用于展示请求结果

7.创建SpringMvc的配置文件
  1).声明组件扫描器
  2).声明视图解析器，用于解析视图
