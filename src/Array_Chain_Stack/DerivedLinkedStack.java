/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_Chain_Stack;

import Stack.Stack;
import java.util.EmptyStackException;

/**
 *
 * @author USER
 */
public class DerivedLinkedStack extends Chain implements Stack {
	
	public DerivedLinkedStack(int initialCapacity) {
		super();
	}
	
	public DerivedLinkedStack() {
		this(0);
	}
	
	public boolean empty() {
		return isEmpty();
	}
	
	public Object peek() {
		if (empty()) 
			throw new EmptyStackException();
	   	return get(0);
	}
	
	public void push(Object theElement) {
	   add(0, theElement);
	}
	
	public Object pop() {
		if (empty()) 
			throw new EmptyStackException();
	   	return remove(0);
	}
}
