package cc.mrbird.febs.business.service.Impl;

import cc.mrbird.febs.business.entity.Tlbegin;
import cc.mrbird.febs.business.entity.Tlye;
import cc.mrbird.febs.business.mapper.TlweekReportMapper;
import cc.mrbird.febs.business.service.IBaseService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class TlweekReportService extends ServiceImpl<TlweekReportMapper, Tlye> implements IBaseService {

    @Autowired
    TlweekReportMapper tlweekReportMapper;

    @DS("sqlserver_u8")
    public List<Tlye> getU8TlYe(String begin,String end){
        return tlweekReportMapper.getTlYe(begin,end);
    }

    public List<Tlbegin> getLocalYe(){
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        return tlweekReportMapper.getTlBegin(year);
    }

}
