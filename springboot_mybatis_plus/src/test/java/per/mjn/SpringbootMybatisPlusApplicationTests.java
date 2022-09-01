package per.mjn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import per.mjn.dao.UserDao;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(userDao.selectById(1));
    }

}
