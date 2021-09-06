public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Victor", "vic@mail.ru", 'M');
        System.out.println(author);
        author.setEmail("victor@yandex.ru");
        System.out.println(author);
    }
}
