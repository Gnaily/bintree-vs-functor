package bintree.v6.def;

import  bintree.v6.func.ContainsFunctor;
import  bintree.v6.func.SumFunctor;

public interface BinTree {


  boolean contains(ContainsFunctor containsFunctor);

  int sum(SumFunctor sumFunctor);
}
