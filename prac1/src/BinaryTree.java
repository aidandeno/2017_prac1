// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTree<T>
{
    BinaryTreeNode<T> root;

    public BinaryTree()
    {
        root = null;
    }

    public int getHeight()
    {
        return getHeight(root);
    }

    public int getHeight(BinaryTreeNode<T> node)
    {
        if (node == null)
        {
            return -1;
        }
        else
        {
            return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
        }
    }

    public int getSize()
    {
        return getSize(root);
    }

    public int getSize(BinaryTreeNode<T> node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            return 1 + getSize(node.getLeft()) + getSize(node.getRight());
        }
    }

    public void visit(BinaryTreeNode<T> node)
    {
        System.out.println(node.data);
    }

    public void preOrder()
    {
        preOrder(root);
    }

    public void preOrder(BinaryTreeNode<T> node)
    {
        if (node != null)
        {
            visit(node);
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder()
    {
        postOrder(root);
    }

    public void postOrder(BinaryTreeNode<T> node)
    {
        if (node != null)
        {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            visit(node);
        }
    }

    public void inOrder()
    {
        inOrder(root);
    }

    public void inOrder(BinaryTreeNode<T> node)
    {
        if (node != null)
        {
            inOrder(node.getLeft());
            visit(node);
            inOrder(node.getRight());
        }
    }

    public void levelOrder()
    {
        if (root == null)
        {
            return;
        }
        BTQueue<T> q = new BTQueue<>();
        q.enQueue(root);
        BinaryTreeNode<T> node;
        while ((node = q.getNext()) != null)
        {
            visit(node);
            if (node.getLeft() != null)
            {
                q.enQueue(node.getLeft());
            }
            if (node.getRight() != null)
            {
                q.enQueue(node.getRight());
            }
        }
    }
}
