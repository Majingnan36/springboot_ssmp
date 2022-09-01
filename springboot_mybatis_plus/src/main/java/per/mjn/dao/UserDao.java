package per.mjn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import per.mjn.domain.User;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
