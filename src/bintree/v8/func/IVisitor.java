package bintree.v8.func;

import bintree.v8.def.Leaf;
import bintree.v8.def.Node;

public interface IVisitor<Return> {

   Return visit(Node node);
   Return visit(Leaf leaf);

}
