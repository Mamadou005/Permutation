public class NbEntier{
    private int val;
    public NbEntier(){
      val =0;
    }
    public NbEntier(int Val){
        val=val;  
    }
    public int setValue(int newVal){
        int oldVal=val;
        val=newVal;
        return oldVal;
  }
    public int getValue(){
        return val;
  }  
}


