package p2;

public class D {
    private E objE =new E();
     private class E{

         private class F{

             private int x = 100;
             public void setX(int x){
                 this.x = x;
             }
             public int getX(){
                 return this.x;
             }
         }
         private F innerF = new F();
         public void setInF(int x){
             innerF.setX(x);
         }
         public int getInF(){
             return innerF.getX();
         }
     }
     public void writeX(int x){
         objE.setInF(x);
     }
     public int readX(){
         return objE.getInF();
     }

}
