package com.hp.docker_base.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hp.docker_base.bean.Belief;
import com.hp.docker_base.bean.MDC2;
import com.hp.docker_base.bean.MDC2Example;
import com.hp.docker_base.bean.Reference;
import com.hp.docker_base.mapper.MDC2Mapper;
import com.hp.docker_base.service.IMDC2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Desc MDC2Service 服务实现
 * @Author 24763
 * @Date 2020/10/10 9:46
 */
@Service
public class MDC2ServiceImpl implements IMDC2Service {

    @Autowired
    private MDC2Mapper mdc2Mapper;

    @Override
    public List<MDC2> selectAllMDC2List(){

        MDC2Example example = new MDC2Example();
        MDC2Example.Criteria criteria = example.createCriteria();

        List<MDC2> mdc2List = mdc2Mapper.selectByExample(example);
        return mdc2List;
    }

    @Override
    public ArrayList<ArrayList<Double>> getReferenceValueList() {
        ArrayList<ArrayList<Double>> retList = new ArrayList<ArrayList<Double>>();

        // 1、获取所有Reference
        List<Reference> referenceList = getReferenceList();

        // 2、解析处理数据
        for(int i=0; i<referenceList.size();i++){

            ArrayList<Double> referenceValues = new  ArrayList<Double>();

            Reference reference = referenceList.get(i);

            double d1 = Double.parseDouble(reference.getId001());
            double d2 = Double.parseDouble(reference.getId002());
            double d3 = Double.parseDouble(reference.getId003());
            double d4 = Double.parseDouble(reference.getId004());
            double d5 = Double.parseDouble(reference.getId005());
            double d6 = Double.parseDouble(reference.getId006());
            double d7 = Double.parseDouble(reference.getId007());
            double d8 = Double.parseDouble(reference.getId008());
            double d9 = Double.parseDouble(reference.getId009());
            double d10 = Double.parseDouble(reference.getId010());
            double d11 = Double.parseDouble(reference.getId011());
            double d12 = Double.parseDouble(reference.getId012());
            double d13 = Double.parseDouble(reference.getId013());
            double d14 = Double.parseDouble(reference.getId014());
            double d15 = Double.parseDouble(reference.getId015());
            double d16 = Double.parseDouble(reference.getId016());

            referenceValues.add(d1);
            referenceValues.add(d2);
            referenceValues.add(d3);
            referenceValues.add(d4);
            referenceValues.add(d5);
            referenceValues.add(d6);
            referenceValues.add(d7);
            referenceValues.add(d8);
            referenceValues.add(d9);
            referenceValues.add(d10);
            referenceValues.add(d11);
            referenceValues.add(d12);
            referenceValues.add(d13);
            referenceValues.add(d14);
            referenceValues.add(d15);
            referenceValues.add(d16);

            retList.add(referenceValues);
        }

        return retList;
    }

    @Override
    public ArrayList<ArrayList<Double>> getBeliefValueList() {
        ArrayList<ArrayList<Double>> retList = new ArrayList<ArrayList<Double>>();

        // 1、获取所有Reference
        List<Belief> referenceList = getBeliefList();

        // 2、解析处理数据
        for(int i=0; i<referenceList.size();i++){

            ArrayList<Double> referenceValues = new  ArrayList<Double>();

            Belief belief = referenceList.get(i);

            double d1 = Double.parseDouble(belief.getSk001());
            double d2 = Double.parseDouble(belief.getSk002());
            double d3 = Double.parseDouble(belief.getSk003());

            referenceValues.add(d1);
            referenceValues.add(d2);
            referenceValues.add(d3);

            retList.add(referenceValues);
        }

        return retList;
    }

    @Override
    public List<Reference> getReferenceList() {
        List<MDC2> mdc2List = this.selectAllMDC2List();

        List<Reference> retList = new ArrayList<>();

        if(mdc2List.isEmpty()){
            return retList;
        }


        for(MDC2 mdc2 :mdc2List){
            // 解析Reference
            String referenceJsonStr = mdc2.getReference();
            Reference reference = JSONObject.parseObject(referenceJsonStr, Reference.class);

            retList.add(reference);
        }
        return retList;
    }

    @Override
    public List<Belief> getBeliefList() {
        List<MDC2> mdc2List = this.selectAllMDC2List();

        List<Belief> retList = new ArrayList<>();

        if(mdc2List.isEmpty()){
            return retList;
        }


        for(MDC2 mdc2 :mdc2List){
            // 解析Belief
            String referenceJsonStr = mdc2.getBelief();
            Belief reference = JSONObject.parseObject(referenceJsonStr, Belief.class);

            retList.add(reference);
        }
        return retList;
    }


}
