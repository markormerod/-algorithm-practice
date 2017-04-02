package algorithm_practice;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable> {
	
	private BinarySearchTreeNode<T> root;
	
	public boolean search(T value) {
		return search(root, value);
	}
	
	private boolean search(BinarySearchTreeNode<T> node, T value) {
		if (node == null)
			return false;
		
		if (node.valueEquals(value))
			return true;
		
		if (node.valueGreaterThan(value))
			return search(node.getLeft(), value);
		else
			return search(node.getRight(), value);
	}
	
	public void insert(T value) {
		root = insert(root, value);
	}
	
	private BinarySearchTreeNode<T> insert(BinarySearchTreeNode<T> node, T value) {
		if (node == null) {
			node = new BinarySearchTreeNode<T>(value);
		}
		else if (node.valueGreaterThan(value))
			node.setLeft(insert(node.getLeft(), value));
		else
			node.setRight(insert(node.getRight(), value));
		
		return node;
	}
	
	public List<T> toList() {
		List<T> list = new ArrayList<T>();
		
		return toList(root, list);
	}
	
	private List<T> toList(BinarySearchTreeNode<T> node, List<T> list) {
		if (node == null)
			return list;
		
		list = toList(node.getLeft(), list);
		
		list.add(node.getValue());
		
		list = toList(node.getRight(), list);
		
		return list;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder = toString(root, stringBuilder);
		
		int length = stringBuilder.length();
		
		return length == 0 ? stringBuilder.toString() : stringBuilder.substring(0, length - 2);
	}
	
	private StringBuilder toString(BinarySearchTreeNode<T> node, StringBuilder stringBuilder) {
		if (node == null)
			return stringBuilder;
		
		stringBuilder = toString(node.getLeft(), stringBuilder);
		
		stringBuilder.append(node.getValue().toString() + ", ");
		
		stringBuilder = toString(node.getRight(), stringBuilder);
		
		return stringBuilder;
	}
	
	public BinarySearchTreeNode<T> getRoot() {
		return root;
	}
}