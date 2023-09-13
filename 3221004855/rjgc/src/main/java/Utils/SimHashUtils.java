package Utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class SimHashUtils {

    //获取哈希值
    public static String getHash(String str){
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            return new BigInteger(1,messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    //获取Simhash
    public static String getSimhash(String text){
        List<String> ansj = AnsjUtils.ansj(text);
        int[] arr=new int[128];
        for (int i=0;i<ansj.size();i++){
            //获取hash值
            String hash=getHash(ansj.get(i));
            //补全128位二进制
           if(hash.length()<128){
               int num=128-hash.length();
               for (int j=0;j<num;j++){
                   hash+="0";
               }
           }

            //加权合并
            for (int j=0;j<arr.length;j++){
                if(hash.charAt(j)=='1'){
                    arr[j]+=(10-(i/(ansj.size()/10)));
                }else{
                    arr[j]-=(10-(i/(ansj.size()/10)));
                }
            }
        }

        //降维
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }

        return sb.toString();
    }

}
