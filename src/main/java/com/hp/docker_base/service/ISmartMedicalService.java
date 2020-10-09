package com.hp.docker_base.service;

import com.hp.docker_base.algorithm.FidOutDto;

/**
 * 1、定义你服务的接口
 */
public interface ISmartMedicalService {



    /**
     *  获取医疗执行结果
     * @param recId 诊断编号
     * @param deptId 科室编号
     * @param dataIn [{FidIn:\"输入特征Id1\", Value:\"特征数值\"}, \n" +
     *                     "               {FidIn:\"输入特征Id2\", Value:\"特征数值\"}, \n" +
     *                     "               {FidIn:\"输入特征Id3\", Value:\"特征数值\"}
     * @return 获取医疗执行结果
     */
    FidOutDto getMedicalResult(String recId,
                               String deptId,
                               String dataIn);
}
