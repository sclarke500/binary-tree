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


  }

}