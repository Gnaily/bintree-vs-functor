package bintree.v6.func;

import bintree.v6.def.Leaf;
import bintree.v6.def.Node;

public interface IVisitor<Return> {

   Return visit(Node leaf);
   Return visit(Leaf leaf);

}
