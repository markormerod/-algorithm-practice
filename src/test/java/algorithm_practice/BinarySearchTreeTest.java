package algorithm_practice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import algorithm_practice.BinarySearchTree;

public class BinarySearchTreeTest {
	public BinarySearchTree<Integer> bst;
	
	@Before
	public void SetUp() {
		bst = new BinarySearchTree<Integer>();
	}
	
	@Test
	public void insertingValueIntoNewTree_insertsValueIntoRootNode() {
		int valueToInsert = 5;
		
		bst.insert(valueToInsert);
		
		int rootNodeValue = bst.getRoot().getValue();
		assertEquals(valueToInsert, rootNodeValue);
	}
	
	@Test
	public void insertingValuesIntoTree_storesValuesInCorrectOrder() {
		int[] valuesOutOfOrder = { 5, 1, 2, 20, 4 };
		int[] valuesInOrder  = { 1, 2, 4, 5, 20 };

		for (int i = 0; i < valuesOutOfOrder.length; i++) {
			bst.insert(valuesOutOfOrder[i]);
		}
		
		List<Integer> treeList = bst.toList();
				
		for (int i = 0; i < valuesInOrder.length; i++) {
			assertTrue(treeList.get(i) + " does not equal " + valuesInOrder[i], 
					treeList.get(i).equals(valuesInOrder[i]));
		}
	}
	
	@Test
	public void insertingValuesIntoTree_andCallingToString_returnsCommaSeparatedValuesInOrder() {
		int[] valuesOutOfOrder = { 5, 1, 2, 20, 4 };
		String expectedString = "1, 2, 4, 5, 20";

		for (int i = 0; i < valuesOutOfOrder.length; i++) {
			bst.insert(valuesOutOfOrder[i]);
		}
		
		String actualString = bst.toString();
				
		assertEquals(expectedString, actualString);
	}
}
