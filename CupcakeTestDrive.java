
public class CupcakeTestDrive {
	public static void main(String[] args) {
		CupcakeFactory factory = new CupcakeFactory();
		CupcakeStore store = new CupcakeStore(factory);
		
		Cupcake cupcake = store.orderCupcake("Red Velvet");
		System.out.println("We ordered a " +cupcake.getName()+ "\n");
		System.out.println(cupcake);
		
		cupcake = store.orderCupcake("Chocolate");
		System.out.println("We ordered a " +cupcake.getName()+ "\n");
		System.out.println(cupcake);
	}
}

//make CupcakeStore copy PizzaStore