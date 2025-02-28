package InterviewPrograms.ProblemSovling;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;
/*OUTPUT:
* 1,5,4,3,6,7,0,0,0
* */
public class FillZerosToEnd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 0, 4, 3, 0, 6, 7, 0);  //1,5,4,3,6,7,0,0,0
        moveZerosToEnd(list);
        System.out.println(list);
    }

    public static void moveZerosToEnd(List<Integer> list) {
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(index++, list.get(i));
            }
        }

        // Fill remaining positions with zeros
        while (index < list.size()) {
            list.set(index++, 0);
        }
    }
}
