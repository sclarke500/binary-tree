import java.util.ArrayList;

class MyApp {
  public static void main(String[] args) {

    BinaryTree bt = new BinaryTree();
    
    bt.insertValue(5);
    bt.insertValue(7);
    bt.insertValue(12);
    bt.insertValue(99);
    bt.insertValue(6);
    bt.insertValue(-3);
    bt.insertValue(15);
    bt.insertValue(3);

    ArrayList<Integer> values = bt.values();

    for (int counter = 0; counter < values.size(); counter++) { 		      
      System.out.println(values.get(counter)); 		
    }

    System.out.println("--------------");

    System.out.println(bt.indexOf(7));

    int v = 3;

    BinaryNode searchResult = bt.search(v);
    if (searchResult != null) {
      System.out.println("found " + searchResult.value);
    } else {
      System.out.println(v + " not found");
    }



  }

}