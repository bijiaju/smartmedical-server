package com.hp.docker_base.util;

import cn.hutool.log.LogFactory;
import com.hp.docker_base.bean.ProcessRetDto;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 文件工具
 * @Author 24763
 * @Date 2020/10/13 13:59
 */
public class FileUtil {

    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(FileUtil.class);

    public  static int sucCount = 0; //成功个数
    public static int failCount = 0; //失败个数3
   // public static List<String> sucList = new ArrayList<>(); //失败个数3
   // public static List<String> failList = new ArrayList<>(); //失败个数3

    /**
     * 复制文件
     * @param strOldpath 老文件地址
     * @param strNewPath 新文件地址
     */
    public static ProcessRetDto copyFile(String strOldpath, String strNewPath, List<String> sucList, List<String> failList)
    {
        if(StringUtils.isEmpty(strNewPath)
                || StringUtils.isEmpty(strOldpath)){
            return null;
        }
        ProcessRetDto ret = new ProcessRetDto();

        String barCode = strOldpath.substring(strOldpath.lastIndexOf("/") + 1, strOldpath.lastIndexOf("_"));
        try
        {
            String newFileFolderPath = strNewPath.substring(0,strNewPath.lastIndexOf("/")+1);
            File dir = new File(newFileFolderPath);
            if(dir.exists() == false){
                dir.mkdirs();
            }

            File inFile = new File(strOldpath);
            File outFile = new File(strNewPath);

            FileUtils.copyFile(inFile, outFile);

            sucCount++;
            sucList.add(barCode);

        } catch (FileNotFoundException e){
            failCount++;
            failList.add(barCode);
            logger.error("复制单个文件出错,文件不存在:" +  ExceptionUtils.getStackTrace(e));

        }
        catch (Exception e) {
            failCount++;
            failList.add(barCode);
            logger.error("error:{}",ExceptionUtils.getStackTrace(e));
            e.printStackTrace();
        }

        ret.setFailCount(failCount);
        ret.setSuccessCount(sucCount);
        ret.setTotal(failCount+sucCount);
        ret.setSuccessList(sucList);
        ret.setFailList(failList);

        return ret;
    }


       /*  int bytesum = 0;
                int byteread = 0;
                InputStream inputStream = new FileInputStream(fOldFile);
                FileOutputStream fileOutputStream = new FileOutputStream(strNewPath);
                byte[] buffer = new byte[10240];
                while ( (byteread = inputStream.read(buffer)) != -1)
                {
                    bytesum += byteread; //这一行是记录文件大小的，可以删去
                    fileOutputStream.write(buffer, 0, byteread);//三个参数，第一个参数是写的内容，
                    //第二个参数是从什么地方开始写，第三个参数是需要写的大小
                }
                fileOutputStream.flush();
                inputStream.close();
                fileOutputStream.close();*/


          /*  }else{
                failCount++;
                failList.add(strOldpath.substring(strOldpath.lastIndexOf("/")+1,strOldpath.lastIndexOf("_")));
            }*/

      /*  if (inFile.exists())
            {*/
              /*  //建立数据输入输出通道
                FileInputStream fileInputStream = new FileInputStream(inFile);
                FileOutputStream fileOutputStream = new FileOutputStream(outFile);
                //建立缓冲输入输出流
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                //边读边写
                int content = 0;
                // int length = bufferedInputStream.read(buf);   如果传入了缓冲数组，内容是存储到缓冲数组中，返回值是存储到缓冲数组中的字节个数。
                while((content = bufferedInputStream.read())!=-1){ // 如果使用read方法没有传入缓冲数组，那么返回值是读取到的内容。
                    bufferedOutputStream.write(content);
//			bufferedOutputStream.flush();
                }

                //关闭资源
                bufferedInputStream.close();
                bufferedOutputStream.close();*/

    public static void main(String [] a){
        // 拷贝文件
        //copyFile("D:/run.sh","D:/logs/test/run2.sh");

        //重命名文件
       // renameFile("D:/logs","1.png","2.png");
    }

    public static void clearCount() {
        sucCount=0;
        failCount=0;

       // sucList.clear();
        //failList.clear();
    }
}
