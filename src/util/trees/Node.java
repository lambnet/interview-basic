package util.trees;

public class Node {
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new Node(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if(value ==  data){
            return true;
        }else if(value < data){
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }

    public void printInorder(){
        if(left != null){
            left.printInorder();
        }
        System.out.print(" "+data);
        if(right != null){
            right.printInorder();
        }
    }

    public void printPreorder(){
        System.out.print(" "+data);
        if(left!=null){
            left.printPreorder();
        }
        if(right!=null){
            right.printPreorder();
        }
    }

    public void printPostorder(){
        if(left!=null){
            left.printPostorder();
        }
        if(right!=null){
            right.printPostorder();
        }
        System.out.print(" " + data);
    }
}
