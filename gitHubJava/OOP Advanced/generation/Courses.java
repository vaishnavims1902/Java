package generation;

public class Courses {
 private String name;
 private int credits;
 private String professorName;

 public Courses(String name, int credits, String professorName) {
     this.name = name;
     this.credits = credits;
     this.professorName = professorName;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getCredits() {
     return credits;
 }

 public void setCredits(int credits) {
     this.credits = credits;
 }

 public String getProfessorName() {
     return professorName;
 }

 public void setProfessorName(String professorName) {
     this.professorName = professorName;
 }
}
