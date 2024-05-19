public class Menu extends Order{
    private char code;
    private double price;
    //default constructor
    public Menu(){
        code = '0';
    }
    //normal constructor
    public Menu(char code,double price){
        this.code = code;
        this.price = price;
    }
    // getter method
    public char getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }
    //display
    public void display(){

        System.out.println(" +--------------------------------------------------------------+ ");
        System.out.println(" |    CODE    |\t  MEAL MENU\t\t\t|  PRICE\t|");
        System.out.println(" +--------------------------------------------------------------+ ");
        System.out.println(" |     A      |   Spaghetti Chicken Meatball\t|  RM 10.00\t|");
        System.out.println(" |     B      |   Mac & Cheese\t\t\t|  RM 8.50\t|");
        System.out.println(" |     C      |   Chicken Chop\t\t\t|  RM 14.00\t|");
        System.out.println(" |     D      |   Fries\t\t\t\t|  RM 6.00\t|");
        System.out.println(" |     E      |   Fish Burger\t\t\t|  RM 9.00\t|");
        System.out.println(" +--------------------------------------------------------------+ ");


        System.out.println(" +--------------------------------------------------------------+ ");
        System.out.println(" |   CODE     |\tBEVERAGES MENU\t\t\t|  PRICE\t|");
        System.out.println(" +--------------------------------------------------------------+ ");
        System.out.println(" |     F      |\tEspresso\t\t\t|  RM 5.00\t|");
        System.out.println(" |     G      |\tHot Chocolate\t\t\t|  RM 4.00\t|");
        System.out.println(" |     H      |\tAmericano\t\t\t|  RM 4.50\t|");
        System.out.println(" +--------------------------------------------------------------+ ");
    }
    //decode method
    public double deCode(char code){

        if (code == 'A') {
            price = 10.00;
        }
        else if (code == 'B')
        {
            price = 8.50;
        }
        else if (code == 'C')
        {
            price = 14.00;
        }
        else if (code == 'D')
        {
            price = 6.00;
        }
        else if (code == 'E')
        {
            price = 9.00;
        }
        else if (code == 'F')
        {
            price = 5.00;
        }
        else if (code == 'G')
        {
            price = 4.00;
        }
        else if (code == 'H')
        {
            price = 4.50;
        }
        return price;
    }
}
