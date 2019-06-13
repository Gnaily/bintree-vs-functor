package bintree.v1;

public class Leaf implements BinTree {
    int value;
    public Leaf(int value){
        this.value=value;
    }


    @Override
    public boolean contains(int i) {
        return value==i;
    }
}
