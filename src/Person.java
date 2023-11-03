
public class Person {
    private int id;
    private String name;
    private int age;
    private boolean parentPermission;

    public Person(int id, String name, int age, boolean parentPermission) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
    }

    public Person(int id, int age, boolean parentPermission) {
        this(id, "Unknown", age, parentPermission);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean ofAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return ofAge() || parentPermission;
    }
//main methods on person class
    public static void main(String[] args) {
        // Creating instances of Person, Student, and Teacher classes
        Person person = new Person(1, "Urena", 25, true);
        Student student = new Student(2, "Baye", 19, true, "Class A");
        Teacher teacher = new Teacher(3, "Mr. Ermiyas", 35, false, "Mathematics");

        // Accessing methods and printing information
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
        System.out.println("Can Person Use Services?: " + person.canUseServices());

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Classroom: " + student.getClassroom());
        System.out.println("Can Student Use Services?: " + student.canUseServices());

        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Teacher Age: " + teacher.getAge());
        System.out.println("Teacher Specialization: " + teacher.getSpecialization());
        System.out.println("Can Teacher Use Services?: " + teacher.canUseServices());
    }
}