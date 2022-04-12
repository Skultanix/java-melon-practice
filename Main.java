public class Main {

	public static void main(String[] args) {

		//Creating new instances of object MelonType with requisite fields
		MelonType musk = new MelonType("musk", "Muskmelon", 1998, "green", true, true);
		MelonType cas = new MelonType("cas", "Casaba", 2003, "orange", true, false);
		MelonType cren = new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType yw = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);

		//Creating a new array of MelonType Objects
		MelonType[] types = {musk, cas, cren, yw};

		//PART 2

		//Creating new instances of the object Melon with requisite fields
		Melon melon1 = new Melon(yw, 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(yw, 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(cas, 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(cren, 9, 9, 35, "Michael");
		Melon melon5 = new Melon(cren, 8, 2, 35, "Michael");
		Melon melon6 = new Melon(musk, 6, 7, 4, "Michael");
		Melon melon7 = new Melon(yw, 7, 10, 3, "Sheila");

		//Making an array of Melons
		Melon[] harvest = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		//Calling the method
		getSellabilityReport(harvest);
	}
	//Sellability Report method to check if Melons in harvest array can be sold
	public static void getSellabilityReport(Melon[] harvest){
		//For loop to cycle through the array
		for (int i = 0; i < harvest.length; i++) {
				//Create a variable to id the current object in the array
				Melon current = harvest[i];

				//if statement to determine what the "canSell" string will be
				String canSell;
				if (current.isSellable() == true) {
					canSell = "(CAN BE SOLD)";
				} else {
					canSell = "(NOT SELLABLE)";
				}

				//Method output for each given object in the array
				System.out.println("Harvested by "+current.harvester+ " from Field "+current.field+" "+canSell);
			}
		}


}
