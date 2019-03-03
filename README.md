# YwhSpringInAction
spring实战第4版

```$xslt
├── pom.xml //maven的配置文件
└── src
    ├── main
    │   ├── java //java代码的目录
    │   │   └── com.ywh.springinactiontest
    │   │       ├── controller //控制层
    │   │       ├── dao         //持久层
    │   │       └── entity      //实体类
    │   │       
    │   ├── resources //静态资源目录
    │   │   ├── db.properties
    │   │   ├── log4j.xml
    │   │   └── META-INF
    │   │       └── persistence.xml
    │   └── webapp //web应用部署根目录
    │       ├── index.html //因为是静态html文件，不用放到WEB-INF目录下
    │       ├── META-INF
    │       │   ├── context.xml
    │       │   └── MANIFEST.MF
    │       ├── resources //css，js等静态资源是不能放到WEB-INF目录下的，因为WEB-INF下的资源，客户端无法直接访问
    │       │   └── css
    │       │       └── screen.css
    │       └── WEB-INF //jsp都会放到这里，以保证用户无法直接访问jsp，而是通过controller这个目录下的所有内容客户端都无法直接访问，所以不要放静态文件
    │           ├── spring
    │           │   ├── app
    │           │   │   ├── controllers.xml
    │           │   │   └── servlet-context.xml
    │           │   ├── db.xml
    │           │   └── root-context.xml
    │           ├── views
    │           │   ├── edit.jsp
    │           │   ├── home.jsp
    │           │   └── list.jsp
    │           └── web.xml
    └── test
        ├── java
        │   └── mygroup
        │       ├── controller
        │       │   ├── DataInitializer.java
        │       │   ├── HomeControllerTest.java
        │       │   └── PersonControllerTest.java
        │       └── dao
        │           └── PersonDaoTest.java
        └── resources
            ├── db.properties
            ├── log4j.xml
            ├── test-context.xml
            └── test-db.xml

--------------------- 

```