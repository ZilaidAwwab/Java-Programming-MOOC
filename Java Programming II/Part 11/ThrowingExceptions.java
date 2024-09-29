/*
 * The throw command throws an exception. For example a NumberFormatException can be 
 * done with command throw new NumberFormatException(). The following code always 
 * throws an exception.
 */

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
        throw new NumberFormatException();
    }
}
