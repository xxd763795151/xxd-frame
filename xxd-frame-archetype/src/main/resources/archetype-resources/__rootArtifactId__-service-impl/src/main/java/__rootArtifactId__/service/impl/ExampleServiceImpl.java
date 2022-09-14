package ${package}.${rootArtifactId}.service.impl;

import ${package}.${rootArtifactId}.domain.ExampleBean;
import ${package}.${rootArtifactId}.iservice.IExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements IExampleService {
    @Override
    public ExampleBean getExampleBean() {
        ExampleBean bean = new ExampleBean();
        bean.setContent("This is a example!");
        return bean;
    }
}
