package pckg_arraylist_command_problem;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {
        User user1 = new User("user-01");
        User user2 = new User("user-02");
        User user3 = new User("user-03");
        User user4 = new User("user-04");
        ArrayList<User> users = new ArrayList<>();

        Car car1 = new Car("car", "01");
        Car car2 = new Car("car", "02");
        Car car3 = new Car("car", "03");
        Car car4 = new Car("car", "04");
        ArrayList<Car> cars = new ArrayList<>();

        ArrayListController controller = new ArrayListController();
        AddNewElementToList<User> addUser1 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> addUser2 = new AddNewElementToList<>(users, user1);
        InsertElementAtIndex<User> insertUser1 = new InsertElementAtIndex<>(users, user2, 1);
        ClearAllElements<User> clearUsers = new ClearAllElements<>(users);
        AddNewElementToList<Car> addCar1 = new AddNewElementToList<>(cars, car1);


        controller.setCommand(addUser1);
        controller.runCommand();
        controller.setCommand(addUser2);
        controller.runCommand();
        controller.setCommand(insertUser1);
        controller.runCommand();
        controller.setCommand(addCar1);
        controller.runCommand();
        controller.undoCommand();
        controller.undoCommand();
        controller.redoCommand();
        controller.setCommand(clearUsers);
        controller.runCommand();

    }
}
