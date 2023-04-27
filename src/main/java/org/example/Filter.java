package org.example;

import java.util.ArrayList;
import java.util.List;
public class Filter {
    private int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getLog();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < f){
                logger.log("Элемент " + list.get(i) + " не проходит");
            }else{
                logger.log("Элемент" + list.get(i) + " проходит");
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
