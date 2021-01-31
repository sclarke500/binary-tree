import java.util.ArrayList;

public class BinaryTree {

  public BinaryNode root;

  public BinaryTree() {

  }

  public void insertValue(Integer value) {

    if (this.root == null) {
      this.root = new BinaryNode(value);
    } else {
      this.root.insertValue(value);
    }

  }

  public ArrayList<Integer> values() {

    ArrayList<Integer> vals = new ArrayList<Integer>();

    return this.root.addValuesToArrayList(vals);
    


  }


}
