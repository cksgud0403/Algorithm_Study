package p1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	char data;
	Node left;
	Node right;
	
	
	Node(char data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
		
	}
	
}

class Tree {
	
	Node root;
	
	public void addNode(char parent, char left, char right) {
		
		if(root == null) { //head가 NULL이라면
			
			root = new Node(parent, (left != '.' ? new Node(left, null, null) : null), (right != '.' ? new Node(right, null, null) : null));
			
			
		}else { // head가 NULL이 아니라면
			
			Node node = searchNode(root, parent);
			
			if(node == null) { //node를 찾을 수 없다면
				return;
			}else { //node를 찾았다면
				if( left != '.') {
					node.left = new Node(left, null, null);
				}
				
				if( right != '.') {
					node.right = new Node(right, null, null);
				}
				
			}
			
			
		}
	}
	
	
	public Node searchNode(Node root, char data) {
		
		if(root == null) {
			return null;
		}
		
		if(root.data == data) {
			return root;
		}
		
		Node node = null;
		
		node = searchNode(root.left, data);
		
		if(node == null) { //만약에 왼쪽 서브트리에서 찾을 수 없다면 실행 찾았다면 실행이 안됨
			node = searchNode(root.right, data);
		}
		
		return node;
		
	}
	
	public void preOrder(Node node) {
		if(node == null) {
			return;
		}
		
		
		System.out.print(node.data);
		preOrder(node.left);
		preOrder(node.right);
		
	}


	public void inOrder(Node node) {
		
		if(node == null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.data);
		inOrder(node.right);
	}


	public void postOrder(Node node) {
		if(node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data);
		
	}
	
}

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		Tree tree = new Tree();
		
		
		
		for(int i = 0; i < N ; i++) {
			String[] data = br.readLine().split(" ");
			
			char parent = data[0].charAt(0);
			char left = data[1].charAt(0);
			char right = data[2].charAt(0);
			
			tree.addNode(parent, left, right);
		}
		
		tree.preOrder(tree.root);
		
		System.out.println();
		
		tree.inOrder(tree.root);
		
		System.out.println();

		tree.postOrder(tree.root);

		
	}

}
