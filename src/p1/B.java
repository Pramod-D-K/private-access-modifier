package p1;

public class B {
    private int num;
    public void setNum(int num){
        this .num = num;
    }
    public int getNum(){
        return this.num;
    }
     private class C{
         private String name;
         private String Education;

         public void setName(String name ){
             this.name = name;
         }
         public void setEducation(String Education ){
             this.Education = Education;
         }
         public String getName(){
             return this .name;
         }
         public String getEducation(){
             return this.Education;
         }
     }
     private C obj = new C();
     public void setEdu(String Education){
//        C obj =new C();
        obj.setEducation(Education);
     }
    public void setName(String name){
//        C obj =new C();
        obj.setName(name);
    }
    public String getEdu(){
//        C obj =new C();
        return obj.getEducation();
    }
    public String getName(){
//        C obj =new C();
        return obj.getName();
    }
}
