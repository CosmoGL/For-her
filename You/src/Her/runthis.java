package Her;

public class Hehe {
    public static void main(String[] args) {
        String[] y = {
            "*     *",
            " *   * ",
            "  * *  ",
            "   *   ",
            "   *   "
        };

        String[] u = {
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] r = {
            "*******",
            "*     *",
            "*******",
            "*    * ",
            "*     *"
        };

        String[] a = {
            "  ***  ",
            " *   * ",
            "*******",
            "*     *",
            "*     *"
        };

        String[] i = {
            "  ***  ",
            "   *   ",
            "   *   ",
            "   *   ",
            "  ***  "
        };

        for (int line = 0; line < 5; line++) {
            System.out.print(y[line] + "  "); 
            System.out.print(u[line] + "  "); 
            System.out.print(r[line] + "  "); 
            System.out.print(a[line] + "  "); 
            System.out.print(i[line] + "  "); 
            System.out.print(a[line]);         
            System.out.println();               
        }
    }
}
