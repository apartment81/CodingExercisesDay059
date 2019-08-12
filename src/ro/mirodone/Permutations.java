package ro.mirodone;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    public  List<String> singlePermutations(String s) {

        List<String> list = new ArrayList<>();

        if (s == null) {
            return null;
        } else if (s.length() == 0) {
            list.add("");
            return list;
        }

        char initial = s.charAt(0);
        String rest = s.substring(1);
        List<String> words = singlePermutations(rest);
        for ( String strNew : words){
            for (int i = 0 ; i <= strNew.length(); i++){
                list.add(charInsert(strNew, initial, i));
            }
        }

        // Add the elements to set
        Set<String> set = new LinkedHashSet<>(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;


    }

     private String charInsert ( String str, char c, int j){
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end ;
    }

}
