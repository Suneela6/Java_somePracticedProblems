class ThisIsString{  
 int rollno;  
 String name;  
 String city;  
  
 ThisIsString(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
   ThisIsString s1=new ThisIsString(101,"Raj","lucknow");  
   ThisIsString s2=new ThisIsString(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  