package Utils;

import org.junit.Test;

public class SimHashUtilsTest {

    //测试词语Hash值的获取
    @Test
    public void testgetHash(){
        String test="今天";
        String hash = SimHashUtils.getHash(test);
        System.out.println(hash);
    }

    //测试文本SimHash值的获取
    @Test
    public void testgetSimhash(){
        String test="今天是星期六，天气很适合出去野餐，我们决定去中山公园玩";
        String simhash = SimHashUtils.getSimhash(test);
        System.out.println(simhash);

    }
}
