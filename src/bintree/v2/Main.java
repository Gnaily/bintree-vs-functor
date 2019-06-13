package bintree.v2;

import bintree.v2.def.BinTree;
import bintree.v2.def.Leaf;
import bintree.v2.def.Node;
import bintree.v2.func.ContainsFunctor;

public class Main {
	public static  void main(String[] args){
		Leaf leaf1=new Leaf(1);
		Leaf leaf2=new Leaf(2);
		Leaf leaf3=new Leaf(3);
		Leaf leaf4=new Leaf(4);

		BinTree tree =new Node(
				leaf4, new Node(
					new Node(leaf1,leaf2),leaf3));
		System.out.println(tree.contains(2,new ContainsFunctor()));
		System.out.println(tree.contains(5,new ContainsFunctor()));
	}
}
