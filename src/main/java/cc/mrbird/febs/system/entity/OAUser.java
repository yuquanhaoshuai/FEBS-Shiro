package cc.mrbird.febs.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;



@TableName("hrmresource")
@Getter
@Setter
public class OAUser implements Serializable {

    private int id;
    private String loginid;
    private String password;
    private String lastname;
    private String sex;
    private String telephone;
    private String mobile;
    private String email;
    private int departmentid;
    private int subcompanyid1;
    private int managerid;
    private int status;
}
