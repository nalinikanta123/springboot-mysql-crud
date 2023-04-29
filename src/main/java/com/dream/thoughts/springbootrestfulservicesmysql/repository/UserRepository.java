package com.dream.thoughts.springbootrestfulservicesmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dream.thoughts.springbootrestfulservicesmysql.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
