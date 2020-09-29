package by.htp.les20.classes;

public class StudentMain {

	public static void main(String[] args) {
		
		 Student [] studentGroup = new Student [10]; 

		 studentGroup[0] = new Student ("Ivanov",427,new int []{7,8,5,4,9,10,8});
		 studentGroup[1] = new Student ("Petrov",459,new int []{10,9,10,10,10,9,10});
		 studentGroup[2] = new Student ("Zubov",952,new int []{7,8,8,9,9,10,8});
		 studentGroup[3] = new Student ("Chalov",112,new int []{9,9,9,9,9,9,9});
		 studentGroup[4] = new Student ("Bruzga",789,new int []{7,8,6,9,9,9,9});
		 studentGroup[5] = new Student ("Gromov",901,new int []{10,10,10,10,10,9,10});
		 studentGroup[6] = new Student ("Kotov",831,new int []{7,8,5,4,9,10,8});
		 studentGroup[7] = new Student ("Orlov",795,new int []{9,8,9,10,9,10,8});
		 studentGroup[8] = new Student ("Snegin",257,new int []{9,10,10,10,9,10,10});
		 studentGroup[9] = new Student ("Fitin",555,new int []{8,10,9,10,8,10,10});
		 
		 for(Student f: studentGroup) {
			 System.out.println(f);
		 }
		 
		 System.out.println("-------------------");
		 StudentAction sa = new StudentAction();
		 sa.findBestStudent(studentGroup);
		 //использование того или иного метода определяется полнотой необходимых сведений
		  System.out.println("--****----------****--");
		  sa.Best(studentGroup);
	 }

}
