// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeNode<T>
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    BinaryTreeNode<T> getLeft()
    {
        return left;
    }

    BinaryTreeNode<T> getRight()
    {
        return right;
    }
}
