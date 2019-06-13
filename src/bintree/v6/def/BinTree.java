package bintree.v6.def;

import  bintree.v6.func.ContainsFunctor;
import  bintree.v6.func.SumFunctor;

public interface BinTree {


  boolean contains(ContainsFunctor cf);

  int sum(SumFunctor sf);
}
