package cn.kdjlyy.studentmanagementsys.model;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("StudentManagementSys.student")
@ApiModel("学生实体")
public class Student {
    @ApiModelProperty("学生主键ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty("学号")
    private String sno;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("班级")
    private String className;
    @ApiModelProperty("性别 1:男 0:女")
    private Integer gender;
    @ApiModelProperty("入学日期")
    private LocalDate entryDate;
    @ApiModelProperty("联系方式")
    private String contact;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("学生状态 0:已删除 1:正常")
    private Integer status;
    @ApiModelProperty
    private LocalDateTime createTime;
    @ApiModelProperty
    private LocalDateTime updateTime;

    @Override
    public String toString() {
      return JSONObject.toJSONString(this);
    }
}
