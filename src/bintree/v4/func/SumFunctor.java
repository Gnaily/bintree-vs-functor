package bintree.v4.func;

import bintree.v4.def.Leaf;
import bintree.v4.def.Node;

public class SumFunctor {

	public int sum(Node node){
		return node.left.sum(this)+node.right.sum(this);
	}


	public int sum(Leaf leaf){
		return leaf.value;
	}

}
