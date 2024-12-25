package InterviewPrograms.stringProblems;

import java.util.*;
import java.util.stream.Collectors;

public class IsAllCharsExistsinOtherStr {
    public static void main(String[] args) {
        try {
//            String fileData = "abc bcsa abc sdfsd abc asdsdr";
//            List<String> list = Arrays.asList(fileData.split(" "));
//            Map<String, Integer> mymap = new HashMap<>();
//            String maxRepeatedStr = "";
//            Integer repeatcount = 0;
//            for (String str : list) {
//                if (mymap.containsKey(str)) {
//                    mymap.put(str, mymap.get(str) + 1);
//                } else {
//                    mymap.put(str, 1);
//                }
//                if (mymap.get(str) > repeatcount) {
//                    repeatcount = mymap.get(str);
//                    maxRepeatedStr=str;
//                }
//            }
//            System.out.println("repeated str = "+maxRepeatedStr);

            String str1="dog";
            List<String> str1arr = Arrays.asList(str1.split(""));
            String str2="good";
            List<String> str2Arr = Arrays.asList(str2.split(""));
            System.out.println(str1arr.containsAll(str2Arr));
            str1arr.stream().collect(Collectors.toList());
            str1.toCharArray();

        } catch (Exception ex) {

        }

    }
}
