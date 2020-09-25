package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<? super T> > {

    private BinaryNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    // TODO: initialisation
    public BinarySearchTree(T item) {
        root = new BinaryNode<T>(item);
    }

    // TODO: on insere un nouvel item a partir de la racine
    // O(log(n))
    public void insert(T item) {
        this.root.insert(item);
    }

    // TODO: est-ce qu'un item fais partie de l'arbre
    // O(log(n))
    public boolean contains(T item) {
        return this.root.contains(item);
    }

    // TODO: trouver la hauteur de l'arbre
    // O(n)
    public int getHeight() {
        if(this.root != null)
            return this.root.getHeight() - 1;
        else
            return -1;
    }

    // TODO: placer dans une liste les items de l'arbre en ordre
    // O(n)
    public List<BinaryNode<T>> getItemsInOrder() {
        List<BinaryNode<T>> list = new ArrayList<>();
        this.root.fillListInOrder(list);
        return list;
    }

    // TODO: retourner la liste d'item en String selon le bon format
    // O(n)
    //Metod sa a poko fini
    public String toStringInOrder() {
//        int size = getItemsInOrder().size();
//        List<BinaryNode<T>> list = getItemsInOrder();
//
//        String str = "";
//
//        String[] tabList = new String[size];
//        for(int i = 0; i < size; i++){
//            str = "" + list.get(i).toString();
//        }
        return " ";
    }
}
