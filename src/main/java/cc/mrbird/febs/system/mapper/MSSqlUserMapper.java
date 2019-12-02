package cc.mrbird.febs.system.mapper;

import cc.mrbird.febs.system.entity.OAUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MSSqlUserMapper extends BaseMapper<OAUser> {

    List<OAUser> findAll();

    @Select("select * from hrmresource")
    List<OAUser> findAll1();

}
