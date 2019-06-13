package bintree.v2.def;

import bintree.v2.func.ContainsFunctor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }


    @Override
    public boolean contains(int i, ContainsFunctor cf) {
        return cf.contains(this,i);
    }
}
