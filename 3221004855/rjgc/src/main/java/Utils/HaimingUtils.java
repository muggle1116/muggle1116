package Utils;

public class HaimingUtils {

    //计算海明距离
    public static int getHaimingDis(String simHash1,String simHash2){
        int result=0;
        if(simHash1.length()!=simHash2.length()){
            result=-1;
        }else{
            for(int i=0;i<simHash1.length();i++){
                if(simHash1.charAt(i)!=simHash2.charAt(i)){
                    result++;
                }
            }
        }
        return result;
    }

    //计算相似度
    public static double getSimilar(String simHash1,String simHash2){
        int distance=getHaimingDis(simHash1,simHash2);
        double similar = 0.01 * (100 - distance * 100 / 128);
        return similar;
    }
}
