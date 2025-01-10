import java.util.ArrayList;
import java.util.List;

public class Day_8_leetcode {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String sOne = words[i];
            for(int j=0;j<words.length;j++){
                String sTwo = words[j];
                if(i!=j && sOne.length()<sTwo.length()){
                    //check if sOne is substring of sTwo
                    if(isSubstring(sOne,sTwo)){
                        result.add(sOne);
                        break;
                    }

                }

            }
            
        }
        return result;
    }
            //if sOne is substring of sTwo
            public boolean isSubstring(String sOne,String sTwo){
                for(int i=0;i<=sTwo.length()-sOne.length();i++){ //i=1
                    if(sOne.equals(sTwo.substring(i, sOne.length()+i))){
                        return true;
                        //0,4
                        //1,5
                        //2,6
                    }
                }
                return false;

            }
        }
    
      //.01234
//sTwo = morn inggood
//sOne = good

//if the length of stringOne is greater than the length
//of stringTwo
//mass
//as

//sTwo = morninggood
//sOne = good

    

