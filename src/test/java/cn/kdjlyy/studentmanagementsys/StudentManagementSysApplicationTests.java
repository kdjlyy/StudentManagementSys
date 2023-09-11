package cn.kdjlyy.studentmanagementsys;

import cn.kdjlyy.studentmanagementsys.dao.UserDao;
import cn.kdjlyy.studentmanagementsys.model.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentManagementSysApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
        user.setName("Jim");
        user.setPassword("3283434");
        user.setAge(32);
        user.setTel("13329875418");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        userDao.deleteById(1701261234571325442L);
    }

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    @Test
    void testGetByPage() {
        IPage page = new Page(2, 2);
        userDao.selectPage(page, null);
        System.out.println("current_page:" + page.getCurrent());
        System.out.println("current_pageSize:" + page.getSize());
        System.out.println("total pages:" + page.getPages());
        System.out.println("total count:" + page.getTotal());
        System.out.println("result:" + page.getRecords());
    }
}
