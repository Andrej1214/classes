package by.htp.les20.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TrainAction {

	public void printTrainNumber(Train[] m) {

		System.out.println("Введите три цифры номера поезда");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число. Попробуйте ещё раз");
			sc.nextLine();
		}

		Integer a = sc.nextInt();

		while (a.toString().length() != 3) {
			System.out.println("Вы ввели не трехзначное число. Попробуйте ещё раз");
			sc.nextLine();
			a = sc.nextInt();
		}

		for (int i = 0; i < m.length; i++) {

			if (a == m[i].getTrainNumber()) {
				switch (a) {
				case 708:
					System.out.println(m[i].toString());
					break;
				case 555:
					System.out.println(m[i].toString());
					break;
				case 993:
					System.out.println(m[i].toString());
					break;
				case 100:
					System.out.println(m[i].toString());
					break;
				case 459:
					System.out.println(m[i].toString());
					break;
				default:
					System.out.println("Поезда с таким номером не существует. Попробуйте ещё раз");

				}
				break;
			}
			while ((i + 1) == m.length) {
				System.out.println("Поезда с таким номером не существует. Начните сначала");
				break;
				
			}
		}
	}

	public void sortOfStation(Train[] n) {
		StationComparator sC = new StationComparator();
		Arrays.sort(n, sC);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i].toString());
		}
	}
	public void sortOfStationAndTime (Train [] n) {
		Comparator<Train> tVR = new StationComparator().thenComparing(new DateComparator());
		Arrays.sort(n,tVR);
		for(int i=0; i<n.length;i++) {
			System.out.println(n[i].toString());
		}
	}
}
