import java.util.Iterator;
import java.util.Stack;
public class BST<K extends Comparable<K>,V> implements Iterable<BST<K, V>.Node>{
    private Node root;
    private int size;
    public class Node{
        private K key;
        private V val;
        private Node left, right;
        public Node(K key,V val){
            this.key= key;
            this.val= val;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return val;
        }
    }
    public void put(K key, V val){
        Node newNode= new Node(key,val);
        if (root== null){
            root= newNode;
            size++;
            return;
        }
        Node current= root;
        Node parent= null;
        while (current!= null){
            parent= current;
            int cmp= key.compareTo(current.key);
            if (cmp< 0) {
                current= current.left;
            }
            else if(cmp > 0){
                current = current.right;
            }
            else{
                current.val = val;
                return;
            }
        }
        int cmp= key.compareTo(parent.key);
        if(cmp< 0){
            parent.left= newNode;
        }
        else{
            parent.right= newNode;
        }
        size++;
    }
    public V get(K key){
        Node current= root;
        while (current!= null){
            int cmp= key.compareTo(current.key);
            if (cmp< 0) {
                current= current.left;
            }
            else if(cmp> 0){
                current= current.right;
            }
            else{
                return current.val;
            }
        }
        return null;
    }
    public void delete(K key){
        Node parent= null;
        Node current= root;
        while(current!= null&& !current.key.equals(key)){
            parent= current;
            int cmp= key.compareTo(current.key);
            if(cmp< 0){
                current= current.left;
            }
            else{
                current= current.right;
            }
        }
        if(current == null) return;
        if(current.left != null && current.right != null){
            Node successorParent= current;
            Node successor= current.right;
            while(successor.left!= null) {
                successorParent= successor;
                successor= successor.left;
            }
            current.key= successor.key;
            current.val= successor.val;
            if (successorParent.left== successor){
                successorParent.left= successor.right;
            }
            else{
                successorParent.right = successor.right;
            }
        }
        else{
            Node child= (current.left != null)? current.left: current.right;
            if (current == root){
                root = child;
            }
            else if (parent.left == current){
                parent.left = child;
            }
            else{
                parent.right = child;
            }
        }
        size--;
    }
    public int size(){
        return size;
    }
    @Override
    public Iterator<Node> iterator(){
        return new InOrderIterator();
    }
    private class InOrderIterator implements Iterator<Node>{
        private Stack<Node> stack= new Stack<>();
        public InOrderIterator(){
            pushLeft(root);
        }
        private void pushLeft(Node node){
            while (node != null){
                stack.push(node);
                node= node.left;
            }
        }
        @Override
        public boolean hasNext(){
            return !stack.isEmpty();
        }
        @Override
        public Node next(){
            Node node= stack.pop();
            pushLeft(node.right);
            return node;
        }
    }
}