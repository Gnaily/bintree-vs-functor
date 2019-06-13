package bintree.v5.def;

import bintree.v5.func.ContainsFunctor;
import bintree.v5.func.SumFunctor;

public interface BinTree {


  boolean contains(ContainsFunctor cf);

  int sum(SumFunctor af);
}
