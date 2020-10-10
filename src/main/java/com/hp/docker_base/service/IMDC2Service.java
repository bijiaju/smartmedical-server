package com.hp.docker_base.service;

import com.hp.docker_base.bean.Belief;
import com.hp.docker_base.bean.MDC2;
import com.hp.docker_base.bean.Reference;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc mdc2 增删查改
 * @Author 24763
 * @Date 2020/10/10 9:44
 */
public interface IMDC2Service {

    /**
     * 获取所有的Md2的数据
     */
    List<MDC2> selectAllMDC2List();

    /**
     * 根据mdc2List获取 Reference数据
     */
    ArrayList<ArrayList<Double>> getReferenceValueList();


    /**
     * 根据mdc2List获取 Belief数据
     */
    ArrayList<ArrayList<Double>> getBeliefValueList();


    /**
     * 根据mdc2List获取 Reference数据
     */
    List<Reference> getReferenceList();


    /**
     * 根据mdc2List获取 Belief数据
     */
    List<Belief> getBeliefList();
}
