package how2metodos.proyect1.code;
public class class2Methods {

    //definition of variables of the constructor
    String name;
    int amount;
    int price;

    //empty constructor for the creation of the object in the source of the frame
    public class2Methods() {
    }
    
    //constructor of the class
    public class2Methods(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    //start of the getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //finish of the setters and gettersS
    
    //method to know if the object was created succesfull
    public boolean isCreated(){
        
        //variable to return 
       boolean selection;
        
       //aqui esto esta mal colocado, esto hay que hacerlo con el do while
       //condition for seleccion(not empty basicaly)
        if (!"".equals(this.name) && this.amount != 0 && this.price != 0){
            selection = true;
        }
        
        else{
            selection = false;
        }
        
        return selection;
    }

}
