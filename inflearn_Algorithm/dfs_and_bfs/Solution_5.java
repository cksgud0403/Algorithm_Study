package dfs_and_bfs;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class BinaryTree {
	Node root;
	
	
	public void preOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	
	}
	
	
	public void inOrder(Node root) {
			
			if(root == null) {
				return;
			}
			
			
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		
		}

	public void postOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	
	}




	public class Solution_5 {
	
		public static void main(String[] args) {
			
			BinaryTree bt = new BinaryTree();
			
			
			bt.root = new Node(1, null, null);
			
			
			bt.root.left = new Node(2, new Node(4, null, null), new Node(5, null, null));
			bt.root.right = new Node(3, new Node(6, null, null), new Node(7, null, null));
			
			
			bt.preOrder(bt.root);
			System.out.println();
			bt.inOrder(bt.root);
			System.out.println();
			bt.postOrder(bt.root);
			
	
		}
	
		}
	}
