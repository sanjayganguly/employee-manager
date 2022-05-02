
import java.util.*;

class Node{
    int nodeData;
    Node leftNode, rightNode;
    Node(int nodeData){
        temp.nodeData = nodeData;
        temp.leftNode = null;
        temp.rightNode = null;
        return temp;
        }
    }
    public class FindSumPair {
    public Node insert(Node root, int key){
        if (root == null)
            return new Node(key);
        if(key < root.nodeData)
                root.leftNode = insert(root.leftNode, key);
        else
                root.rightNode = insert(root.rightNode, key);
        return root;

    }
    public boolean findpairUntil(Node root, int sum, HashSet<Integer>set){
        if (root == null)
            return false;
        if (findpairUntil(root.leftNode, sum, set))
            return true;
        if (set.contains(sum - root.nodeData)){
            System.out.println("The pair is Found :" +(sum - root.nodeData) + "," +root.nodeData+")");
            return true;
        } else set.add(root.nodeData);
        return findpairUntil(root.rightNode, sum, set);
    }
    public void findPairWithGivenSum(Node root, int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        if (!findpairUntil(root, sum, set));
    }
    // DRIVER CLASS
    public static void main (String [] args){

        Node root = null;
        FindSumPair findSP = new FindSumPair();
        root = findSP.insert(root, 40);
        root = findSP.insert(root, 20);
        root = findSP.insert(root, 60);
        root = findSP.insert(root, 10);
        root = findSP.insert(root, 30);
        root = findSP.insert(root, 50);
        root = findSP.insert(root, 70);

        int sum = 130;
        findSP.findpairUntil(root, sum, set);

        findSP.findPairWithGivenSum(root,sum);
    }

}




public class findSumPair {
}
