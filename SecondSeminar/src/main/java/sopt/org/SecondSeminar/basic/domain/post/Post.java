package sopt.org.SecondSeminar.basic.domain.post;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Post {
    private Long id;

    private String title;

    private String body;

    @Builder.Default
    private int view_count = 0;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void plus_view_count() {
        this.view_count += 1;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "title: " + this.title + "\n" +
                "body: " + this.body + "\n" +
                "view_count: " + this.view_count + "\n";
    }
}
