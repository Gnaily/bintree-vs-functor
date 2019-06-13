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
    public boolean contains(ContainsFunctor cf) {
        return  cf.visit(this);
    }

    @Override
    public int sum(SumFunctor af) {
        return af.visit(this);
    }

}
