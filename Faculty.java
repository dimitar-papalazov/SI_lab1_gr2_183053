import java.util.List;

public class Faculty {
    List<Student> students;
    String name;

    public Faculty(List<Student> students, String name) {
        this.students = students;
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String removeStudent(Student student) {
        students.remove(student);
        return student.getFirstName() + student.getLastName();
    }

    public double averageStudentsGrade() {
        double sum = 0.0;
        for (Student s : students) {
            sum += s.getAverage();
        }
        return sum / students.size();
    }

    public double averageStudentsECTSCredits() {
        double sum = 0.0;
        for (Student s : students) {
            sum += s.ECTSCredits();
        }
        return sum / students.size();
    }

    public Student bestStudent() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getAverage() > best.getAverage()) {
                best = s;
            }
            else if (s.getAverage() == best.getAverage()) {
                if (s.ECTSCredits() > best.ECTSCredits())
                    best = s;
            }
        }
        return best;
    }
}
