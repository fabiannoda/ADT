/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author wilson soto
 * 
 */

public interface Stack {
	/**
	 * 
	 * @return
	 */
	public boolean empty();
	
	/**
	 * 
	 * @return
	 */
	public Object peek();
	
	/**
	 * 
	 * @param theObject
	 */
	public void push(Object theObject);
	
	/**
	 * 
	 * @return
	 */
	public Object pop();
}