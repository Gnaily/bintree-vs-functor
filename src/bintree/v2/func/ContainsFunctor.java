package bintree.v2.func;

import bintree.v2.def.Leaf;
import bintree.v2.def.Node;

public class ContainsFunctor {

	public boolean contains(Leaf leaf, int i){
		return leaf.value==i;
	}

	public boolean contains(Node node, int i){
		return node.left.contains(i,this) || node.right.contains(i,this);
	}
}
