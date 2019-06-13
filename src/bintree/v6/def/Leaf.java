package bintree.v6.def;

import bintree.v6.func.ContainsFunctor;
import bintree.v6.func.SumFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public boolean contains(ContainsFunctor cf) {
        return cf.visit(this);
    }

    @Override
    public int sum(SumFunctor af) {
        return af.visit(this);
    }

}
