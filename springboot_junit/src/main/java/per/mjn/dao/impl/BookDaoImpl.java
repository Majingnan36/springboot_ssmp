package per.mjn.dao.impl;

import org.springframework.stereotype.Repository;
import per.mjn.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running....");
    }
}
