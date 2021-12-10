package com.humanbooster.monpetitprojet;


public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean employee = true;
    private String category;
    private Book book;

    public void displayInfos() {
        String resultat = "Je m'appelle " + this.firstName + " " + this.lastName +
                " et j'ai " + this.age + " ans et je suis donc " + category;

        if (employee == true) {
            resultat = resultat + " et je suis employé";
            // OU: resultat += " et je suis employé";
        } else {
            resultat = resultat + " et je suis hélas, au chomage (mais plus pour très longtemps)";
        }
        System.out.println(resultat);
    }


    public Person(String firstName, String lastName, int age, Book book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setAge(age);
        this.book = book;
    }

    public void setAge(int age) {
        this.age = age;
        if(this.age > 18) {
            this.category = "majeur";
        }else{
            this.category = "mineur";
        }
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", employee=").append(employee);
        sb.append(", category='").append(category).append('\'');
        sb.append(", book=").append(book);
        sb.append('}');
        return sb.toString();
    }
}
