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

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @program: uidc
 * @description: 集团企业员工
 * @author: 姬同凯
 * @create: 2019-12-19 10:51
 **/
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data

@ApiModel("集团企业员工信息")
public class StaffDto extends StaffBaseDto {

    private static final long serialVersionUID = -7380215445341707945L;


    @ApiModelProperty(value = "自定义注解")
    @CaseCheck(value = CaseMode.UPPER, message = "注册方式必须是大写字母",groups = MiniValidation.class)
    private String registerMode;

    @ApiModelProperty(value = "员工外码")
    private String foreignCode;

    @ApiModelProperty(value = "生日")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式错误", groups = MiniValidation.class)
    private String email;

    @ApiModelProperty(value = "是否接管企业员工")
    private Integer isTakeOver;

    @ApiModelProperty(value = "入职日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;

    @ApiModelProperty(value = "政治面貌", example = "0:非党员 | 1:党员")
    @Max(value = 1, message = "无此政治面貌",groups = MiniValidation.class)
    @Min(value = 0, message = "无此政治面貌",groups = MiniValidation.class)
    private Integer politicsStatus;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "校验位")
    private String fieldCheck;
}
