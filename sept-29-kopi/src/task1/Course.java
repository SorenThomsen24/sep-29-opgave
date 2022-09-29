package task1;

public class Course {
    private String name;

    public Course (String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "task1.Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
