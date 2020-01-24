package com.agotiya.Utils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class CommonUtility {

    private static Predicate<Integer> greaterThanFifty= (e) -> e > 50;

    public static Integer totalMonthlyPoints(Map<String, List<Integer>> map, String month){
        return map.get(month)
                .stream()
                .filter(greaterThanFifty)
                .map(e -> {
                    if (e > 100) {
                        return  (e -100) * 2;
                    } else {
                        return  (e-50);
                    }})
                .reduce(0,(c,e) ->c +e);
    }

    public static Map<String,List<Integer>> dataSetMap(){

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("January", Arrays.asList(40,55,120,140,89,66,200,230,180,30,250));
        map.put("February",Arrays.asList(140,155,20,104,84,61,210,301,108,30,150));
        map.put("March",Arrays.asList(14,105,210,141,184,161,110,101,181,301,115));
        return map;
    }

}
