package com.acat;

import com.acat.model.User;
import com.acat.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MongodbApplication.class)
public class MongodbApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        //userRepository.deleteAll();
    }

    @Test
    public void test() throws Exception {

        // 创建10个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        userRepository.save(new User(4L, "didi2", 30));
        userRepository.save(new User(5L, "mama", 40));
        userRepository.save(new User(6L, "kaka2", 50));
        userRepository.save(new User(7L, "kaka", 50));
        userRepository.save(new User(8L, "kao", 50));
        userRepository.save(new User(9L, "ekakae", 50));
        userRepository.save(new User(10L, "kaka5", 50));
        userRepository.save(new User(11L, "", 50));
        userRepository.save(new User(12L, null, 50));

        // 删除一个User，再验证User总数
        /*User u = userRepository.findOne(1L);
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));
        // 删除一个User，再验证User总数
        u = userRepository.findByUsername("mama").get(0);
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));*/

    }
}

