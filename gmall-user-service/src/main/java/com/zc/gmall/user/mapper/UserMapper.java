package com.zc.gmall.user.mapper;


import com.zc.gmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
