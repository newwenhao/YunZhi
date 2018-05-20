package com.skylaker.yunzhi.service;

import com.skylaker.yunzhi.pojo.RegisterInfo;
import com.skylaker.yunzhi.pojo.Role;
import com.skylaker.yunzhi.pojo.User;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyong
 * Date: 2018/5/20 11:17
 * Description:
 *      用户相关逻辑处理接口定义
 */
public interface UserService {
    /**
     * 获取所有用户
     *
     * @return  用户列表
     */
    List<User> getAllUsers();

    /**
     * 根据用户名获取用户信息对象
     *
     * @param   username  用户名
     * @return
     */
    User getUserByUserName(String username);

    /**
     * 获取用户拥有的角色信息
     * @param   username  用户名
     * @return  {set}     角色信息集合
     */
    Set<Role> getUserRoles(String username);

    /**
     * 保存注册用户信息
     *
     * @param registerInfo  注册用户信息
     */
    void saveRegisterUser(RegisterInfo registerInfo);
}