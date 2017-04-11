// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>
{
    public void insert(T data)
    {
        if (root == null)
        {
            root = new BinaryTreeNode<>(data, null, null);
        }
        else
        {
            insert(data, root);
        }
    }

    public void insert(T data, BinaryTreeNode<T> node)
    {
        if (data.compareTo(node.data) <= 0)
        {
            if (node.left == null)
            {
                node.left = new BinaryTreeNode<>(data, null, null);
            }
            else
            {
                insert(data, node.left);
            }
        }
        else
        {
            if (node.right == null)
            {
                node.right = new BinaryTreeNode<>(data, null, null);
            }
            else
            {
                insert(data, node.right);
            }
        }
    }

    public BinaryTreeNode<T> find(T d)
    {
        if (root == null)
        {
            return null;
        }
        else
        {
            return find(d, root);
        }
    }

    public BinaryTreeNode<T> find(T d, BinaryTreeNode<T> node)
    {
        if (d.compareTo(node.data) == 0)
        {
            return node;
        }
        else if (d.compareTo(node.data) < 0)
        {
            return (node.left == null) ? null : find(d, node.left);
        }
        else
        {
            return (node.right == null) ? null : find(d, node.right);
        }
    }

    public void delete(T data)
    {
        root = delete(data, root);
    }

    public BinaryTreeNode<T> delete(T d, BinaryTreeNode<T> node)
    {
        if (node == null)
        {
            return null;
        }

        if (d.compareTo(node.data) < 0)
        {
            node.left = delete(d, node.left);
        }
        else if (d.compareTo(node.data) > 0)
        {
            node.right = delete(d, node.right);
        }
        else if (node.left != null && node.right != null)
        {
            node.data = findMin(node.right).data;
            node.right = removeMin(node.right);
        }
        else if (node.left != null)
        {
            node = node.left;
        }
        else
        {
            node = node.right;
        }
        return node;
    }

    public BinaryTreeNode<T> findMin(BinaryTreeNode<T> node)
    {
        if (node != null)
        {
            while (node.left != null)
            {
                node = node.left;
            }
        }
        return node;
    }

    public BinaryTreeNode<T> removeMin(BinaryTreeNode<T> node)
    {
        if (node == null)
        {
            return null;
        }
        else if (node.left != null)
        {
            node.left = removeMin(node.left);
            return node;
        }
        else
        {
            return node.right;
        }
    }

}
