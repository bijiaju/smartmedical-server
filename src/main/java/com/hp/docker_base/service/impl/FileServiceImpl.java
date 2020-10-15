package com.hp.docker_base.service.impl;

import com.hp.docker_base.bean.CopyFileItem;
import com.hp.docker_base.bean.ProcessRetDto;
import com.hp.docker_base.service.IFileService;
import com.hp.docker_base.util.FileUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Desc TODO
 * @Author 24763
 * @Date 2020/10/15 10:05
 */
@Service
public class FileServiceImpl implements IFileService {

    /*public static List<String> sucList = new ArrayList<>(); //失败个数3
    public static List<String> failList = new ArrayList<>(); //失败个数3*/

    @Override
    public ProcessRetDto copyFileList(List<CopyFileItem> copyFileItemList) {

        List<String> sucList = new ArrayList<>(); //失败个数3
        List<String> failList = new ArrayList<>(); //失败个数3*/

        ProcessRetDto processRetDto = new ProcessRetDto();
        if(!copyFileItemList.isEmpty() && copyFileItemList != null){
            for(CopyFileItem fileItem:copyFileItemList){
                // 拷贝文件
                processRetDto = FileUtils.copyFile(fileItem.getSourcePathFile(),
                        fileItem.getTargetPathFile(),
                        sucList,
                        failList);
            }
        }

        // 清空执行个数
        FileUtils.clearCount();

        return processRetDto;
    }
}
