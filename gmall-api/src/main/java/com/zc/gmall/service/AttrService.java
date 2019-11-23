package com.zc.gmall.service;



import com.zc.gmall.bean.PmsBaseAttrInfo;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
    PmsBaseAttrInfo saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
