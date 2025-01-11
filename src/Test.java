public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Student std1 = new Student("myth",46,19,"cse");
        System.out.println(std1.toString());
        //std1.name = "Mythri";
        //std1.id = 20;
        /*std1.classNo = "G2";
        std1.dept = "CSE";
        System.out.println(std1.name);
        System.out.println(std1.id);
        System.out.println(std1.classNo);
        System.out.println(std1.dept);*/
        Student s2 = new Student("john",134,18,"AIML");
        /*s2.name = "Meena";
        s2.id = 378;
        s2.classNo = "G3";
        s2.dept = "AI";
        System.out.println(s2);
        Student s3 = std1;
        s3.name = "John";
        System.out.println(std1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);*/
    }
}
