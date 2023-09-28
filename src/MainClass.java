import addition.Add;
import division.Div;
import multiplication.mult;
import substraction.sub;

public class MainClass {

	public static void main(String[] args) {
		
		Add add=new Add();
		
		add.addNumber(10,20);	
		add.addNumber(5, 6, 7);
		add.Sum(4, 04);
		add.Total(10, 10);
		
		
		Div div= new Div();
		div.Division(4,2);
		
		mult mu=new mult();
		System.out.println(mu.mu1(2, 3));
		
		sub s=new sub();
		s.subnumber(5, 2);
		
	}

}
