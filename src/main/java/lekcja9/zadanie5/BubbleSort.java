package lekcja9.zadanie5;

import java.util.List;

public class BubbleSort <T extends Comparable<T>>{
    public void sort(List<T> list){
        int n = list.size();

        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n-i-1; j++){
                if (list.get(j).compareTo(list.get(j+1)) > 0){
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }
}
