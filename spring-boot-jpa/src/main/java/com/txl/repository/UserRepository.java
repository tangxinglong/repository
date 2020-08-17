package com.txl.repository;

import com.txl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description
 * @author: TXL
 * @date: 2020/08/16 18:39
 */
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();
}
