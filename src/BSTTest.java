public class BSTTest{
    public static void main(String[] args){
        BST<Integer,String> tree= new BST<>();
        tree.put(5,"Five");
        tree.put(3,"Three");
        tree.put(7,"Seven");
        tree.put(2,"Two");
        tree.put(4,"Four");
        tree.put(6,"Six");
        tree.put(9,"Nine");
        System.out.println("Size: " + tree.size());
        for(var elem: tree){
            System.out.println("key is "+ elem.getKey()+ " and value is "+ elem.getValue());
        }
    }
}