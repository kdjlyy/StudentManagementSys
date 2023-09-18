package cn.kdjlyy.studentmanagementsys.service;

import cn.kdjlyy.studentmanagementsys.common.PageBean;
import cn.kdjlyy.studentmanagementsys.model.Student;

public interface StudentService {
    PageBean<Student> query(Integer page, Integer pageSize, String sno, String name, Integer gender);

    void updateById(Student student);
//    void load();
//    void init();
}
