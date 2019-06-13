package bintree.v7.func;

import  bintree.v7.def.Leaf;
import  bintree.v7.def.Node;

public interface IVisitor<Return> {

   Return visit(Node leaf);
   Return visit(Leaf leaf);

}
