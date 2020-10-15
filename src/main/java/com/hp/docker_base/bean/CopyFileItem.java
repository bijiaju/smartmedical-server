package com.hp.docker_base.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Desc 拷贝文件对象
 * @Author 24763
 * @Date 2020/10/14 17:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CopyFileItem {

  /*  public string SourceFile { get; set; }
    public string TargetDir { get; set; }
    public string TargetFile { get; set; }
    public string TargetFileName { get; set; }*/

    // 源文件名
    private String fileName;

    // 初始路径
    private String sourcePathFile;

    // 目标文件
    private String targetPathFile;
}
