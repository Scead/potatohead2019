
public class PotatoHeadTester {

	public static void main(String[] args) {
		PotatoHead taterFace = new PotatoHead();
		System.out.println(taterFace.toString());
		/*
		 Mutator methods
		 */
		taterFace.setEyeColor("Red");
		taterFace.setNumbOfArms(4);
		taterFace.setNumberOfLegs(5);
		taterFace.setHatColor("Blue");
		/*
		 Accessor Methods
		 */
		System.out.println(taterFace.getEyeColor());
		System.out.println(taterFace.getNumbOfArms());
		System.out.println(taterFace.getHatColor());
		/*
		 toString() Method
		 */
		System.out.println(taterFace.toString());
	}

}
