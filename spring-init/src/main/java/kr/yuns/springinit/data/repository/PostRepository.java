package kr.yuns.springinit.data.repository;

import kr.yuns.springinit.data.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
