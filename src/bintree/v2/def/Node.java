package bintree.v2.def;


import bintree.v2.func.ContainsFunctor;

public class Node implements BinTree {

    public BinTree left;
    public BinTree right;

    public Node(BinTree left, BinTree right){
       this.left=left;
       this.right=right;
    }


    @Override
    public boolean contains(int i, ContainsFunctor cf) {
        return cf.contains(this,i);
    }
}
