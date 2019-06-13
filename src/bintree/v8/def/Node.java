package bintree.v8.def;

import bintree.v8.func.IAction;
import bintree.v8.func.IVisitor;

public class Node implements BinTree {

    public BinTree left;
    public BinTree right;

    public Node(BinTree left, BinTree right){
        this.left=left;
        this.right=right;
    }

    @Override
    public <Return> Return apply(IVisitor<Return> visitor) {
        return visitor.visit(this);
    }

    @Override
    public  void forEach(IAction action) {
         action.on(this);
    }
}
