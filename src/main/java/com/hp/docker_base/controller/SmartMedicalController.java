package com.hp.docker_base.controller;

import com.hp.docker_base.algorithm.FidOutDto;
import com.hp.docker_base.bean.em.EnumOKOrNG;
import com.hp.docker_base.service.ISmartMedicalService;
import com.hp.docker_base.util.CommonUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/smart-medical")
public class SmartMedicalController {


    @Autowired
    private ISmartMedicalService smartMedicalService;

    //请求参数
    // http://localhost:8083/smart-medical/diagnostic/result
    @ApiOperation(value = "获取诊断结果", notes = "获取诊断结果")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "RecId", value = "诊断编号", paramType = "query", required = true),
            @ApiImplicitParam(name = "DeptId", value = "科室编号", paramType = "query", required = true),
            @ApiImplicitParam(name = "DataIn", value = "[{FidIn:\"输入特征Id1\", Value:\"特征数值\"}, \n" +
                    "               {FidIn:\"输入特征Id2\", Value:\"特征数值\"}, \n" +
                    "               {FidIn:\"输入特征Id3\", Value:\"特征数值\"}", paramType = "query", required = true)
    })
    @PostMapping("/diagnostic/result")
    public  Map<String,Object>  doQueryDiagnosticFeatureList(@RequestParam(value = "RecId") String RecId,
                                                             @RequestParam(value = "DeptId") String DeptId,
                                                             @RequestParam(value = "DataIn") String DataIn) {

        // 1、调用诊断服务结果
        FidOutDto medicalResult = smartMedicalService.getMedicalResult(RecId,DeptId,DataIn);

        // 2、响应结果结果数据
        return CommonUtil.setReturnMap(EnumOKOrNG.OK.getCode(), EnumOKOrNG.OK.getValue(),medicalResult);
    }











}
