
import java.util.Map;
import java.util.TreeMap;
 
public class Treemap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);
        treeMap.remove("B");
        for (String key : treeMap.keySet()) {
            System.out.println( key + ":" + treeMap.get(key));
        }
    }
}