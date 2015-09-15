class Student{
  int id;
  String name;
  int age;
  static String college = "UTA";

Student(int r, String n){
  id = r;
  name = n;
}

Student(int r, String n, int a ){
  id = r;
  name = n;
  age = a;
}

void displayInformation(){System.out.println(id+" "+name+" "+age+" "+college);}
 
public static void main(String args[]){	
 Student s1 = new Student(1000996623, "ALOK", 26);
 Student s2 = new Student(4553777, "Richa");


s1.displayInformation();
s2.displayInformation();
        
}
  
}
