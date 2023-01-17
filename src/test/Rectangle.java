package test;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {
		this.length=20;
		this.width=15;
	}
	
	public Rectangle(int l,int w) {
		this.length=l;
		this.width=w;
	}
	
	public Rectangle(int l) {
		this.length=l;
		this.width=5;
	}
	
	public Rectangle(Rectangle r) {
		this.length=r.length;
		this.width=r.width;
	}
	
	public void setLength(int l) {
		this.length=l;
	}
	public void setWidth(int w) {
		this.width=w;
	}
	public int getLength() {
		return this.length;
	}
	public int getWdth() {
		return this.width;
	}
	
	public long getArea() {
		return this.length * this.width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		rect.setLength(5);
		rect.setWidth(2);
		System.out.println(rect.getArea());
		
		Rectangle obj1 = new Rectangle();
		System.out.println(obj1.getArea());
		
		Rectangle obj2 = new Rectangle(200,30);
		System.out.println(obj2.getArea());
		
		Rectangle obj3 =new Rectangle(obj2);
		System.out.println(obj3.getArea());
		

	}

}

class Triangle{
	
}