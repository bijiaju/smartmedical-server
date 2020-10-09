package com.hp.docker_base.algorithm;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 算法输入
 * @author: biyangqiang
 * @time: 2020/8/31 17:20
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class FidInDto implements Serializable{

    @ApiModelProperty(value = "诊疗记录Id", example = "诊疗记录Id")
    private String RecId;

    @ApiModelProperty(value = "科室Id", example = "科室Id")
    private String DeptId;

    private List<DataInDto> DataIn;
}
