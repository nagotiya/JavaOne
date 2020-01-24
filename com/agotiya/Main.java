package com.agotiya;
import java.util.List;
import java.util.Map;

import static com.agotiya.Utils.CommonUtility.dataSetMap;
import static com.agotiya.Utils.CommonUtility.totalMonthlyPoints;


public class Main {

    public static void main(String[] args) {

        int totalPointRedemption=0;
        Map<String, List<Integer>> map = dataSetMap();

        if (!map.isEmpty()){
            for (String month : map.keySet()){
                int monthlyPointValue= totalMonthlyPoints(map,month);
                if (monthlyPointValue > 0){
                    System.out.println("Monthly total Point for"  + month + "=" + monthlyPointValue);
                    totalPointRedemption += monthlyPointValue;
                }
            }
        }
        System.out.println(" OverAll total rewards points =" + totalPointRedemption);

    }
}
