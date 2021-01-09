package com.company;

public class Son extends Father {

    private int milkTeeth;

    public Son(String name, String surname, int age, int milkTeeth) {
        super(name, surname, age);
        this.milkTeeth = milkTeeth;
    }

    public void ShowInfo (){
        super.ShowInfo();
        System.out.println("Son`s name - " + /*getName() + "\n" +
                "Son`s surname - "+ getSurname() + "\n" +
                "Son`s age - " + getAge() + "\n" +*/
                "Ammount son`s milk teeth - " + milkTeeth);
    }

    public void ShowUp(String Otchestvo) {
        Otchestvo = "Petrovich";
        System.out.println("\n" + "Son`s otchestvo - " + Otchestvo);
    }



}
