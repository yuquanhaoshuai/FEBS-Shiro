package cc.mrbird.febs.system.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OADept implements Serializable {

    private int id;
    private String departmentname;
    private int parent_id;
    private int showorder;

}
