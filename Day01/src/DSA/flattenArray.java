package DSA;


import java.util.ArrayList;
import java.util.List;

public class flattenArray {
    public static List<Integer> flatnArray(List<Object> nestedArray) {
        List<Integer> flatArray = new ArrayList<>();
        for (Object obj : nestedArray) {
            if (obj instanceof Integer) {
                flatArray.add((Integer) obj);
            } else if (obj instanceof List) {
                flatArray.addAll(flatnArray((List<Object>) obj));
            }
        }
        return flatArray;
    }

    public static void main(String[] args) {
        List<Object> nestedArray = new ArrayList<>();
        nestedArray.add(1);
        List<Object> innerArray1 = new ArrayList<>();
        innerArray1.add(2);
        List<Object> innerArray2 = new ArrayList<>();
        innerArray2.add(3);
        innerArray2.add(4);
        innerArray1.add(innerArray2);
        List<Object> innerArray3 = new ArrayList<>();
        innerArray3.add(5);
        innerArray1.add(innerArray3);
        nestedArray.add(innerArray1);

        List<Integer> flatArray = flatnArray(nestedArray);
        System.out.println("Flattened array: " + flatArray);
    }
}

