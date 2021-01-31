import java.util.ArrayList;

public class BinaryNode {
  
  public int value;

  public BinaryNode left;
  public BinaryNode right;

  public BinaryNode(int value) {
    this.value = value;
  }

  public void insertValue(int value) {
    if (value <= this.value) {
      if (this.left == null) {
        this.left = new BinaryNode(value);
      } else {
        this.left.insertValue(value);
      }
    } else {
      if (this.right == null) {
        this.right = new BinaryNode(value);
      } else {
        this.right.insertValue(value);
      }
    }
  }

  public ArrayList<Integer> addValuesToArrayList(ArrayList<Integer> vals) {

    // first add left children if exist
    if (this.left != null) {
      vals = this.left.addValuesToArrayList(vals);
    }

    // add my value
    vals.add(this.value);

    // add right children if exist
    if (this.right != null) {
      vals = this.right.addValuesToArrayList(vals);
    }

    return vals;

  }


}
