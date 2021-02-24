/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

/**
 *
 * @author USER
 */
public class Execution {

	public static void main(String[] args) {
		// test constructor and put
		MaxHeap h = new MaxHeap(4);
		h.put(new Integer(10));
		h.put(new Integer(20));
		h.put(new Integer(5));
		h.put(new Integer(15));
		h.put(new Integer(30));
		System.out.println("Elements in array order are");
		System.out.println(h);
		System.out.println();
		System.out.println("size " + h.size());
		System.out.println("max " + h.getMax());
		System.out.println("Empty " + h.isEmpty());
		// test remove max
		System.out.print("Deleted max element ");
		System.out.println(h.removeMax());
		System.out.println("size " + h.size());
		System.out.println("max " + h.getMax());
		System.out.println("Empty " + h.isEmpty());
		System.out.print("Deleted max element ");
		System.out.println(h.removeMax());
		System.out.println("size " + h.size());
		System.out.println("max " + h.getMax());
		System.out.println("Empty " + h.isEmpty());
		System.out.println("Elements in array order are");
		System.out.println(h);
		System.out.println();
	}

}
