package com.example.springboot.mybatis.web;

import com.example.springboot.mybatis.service.UserService;
import com.example.springboot.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author phil
 * @create 2021-04-21 11:52
 */
@RestController //@Controller 和 @ResponseBody合体
public class UserController {

    @Autowired
    private UserService userService;

    //增加一条数据
//    @PostMapping
    @RequestMapping(value = "/insert")
    public String insert(User user) {
        return userService.insertSelective(user) > 0 ? "添加成功":"添加失败";
    }

    //删除数据
//    @DeleteMapping
    @RequestMapping(value = "/delete")
    public String delete(Integer id) {
        return userService.deleteByPrimaryKey(id)> 0 ? "删除成功":"删除失败";
    }

    //修改
    @RequestMapping(value = "/update")
    public String update(User user) {
        return userService.updateByPrimaryKeySelective(user) > 0 ? "修改成功":"修改失败";
    }

    //查询
//    @GetMapping
    @RequestMapping(value = "/query")
    public Object user(Integer id) {
        User user = userService.queryUserById(id);
        return user;
    }
  @GetMapping
    @RequestMapping(value = "/selectAll")
    public List<User> selectAll() {
        return userService.selectAll();
    }

}
