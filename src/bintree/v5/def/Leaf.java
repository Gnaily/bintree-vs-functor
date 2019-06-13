package bintree.v5.def;

import bintree.v5.func.ContainsFunctor;
import bintree.v5.func.SumFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public boolean contains(ContainsFunctor cf) {
        return (boolean)cf.visit(this);
    }

    @Override
    public int sum(SumFunctor af) {
        return (int)af.visit(this);
    }

}
