package Utils;

import org.junit.Test;

import java.util.List;

public class AnsjUtilsTest {

    //测试分词器ansj
    @Test
    public void testAnsj(){
        String test="今天是星期六，天气很适合出去野餐";
        List<String> ansj = AnsjUtils.ansj(test);
        System.out.println(ansj.toString());
    }
}
