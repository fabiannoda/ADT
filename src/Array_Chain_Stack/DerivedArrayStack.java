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
public class DerivedArrayStack extends ArrayLinearList implements Stack {
	// constructors
	public DerivedArrayStack(int initialCapacity) {
		super(initialCapacity);
	}

	public DerivedArrayStack() {
		this(10);
	}

	// methods
	public boolean empty() {
		return isEmpty();
	}

	public Object peek() {
		if (empty()) throw new EmptyStackException();
   		return get(size() - 1);
	}

	public void push(Object theElement) {
   		add(size(), theElement);
   	}

	public Object pop() {
		if (empty()) throw new EmptyStackException();
   			return remove(size() - 1);
	}
	
}
