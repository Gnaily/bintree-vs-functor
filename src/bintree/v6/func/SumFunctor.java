package bintree.v6.func;

import bintree.v6.def.Leaf;
import bintree.v6.def.Node;

public class SumFunctor implements IVisitor<Integer> {

	@Override
	public Integer visit(Node node) {
		return node.left.sum(this)+node.right.sum(this);
	}

	@Override
	public Integer visit(Leaf leaf) {
		return leaf.value;
	}
}
