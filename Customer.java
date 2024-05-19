public class Customer {
    private String name;
    private String password;
    private String noPhone;

    //default constructor
    public Customer()
    {
        name="unknown";
        password=" ";
        noPhone=" ";
    }

    //normal constructor
    public Customer(String name, String password, String noPhone){
        this.name = name;
        this.password = password;
        this.noPhone = noPhone;
    }

    //setter method
    public void setCustomer(String name,String password,String noPhone)
    {
        this.name=name;
        this.password=password;
        this.noPhone=noPhone;
    }

    //getter methods
    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getNoPhone(){
        return noPhone;
    }

    //viewCustomer method
    public void viewCustomer(String N, String NP){
        System.out.println("\nName         : " + name);
        System.out.println("Phone number : " + noPhone);
    }
}