package cc.mrbird.febs.business.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Tlye implements Serializable {

    private int fid;
    private Date fdate;
    private String farea;
    private BigDecimal fmonthout;
    private BigDecimal fmonthin;
    private BigDecimal foutLj;
    private BigDecimal finLj;
    private BigDecimal fbegin;
    private BigDecimal fyearplayout;
    private BigDecimal fyearplayin;
    private BigDecimal ffinishoutrate;
    private BigDecimal ffinishinrate;
    private BigDecimal fye;
}
