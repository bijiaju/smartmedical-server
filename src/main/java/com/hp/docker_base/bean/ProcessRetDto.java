package com.hp.docker_base.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hp.docker_base.bean.constrains.group.MiniValidation;
import com.hp.docker_base.bean.constrains.group.customize.CaseCheck;
import com.hp.docker_base.bean.constrains.group.customize.CaseMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

/**
 * @program: uidc
 * @description: 执行结果
 * @author: 姬同凯
 * @create: 2019-12-19 10:51
 **/
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data

@ApiModel("集团企业员工信息")
public class ProcessRetDto extends StaffBaseDto {

    private static final long serialVersionUID = -7380215445341707945L;


    @ApiModelProperty(value = "总个数")
    private Integer total;

    @ApiModelProperty(value = "成功个数")
    private Integer successCount;

    @ApiModelProperty(value = "失败个数")
    private Integer failCount;

    @ApiModelProperty(value = "成功列表")
    private List<String> successList;

    @ApiModelProperty(value = "失败列表")
    private List<String> failList;
}
