import java.util.*;
class Circle
{
   public double area(int r){
    double Pi=3.14;
   double area=Pi*r*r;
     return area;
       }
    public double  perimeter (int r){
       double Pi=3.14;
       double perimeter=2*Pi*r;
        return perimeter;
    }
    public static void main(String args []){
        Scanner s1=new Scanner(System.in);
         System.out.print("enter the Radius:");
        int r1=s1.nextInt();
        Circle c1=new Circle();
        System.out.println("The area of circle is:"+c1.area(r1));
        System.out.println("The perimeter of circle is:"+c1.perimeter(r1));
       
        
    }
}
