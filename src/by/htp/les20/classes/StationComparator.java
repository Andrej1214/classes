package by.htp.les20.classes;

import java.util.Comparator;

public class StationComparator implements Comparator<Train> {
	public int compare(Train t1, Train t2) {
		return t1.getDestStation().compareTo(t2.getDestStation());
	}

}
