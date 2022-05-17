
public class Animal {
	
	private static String animalType;
	private static String age;
	private static String sourceRegion;
	
	public  Animal( String type,String regionSource,String setAge ) {
		animalType = type;
		age = setAge;
		sourceRegion = regionSource;	
	}
	
		public static String getAnimalType() {
		return animalType;
	}

	public static String getAge() {
		return age;
	}

	 public String getSourceRegion() {
		return sourceRegion;
	}

		public static void walk(String newAnimalType) {//common code for all subclasses
		
		animalType = newAnimalType;
		System.out.println(animalType + " is walking...");
		}

		
		public static void  eat(String newAnimalType) {//common code for all subclasses
			animalType = newAnimalType;
			System.out.println(animalType + " is eating...");
		}
}
