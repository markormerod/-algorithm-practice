package algorithm_practice;

public class BinarySearchTreeNode<T extends Comparable> {
	private T value;
	private BinarySearchTreeNode<T> left;
	private BinarySearchTreeNode<T> right;
	
	public BinarySearchTreeNode(T value) {
		this.value = value;
	}
	
	public boolean valueGreaterThan(T otherValue) {
		return value.compareTo(otherValue) > 0;
	}
	
	public boolean valueEquals(T otherValue) {
		return value.compareTo(otherValue) == 0;
	}
	
	public BinarySearchTreeNode<T> getLeft() {
		return left;
	}
	
	public BinarySearchTreeNode<T> getRight() {
		return right;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setLeft(BinarySearchTreeNode<T> left) {
		this.left = left;
	}

	public void setRight(BinarySearchTreeNode<T> right) {
		this.right = right;
	}
}
