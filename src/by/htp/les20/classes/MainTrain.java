package by.htp.les20.classes;


import java.util.Date;

public class MainTrain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Train [] tr = new Train [5];
		
		tr[0] = new Train("Gomel", 459, new Date (120,6,27,12,15));
		tr[1] = new Train("Brest", 100, new Date (120,7,21,5,45));
		tr[2] = new Train("Brest", 555, new Date (120,8,12,21,10));
		tr[3] = new Train("Brest", 708, new Date (120,7,19,8,20));
		tr[4] = new Train("Grodno", 993, new Date (120,5,7,17,30));
		
		TrainAction tA = new TrainAction();
		tA.sortOfStation(tr);
		System.out.println("---------------");
		tA.printTrainNumber(tr);

	}	
	
}
