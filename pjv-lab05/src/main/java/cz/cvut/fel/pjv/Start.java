package cz.cvut.fel.pjv;

public class Start {
    public static void main(String[] args) {
        TreeImpl tree = new TreeImpl();
//        tree.setTree(new int[]{1});
//        tree.setTree(new int[]{1, 2});
//        tree.setTree(new int[]{1, 2, 3});
//        tree.setTree(new int[]{1, 2, 3, 4});
//        tree.setTree(new int[]{1, 2, 3, 4, 5});
//        tree.setTree(new int[]{1, 2, 3, 4, 5, 6});
//        tree.setTree(new int[]{1, 2, 3, 4, 5, 6,7});
//        tree.setTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        tree.setTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(tree.toString());
    }
}
