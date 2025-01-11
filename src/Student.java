public class Student {
        String name;
        int id;
        String classNo;
        String dept;
        int phNumber;
        int age;
    
        //role of constructor is to create and initialize an object
        public Student(String name,int id,int age,String dept){
            System.out.println("In class: "+this);
            this.name = name;
            this.id = id;
            this.age = age;
            this.dept = dept;
        }

        public void talking(){
         System.out.println("Students are talking");
        }
        public void makingnoise(){
            System.out.println("Students are makingnoise");
        }
        public void coding(){
            System.out.println("Students are coding");
        }
        public String toString(){
            return this.name +" "+this.id;
        }
}
//Class:A Class is just a design which tell how objects look like.   
