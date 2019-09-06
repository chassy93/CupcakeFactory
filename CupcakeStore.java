
public class CupcakeStore {
	CupcakeFactory factory;
	
	public CupcakeStore(CupcakeFactory factory) {
		this.factory = factory;
	}
	public Cupcake orderCupcake(String type) {
		Cupcake cupcake;
		cupcake = factory.createCupcake(type);
		
		cupcake.prepare();
		cupcake.bake();
		cupcake.decorate();
		cupcake.box();
		
		return cupcake;
	}
}
