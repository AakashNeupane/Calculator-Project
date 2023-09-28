import addition.Add;
import division.Div;
import multiplication.mult;

public class MainClass {

	public static void main(String[] args) {
		
		Add add=new Add();
		
		add.addNumber(10,20);	
		add.addNumber(5, 6, 7);
		
		
		
		Div div= new Div();
		div.Divison(4,2);
		
		mult mu=new mult();
		System.out.println(mu.mu1(2, 3));
	}

}
