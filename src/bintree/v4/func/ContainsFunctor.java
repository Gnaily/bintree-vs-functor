package bintree.v4.func;

import bintree.v4.def.Leaf;
import bintree.v4.def.Node;

public class ContainsFunctor {

	private final int i;
	public ContainsFunctor(int i){
		this.i=i;
	}

	public boolean contains(Leaf leaf){
		return leaf.value==i;
	}

	public boolean contains(Node node ){
		return node.left.contains(this) || node.right.contains(this);
	}

}
