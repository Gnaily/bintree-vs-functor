package bintree.v5.def;

import bintree.v5.func.ContainsFunctor;
import bintree.v5.func.SumFunctor;

public class Node implements BinTree {

    public BinTree left;
    public BinTree right;

    public Node(BinTree left, BinTree right){
        this.left=left;
        this.right=right;
    }

    @Override
    public boolean contains(ContainsFunctor containsFunctor) {
        return (boolean)containsFunctor.visit(this);
    }

    @Override
    public int sum(SumFunctor sumFunctor) {
        return (int) sumFunctor.visit(this);
    }

}
