public class Main {
    public static void main(String[] args) {

               String originalString = "$2000";

               int amount = Integer.parseInt(originalString.substring(1));

                amount++;

                String updatedString = "$" + amount;

                System.out.println("Original String: " + originalString);
                System.out.println("Updated String: " + updatedString);
            }
        }

