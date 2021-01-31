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

  public Integer indexOf(int val) {

    // returns index of value if in list, else returns -1

    ArrayList<Integer> vals = this.values();

    for (int counter = 0; counter < vals.size(); counter++) { 		      
      if (vals.get(counter) == val) {
        return counter;
      }
    }

    return -1;

  }


}
