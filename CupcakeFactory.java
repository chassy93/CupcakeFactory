
public class CupcakeFactory {
	public Cupcake createCupcake(String type) {
		Cupcake cupcake = null;
		if (type.equals("Vanilla")) {
			cupcake = new Vanilla();
		} else if (type.equals("Sugar Free")) {
			cupcake = new SugarFree();
		} else if (type.equals("Red Velvet")) {
			cupcake = new RedVelvet();
		} else if (type.equals("Chocolate")) {
			cupcake = new ChocoCupcake();
		}
		return cupcake;
	}
}