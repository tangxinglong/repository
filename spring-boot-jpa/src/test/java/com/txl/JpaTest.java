package com.txl;

import com.txl.domain.User;
import com.txl.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @description
 * @author: TXL
 * @date: 2020/08/16 18:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpaApplication.class)
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }
}
