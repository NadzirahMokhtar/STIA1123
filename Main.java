public class Main {

	public static void main(String[] args) {
		Ruler myRuler = new Ruler();
		myRuler.brand = "Shinwa ruler";
		myRuler.color = "Grey";
		myRuler.madeFrom = "Steel";
		
		Ruler ainRuler = new Ruler();
		ainRuler.brand = "Astar ruler";
		ainRuler.color = "White";
		ainRuler.madeFrom = "Plastic";
		
		System.out.println("myRuler");
		System.out.println("brand:" + myRuler.brand);
		System.out.println("color:" + myRuler.color);
		System.out.println("madeFrom:" + myRuler.madeFrom);
		
		System.out.println();
		
		System.out.println("Function:");
		myRuler.Draw();
				
		System.out.println();
		
		System.out.println("ainRuler");
		System.out.println("brand:" + ainRuler.brand);
		System.out.println("color:" + ainRuler.color);
		System.out.println("madeFrom:" +ainRuler.madeFrom);
		System.out.println();
		
		System.out.println("Function:");
		ainRuler.Draw();
				
	}

}

