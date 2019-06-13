package bintree.v8.func;

import bintree.v8.def.Leaf;
import bintree.v8.def.Node;

public class SumFunctor implements IVisitor<Integer> {

	@Override
	public Integer visit(Node node) {
		int l=node.left.apply(this);
		int r=node.right.apply(this);
		return l+r;
	}

	@Override
	public Integer visit(Leaf leaf) {
		return leaf.value;
	}
}
