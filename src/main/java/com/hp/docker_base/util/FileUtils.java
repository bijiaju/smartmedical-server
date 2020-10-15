package com.hp.docker_base.util;

import com.hp.docker_base.bean.ProcessRetDto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 文件工具
 * @Author 24763
 * @Date 2020/10/13 13:59
 */
public class FileUtils {

    public  static int sucCount = 0; //成功个数
    public static int failCount = 0; //失败个数3
   // public static List<String> sucList = new ArrayList<>(); //失败个数3
   // public static List<String> failList = new ArrayList<>(); //失败个数3

    /**
     * 复制文件
     * @param strOldpath 老文件地址
     * @param strNewPath 新文件地址
     */
    public static ProcessRetDto copyFile(String strOldpath,String strNewPath,List<String> sucList,List<String> failList)
    {
        ProcessRetDto ret = new ProcessRetDto();

        String newFileFolderPath = strNewPath.substring(0,strNewPath.lastIndexOf("/")+1);
        File dir = new File(newFileFolderPath);
        if(dir.exists() == true){
         //   System.out.println("dirs is exists");
        }else{
            dir.mkdirs();
         //   System.out.println(" created dirs");
        }


        try
        {

            File fOldFile = new File(strOldpath);
            if (fOldFile.exists())
            {
                int bytesum = 0;
                int byteread = 0;
                InputStream inputStream = new FileInputStream(fOldFile);
                FileOutputStream fileOutputStream = new FileOutputStream(strNewPath);
                byte[] buffer = new byte[1444];
                while ( (byteread = inputStream.read(buffer)) != -1)
                {
                    bytesum += byteread; //这一行是记录文件大小的，可以删去
                    fileOutputStream.write(buffer, 0, byteread);//三个参数，第一个参数是写的内容，
                    //第二个参数是从什么地方开始写，第三个参数是需要写的大小
                }
                inputStream.close();
                fileOutputStream.close();

                sucCount++;
                sucList.add(strOldpath.substring(strOldpath.lastIndexOf("/")+1,strOldpath.lastIndexOf("_")));
            }else{
                failCount++;
                failList.add(strOldpath.substring(strOldpath.lastIndexOf("/")+1,strOldpath.lastIndexOf("_")));
            }
        } catch (Exception e) {
            failCount++;
            failList.add(strOldpath.substring(strOldpath.lastIndexOf("/")+1,strOldpath.lastIndexOf("_")));
            // TODO Auto-generated catch block
            System.out.println("复制单个文件出错");
            e.printStackTrace();
        }

        ret.setFailCount(failCount);
        ret.setSuccessCount(sucCount);
        ret.setTotal(failCount+sucCount);
        ret.setSuccessList(sucList);
        ret.setFailList(failList);

        return ret;
    }

    //重命名文件
    public static void renameFile(String path, String oldName, String newName){
        if(!oldName.equals(newName)){
            File oldFile = new File(path+"/"+oldName);
            File newFile = new File(path+"/"+newName);
            if(newFile.exists()){
                System.out.println(newName+"已经存在");}
            else{
                oldFile.renameTo(newFile);
            }

        }
    }

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
