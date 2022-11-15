package day19;

public class LearnEnums {

	String planet1 = "Jupiter";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Complexity.Simple);
		System.out.println(Complexity.Medium);
		System.out.println(Complexity.Hard);

		LearnEnums obj = new LearnEnums();
		obj.planet1 = "Mars";

		for (Complexity each : Complexity.values()) {
			System.out.println(each.name());

			switch (each.name()) {
			case "Simple":
				System.out.println("Its Very Simple");
				break;
			case "hard":
				System.out.println("Its Very Hard");
				break;
			default:
				break;
			}

		}
		
		
		System.out.println("---------------------");
		
		Complexity[] allValue = Complexity.values();
		
		int count = allValue.length;  // 5
		
		
		for (int i = 0; i < count; i++) {
			
			if (i == 0 || i == count-1) {
				System.out.println(allValue[i]);
			}
			
			
			
		}

	}

}
