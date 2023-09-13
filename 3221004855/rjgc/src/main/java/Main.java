import Utils.FileUtils;
import Utils.HaimingUtils;
import Utils.SimHashUtils;

public class Main {
    public static void main(String[] args) {
        String text1 = FileUtils.readFile(args[0]);
        String text2 = FileUtils.readFile(args[1]);
        String simhash1 = SimHashUtils.getSimhash(text1);
        String simhash2 = SimHashUtils.getSimhash(text2);
        double similar = HaimingUtils.getSimilar(simhash1, simhash2);
        String data="文章相似度为"+similar;
        FileUtils.writeFile(args[2],data);
    }
}
