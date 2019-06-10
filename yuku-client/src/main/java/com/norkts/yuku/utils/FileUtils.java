package com.norkts.yuku.utils;

import com.norkts.yuku.ITask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件读取工具类
 * @author huangce.zb
 */
public class FileUtils {
    public static void readLines(String file, ITask<String, Boolean> task) throws Exception {
        if(task == null){
            return;
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));

            while (true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }

                task.execute(line);
            }
        }finally {
            if(reader != null){
                reader.close();
            }
        }
    }

}
