package bintree.v6.def;

import bintree.v6.func.ContainsFunctor;
import bintree.v6.func.SumFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public boolean contains(ContainsFunctor containsFunctor) {
        return containsFunctor.visit(this);
    }

    @Override
    public int sum(SumFunctor sumFunctor) {
        return sumFunctor.visit(this);
    }

}
