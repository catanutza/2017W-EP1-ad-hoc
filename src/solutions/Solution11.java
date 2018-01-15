/**
 * Solution 11) Quadratisches Raster mit variablen Dimensionen mit Kreisen füllen und abhängig
 * von einer Variable statt jedem xten Kreis ein Quadrat Zeichnen.
 * | O | X | O |
 * | X | O | X |
 * | O | X | O |
 */
public class Solution11 {
    public static void main(String[] args) {
        boolean x=true;
       for(int i=0; i<3; i++){
           System.out.println("");
           System.out.print("| ");
           for(int j=0; j<3; j++){
               if(x)
                   System.out.print("X ");
               else
                   System.out.print("O ");
               x=x==true?false:true;
               System.out.print("| ");
           }
       }
    }
}
