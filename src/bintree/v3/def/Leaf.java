package bintree.v3.def;

import bintree.v3.func.ContainsFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public boolean contains(ContainsFunctor cf) {
        return cf.contains(this);
    }

}
