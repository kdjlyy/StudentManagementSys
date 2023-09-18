package cn.kdjlyy.studentmanagementsys.service;

import cn.kdjlyy.studentmanagementsys.dao.StudentDao;
import cn.kdjlyy.studentmanagementsys.common.PageBean;
import cn.kdjlyy.studentmanagementsys.model.Student;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public PageBean<Student> query(Integer page, Integer pageSize, String sno, String name, Integer gender) {
        IPage iPage = new Page(page, pageSize);
        LambdaQueryWrapper<Student> lqw = new LambdaQueryWrapper<>();
        lqw.eq(sno != null, Student::getSno, sno)
                .eq(gender != null, Student::getGender, gender)
                .like(name != null, Student::getName, name);
        studentDao.selectPage(iPage, lqw);

        PageBean<Student> pageBean = new PageBean<>();
        pageBean.setData(iPage.getRecords());
        pageBean.setCurrentPage((int) iPage.getCurrent());
        pageBean.setPageSize((int) iPage.getSize());
        pageBean.setTotalPage((int) iPage.getPages());
        pageBean.setTotalCount((int) iPage.getTotal());

        return pageBean;
    }

    @Override
    public void updateById(Student student) {
        student.setUpdateTime(LocalDateTime.now());
        studentDao.updateById(student);
    }
}
