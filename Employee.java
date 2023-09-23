public class Employee {
    static int id;
    static String name;
    static double salary;
    static Address address;
    public  Employee(int id,String name,double salary,Address address){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address = address;
    }
  void display(){
            System.out.println(id+" "+name+" "+salary);
            System.out.println(address.city+" "+address.state+" "+address.country);
    }
 
    public static void main(String[] args) {
        Employee e4 = new Employee(id, name, salary, address);
        Address a1 = e4.new Address("vzm","andhrapradesh","india");
        Address a2 = e4.new Address("srikakulam","kalam","kashi");
        
        Employee e1 = new Employee(101,"sunee",56.9,a1);
        Employee e2 = new Employee(102,"loki",34.7,a2);
        e1.display();
        e2.display();
    }
        public class Address {  
        String city,state,country;  
          
        public Address(String city, String state, String country) {  
            this.city = city;  
            this.state = state;  
            this.country = country;  
        }  
          
        } 
}
