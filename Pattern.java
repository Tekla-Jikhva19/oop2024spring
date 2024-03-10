     public class Pattern {
        public static void main(String[] args) {
            // Set the number of levels for the triangle
            int levels = 5;

            // Print the triangle pattern
            for (int i = 1; i <= levels; i++) {
                // Print asterisks
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // Move to the next line after each row
                System.out.println();
            }
        }
    }
