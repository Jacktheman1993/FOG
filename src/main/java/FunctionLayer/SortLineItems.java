/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author simon
 */
public class SortLineItems {
    
    private int partition(ArrayList<LineItems> arr, int left, int right) {

        int i = left, j = right;
        LineItems tmp;
        LineItems pivot = arr.get((left + right) / 2);
        if (arr.isEmpty()) {
            return 0;
        }
        while (i <= j) {
            while (arr.get(i).compareTo(pivot) < 0) {
                i++;
            }
            while (arr.get(j).compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Collections.swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public void quickSorting(ArrayList<LineItems> arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSorting(arr, left, index - 1);
        }
        if (index < right) {
            quickSorting(arr, index, right);
        }

    }
    
}
