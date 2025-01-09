public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Student std1 = new Student();
        System.out.println(std1.name);
        std1.name = "Mythri";
        std1.id = 20;
        std1.classNo = "G2";
        std1.dept = "CSE";
        System.out.println(std1.name);
        System.out.println(std1.id);
        System.out.println(std1.classNo);
        System.out.println(std1.dept);
    }
}
