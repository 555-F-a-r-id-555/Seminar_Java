package lesson05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("1", 1);
        map1.put("2", 2);
        System.out.println(map1);
        System.out.println(map1.toString());

        System.out.println(map1.putIfAbsent("3", 3));
        System.out.println(map1.putIfAbsent("3", 9));
        System.out.println(map1);
        System.out.println(map1.size());


        HashMap<String, Integer> map2 = new HashMap<>(10,1f);
        map2.putAll(map1);
        map2.put("4", 4);
        System.out.println(map2);

        Map<Integer, Integer> map3 = new HashMap<>();
        map3.put(1, 1);
        map3.put(2, 2);
        System.out.println(map3);

        System.out.println(map3.isEmpty());
        System.out.println(map2.isEmpty());

        Set<Map.Entry<String, Integer>> set = map1.entrySet();
        System.out.println(set);
        System.out.println();

        for (Map.Entry<String, Integer> item : set) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }

        System.out.println(map2.get("2"));
        System.out.println(map2.get(1));

        System.out.println(map2.getOrDefault(1, -1));

        Collection<Integer> val = map2.values();
        System.out.println(map2.keySet());
        System.out.println(val);

        map2.replaceAll((k, v) -> map2.get(k) * 2);
        System.out.println(map2);
        map2.forEach((k, v) -> System.out.print(k + "->" + v + " "));
        System.out.println();

        boolean k1 = map2.containsKey("1");
        boolean v1 = map2.containsKey(5);
        System.out.println(k1 + "= k1 " + v1 + "=v1");




    }
}
