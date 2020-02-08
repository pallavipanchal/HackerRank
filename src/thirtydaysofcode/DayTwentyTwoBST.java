package thirtydaysofcode;

import java.util.Scanner;

class NodeBST {
    NodeBST left, right;
    int data;

    NodeBST(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DayTwentyTwoBST {
    private static int getHeight(NodeBST root) {
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }

        return (heightLeft > heightRight ? heightLeft : heightRight);
    }

    public static NodeBST insert(NodeBST root, int data) {
        if (root == null) {
            return new NodeBST(data);
        } else {
            NodeBST cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeBST root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

}
