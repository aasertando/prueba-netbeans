package clases;
public class class2Methods {

    //definition of variables of the constructor
    String name;
    int amount;
    int price;
    int codigo;

//    //empty constructor for the creation of the object in the source of the frame
//    public class2Methods() {
//    }
//    
    //constructor of the class
    public class2Methods(String name, int amount, int price/*, int codigo*/) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        /*this.codigo = codigo;*/
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
/*
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   */ 
    
    //finish of the setters and gettersS
    

       //aqui esto esta mal colocado, esto hay que hacerlo con el do while
       //condition for seleccion(not empty basicaly)

   
    //metodo que hace que la variable codigo vaya de 1 en 1
//    public void añadirCodigo(){
////        codigo = 0;
//        setCodigo(codigo++);
//    }
    

}
