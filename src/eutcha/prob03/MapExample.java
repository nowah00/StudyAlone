package eutcha.prob03;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            totalScore += entry.getValue();
            if (maxScore < entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(totalScore / map.size());
        System.out.println(maxScore);
        System.out.println(name);
    }
}
