package lambdaExpressions;


interface shape {
	
	void drawShape();
	
}

class rectangle implements shape{

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle class shapeMethod");
		
	}
}

class pentagon implements shape{

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("pentagon class shapemethod");
		
	}
}

class hexagon implements shape{

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("hexagon class shapemethod");
		
	}
}

/**
 * 
 * @author Pranay
 * 
 *
 */
public class LambdaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 shape rectangle =  () -> System.out.println("Rectangle class shapeMethod");
		// rectangle.drawShape();
		 shape pentagon =  () -> System.out.println("pentagon class shapemethod");
		 //pentagon.drawShape();
		 shape hexagon =  () -> System.out.println("hexagon class shapemethod");
		// hexagon.drawShape();
		 
		 print(hexagon);
		 print(pentagon);
		 print(rectangle);
	}
	
	/**
	 * Providing Lambda expression as a method parameter
	 */
	
	public static void print(shape shape) {
		
		shape.drawShape();
	}
	
	

}
