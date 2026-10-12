public class TestList {

    public static void main(String [] args){
        ListArrayBased list = new ListArrayBased();

        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("List size: " + list.size());

        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Orange");

         displayList(list);

        System.out.println("Item at position 1: " + list.get(1));
        System.out.println("Item at position 2: " + list.get(2));
        System.out.println("Item at position 3: " + list.get(3));

        list.remove(2);

        displayList(list);

        System.out.println("Item at position 1: " + list.get(1));
        System.out.println("Item at position 2: " + list.get(2));

         list.removeAll();

        System.out.println("List empty after removeAll(): " + list.isEmpty());
        System.out.println("List size after removeAll(): " + list.size());   
        
        testInvalidIndex();
    }
        public static void displayList(ListArrayBased list) {
        System.out.println("Current list contents:");

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    
public static void testInvalidIndex() {
    ListArrayBased list = new ListArrayBased();

    try {
        list.get(1);
        System.out.println("FAIL: Expected an exception for get(1)");
    } catch (ListIndexOutOfBoundsException e) {
        System.out.println("PASS: get(1) rejects an invalid index");
    }

       try {
        list.add(0, "Invalid");
        System.out.println("FAIL: Expected an exception for add(0)");
    } catch (ListIndexOutOfBoundsException e) {
        System.out.println("PASS: add(0) rejects an invalid index");
    } catch (ListException e) {
        System.out.println("Unexpected ListException: " + e.getMessage());
    }

    try {
        list.remove(1);
        System.out.println("FAIL: Expected an exception for remove(1)");
    } catch (ListIndexOutOfBoundsException e) {
        System.out.println("PASS: remove(1) rejects an invalid index");
    }
}

}