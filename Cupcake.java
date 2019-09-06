import java.util.ArrayList;

abstract public class Cupcake {
	String name;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	public void prepare() {
		System.out.println("Preparing " + name);
	}
	public void bake() {
		System.out.println("Baking " + name);
	}
	public void decorate() {
		System.out.println("Decorating " + name);
	}
	public void box() {
		System.out.println("Boxing " + name);
	}
	public String toString() {
		//code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name+ " ----\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}
