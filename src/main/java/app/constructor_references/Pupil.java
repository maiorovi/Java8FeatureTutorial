package app.constructor_references;

public class Pupil {

    private String id;
    private int age;
    private String className;
    private double averageMark;

    public Pupil() {}

    public Pupil(String id) {
        this.id = id;
    }

    public Pupil(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public Pupil(String id, int age, String className) {
        this.id = id;
        this.age = age;
        this.className = className;
    }
}
