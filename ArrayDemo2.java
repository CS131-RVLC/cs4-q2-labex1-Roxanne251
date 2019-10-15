package arraydemo2;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    String Name;
    int Score;
    
   <your code>

}


public class ArrayDemo2 {
    static void display(ArrayList<Student> AS){
        <your code to display the array elements>
    }

    static ArrayList<Student> sortScores(ArrayList<Student> AS){
		<your code to sort the array>
        
    }
    static void searchHighestScore(ArrayList<Student> AS){
<your code to search for the highest score in the array>
    }

    static void sortNames (ArrayList<Student> AS){
		<your code to sort the array according the names>      
    }

    public static void main(String[] args) {
        ArrayList<Student> StudentArrayList = new ArrayList<>();

        for(int x=0; x<5; x++){StudentArrayList.add(new Student());}

  	 String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};

        StudentArrayList.get(0).Name = "Bok"; StudentArrayList.get(0).Score = 90;
        StudentArrayList.get(1).Name = "Mik"; StudentArrayList.get(1).Score = 96;
        StudentArrayList.get(2).Name = "Jak"; StudentArrayList.get(2).Score = 91;
        StudentArrayList.get(3).Name = "Luds"; StudentArrayList.get(3).Score = 97;
        StudentArrayList.get(4).Name = "Kim"; StudentArrayList.get(4).Score = 99;

        display(StudentArrayList);
        display(sortScores(StudentArrayList));
        sortNames(StudentArrayList);
        searchHighestScore(StudentArrayList);
    }
}
