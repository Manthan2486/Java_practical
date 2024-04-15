public class pra13 {
        public static void main(String[] args) {

            String str = "Hello, World!";
            System.out.println("Main String: " + str);
            char cA = str.charAt(5);
            System.out.println("Character at index 5: " + cA);
    
            boolean c = str.contains("World");
            System.out.println("Contains 'World': " + c);
    
            String f = String.format("Today is %s", "Monday");
            System.out.println("Formatted string: " + f);
    
            int l = str.length();
            System.out.println("Length of the string: " + l);

            String[] words = str.split(", ");
            System.out.println("Splitting the string:");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }