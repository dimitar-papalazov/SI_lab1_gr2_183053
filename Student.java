import java.util.List;

class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> grades;

    public Student(String index, String firstName, String lastName, List<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        int sum = 0;
        for (Integer i : grades) {
            sum += i;
        }

        return (double) (sum / grades.size());
    }

    public int ECTSCredits() {
        int count = 0;
        for (Integer i : grades) {
            if (i > 5 && i <= 10) {
                count++;
            }
        }
        return count * 6;
    }
}
