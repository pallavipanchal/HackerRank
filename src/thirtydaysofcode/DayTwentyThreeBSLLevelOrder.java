package thirtydaysofcode;

import java.util.Scanner;

class NodeBSTLevel {
    NodeBSTLevel left, right;
    int data;

    NodeBSTLevel(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DayTwentyThreeBSLLevelOrder {
    public static NodeBSTLevel insert(NodeBSTLevel root, int data) {
        if (root == null) {
            return new NodeBSTLevel(data);
        } else {
            NodeBSTLevel cur;
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
        NodeBSTLevel root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

    private static void levelOrder(NodeBSTLevel root) {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    private static void printGivenLevel(NodeBSTLevel root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    static int height(NodeBSTLevel root) {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }
}
