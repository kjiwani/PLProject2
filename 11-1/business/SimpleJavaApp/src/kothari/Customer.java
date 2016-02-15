package kothari;

public class Customer extends Person{

    private int cust_num = 0;

    public static getCustNum(){
        return cust_num;
    }

    public static setCustNum(int number){
        cust_num = this.number;
}

    //this should match with the Person class
    public static getDisplay(){
        person.getNameAndEmail() + "/n" + "Customer Number: " + cust_num;
    }
}
