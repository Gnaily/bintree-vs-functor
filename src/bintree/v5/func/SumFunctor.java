package bintree.v5.func;

import bintree.v5.def.Leaf;
import bintree.v5.def.Node;

public class SumFunctor implements IVisitor {

	@Override
	public Object visit(Node node) {
		return node.left.sum(this)+node.right.sum(this);
	}

	@Override
	public Object visit(Leaf leaf) {
		return leaf.value;
	}
}
