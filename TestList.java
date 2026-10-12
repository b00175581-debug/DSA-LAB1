public class TestList {

    public static void main(String [] args){
        ListArrayBased list = new ListArrayBased();

        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("List size: " + list.size());

        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Orange");

        System.out.println("List size after adding items: " + list.size());

        System.out.println("Item at position 1: " + list.get(1));
        System.out.println("Item at position 2: " + list.get(2));
        System.out.println("Item at position 3: " + list.get(3));
    }
}