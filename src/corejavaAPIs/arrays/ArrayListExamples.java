package corejavaAPIs.arrays;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {

//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Test");
//        arrayList.add(1,"Third");
//        arrayList.add(0, "First");
//        arrayList.add(0, "Seond");
//        arrayList.add(3,"Fourth");
//        arrayList.clear();


//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(1);
//        integerList.add(2);
//        integerList.remove(1);
//        integerList.remove(new Integer(1));
//        System.out.println(integerList);


//        List<String> list = new ArrayList<>();
//        list.add("hawk");
//        list.add("robin");
//        Object[] objectArray = list.toArray();
//        System.out.println(objectArray.length); // 2
//        String[] stringArray = list.toArray(new String[2]);
//        System.out.println(stringArray.length); // 2

//        String[] array = {"hawk", "robin"}; // [hawk, robin]
//        List<String> list = Arrays.asList(array); // returns fixed size list
//        System.out.println(list.size()); // 2
//        list.set(1, "test"); // [hawk, test]
//        array[0] = "new"; // [new, test]
//        for (String b : array) System.out.print(b + " "); // new test
//        list.remove(1); // throws UnsupportedOperation Exception

        List <String> list1 = new ArrayList<>(2);
        list1.add("b");
        list1.add("a");
        list1.add("c");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
