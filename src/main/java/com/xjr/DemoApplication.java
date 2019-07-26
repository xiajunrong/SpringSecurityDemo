package com.xjr;

import com.xjr.mapper.ClassVoMapper;
import com.xjr.mapper.StudentDOMapper;
import com.xjr.model.ClassVo;
import com.xjr.model.StudentDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "/student")
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
@MapperScan("com.xjr.mapper")
@ServletComponentScan
@SpringBootApplication
public class DemoApplication {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoApplication.class);

    @Resource
    private StudentDOMapper studentDOMapper;
    @Resource
    private ClassVoMapper classVoMapper;
    private final String COMSUME = "application/x-www-form-urlencoded";

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public List<StudentDO> getList() {
        List<StudentDO> list = new ArrayList<StudentDO>();
        list = studentDOMapper.getStuentList();
        return list;
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public StudentDO getStudent() {
        StudentDO studentDO = studentDOMapper.selectByPrimaryKey("1");
        if (studentDO != null) {
            return studentDO;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = {COMSUME})
    @ResponseBody
    public String addStudent(@RequestParam("name") String name,
                             @RequestParam("fs") Integer fs,
                             @RequestParam("kc") String kc) {
        StudentDO studentDO = new StudentDO();
        Random random = new Random();
        int ranNum = random.nextInt(100);
        String randomId = String.valueOf(ranNum);
        studentDO.setId(randomId);
        studentDO.setName(name);
        studentDO.setFs(fs);
        studentDO.setKc(kc);
        studentDOMapper.insertSelective(studentDO);
        return "success";
    }
    @RequestMapping(value = "/getStudents", method = {RequestMethod.GET})
    @ResponseBody
    public List<ClassVo> getStudents(){
        List<ClassVo> students = new ArrayList<ClassVo>();
        students = classVoMapper.getStudents();
        System.out.println(students.toString());
        log.error(students.toString());
        return students;
    }

    @RequestMapping(value = "/getTeachers", method = {RequestMethod.GET})
    @ResponseBody
    public ClassVo getTeachers(){
        ClassVo  teachers =   new ClassVo();
        teachers = classVoMapper.getTeachers("1");
        System.out.println(teachers.toString());
        return teachers;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
