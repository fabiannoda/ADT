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
public interface MaxPriorityQueue {

	public boolean isEmpty();

	public int size();

	public Comparable getMax();

	public void put(Comparable theObject);

	public Comparable removeMax();
}
