package by.htp.les20.classes;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int grupNumber;
	private int [] note;
	
	public Student() {
		
	}
	public Student(String name, int grupNumber, int[] note) {
		super();
		this.name = name;
		this.grupNumber = grupNumber;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrupNumber() {
		return grupNumber;
	}

	public void setGrupNumber(int grupNumber) {
		this.grupNumber = grupNumber;
	}

	public int[] getNote() {
		return note;
	}

	public void setNote(int[] note) {
		this.note = note;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grupNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(note);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grupNumber != other.grupNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(note, other.note))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grupNumber=" + grupNumber + ", note=" + Arrays.toString(note) + "]";
	}

	public boolean findBest(int[] a) {
		int n = 0;
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 9) {
				m=0;
			} else {
				m++;
			}
			n=n+m;
		}
		if (n == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	
}
