package ${package}.${rootArtifactId}.domain;

public class ExampleBean {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override public String toString() {
        return "ExampleBean{" +
            "content='" + content + '\'' +
            '}';
    }
}
