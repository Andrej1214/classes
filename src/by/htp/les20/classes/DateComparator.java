package by.htp.les20.classes;

import java.util.Comparator;

public class DateComparator implements Comparator<Train>{
	@SuppressWarnings("deprecation")
	public int compare(Train t1,Train t2) {
		return t1.getDepartureTime().getHours()-(t2.getDepartureTime().getHours());
	}

}
