
public class TestPointD {
public static void main (String[] args) {
	PointD p1=new PointD(6,4);
	PointD p2=new PointD(5,10);
	PointD p3=p1.createNewPointD(3,-6);
	System.out.println("point1:"+p1.getDetails());
	System.out.println("point2:"+p2.getDetails());
	System.out.println("point3:"+p3.getDetails());
	System.out.println("Whether p1 and p2 are equal or not: "+p1.isEqual(p2));
	
}
}
