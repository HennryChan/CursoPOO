using System;

 public class Account{
    int id;
    string name;
    string document;
    string email;
    string password;

    public Account(string name, string document, string email){
        this.name = name;
        this.document = document;
        this.email = email;
    }

    public void impresion(){
        Console.WriteLine("Nombre: " + name + " CURP: " + document + " Gmail: " + email);
        
    }

}