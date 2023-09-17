package kr.yuns.springinit.data.repository;

import kr.yuns.springinit.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByEmail(String email);
    User findByEmail(String email);
}
