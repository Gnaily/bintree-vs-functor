package bintree.v3.func;

import bintree.v3.def.Leaf;
import bintree.v3.def.Node;

public class ContainsFunctor {

	int i;
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
