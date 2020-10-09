package com.hp.docker_base.service;

import com.alibaba.fastjson.JSON;
import com.hp.docker_base.algorithm.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 2、服务实现的接口
 * @Author bee
 * @Date 2020/10/9 10:50
 */
@Service
public class SmartMedicalServiceImpl implements ISmartMedicalService{



    @Override
    public FidOutDto getMedicalResult(String RecId,
                                             String DeptId,
                                             String DataIn) {
        // TODO: 2020/10/9 修改成你的算法
        // 1、请求参数处理
        // 1-1、处理科室和诊断信息
        FidInDto inDto = new FidInDto();
        inDto.setRecId(RecId);
        inDto.setDeptId(DeptId);

        // 1-2、处理科室和诊断信息
        List<DataInDto> dataInDtos = JSON.parseArray(DataIn, DataInDto.class);
        inDto.setDataIn(dataInDtos);

        // 2、请求参数处理
        // 2-1、处理科室和诊断信息
        FidOutDto retList = new FidOutDto();
        retList.setDeptId(DeptId);
        retList.setRecId(RecId);

        // 2-2、响应激活规则列表
        List<ActivedRulesDto> activedRulesDtoList = new ArrayList<>();

        ActivedRulesDto rulesDto = new ActivedRulesDto();
        rulesDto.setRId("11");
        rulesDto.setWeight("0.1");
        activedRulesDtoList.add(rulesDto);

        ActivedRulesDto rulesDto1 = new ActivedRulesDto();
        rulesDto1.setRId("12");
        rulesDto1.setWeight("0.4");
        activedRulesDtoList.add(rulesDto1);

        ActivedRulesDto rulesDto2 = new ActivedRulesDto();
        rulesDto2.setRId("13");
        rulesDto2.setWeight("0.5");
        activedRulesDtoList.add(rulesDto2);

        retList.setActivedRules(activedRulesDtoList);


        // 2-3、设置激活规则
        List<DataOutDto> rulesDtos = new ArrayList<>();
        DataOutDto data1 = new DataOutDto();
        data1.setFidOut("1");
        data1.setValue("0.1");
        rulesDtos.add(data1);

        DataOutDto data2 = new DataOutDto();
        data2.setFidOut("2");
        data2.setValue("0.4");
        rulesDtos.add(data2);

        DataOutDto data3 = new DataOutDto();
        data3.setFidOut("3");
        data3.setValue("0.5");
        rulesDtos.add(data3);

        retList.setResult(rulesDtos);
        return retList;
    }
}
