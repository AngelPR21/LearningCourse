public class Main {
   public static void main(String[] args) {
      // Write your solution here
      MyList<Integer> myList = new MyList<>();

      myList.addHead(3);
      myList.addHead(0);
      myList.addHead(4);
      myList.addTail(1);
      System.out.println(myList);
      System.out.println(myList.remove(3));
      System.out.println(myList);

   }
}