package bintree.v4.def;

import bintree.v4.func.ContainsFunctor;
import bintree.v4.func.SumFunctor;

public interface BinTree {

  boolean contains(ContainsFunctor containsFunctor);

  int sum(SumFunctor sumFunctor);
}
