package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Oleg", "Liker1337@sobaka.tochka", 'm');
        System.out.println(author.getName() + " " + author.getGender() + " " + author.getEmail());
        author.setEmail("no email");
        System.out.println(author.toString());


    }

}
