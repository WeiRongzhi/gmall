package com.zc.gmall.service;



import com.zc.gmall.bean.UmsMember;
import com.zc.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
