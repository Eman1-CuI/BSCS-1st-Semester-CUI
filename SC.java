public class SC {
    enum WashChoice { cotton, linen, wool }
    public static void main(String[] args) {
        WashChoice wash = WashChoice.linen;
        switch (wash) {
            case cotton:
                System.out.println("Cotton Selected");
                break;
            case linen:
                System.out.println("Ltrsinen Selected");
                break; 
            case wool:
                System.out.println("Wool Selected");
                break;
        }
    }
}
