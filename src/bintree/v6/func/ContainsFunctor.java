package bintree.v6.func;

import bintree.v6.def.Leaf;
import bintree.v6.def.Node;

public class ContainsFunctor implements IVisitor<Boolean> {

	private  final int i;
	public ContainsFunctor(int i){
		this.i=i;
	}


	@Override
	public Boolean visit(Node node) {
		return node.left.contains(this) || node.right.contains(this);
	}

	@Override
	public Boolean visit(Leaf leaf) {
		return leaf.value==i;
	}
}
