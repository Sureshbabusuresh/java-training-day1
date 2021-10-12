
public class PointD {
	private int x;
	private int y;
	public PointD(int a,int b)
	{x=a;
	y=b;
	}
	public String getDetails() {
		return "Point("+x+" "+y+")";
		
	}public boolean isEqual(PointD p2) {
		if(x==p2.getx() && y==p2.gety()) {
			return true;
		}else {
			return false;
		}
	}
	public PointD createNewPointD(int n1,int n2) {
		int x2=n1+x;
		int y2=n2+y;
		PointD newPoint=new PointD(x2,y2);
		return newPoint;
		
	}
		public int getx() {
			return x;
		}
		public int gety() {
			return y;
		}
	}
		
	