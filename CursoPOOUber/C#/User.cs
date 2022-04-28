using System;


public class User:Account
{
    string name;
    string document;
    string email;

    public Account(string name, string document, string email )
    {
        this.name = name;
        this.document = document;
        this.email = email;
    }
}