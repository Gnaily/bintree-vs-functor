package bintree.v5.func;

import bintree.v5.def.Leaf;
import bintree.v5.def.Node;

public class ContainsFunctor implements IVisitor {

	int i;
	public ContainsFunctor(int i){
		this.i=i;
	}


	@Override
	public Object visit(Node node) {
		return node.left.contains(this) || node.right.contains(this);
	}

	@Override
	public Object visit(Leaf leaf) {
		return leaf.value==i;
	}
}
