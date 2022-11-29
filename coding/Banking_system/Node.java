//Rakib Rary
//CSCI 313
//Anne Smith Thompson
//Mon-Wed section
public class Node {
	private Customer customer;
	Node left, right;
	private int data;
	
	//--------------------------------------------------------------------
	public Node() {

	}
	//--------------------------------------------------------------------
	public Node(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
