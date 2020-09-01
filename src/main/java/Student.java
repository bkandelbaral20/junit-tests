import java.util.ArrayList;

public class Student {
// id should be a long number used to represent a "unique user" in our application.
private final long id;
//name is a String that holds the name of the student.
 private String name = "";
//grades is an ArrayList that contains a list of Integer numbers.
private ArrayList<Integer> grades = new ArrayList<>();

    //constructor
    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

// returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
         grades.add(grade);
    }

    //returns the average of the students grades
    public double getGradeAverage(){
        double totalSum = 0;
        for (double grade : grades) {
            totalSum += grade;
        }
        return totalSum / grades.size();
        }


}
