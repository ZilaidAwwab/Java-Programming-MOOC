public class Decrypting {
  public static void main(String[] args) {
    String username = "Zemayel";
    String password = "hashu321!";

    // Here we will decrypt the password by adding the first character of the username to the decrypted password, we also learnt about the char data type and the chatAt method

    String decryptedPassword = username.charAt(0) + password;
    System.out.println("Decrypted Password: " + decryptedPassword);
  }
}
