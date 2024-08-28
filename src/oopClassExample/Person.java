package oopClassExample;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String cpf;
    private Address address = new Address();
    
    public Person() {
    	
    }
    
    public Person(String firstName, String lastName, int age, String cpf, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cpf = cpf;
        this.address = address;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setAddress(Address address) {
    	this.address = address;
    }
   

    public String getPerson() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cpf='" + cpf + '\'' +
                ", address=" + this.address.getAddress() +
                '}';
    }
}
