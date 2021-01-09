
package com.company;
public class Father {

    private String name;
    private String surname;
    private int age;

    public Father() {
    }

    public Father(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

/*    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public void ShowInfo (){
        System.out.println("\n" + "Father`s name - " + name + "\n" +
                "Father`s surname - "+ surname + "\n" +
                "Father`s age - " + age);
    }

    public void ShowUp() {
        String Otchestvo = "Igorevich";
        System.out.println("\n" + "Father`s otchestvo - " + Otchestvo);
    }

    public static class Builder {
        private Father newFather;

        public Builder() {
            newFather = new Father();
        }

        public Builder withName (String name){
            newFather.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newFather.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newFather.age = age;
            return this;
        }

        public Father build(){
            return newFather;
        }




    }

}
