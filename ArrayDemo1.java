package arraydemo1;
import java.util.*;

class Student {
    String Name;
    int Score;
    
    
    public void displayArray(ArrayList<Student> AS) {
<your code to display the array elements>

    }
    
     public void searchHighestScore(ArrayList<Student> AS) {
<your code to search for the highest score in the array>

    }    
    public void sortScores(ArrayList<Student> AS) {
        	<your code to sort the array>

    }
    
    public void sortNames(ArrayList<Student> AS) {
<your code to sort the array according the names>      
   }
}

public class ArrayDemo1 {
    public static void main(String[] args) {
        String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};
        
        ArrayList<Student> StudentArrayList = new ArrayList<Student>();
        for (int i = 0; i <= 4; i++) {
            StudentArrayList.add(new Student());
            StudentArrayList.get(i).Name = NameI[i];
            StudentArrayList.get(i).Score = ScoreI[i];
        }
        
       
        Student method = new Student();

        method.displayArray(StudentArrayList);

        method.searchHighestScore(StudentArrayList);

        method.sortScores(StudentArrayList);
        
        method.displayArray(StudentArrayList);

        method.sortNames(StudentArrayList);
        
        method.displayArray(StudentArrayList);        
        
   
    }
}

