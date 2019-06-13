package bintree.v1;

public class Node implements BinTree {

    BinTree left;
    BinTree right;

    public Node(BinTree left, BinTree right){
       this.left=left;
       this.right=right;
    }


    @Override
    public boolean contains(int i) {
        return this.left.contains(i) || this.right.contains(i);
    }

}
