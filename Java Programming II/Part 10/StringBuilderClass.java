public class StringBuilderClass{
    public static void main(String[] args) {

        /*
         * Here the draw back is that the for loop is creating a new string
         * everytime and then concatenating it, which is a space and eventually 
         * performance tradeoff, so to rescue this, we have stringbuilder class
         
         String numbers = "";    // creating an empty string
         for(int i = 0; i < 5; i++) {
            numbers = numbers + i;
        }
        System.out.println(numbers);    // 1234 (ouput)
        */

        StringBuilder numbers = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            numbers.append(i);  // here we are overloading using the append class
        }
        System.out.println(numbers);
    }
}
