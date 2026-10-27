import java.util.Scanner;
public class CharacterChecker{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char character = sc.next().charAt(0);
    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
        character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
      System.out.print("Vowel");
    } else {
      System.out.print("Consonant");
    }
  }
}
