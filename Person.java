public class Person
{
    private String Firstname;
    private String Lastname;
    private int Age;
    private int SSN;
    public Person(String first, String last, int age, int social){
        Firstname = first;
        Lastname = last;
        Age = age;
        SSN = social;
    }

    public void print(){
        System.out.print("SSN: "+SSN+"\n	Name: "+Firstname+" "+Lastname+"\n	age: "+Age+"\n");

    }
}
