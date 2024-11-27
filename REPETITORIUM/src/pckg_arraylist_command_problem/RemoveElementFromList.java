package pckg_arraylist_command_problem;

import java.util.ArrayList;

public class RemoveElementFromList<E> implements CommandOnList<E> {

    private ArrayList<E> list;
    private E element;
    private boolean flag;

    public RemoveElementFromList(ArrayList<E> list, E element) {
        this.list = list;
        this.element = element;
        this.flag = false;
    }

    @Override
    public void runCommand() {
        if (list.contains(element)) {
            flag = list.remove(element);
            System.out.println("Element: " + element + " removed from the list");
        } else {
            System.out.println("nothing to remove");
        }
    }

    @Override
    public void undoCommand() {
        if (flag) {
            list.add(element);
            System.out.println("Undo command: Element added to the list | element: " + element);
            flag = false;
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
