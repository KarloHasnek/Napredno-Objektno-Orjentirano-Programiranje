package pckg_arraylist_command_problem;

import java.util.ArrayList;

public class InsertElementAtIndex<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;
    private int index;

    public InsertElementAtIndex(ArrayList<E> list, E element, int index) {
        this.list = list;
        this.element = element;
        this.index = index;
    }

    @Override
    public void runCommand() {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        } else {
            if (list.contains(element)) {
                System.out.println("Element already exists in the list!");
            } else {
                list.add(index, element);
                System.out.println("Element: " + element + " added to the list at index: " + index);
            }
        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Undo command: Element removed from the list | element: " + element);
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
