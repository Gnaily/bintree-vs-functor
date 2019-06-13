package bintree.v3;

import bintree.v3.def.BinTree;
import bintree.v3.def.Leaf;
import bintree.v3.def.Node;
import bintree.v3.func.ContainsFunctor;

public class Main {
	public static  void main(String[] args){
		Leaf leaf1=new Leaf(1);
		Leaf leaf2=new Leaf(2);
		Leaf leaf3=new Leaf(3);
		Leaf leaf4=new Leaf(4);

		BinTree tree =new Node(
				leaf4, new Node(
						new Node(leaf1,leaf2),leaf3));
		System.out.println(tree.contains( new ContainsFunctor(2)));
		System.out.println(tree.contains( new ContainsFunctor(5)));
	}
}
