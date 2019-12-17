package cc.mrbird.febs.system.mapper;

import cc.mrbird.febs.system.entity.OADept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface MSSQLDeptMapper extends BaseMapper<OADept> {

    List<OADept> findAll();

}
