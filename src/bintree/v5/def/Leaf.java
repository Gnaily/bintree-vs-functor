package bintree.v5.def;

import bintree.v5.func.ContainsFunctor;
import bintree.v5.func.SumFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public boolean contains(ContainsFunctor containsFunctor) {
        return (boolean)containsFunctor.visit(this);
    }

    @Override
    public int sum(SumFunctor sumFunctor) {
        return (int)sumFunctor.visit(this);
    }

}
