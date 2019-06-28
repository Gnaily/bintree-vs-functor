package bintree.v6.def;

import bintree.v6.func.ContainsFunctor;
import bintree.v6.func.SumFunctor;

public class Node implements BinTree {

    public BinTree left;
    public BinTree right;

    public Node(BinTree left, BinTree right){
        this.left=left;
        this.right=right;
    }

    @Override
    public boolean contains(ContainsFunctor containsFunctor) {
        return  containsFunctor.visit(this);
    }

    @Override
    public int sum(SumFunctor sumFunctor) {
        return sumFunctor.visit(this);
    }

}
