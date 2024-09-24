public class Checker {
    public boolean isDayOfWeek(String string) {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    public boolean allVowels(String string) {
        if(string.matches("^[aeiou]*")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    public boolean timeOfDay(String string) {
        if (string.matches("(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
}
