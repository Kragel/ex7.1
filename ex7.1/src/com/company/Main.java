package com.company;

public class Main {

    private String surname, name, country;
    private Alena a;
    public Main()
    {
        System.out.println("Описание ");
        surname = "Крагель";
        name = "Алёна";
        country = "Беларусь";
    }
    public String toString()
    {
        if(a == null) // lazy (delayed) initialization:
            a = new Alena();
        return "surname = " + surname + ", " +
                "name = " + name + ", " +
                "country= " + country + ", " +
                "town = " + a;
    }
    public static void main(String[] args)
    {
        Main N1234 = new Main();
        System.out.println(N1234);
    }
}
