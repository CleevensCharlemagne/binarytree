package binarytree;

import java.util.List;

public class BinaryNode<T extends Comparable<? super T> > {
    private T data;
    private BinaryNode<T> right;
    private BinaryNode<T> left;

    // TODO: initialisation
    // O(1)
    public BinaryNode(T data) {
        initialize(data);
    }

//    public BinaryNode(T data, BinaryNode<T> right, BinaryNode<T> left){
//        this.data = data;
//        this.right = right;
//        this.left = left;
//    }

    // TODO: on retourne la donnee voulue
    // O(1)
    public T getData() {
        return data;
    }

    // TODO: on ajoute une nouvelle donnee au bon endroit
    // O(log(n))
    // Men metod ki bay erreur a
    public void insert(T item) {
        if(this == null){
            new BinaryNode<T>(item);
        } else{
            int compareresult = item.compareTo(this.data);

            if(compareresult < 0 || compareresult == 0)
                left.insert(item);
            else if(compareresult > 0)
                right.insert(item);
        }
    }

    // TODO: est-ce que l'item fais partie du noeuds courant
    // O(log(n))
    public boolean contains(T item) {
        if(this == null){
            throw new NullPointerException("exception thrown by contains method");
        } else {
            int compareresult = item.compareTo(this.data);

            if(compareresult == 0)
                return true;
            else if(compareresult < 0)
                this.left.contains(item);
            else
                this.right.contains(item);
        }
        return false;
    }

    // TODO: on retourne la maximale de l'arbre
    // O(n)
    public int getHeight() {
        int lefgtHeight = 0, rightHeight = 0;
        if(this == null){
            throw new NullPointerException("exception thrown by getHeight method");
        } else {
            if(this.left != null)
                lefgtHeight = this.left.getHeight();
            if(this.right != null)
                rightHeight = this.right.getHeight();
        }
        return 1 + Math.max(lefgtHeight, rightHeight);
    }

    // TODO: l'ordre d'insertion dans la liste est l'ordre logique
    // de manière que le plus petit item sera le premier inseré
    // O(n)
    public void fillListInOrder(List<BinaryNode<T>> result) {
        if(this!= null){
            if(result != null){
                this.left.fillListInOrder(result);
                result.add(this);
                this.right.fillListInOrder(result);
            } else {
                throw new NullPointerException("exception thrown by fillListInOrder method because the list is empty");
            }

        } else {
            throw new NullPointerException("exception thrown by fillListInOrder method");
        }
    }

    private void initialize(T data){
        this.data = data;
        this.right = null;
        this.left = null;
    }

    @Override
    public String toString() {
        if(this != null)
           return data.toString();
        return "Object null";
    }
}
