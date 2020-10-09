package com.hp.docker_base.algorithm;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @description: 激活规则
 * @author: biyangqiang
 * @time: 2020/8/31 17:36
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class ActivedRulesDto {

    @ApiModelProperty(value = "规则id", example = "规则id")
    private String RId;

    @ApiModelProperty(value = "值", example = "值")
    private String Weight;
}
