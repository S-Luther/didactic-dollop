package com.example.project;

public class BST {

    Node start, head;

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int d){
            data = d;
        }
    } 

    static void insert(BST tree, int d){
        Node new_node = new Node(d);
        tree.head = tree.start;
        if(tree.start == null){
            tree.start = new_node;
        }else{
            Node parent;  
  
            while(true) {  
                //parent keep track of the parent node of current node.  
                parent = tree.head;  

                //If data is less than current's data, node will be inserted to the left of tree  
                if(d < tree.head.data) {  
                    tree.head = tree.head.left;  
                    if(tree.head == null) {  
                        parent.left = new_node;  
                        return;  
                    }  
                }  
                //If data is greater than current's data, node will be inserted to the right of tree  
                if (d > tree.head.data){  
                    tree.head = tree.head.right;  
                    if(tree.head == null) {  
                        parent.right = new_node;  
                        return;  
                    }  
                }  
            }  
        } 
        tree.head = tree.start; 
    }




    public static void main(String[] args){
        BST searchTree = new BST(); 

        searchTree.insert(searchTree, 10);
        searchTree.insert(searchTree, 5);
        searchTree.insert(searchTree, 15);
        searchTree.insert(searchTree, 1);
        searchTree.insert(searchTree, 20);
        searchTree.insert(searchTree, 8);

        /*
         *           10
         *         /    \
         *       5        15
         *      / \         \
         *    1     8        20
         */

    }
}
