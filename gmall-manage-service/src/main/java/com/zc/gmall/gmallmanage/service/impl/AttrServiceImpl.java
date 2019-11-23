package com.zc.gmall.gmallmanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zc.gmall.bean.PmsBaseAttrInfo;
import com.zc.gmall.gmallmanage.mapper.PmsBaseAttrInfoMapper;
import com.zc.gmall.gmallmanage.mapper.PmsBaseAttrValueMapper;
import com.zc.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }

    @Override
    public PmsBaseAttrInfo saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
        return null;
    }


}
