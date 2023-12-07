package Codewars;

import java.util.ArrayList;
import java.util.List;

public class KataFilter {

    /*
    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
     */
    public static void main(String[] args) {

    }


    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        final List res = new ArrayList<Object>();
        for (Object o : list) {
            if (o.getClass().equals(Integer.class)) {
                res.add(o);
            }
        }

        return res;
    }

}




