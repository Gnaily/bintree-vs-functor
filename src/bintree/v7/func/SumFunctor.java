package bintree.v7.func;

import  bintree.v7.def.Leaf;
import  bintree.v7.def.Node;

public class SumFunctor implements IVisitor<Integer> {

	@Override
	public Integer visit(Node node) {
		int l=node.left.apply(this);
		int r=node.left.apply(this);
		return l+r;
	}

	@Override
	public Integer visit(Leaf leaf) {
		return leaf.value;
	}
}
