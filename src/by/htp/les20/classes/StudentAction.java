package by.htp.les20.classes;

public class StudentAction {

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

	public void findBestStudent(Student[] s) {
		for (int i = 0; i < s.length; i++) {
			int[] m = s[i].getNote();
			int k = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j] >= 9) {
					k++;
				}

			}
			if (k == 7) {
				System.out.println("Фамилия= " + s[i].getName() + " номер группы= " + s[i].getGrupNumber());
			}
		}
	}

	public void Best(Student [] st) {
		for(int i=0;i<st.length;i++){
			if(st[i].findBest(st[i].getNote())) {
			
		System.out.println(st[i].getName());
		}
		}	
	}
			
	}

