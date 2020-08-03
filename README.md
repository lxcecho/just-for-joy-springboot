一、Spring Boot简介
  简化Spring应用开发的一个框架。
  整个Spring技术栈的一个大整合。
  J2EE开发的一站式解决方案。

二、微服务
  2014 martain flower
  微服务：架构风格（服务微化）
  一个应用应该是一组小型服务，可以通过HTTP的方式进行互通。
  单体应用：ALL IN ONE
  微服务：每一个功能元素最终都是一个可独立替换和独立升级的软件单元。
  详细参照微服务文档（https://martinfowler.com/articles/microservices.html#MicroservicesAndSoa）。

三、环境准备
  环境约束
  -jdk1.8：Spring Boot推荐jdk1.7及以上；java version "1.8.0_112"
  -maven3.x：maven3.3以上版本；Apache Maven3.6.3
  -IntellijIDEA2020:intelliJ IDEA 2020.1.x64、STS
  -SpringBoot 2.3.2.RELEASE:2.3.2
统一环境：
1、Maven设置
给Maven的setting.xml配置文件的profiles标签添加下面的代码：
  <profile>
    <id>jdk‐1.8</id>
    <activation>
      <activeByDefault>true</activeByDefault>
      <jdk>1.8</jdk>
    </activation>
    <properties>
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
      <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
    </properties>
  </profile>
 2、IDEA设置
 整合maven进来：settings->Build/Exception/Deployment->maven->...directory/user setting/local respository-->OK

四、Spring Boot HelloWorld
  一个功能：浏览器发送hello请求，服务器接收请求并处理，响应Hello World字符串。
  1、创建一个maven工程（jar）
  2、打入Spring Boot相关依赖
    <parent>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring‐boot‐starter‐parent</artifactId>
          <version>2.3.2.RELEASE</version>
      </parent>
      <dependencies>
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring‐boot‐starter‐web</artifactId>
          </dependency>
      </dependencies>
   3、编写一个主程序；启动Spring Boot应用
      /**
       *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
       */
      @SpringBootApplication
      public class HelloWorldMainApplication {
          public static void main(String[] args) {
              // Spring应用启动起来
              SpringApplication.run(HelloWorldMainApplication.class,args);
          }
      }
   4、编写相关的Controller、Service
      @Controller
      public class HelloController {
          @ResponseBody
          @RequestMapping("/hello")
          public String hello(){
              return "Hello World!";
          }
      }
   5、运行主程序测试
   6、简化部署
      <!‐‐ 这个插件，可以将应用打包成一个可执行的jar包；‐‐>
      <build>
          <plugins>
              <plugin>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring‐boot‐maven‐plugin</artifactId>
              </plugin>
          </plugins>
      </build>
    将这个应用打成jar包，直接使用java -jar的命令进行执行。
五、HelloWorld探究
  1、POM文件
    1）父项目
       <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring‐boot‐starter‐parent</artifactId>
        <version>2.3.2.RELEASE</version>
       </parent>
    他的父项目是
        <parent>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring‐boot‐dependencies</artifactId>
          <version>2.3.2.RELEASE</version>
          <relativePath>../../spring‐boot‐dependencies</relativePath>
         </parent>
     他来真正管理Spring Boot应用里面的所有依赖版本；
    Spring Boot的版本仲裁中心：
      以后我们导入依赖默认是不需要写版本，（没有在dependencies里面管理的依赖自然需要声明版本号）。
    2）启动器
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring‐boot‐starter‐web</artifactId>
      </dependency>
    spring‐boot‐starter‐web ：
      spring‐boot‐starter：Spring Boot场景启动器，帮我们打入了web模块正常运行所依赖的组件。
    SpringBoot将所有的功能场景都抽取出来，做成一个个starters（启动器），只需要在项目里面引入这些starter相关场景的所有依赖都会导入进来，
    要用什么功能就导入什么场景的启动器。
  2、主程序类，主入口类
    /**
     *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
     */
    @SpringBootApplication
    public class HelloWorldMainApplication {
        public static void main(String[] args) {
            // Spring应用启动起来
            SpringApplication.run(HelloWorldMainApplication.class,args);
        }
    }
   @SpringBootApplication：Spring Boot应用标注在某个类上说明这个类时SpringBoot的主配置类，SPringBoot就应该运行这个类的main方法来启动SpringBoot应用。
   其实现为：（部分代码截取）
      @Target(ElementType.TYPE)
      @Retention(RetentionPolicy.RUNTIME)
      @Documented
      @Inherited
      @SpringBootConfiguration
      @EnableAutoConfiguration
      @ComponentScan(excludeFilters = {
            @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
            @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
      public @interface SpringBootApplication {
     @SpringBootConfiguration：SpringBoot的配置类；
      标注在某个类上，表示这是一个SpringBoot的配置类。
     @Configuration：配置类上来标注这个注解；
      配置类---配置文件；配置类也是容器中的一个组件；@Component
     @EnableAutoConfiguration：开启自动配置功能；
      以前我们需要配置的东西，SpringBoot帮我们自动配置；@EnableAutoConfiguration告诉SpringBoot开启自动配置功能，这样自动配置才能生效。
        @AutoConfigurationPackage
        @Import(EnableAutoConfigurationImportSelector.class)
        public @interface EnableAutoConfiguration {
     @AutoConfigurationPackage：自动配置包
     @Import（AutoConfigurationPackage.Registrar.class）；
      Spring的底层注解@Import，给容器中导入一个组件，打入的组件由AutoConfigurationPackage.Registrar.class。
     将主配置类（@SpringBootApplication标注的类）的所有包及下面的所有子包里面的所有组件扫描到Spring容器。
     @Import(EnableAutoConfigurationImportSelector.class)：给容器中打入组件。
     EnableAutoConfigurationImportSelector：导入哪些组件的选择器；
     将所有需要导入的组件以全类名的方式返回，这些组件就会被添加到容器中；
     会给容器中导入非常多的自动配置类（XXXAutoConfiguration）；就是给容器中导入这个场景所需要的所有组件，并配置好这些组件。
     
