package bintree.v8.func;

import bintree.v8.def.Leaf;
import bintree.v8.def.Node;

public class SumAccumulator implements IAction{
	private int sum=0;

	@Override
	public void on(Node node) {
		node.left.forEach(this);
		node.right.forEach(this);
	}

	@Override
	public void on(Leaf leaf) {
		accumulate(leaf.value);
	}

	private void accumulate(int value){
		sum=sum+value;
	}

	public int getSum() {
		return sum;
	}
}
