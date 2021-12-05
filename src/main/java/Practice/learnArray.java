package Practice;


import java.util.*;
import java.util.function.IntFunction;


public class learnArray {
    public void listArray() {
        List<String> lists = new ArrayList<>();
        lists.add("one");
        lists.add("two");
        lists.add("three");

        lists.remove("three");
        lists.add("four");
        for (String list : lists) {
            System.out.println("print the list is :" + list);


        }
    }
List<String> list;
    String[] array;

    public void convertArrayToList() {
        array = new String[] {"java", "python", "c++", "php"};
        System.out.println("printing arrays:" + Arrays.toString(array));

        //Converting array to list
        list = new ArrayList<>();
        for(String language : array){
            list.add(language);
        }
        System.out.println("printing list:" + list);
        //adding value into the list
        list.add("rubby");
        list.add("visual basic");
        System.out.println("print new list:" +list);


    }
    public void convertListToArray () {
    array = list.toArray(new String[list.size()]);
    System.out.println("printing array upon converting from list:" +Arrays.toString(array));




    }

}