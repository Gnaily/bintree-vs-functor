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
    public boolean contains(ContainsFunctor cf) {
        return cf.contains(this);
    }

    @Override
    public int sum(SumFunctor af) {
        return af.sum(this);
    }

}
