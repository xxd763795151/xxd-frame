package ${package}.${rootArtifactId}.web;

import com.xxd.frame.boot.ApplicationStarter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan({"com.xxd.*", "${package}.*"})
public class Application {

    public static void main(String[] args) {
        ApplicationStarter.start(Application.class, args);
    }

    @GetMapping
    public String hello() {
        return "hello, world";
    }
}
