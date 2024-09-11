public class TextMessage implements Readable {
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    /*
    * Since the TextMessage class implements the Readable interface (public class TextMessage implements
    Readable), the TextMessage class must contain an implementation of the public String read() method.
    */

    public String getSender() {
        return this.sender;
    }

    public String read() {
        return this.content;
    }

    public static void main(String[] args) {
        /*
         * An object's type can be other than its class. For example, the type of the Ebook class that implements the Readable interface is both Ebook and Readable. Similarly, the text message also has multiple types. Because the TextMessage class implements the Readable interface, it has a Readable type in addition to the TextMessage type.
         */

        /* Here we can see that the TextMessage is initialized once as the TextMessage object type and once as Readable type (as readable is the interface it implements, so the object can be initialized both as the class name as well as the interface it implements) */

        TextMessage message = new TextMessage("ope", "Something cool's about to happen");
        Readable readable = new TextMessage("ope", "The text message is Readable!");

        /* TextMessages is the main class that implements the readable interface, and here we saw that TextMessage can be assigned to readable type variable, but it is not applied to the contrary conditions

         * Readable readable = new TextMessage("ope", "TextMessage is Readable!"); // works
         * TextMessage message = readable; // doesn't work
        
         */
        
        /*
         * Type conversion succeeds if, and only if, the variable is of the type that it's being converted to. Type conversion is not considered good practice, and one of the few situation where it's use is appropriate is in the implementation of the equals method.
        
         * TextMessage castMessage = (TextMessage) readable; // works if, and only if, readable is of text message type

         */
        System.out.println(message);
        System.out.println(readable);
    }
}
