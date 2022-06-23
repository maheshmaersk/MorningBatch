package collectionsSample;

public class Student {

    private String name;
    private int id;
    private float cgpa;

    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
