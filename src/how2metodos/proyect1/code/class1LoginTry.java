package how2metodos.proyect1.code;
public class class1LoginTry {
    
    String user;
    String password;

    //constructor de user y password
    public class1LoginTry(String user, String password) {
        this.user = user;
        this.password = password;
    }

    //inicio de getters y setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //fin de getters y setters
    
    //metodo para saber si metó usuario y contraseña bien
    public boolean loginTry(){
        
        boolean selection = false;
        
        if ("admin".equals(user) && "1234".equals(password)){
            selection = true;
        }
        
        else{
            selection = false;
        }
        
        return selection;
    }
    
    
}
