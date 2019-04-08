package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double hoursLearned;

    public Student() {
        this(null);
        this.hoursLearned = 0.0;
    }

    public Student(Integer id) {
        this.hoursLearned = 0.0;
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.hoursLearned += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.hoursLearned;
    }
}
