package com.hp.docker_base.controller;

import com.alibaba.fastjson.JSON;
import com.hp.docker_base.algorithm.FidOutDto;
import com.hp.docker_base.bean.CopyFileItem;
import com.hp.docker_base.bean.ProcessRetDto;
import com.hp.docker_base.bean.em.EnumOKOrNG;
import com.hp.docker_base.service.IFileService;
import com.hp.docker_base.service.ISmartMedicalService;
import com.hp.docker_base.util.CommonUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/file")
public class ElectricSignServerController {


    @Autowired
    private IFileService fileService;

    @ApiOperation(value = "获取诊断结果", notes = "获取诊断结果")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fileJsonStr", value = "变更文件位置", paramType = "query", required = true)
    })
    @GetMapping("/copy")
    public  Map<String,Object>  doCopyFileList(@RequestParam(value = "fileJsonStr") String fileJsonStr) {

        // 0、转换对象
        List<CopyFileItem> copyFileItemList = JSON.parseArray(fileJsonStr, CopyFileItem.class);

        // 1、调用诊断服务结果
        ProcessRetDto processRetDto = fileService.copyFileList(copyFileItemList);
        if(processRetDto == null){
            return CommonUtil.setReturnMap(EnumOKOrNG.NG.getCode(),"文件拷贝个数为0",null);
        }

        // 2、响应结果结果数据
        return CommonUtil.setReturnMap(EnumOKOrNG.OK.getCode(), EnumOKOrNG.OK.getValue(),processRetDto);
    }


}
