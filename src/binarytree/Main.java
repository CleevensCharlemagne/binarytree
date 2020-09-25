package binarytree;

import java.util.ArrayList;
import java.util.List;

// Toute modification a ce fichier ne sera pas comptabilisée
public class Main {

    // Le main fait simplement tester votre logique pour les deux exercices

    public static void main(String[] args) {
        System.out.println("Debut des tests du TP3");
//        TestBinary testBinary = new TestBinary();
//        testBinary.test();

//        TestCompany testCompany = new TestCompany();
//        testCompany.test();
        List<Integer> list = new ArrayList<>();
        BinarySearchTree<Integer> b = new BinarySearchTree<>(59);
        int []tab = {6,35,2,13,14,15,8,9,0,56,100,45,36,23,4,3,67,};
        for(int i = 0; i < tab.length; i++){
            list.add(tab[i]);
        }
        for(int i = 0; i < tab.length; i++){
            b.insert(list.get(i));
        }
    }
}
