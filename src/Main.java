public class Main {
    public static void main(String[] args) {
        Author pushkinAS = new Author("Александр", "Пушкин");
        Author bulgakov = new Author("Михаил", "Булгаков");

        Book onegin = new Book("Евгений Онегин", pushkinAS, 1821);
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1953);

        System.out.println(onegin);
        System.out.println(masterAndMargarita);

        masterAndMargarita.setYearOfPublication(1959);
        System.out.println(masterAndMargarita);

    }
}