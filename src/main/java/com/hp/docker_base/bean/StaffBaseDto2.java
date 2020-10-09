package com.hp.docker_base.bean;

import com.hp.docker_base.bean.constrains.group.MiniValidation;
import com.hp.docker_base.bean.constrains.group.NewValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @program: uidc
 * @description: 集团企业员工基本信息
 * @author: 姬同凯
 * @create: 2019-12-31 17:23
 **/
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data

@ApiModel("集团企业员工基本信息")
public class StaffBaseDto2 implements Serializable {

    private static final long serialVersionUID = -7466929397982762371L;

    @ApiModelProperty(value = "员工唯一编号")
    @NotEmpty(message = "员工编号为空")
    private String number;

    @ApiModelProperty(value = "员工工号")
    private String jobNumber;

    @ApiModelProperty(value = "员工姓名")
    @NotBlank(message = "员工姓名不能为空")
    private String name;

    @ApiModelProperty(value = "员工性别", example = "1:男 | 2:女")
    @Max(value = 2, message = "性别错误")
    @Min(value = 1, message = "性别错误")
    private Integer gender;

    @ApiModelProperty(value = "办公电话")
    private String officePhone;

    @ApiModelProperty(value = "手机号")
    @Pattern(regexp = "1\\d{10}", message = "手机号是1开头的11位数字")
    private String phone;

    @ApiModelProperty(value = "身份证号")
    @NotEmpty(message = "身份证号为空")
    private String idNumber;

    @ApiModelProperty(value = "照片地址")
    @URL(message = "url格式错误")
    private String photoUrl;

    @ApiModelProperty(value = "所属组织机构编号")
    private String organizationCode;

    @ApiModelProperty(value = "所属组织机构名称")
    @Size(max=50,min=5,message = "字段长度要在5-50之间")
    private String organizationName;

    @ApiModelProperty(value = "所属部门编号")
    private String departmentCode;

    @ApiModelProperty(value = "所属部门名称")
    private String departmentName;

    @ApiModelProperty(value = "员工岗位编号")
    private String positionCode;

    @ApiModelProperty(value = "员工岗位名称")
    private String positionName;

    @ApiModelProperty(value = "员工职位编号")
    private String postCode;

    @ApiModelProperty(value = "员工职位名称")
    @Length(min = 2, max = 18, message = "职位长度为2-18个字符")//多个组的校验
    private String postName;

    @ApiModelProperty(value = "员工在职状态", example = "1:在职 | 2:离职")
    @Max(value = 2, message = "在职状态错误")
    @Min(value = 1, message = "在职状态错误")
    private Integer workStatus;

    @ApiModelProperty(value = "员工工卡号")
    private String smartCardNumber;
}
