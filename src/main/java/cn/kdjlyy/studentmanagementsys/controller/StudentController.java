package cn.kdjlyy.studentmanagementsys.controller;

import cn.kdjlyy.studentmanagementsys.common.PageBean;
import cn.kdjlyy.studentmanagementsys.common.Result;
import cn.kdjlyy.studentmanagementsys.common.ResultGenerator;
import cn.kdjlyy.studentmanagementsys.exception.CustomException;
import cn.kdjlyy.studentmanagementsys.model.Student;
import cn.kdjlyy.studentmanagementsys.service.StudentService;
import cn.kdjlyy.studentmanagementsys.common.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin
@Api(value = "学生管理接口")
@Permission(name = "StudentController", expression = "StudentController")
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @ApiOperation(value = "查询学生基本信息", notes = "支持模糊查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页数", dataTypeClass = Integer.class, paramType = "query", required = false, defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "行数", dataTypeClass = Integer.class, paramType = "query", required = false, defaultValue = "10"),
            @ApiImplicitParam(name = "sno", value = "学号（支持模糊查询）", dataTypeClass = String.class, paramType = "query", required = false),
            @ApiImplicitParam(name = "name", value = "姓名（支持模糊查询）", dataTypeClass = String.class, paramType = "query", required = false),
            @ApiImplicitParam(name = "gender", value = "性别（1:男 0:女）", dataTypeClass = Integer.class, paramType = "query", required = false)
    })
    // 一般不用编写 Response
    @ApiResponses({
        @ApiResponse(code = 200,message = "请求成功"),
        @ApiResponse(code = 400,message = "请求失败"),
    })
    @GetMapping
    public Result query(@RequestParam(defaultValue = "1") Integer page,
                        @RequestParam(defaultValue = "10") Integer pageSize,
                        String sno, String name, Integer gender) {
        log.info("query params: page:{}, pageSize:{}, sno:{}, name:{}, gender:{}", page, pageSize, sno, name, gender);
        PageBean<Student> res = studentService.query(page, pageSize, sno, name, gender);

        throw new CustomException("这里是自定义异常");
//        return ResultGenerator.SUCCESS(res);
    }

    @ApiOperation(value = "根据ID更新学生信息")
    @PostMapping
    public Result updateById(@RequestBody Student student) {
        studentService.updateById(student);
        return ResultGenerator.SUCCESS();
    }
}
