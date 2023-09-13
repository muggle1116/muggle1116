package Utils;

import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnsjUtils {
    public static List<String> ansj(String text){
        String analysisedText = ToAnalysis.parse(text).toStringWithOutNature();
        String[] wordsArr=analysisedText.split(",");
        List<String> list = Arrays.asList(wordsArr);
        return list;

    }
}
