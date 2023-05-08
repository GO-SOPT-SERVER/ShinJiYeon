package sopt.org.ThirdSeminar.infrastructure;

import org.springframework.stereotype.Repository;
import sopt.org.ThirdSeminar.domain.Post;

import java.util.Optional;

@Repository
public interface PostRepository extends org.springframework.data.repository.Repository<Post, Long> {

    void save(Post post);

    Optional<Post> findById(Long postId);
}
