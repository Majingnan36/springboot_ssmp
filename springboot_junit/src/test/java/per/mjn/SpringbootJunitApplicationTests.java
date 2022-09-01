package per.mjn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import per.mjn.dao.BookDao;

@SpringBootTest
class SpringbootJunitApplicationTests {

    // 1. 注入你想要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // 2. 执行要测试的对象对应的方法
        bookDao.save();
    }

}
