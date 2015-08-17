package kamaljitcdotCom;

public class dotComs1 {
	
	private static int hitCounter = 0;
	//static String[][] hitLocate = new String[3][3];
	
	private static String dotComs[][]= {
			{"Kamaljit.com", "A0", "A1", "A2"}, 
			{"battleship.com", "D0", "D1", "D2"}, 
			{"cruiser.com","G0", "G1", "G2"}
			};
	
	@SuppressWarnings("unused")
	private static void printTheInfo() {
		
		for (int i = 0; i<= 2; i++){
			for(int j = 0; j <= 3; j++) {
				System.out.print(dotComs[i][j] + "  ");
			}
			System.out.println();
		}
	}

	
	
	public static boolean equalsIgnoreCase(String entry) {
		int hitCheck = 0;
		
		
		for (int i = 0; i<= 2; i++){
			for(int j = 1; j <= 3; j++) {
				//hitLocate[i][j-1] = dotComs[i][j];
				if (entry.equalsIgnoreCase(dotComs[i][j])) {
					hitCounter++;
					hitCheck++;
					//dotComs[i][j] = null;
				}
			}
		}
		if (hitCheck != 0) {
			return true;
		} else return false;		
	}

	
	public static int getHitCounter() {
		return hitCounter;
	}


	public static void setHitCounter(int hitCounter) {
		dotComs1.hitCounter = hitCounter;
	}


}
