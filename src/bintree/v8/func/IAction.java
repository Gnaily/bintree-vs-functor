package bintree.v8.func;

import bintree.v8.def.Leaf;
import bintree.v8.def.Node;

public interface IAction {
	void on(Node node);
	void on(Leaf leaf);
}
