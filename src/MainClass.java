import addition.Add;
import division.Div;

public class MainClass {

	public static void main(String[] args) {
		
		Add add=new Add();
		
		add.addNumber(10,20);	
		add.addNumber(5, 6, 7);
		
		
		
		Div div= new Div();
		div.Division(4,2);
		
	}

}
