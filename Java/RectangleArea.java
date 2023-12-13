import java.util.Scanner;

public class RectangleArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length and width of Rectangle-1");
	int l1=sc.nextInt();
	int w1=sc.nextInt();
	System.out.println("Enter the length and width of Rectangle-2");
	int l2=sc.nextInt();
	int w2=sc.nextInt();
        Rectangle obj1= new Rectangle(l1,w1);
	int area1 = obj1.calculateArea();
        Rectangle obj2= new Rectangle(l2,w2);
        int area2 = obj2.calculateArea();
        
	if(area1 > area2){
            System.out.println("Area of Rectangle-1 is greater than Area of Rectangle-2");
          }
	else if(area1<area2){
            System.out.println("Area of Rectangle-2 is greater than Area of Rectangle-1");
        }

	else{
            System.out.println("both are equal");
        }
    }
}

class Rectangle{
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
     }

    public int calculateArea() {
       	 return length * width;
    }
}
