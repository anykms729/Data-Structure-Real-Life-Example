
// Question 3(A): Define a suitable Node for the above Binary Tree using Java Generics

public class BTNode<T> {
    protected T element;
    protected BTNode<T> left;
    protected BTNode<T> right;

    public BTNode(T element) {
        this.element = element;
    }

    public String toString() {
        String leftVal = this.left == null ? "NULL" : this.left.element.toString();
        String rightVal = this.right == null ? "NULL" : this.right.element.toString();
        return "[Current Team] " + this.element + "\n[left]" + leftVal + "\n[right]" + rightVal + "\n";
    }
}