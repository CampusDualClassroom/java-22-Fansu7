package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> stringList = new ArrayList<>();
        String elementsEjercicio = "* GKFFD\n" +
                "* TNANA\n" +
                "* MPMSL\n" +
                "* PSWME\n" +
                "* LZMLF\n" +
                "* JYEBV\n" +
                "* YELNT\n" +
                "* JSNKR\n" +
                "* JFESF\n" +
                "* TMJLL";

        String[] elementsArray = elementsEjercicio.replace("* ", "").split("\n");
        for (String str: elementsArray){
            addElementToList(stringList, str);
        }

        return stringList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String str: customList){
            System.out.println(customList.indexOf(str) + "-" +str);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> finalList = createArrayList();
        addElementToList(finalList, "AAAAA");
        printElementsAndIndex(finalList);
    }


}
