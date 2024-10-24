// Violating SRP
//public class StudentService {
//    public void addStudent(String name) { /* logic to add student */ }
//    public void generateStudentReport(String studentName) { /* logic to generate report */ }
//}
// Refactored to follow SRP
public static void main(String[] args) {


    class StudentService {
        public void addStudent(String name) { /* logic to add student */ }
    }

    class reportservice {
        public void generateStudentReport(String studentName) { /* logic to generate report */ }
    }

}