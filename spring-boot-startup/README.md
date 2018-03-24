# spring boot startup 

通过spring boot框架床架一个WEB应用非常简单，甚至不需要我们做任何设置，只需要一个Application入口类，通过注解@SpringBootApplication声明自动引入组建。
然后通过设置@RestController，@RequestMapping注解，就可以成功的启动spring boot 应用。

```shell

gralde build
gradle bootRun

```
