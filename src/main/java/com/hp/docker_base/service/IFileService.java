package com.hp.docker_base.service;

import com.hp.docker_base.bean.CopyFileItem;
import com.hp.docker_base.bean.ProcessRetDto;

import java.util.List;

/**
 * 文件服务接口
 */
public interface IFileService {

    /**
     *  拷贝文件记录数
     * @param copyFileItemList 拷贝文件信息
     */
    ProcessRetDto copyFileList(List<CopyFileItem> copyFileItemList);
}
