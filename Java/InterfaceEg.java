interface Polygon{
	int a=0;
	//void getArea(int l);
  }
interface Polygon2{
	int b=0;
  }



class Rect implements Polygon,Polygon2{
	public void getArea(int ln,int br){
		System.out.println("Area:"+(ln*br));

	}
}
class Password implements Polygon{
	public void getArea(int side){
		System.out.println("Area:"+(side*side));

	}
}

class InterfaceEg{
	public static void main(String args[]){
		Rect r =new Rect();
		r.getArea(5,6);
		Square sq= new Square();
		sq.getArea(5);
	
	}

}