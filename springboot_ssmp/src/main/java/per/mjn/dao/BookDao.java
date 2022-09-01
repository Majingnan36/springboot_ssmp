package per.mjn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import per.mjn.domain.Book;

@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);
}
