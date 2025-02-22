package Star_Patterns;

public class Triangle {

    public static void main(String[] args){

        triangle();
        Triangle();

    }
    public static void triangle(){

        /*      *
                * *
                * * *
                * * * *
                * * * * *
         */

        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void Triangle(){
        /*      *
               * *
              * * *
         */
        int n = 3;
        // Loop through each row
        for (int i=1; i<=n; i++){
            // Print spaces before the stars
            for (int j=1; j<n; j++){
                System.out.print(" ");
            }
            // Print stars with spaces in between
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
