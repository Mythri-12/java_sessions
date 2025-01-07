public class Day_5_Loops {
    public static void main(String[] args) {

        //Strings
        String c = "classroom";
        System.out.println(c.length());

        System.err.println(c.charAt(0));

        //substring
        System.out.println(c.substring(2,3));
        System.out.println("hello".equals("hello"));
        System.out.println(c.substring(c.length() -1));

        // last three characters of any string,str
        String m = "string";
        System.out.println(m.substring(m.length()-3));


        System.out.println("a"+"b");
        String result = 1 + "b";
        System.out.println("hello"+(2+2));

        //for loop
        for(int count=1;count<=10;count++){   //c=2,3,4,5,6,7,8,9,10
            System.out.println("Objects");
        }

        //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        //stringTimes("Hi", 2) → "HiHi"
        //stringTimes("Hi", 3) → "HiHiHi"
        //stringTimes("Hi", 1) → "Hi"
        public String stringTimes(String str, int n) {
            String result = "";
            for (int i=0;i<n;i++){
              result = result + str;
            }
            return result;
          }      
          
          //Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
          //countXX("abcxx") → 1
          //countXX("xxx") → 2
          //countXX("xxxx") → 3

          int countXX(String str) {
            int count = 0;
            for (int i=0;i<str.length()-1;i++){
              if(str.substring(i,i+2).equals("xx")) count++;
            }
            return count;
          }
    }
    
}
