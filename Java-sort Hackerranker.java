import java.util.*;
class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        List<Student> studentList = new ArrayList<>();
        while (testCases-- > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            studentList.add(new Student(id, fname, cgpa));
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // CGPA: descending
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }
                // First name: ascending
                int nameCompare = s1.getFname().compareTo(s2.getFname());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                // ID: ascending
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
        in.close();
    }
}