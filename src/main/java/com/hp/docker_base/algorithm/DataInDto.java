package com.hp.docker_base.algorithm;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @description:
 * @author: biyangqiang
 * @time: 2020/8/31 17:24
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class DataInDto {

    @ApiModelProperty(value = "输入特征", example = "输入特征")
    private String FidIn;

    @ApiModelProperty(value = "值", example = "值")
    private String Value;
}
