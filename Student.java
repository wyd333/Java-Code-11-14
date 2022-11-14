public class Student {
    public String name;
    public int age;
    public static String classRoom;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student.classRoom = "bit306";

        System.out.println(Student.classRoom);
        System.out.println("s1 "+s1.classRoom);
        System.out.println("s2 "+s2.classRoom);
        System.out.println("111");
    }
}
