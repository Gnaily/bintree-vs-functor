package bintree.v3.def;

import bintree.v3.func.ContainsFunctor;

public class Node implements BinTree {

    public BinTree left;
    public BinTree right;

    public Node(BinTree left, BinTree right){
        this.left=left;
        this.right=right;
    }

    @Override
    public boolean contains(ContainsFunctor containsFunctor) {
        return containsFunctor.contains(this);
    }

}
