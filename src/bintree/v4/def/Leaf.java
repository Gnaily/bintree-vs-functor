package bintree.v4.def;

import bintree.v4.func.ContainsFunctor;
import bintree.v4.func.SumFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
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
