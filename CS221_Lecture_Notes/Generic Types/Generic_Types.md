# Type Safety
The reason angle brackets <> are used to ensure one type fills a collection

Ex. ArrayList<Integer> intList = new ArrayList<Integer>();

intList.add(5) valid, intList.add("Hello) invalid

# How do write one arraylist that stores all types
A collection holds things and returns them back; never altered with add() or remove()

The only real needed method is a toString() to print the contents

# Generic Types
Generics are placeholders in a class or interface for an unknown data type

Ex.
public class TinyBag<E> {
    private E item;

    public boolean add(E element) {
        if (item != null) return false;
        item = element;
        return true;
    }
}

Now with an actual type

TinyBag<String> bag = new TinyBag<String>();
at runtime, the generic type E will now hold String
bag.add("Word");

TinyBag<Integet> favoriteNum = new TinyBag<Integer>();
favoriteNum.add(3)

Now at runtime, a list can hold multiple types that replace E from the configurable collection