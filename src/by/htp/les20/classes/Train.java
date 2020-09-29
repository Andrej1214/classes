package by.htp.les20.classes;

import java.util.Date;

public class Train implements Comparable<Train>{
	private String destStation;
	private int trainNumber;
	private Date departureTime;
	
	public Train() {
		
	}
	public Train(String s, int a, Date d) {
		this.destStation = s;
		this.trainNumber = a;
		this.departureTime = d;
	}

	public String getDestStation() {
		return destStation;
	}
	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	@Override
	public String toString() {
		return "Train [destStation=" + destStation + ", trainNumber=" + trainNumber + ", departureTime=" + departureTime
				+ "]";
	}
	
	public int compareTo (Train anotherTrain) {
		if(this.trainNumber==anotherTrain.trainNumber) {
			return 0;
		}else if(this.trainNumber>anotherTrain.trainNumber) {
			return 1;
		}else {
			return -1;
		}
	}
	 public void printInfoTrain() {
		 
	 }
}
