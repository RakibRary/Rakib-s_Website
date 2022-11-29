//Rakib Rary
//CSCI 313
//Anne Smith Thompson
//Mon-Wed section
public class myBST {
	private Node root;

	public myBST() {
	}
	public myBST(Customer customer) {
		root = new Node(customer);
	}
	//--------------------------------------------------------------------
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	//--------------------------------------------------------------------
	public Node insert(Customer customer) {
		Node node = new Node(customer);
		//base case
		if (root == null) {
			root = node;
			return root;
		}
		//sort tree
		Node current = root;
		Customer currentCustomer;
		while (current != null) {
			currentCustomer = current.getCustomer();
			if (customer.compareTo(currentCustomer) == 0) {
				break;
			} else if (customer.compareTo(currentCustomer) > 0) {
				
			if (current.getRight() == null) {
			current.setRight(node);
			break;
				}
				current = current.getRight();
			} else {if (current.getLeft() == null) {
				
			current.setLeft(node);
			break;
				}
			current = current.getLeft();
			}}
		return node;
	}
	
	//--------------------------------------------------------------------
	//private Node delete(Customer customer) {
		//return null;
	//}
		public Node delete(Customer customer) {
			Node Node, node = search(customer);
			if (node == null) {
				return null; 
			} else {
				Node = max();//set node to the root
				//----------------------------------
				Node.setLeft(node.getLeft());
				Node.setRight(node.getRight());
				//----------------------------------
				Node = null;//set the node to null
			}
			return node;
		}
	//--------------------------------------------------------------------
	public Node search(Customer customer) {
		return search(root, customer);
	}

	private Node search(Node root, Customer customer) {
		if (root == null || root.getCustomer().compareTo(customer) == 0) {
			return root;
		}

		if (root.getCustomer().compareTo(customer) < 0) {
			return search(root.getLeft(), customer);
		} else {
			return search(root.getRight(), customer);
		}
	}
	//--------------------------------------------------------------------
	public Node max() {
		return max(root);
	}
	private Node max(Node root) {
		if (root.getRight() != null) {
			return max(root.getRight());
		} else {return root;
		}
	}
	//--------------------------------------------------------------------
	public Node min() {
		return min(root);
	}
	private Node min(Node root) {
		if (root.getLeft() != null) {
			return min(root.getLeft());
		} else {return root;
	//------------------------------------------------------------------------
}}}
