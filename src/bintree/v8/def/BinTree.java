package bintree.v8.def;

import bintree.v8.func.IAction;
import bintree.v8.func.IVisitor;

public interface BinTree {


  <Return> Return apply(IVisitor<Return> visitor);

  void forEach(IAction action);
}
