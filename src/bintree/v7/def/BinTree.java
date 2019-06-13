package bintree.v7.def;

import  bintree.v7.func.IVisitor;

public interface BinTree {


  <Return> Return apply(IVisitor<Return> visitor);
}
