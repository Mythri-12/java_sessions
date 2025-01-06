public class Day_4_Conditional {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
          if(cigars>=40){
            return true;
          }else{
            return false;
          }
        }else{
          if(cigars>=40 && cigars<=60){
            return true;
          }else{
            return false;
          }
        }
      }
}