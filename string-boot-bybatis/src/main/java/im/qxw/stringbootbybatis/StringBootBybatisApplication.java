package im.qxw.stringbootbybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "im.qxw.stringbootbybatis.mapper")
@SpringBootApplication
public class StringBootBybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringBootBybatisApplication.class, args);
    }

}
