package ${package}.${rootArtifactId}.web.controller;

import ${package}.${rootArtifactId}.domain.ExampleBean;
import ${package}.${rootArtifactId}.iservice.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private IExampleService exampleService;

    @GetMapping("/hi")
    public ExampleBean example() {
        return exampleService.getExampleBean();
    }
}
