public class Day_9_OOPS {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.name = "Mythri";
        s2.id = 378;
        s2.age = 18;
        s2.branch = "CSE";
        System.out.println(s2);
        Student s3 = s2;
        s3.name = "John";
        System.out.println(std1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
