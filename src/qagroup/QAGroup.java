package qagroup;

import java.util.*;

public class QAGroup {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Preston");
        set.add("Lilyfield");
        set.add("Ashborough");
        set.add("Washington");
        set.add("Preston");

        final Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String entry = it.next();
            System.out.println(entry);
        }



//        Map<String, String> map = new HashMap<String, String>();
//        map.put("Ivan:Ivanov","Ivanov");
//        map.put("Petr:Petrov","Petrov");
//        String s1 = map.get("Ivan:Ivanov");
//        String s2 = map.get("Petr:Petrov");
//        map.put("Ivan:Ivanov", s2);
//        map.put("Petr:Petrov", s1);
//
//        for(String key : map.keySet()) {
//            System.out.print(key);
//            final String val = map.get(key);
//            System.out.println("="+val);
//        }

//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(Integer.valueOf(100105), "Fairfield");
//        map.put(Integer.valueOf(100100), "Preston");
//        map.put(100101, "Lilyfield");
//        map.put(100102, "Ashborough");
//        map.put(100101, "Washington");
//        System.out.println("size="+map.size());

//        for(Integer key : map.keySet()) {
//            System.out.print(key);
//            final String val = map.get(key);
//            System.out.println("="+val);
//        }
//        final Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
//        final Iterator<Map.Entry<Integer,String>> it = entrySet.iterator();
//        while(it.hasNext()) {
//            Map.Entry<Integer,String> entry = it.next();
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }

    }

}
