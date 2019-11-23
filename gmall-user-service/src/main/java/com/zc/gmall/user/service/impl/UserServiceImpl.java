package com.zc.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zc.gmall.bean.UmsMember;
import com.zc.gmall.bean.UmsMemberReceiveAddress;
import com.zc.gmall.service.UserService;
import com.zc.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers =userMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return null;
    }
}
