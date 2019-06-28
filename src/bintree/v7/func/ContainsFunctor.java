package  bintree.v7.func;

import  bintree.v7.def.Leaf;
import  bintree.v7.def.Node;

public class ContainsFunctor implements IVisitor<Boolean> {

	final int i;
	public ContainsFunctor(int i){
		this.i=i;
	}


	@Override
	public Boolean visit(Node node) {
		return node.left.apply(this) || node.right.apply(this);
	}

	@Override
	public Boolean visit(Leaf leaf) {
		return leaf.value==i;
	}
}
