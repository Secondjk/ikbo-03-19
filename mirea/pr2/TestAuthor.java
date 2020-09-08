package ru.mirea.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Author", "abc@abc.ru", 'M');
        System.out.println(author);
        author.setEmail("abc");
        System.out.println(author);
    }
}
