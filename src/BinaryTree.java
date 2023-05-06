// Question 3(B): Write a suitable interface for a Binary Tree

public interface BinaryTree<T extends Comparable<T>> {

    // Method to check if the tree is empty
    boolean isEmpty();

    // Method to add Nodes into the tree
    void add(T node);

    // Method to count all the Nodes
    int count();

    // Method to find the oldest Person
    T findMax();

    // Method to find the youngest Person
    T findMin();

    // Method to find the percentage split based on gender
    double spiltByGender();

    // Method to be able to remove a Person object based on Name
    double remove(T name);

    // Method to print out a representation of the tree
    void inOrder();
}