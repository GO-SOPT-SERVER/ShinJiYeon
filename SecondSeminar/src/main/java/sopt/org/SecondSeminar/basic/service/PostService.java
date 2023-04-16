package sopt.org.SecondSeminar.basic.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.basic.controller.post.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.basic.domain.post.Post;

import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@Service
public class PostService {

    public Long register(RegisterRequestDto request) {

        Post newPost = new Post(request.getTitle(), request.getBody());

        postList.add(newPost);
        newPost.setId((long) postList.size());

        return newPost.getId();
    }

    public Post getPostById(Long id) {
        //인덱스오류에 대한 오류처리 따로 하지 않음
        Post post = postList.get(id.intValue() - 1);
        post.plus_view_count();

        return post;
    }

    public Post getPostByTitle(String title) {
        Post post = null;
        for (Post p : postList) {
            if (p.getTitle().equals(title)) {
                post = p;
            }
        }
        return post;
    }
}
