/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import PriorityQueue.MaxHeap;

public class HeapSort {

    public static void heapSort(Comparable[] a) {
        MaxHeap h = new MaxHeap();
        h.initialize(a, a.length - 1);
        //System.out.println(h);
        for (int i = a.length - 2; i >= 1; i--) {
            a[i + 1] = h.removeMax();
        }
    }
    
}