package bintree.v4.def;

import bintree.v4.func.ContainsFunctor;
import bintree.v4.func.SumFunctor;

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

    @Override
    public int sum(SumFunctor sumFunctor) {
        return sumFunctor.sum(this);
    }

}
