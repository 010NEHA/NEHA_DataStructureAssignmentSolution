package Quest2;

	public class SkewedTree {
		
	public static Node node;
		static Node prevNode = null;
		static Node headNode = null;
	
		
		static void BinaryTreeToSkewedTree(Node root, int order) {

			if (root == null) {
				return;
			}
			if (order > 0) {
				BinaryTreeToSkewedTree(root.right, order);
			} else {
				BinaryTreeToSkewedTree(root.left, order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;
	
			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			if (order > 0) {
				BinaryTreeToSkewedTree(leftNode, order);
			} else {
				BinaryTreeToSkewedTree(rightNode, order);
			}
		}

		// Traverse the right one skewed using recursion
		static void traverseRightSkewed(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);
		}

		public static void main1(String[] args) {
		
			SkewedTree tree = new SkewedTree();
			SkewedTree.node = new Node(50);
			SkewedTree.node.left = new Node(30);
			SkewedTree.node.right = new Node(60);
			SkewedTree.node.left.left = new Node(10);
			SkewedTree.node.right.left = new Node(55);

			int order = 0;
			BinaryTreeToSkewedTree(node, order);
			traverseRightSkewed(headNode);

			
		
	
	
				}
		
		}

	



		



