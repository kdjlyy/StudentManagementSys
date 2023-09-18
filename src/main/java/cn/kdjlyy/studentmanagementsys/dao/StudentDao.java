package cn.kdjlyy.studentmanagementsys.dao;

import cn.kdjlyy.studentmanagementsys.model.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
