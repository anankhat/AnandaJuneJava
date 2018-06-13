package dayfive;

public class FourMethod {
	class Rectangle {
		  int length;
		  int breadth;

		  void setLength(int len)
		  {
		  length = len;
		  }

		  int getLength()
		  {
		  return length;
		  }

		}

		class RectangleDemo {
		  public static void main(String args[]) {

		  Rectangle r1 = new Rectangle();

		  r1.setLength(20);

		  int len = r1.getLength();

		  System.out.println("Length of Rectangle : " + len);

		  }
		}
}
