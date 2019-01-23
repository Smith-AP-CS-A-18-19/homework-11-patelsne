import java.util.ArrayList;

public class Homework11A extends Homework11{
  public Homework11A(){
    super();
  }


      public int problem4(){
        int answer = 0;
        for(int i = 0; i < getList().size(); i++){
          int add = getList().get(i);
          answer += add;
        }
        return answer;
      }
      public void problem2(int n) {
        int i = 0;
        while (i < getList().size()){
          int x = getList().get(i);
          if(n % x != 0){
           getList().remove(i);
         } else{
           i++;
         }
       }
     }
}
