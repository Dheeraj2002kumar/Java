// Class "Person"
class Person {
    private String name;
    private int age;
  
    // Setter Methods
    public void setName(String name) {
      this.name = name;
    }
    public void setAge(int age) {
      this.age = age;
    }
  
    // Getter methods
    public String getName() {
      return this.name;
    }
  
    public int getAge() {
      return this.age;
    }
  }
  
  // The Main class to test encapsulated class "Person"
  public class Hello {
    public static void main(String args[]) {
      // Objects to Person class
      Person per1 = new Person();
      Person per2 = new Person();
  
      // Setting the values
      per1.setName("Robert");
      per1.setAge(21);
  
      per2.setName("Riyan");
      per2.setAge(22);
  
      // Printing the values
      System.out.println("Person 1: Name : " + per1.getName() + " Age : " + per1.getAge());
      System.out.println("Person 2: Name : " + per2.getName() + " Age : " + per2.getAge());
    }
  }