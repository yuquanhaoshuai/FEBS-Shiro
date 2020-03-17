package cc.mrbird.febs.business.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@TableName("tl_weekly_begin")
public class Tlbegin implements Serializable {

    private String farea;
    private BigDecimal fbegin;
    private BigDecimal fyearplanout;
    private BigDecimal fyearplanin;
    private Date fdate;

}
