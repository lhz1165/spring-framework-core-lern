# spring-framework-core-lern
spring 源码的学习探索
## sspring源码构建方式
   1. 从github下载源码，网速满可以从码云下
   2. 安装gradle，找到spring项目的的gradle配置文件 spring-framework-5.0.x/gradle/wrapper/gradle-wrapper.properties 里面有相关版本的gradle下载地址，如果版本不合适会构建失败
   3. 配置gradle环境变量，idea配置gradle，导入工程
   4. 配置镜像  找到spring-framework-5.0.x/build.gradle文件 再repositories的标签里加入
     ```
     maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
     ```
   5. 编译项目
   
   
