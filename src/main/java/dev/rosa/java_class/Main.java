package dev.rosa.java_class;


public  final class Main {
    
    public static void main(String[] args) {

        Person person = new Person("Rosa", "Cando", "12345678C", 27/01/1993);
            
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());        
        System.out.println("Id: " + person.getIdNumber());
        System.out.println("DateOfBirth: " + person.getDateOfBirth());
    }
}
