package bintree.v7;

import bintree.v7.def.BinTree;
import bintree.v7.def.Leaf;
import bintree.v7.def.Node;
import bintree.v7.func.ContainsFunctor;
import bintree.v7.func.SumFunctor;

public class Main {
	public static  void main(String[] args){
		Leaf leaf1=new Leaf(1);
		Leaf leaf2=new Leaf(2);
		Leaf leaf3=new Leaf(3);
		Leaf leaf4=new Leaf(4);

		BinTree tree =new Node(
				leaf4, new Node(
						new Node(leaf1,leaf2),leaf3));
		System.out.println(tree.apply( new ContainsFunctor(2)));
		System.out.println(tree.apply( new SumFunctor()));
	}
}
