package Utils;

import exception.FileException;

import java.io.*;

public class FileUtils {

    //读取文件
    public static String readFile(String Filename){
        if(!Filename.endsWith(".txt")){
            FileException.handle();
        }
        StringBuilder sb=new StringBuilder();
        try(FileReader reader=new FileReader(Filename);
            BufferedReader br=new BufferedReader(reader);
        ){
            String line;//一次读入一行
            while((line=br.readLine())!=null){
                sb.append(line);//拼接字符串
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return sb.toString();//返回字符串
        }
    }

    //写入TXT文件
    public static void writeFile(String Filename,String data){
        if(!Filename.endsWith(".txt")){
            FileException.handle();
        }
        File writeName=new File(Filename);
        try {
            writeName.createNewFile();
            try(FileWriter writer=new FileWriter(writeName);
            BufferedWriter out=new BufferedWriter(writer)
            ){
                out.write(data);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
