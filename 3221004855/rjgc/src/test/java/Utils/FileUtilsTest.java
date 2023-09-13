package Utils;

import org.junit.Test;

public class FileUtilsTest {

   //正确读取文件
    @Test
    public void testreadFile(){
        String filename="D:\\zhd\\学习\\软件工程\\2\\orig.txt";
        String s = FileUtils.readFile(filename);
        System.out.println(s);
    }

    //正确写入文件
    @Test
    public void testwriteFile(){
        String filename="D:\\zhd\\学习\\软件工程\\2\\text.txt";
        String data="test";
        FileUtils.writeFile(filename,data);
    }

    //错误读取文件
    @Test
    public void testReadException(){
        String filename="D:\\zhd\\学习\\软件工程\\2\\orig.xlsx";
        try {
            FileUtils.readFile(filename);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //错误写入文件
    @Test
    public void testWriteException(){
        String filename="D:\\zhd\\学习\\软件工程\\2\\orig.xlsx";
        String data="1111";
        try {
            FileUtils.writeFile(filename,data);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
