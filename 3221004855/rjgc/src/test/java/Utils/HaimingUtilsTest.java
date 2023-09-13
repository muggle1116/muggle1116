package Utils;

import org.junit.Test;

public class HaimingUtilsTest {

    //测试海明距离计算
    @Test
    public void TestgetHaimingDis(){
        String test1="今天是星期六，天气很适合出去野餐，我们决定去中山公园玩";
        String test2="今天是星期日，天气非常适合出去玩，我们决定去越秀公园放风筝";
        String simhash1= SimHashUtils.getSimhash(test1);
        String simhash2 = SimHashUtils.getSimhash(test2);
        int haimingDis = HaimingUtils.getHaimingDis(simhash1,simhash2);
        System.out.println(haimingDis);
    }

    //测试文本相似度计算
    @Test
    public void TestgetSimilar(){
        String test1="今天是星期六，天气很适合出去野餐，我们决定去中山公园玩";
        String test2="今天是星期日，天气非常适合出去玩，我们决定去越秀公园放风筝";
        String simhash1= SimHashUtils.getSimhash(test1);
        String simhash2 = SimHashUtils.getSimhash(test2);
        double similar = HaimingUtils.getSimilar(simhash1, simhash2);
        System.out.println("相似度为"+similar);
    }
}
