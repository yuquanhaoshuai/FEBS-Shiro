package cc.mrbird.febs.business.mapper;

import cc.mrbird.febs.business.entity.Tlbegin;
import cc.mrbird.febs.business.entity.Tlye;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TlweekReportMapper extends BaseMapper<Tlye> {

    @Select("exec cust_usp_tlweeklyreport #{begin}, #{end}")
    List<Tlye> getTlYe(@Param("begin") String begin,@Param("end") String end);

    @Select("select * from tl_weekly_begin where Year(fdate) = #{year}")
    List<Tlbegin> getTlBegin(@Param("year") Integer year);

}
