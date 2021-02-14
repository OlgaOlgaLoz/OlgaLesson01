package cat1;

public class Cats {
   private String name;
   private int year;
   private String poroda;
   private String color;
//equals() hashCode() toString()
     public Cats(String name, int year, String poroda, String color){
         this.name=name;
         this.year=year;
         this.poroda=poroda;
         this.color=color;
     }
    public Cats(){

    }
   public void setName(String name){
         this.name=name;
   }
 public String getName(){return this.name;}

   public void setYear(int year){
         this.year=year;
   }
 public int getYear(){
         return year;
 }

    public void setPoroda(String poroda){
         this.poroda=poroda;

    }
    public String getPoroda() {
        return this.poroda;
    }
    public void setColor(String color){
         this.color=color;
    }
    public String getColor(){
         return color;
    }
    @Override
    public String toString() {
        String s1;
        System.out.println("Имя "+name);

        if (year==1)
            s1=" год";
        else if (year==2 | year==3 | year==4)
            s1=" года";
        else
            s1=" лет";
       return name+" "+year+s1+" "+poroda+" "+color;
    }

}
