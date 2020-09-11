package cn.dhbin.swaggerdemo.controller;

import cn.dhbin.swaggerdemo.model.ArgBody;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 *
 * @author dhb
 */
@RestController
@RequestMapping("/demo")
public class UserController {

    /**
     * 用户登录
     * <p>
     * 用户登录需要提供用户名和密码，登录5次失败会导致账号被锁
     *
     * @param username 用户名
     * @param password 密码
     * @param argBody  body
     * @return string
     */
    @PostMapping
    public String login(@RequestParam String username, String password, @RequestBody ArgBody argBody) {
        return username;
    }

}
