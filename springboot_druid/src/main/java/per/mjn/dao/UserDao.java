package per.mjn.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import per.mjn.domain.User;

@Mapper
public interface UserDao {

    @Select("select * from user where userId = #{id}")
    public User getById(Integer id);
}
