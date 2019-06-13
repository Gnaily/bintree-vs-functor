package bintree.v5.func;

import bintree.v5.def.Leaf;
import bintree.v5.def.Node;

public interface IVisitor {

   Object visit(Node leaf);
   Object visit(Leaf leaf);

}
