package dev.harsh.architect.multithreading.mergeSort;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

@AllArgsConstructor
public class Sorter implements Callable<List<Integer>> {
    private List<Integer> toBeSorted = new ArrayList<>();
    private ExecutorService executorService;
    @Override
    public List<Integer> call() throws Exception {
        //Base Case
        if(toBeSorted.size() <= 1){
            return toBeSorted;
        }

        int mid = toBeSorted.size() >> 1;
        List<Integer> left = toBeSorted.subList(0,mid);
        List<Integer> right = toBeSorted.subList(mid,toBeSorted.size());
        left = executorService.submit(new Sorter(left,executorService)).get();
        right = executorService.submit(new Sorter(right,executorService)).get();
        //Merge part
        int p1 = 0, p2 = 0;
        List<Integer> out = new ArrayList<>();
        while(p1 < left.size() && p2 < right.size()){
            if(left.get(p1) <= right.get(p2)){
                out.add(left.get(p1++));
            }
            else {
                out.add(right.get(p2++));
            }
        }
        while(p1 < left.size()){
            out.add(left.get(p1++));
        }
        while(p2 < right.size()){
            out.add(right.get(p2++));
        }
        return out;
    }
}
