package pckg_arraylist_command_problem;

import java.util.ArrayList;

public class AddNewElementToList<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;

    public AddNewElementToList(ArrayList<E> list, E element) {
        this.list = list;
        this.element = element;
    }

    @Override
    public void runCommand() {
        if (element == null) {
            System.out.println("\nElement is null");
        }else if (list.contains(element)) {
            System.out.println("\nElement already exists in the list");
        } else {
            list.add(element);
            System.out.println("\nElement" + element + "added to the list! | type of element: " + element.getClass().getSimpleName());
        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Undo command: Element removed from the list | element:" + element);
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
