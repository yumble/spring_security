package com.example.security1.repository;

import com.example.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JPA repository 가 기본적으로 들고있다.
//@Repository라는 어노테이션이 없어도 IOC가 된다.
// Jpa Repository 를 상속했기 때문에
//IndexController 에서 autowired 하자..
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByUsername(String username);

}
