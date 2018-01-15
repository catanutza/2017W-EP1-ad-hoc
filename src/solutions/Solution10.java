/**
 * Solution 10) StdDraw, 5 bzw. 7 Kreise die immer kleiner und dunkler werden,
 * außen weiß bzw. Grau und je weiter nach innen desto dunkler, alles in einem 500x500 canvas.
 */
public class Solution10 {
    public static void main(String[] args) {
       StdDraw.setCanvasSize(500,500);
       StdDraw.setXscale(0,500);
       StdDraw.setYscale(0,500);
       int rad=240, x=250, y=250, r=255, g=255, b=255;
       for(int i=1; i<=10; i++)
       {
           StdDraw.setPenColor(r,g,b);
           StdDraw.filledCircle(x,y,rad);
           rad-=20;
           r=255/(i);
           g=255/(i);
           b=255/(i);
       }
    }
}

