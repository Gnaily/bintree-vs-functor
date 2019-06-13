package bintree.v7.def;

import  bintree.v7.func.IVisitor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public <Return> Return apply(IVisitor<Return> visitor) {
        return visitor.visit(this);
    }
}
