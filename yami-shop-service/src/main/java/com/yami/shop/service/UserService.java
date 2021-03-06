/*
 * Copyright (c) 2018-2999 广州亚米信息科技有限公司 All rights reserved.
 *
 * https://www.gz-yami.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.User;
import com.yami.shop.bean.param.UserRegisterParam;
import com.yami.shop.bean.vo.UserVO;

/**
 *
 * @author lgh on 2018/09/11.
 */
public interface UserService extends IService<User> {

    User getUserByUserId(String userId);

    Boolean insertUser(UserRegisterParam userRegisterParam);

    void validate(UserRegisterParam userRegisterParam, String checkRegisterSmsFlag);
}
