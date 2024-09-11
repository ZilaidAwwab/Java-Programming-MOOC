import java.util.Scanner;

public abstract class Operation {
    private String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void execute(Scanner scanner);
}

/*
 * The abstract class Operation works as a basis for implementing different actions. For instance, you can implement the plus operation by extending the Operation class in the different manner, one as given in PlusOperation class.
 */
