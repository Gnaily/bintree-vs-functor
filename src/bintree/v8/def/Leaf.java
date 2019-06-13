package bintree.v8.def;

import bintree.v8.func.IAction;
import bintree.v8.func.IVisitor;

public class Leaf implements BinTree {
    public int value;
    public Leaf(int value){
        this.value=value;
    }

    @Override
    public <Return> Return apply(IVisitor<Return> visitor) {
        return visitor.visit(this);
    }

    @Override
    public   void forEach(IAction action) {
        action.on(this);
    }
}
