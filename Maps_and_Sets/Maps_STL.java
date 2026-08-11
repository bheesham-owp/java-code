package Maps_and_Sets;

import java.util.HashMap;
public class Maps_STL {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("bheesham", 17); map.put("Kumar", 23);
        map.put("Mahadev", 10);map.put("God", 77);
        map.put("Kirshna", 57);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
//        System.out.println(map+" " +map.size() );
//        System.out.println(map.containsKey("bheesham"));
//        System.out.println(map.remove("Kumar"));
//        System.out.println(map);
//        map.put("Kumar", 57);
//        System.out.println(map);
    }
}
