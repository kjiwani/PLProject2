package kothari;

public abstract class Person {

    // setting instance variables
    private String f_name;
    private String l_name;
    private String email;

    // get and set methods to provide access to instance variables
    public void setF_name(String f_name){
        this.f_name = f_name;
    }

    public String getF_name(){
        return f_name;
    }

    public void setL_name(String l_name){
        this.l_name = l_name;
    }

    public String getL_name(){
        return l_name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    // get name and email address
    public String getNameAndEmail(){
        return(
                "Name: " + f_name + ' ' + l_name + '\n' + "Email: " + email;
        )
    }

    public abstract void String getDisplay();



}
