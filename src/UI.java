import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    boolean flag;
    MovieMap movieMap;
    Scanner scanner;


    UI (MovieMap inputMovieMap) {
        flag = true;
        movieMap = inputMovieMap;
        scanner = new Scanner(System.in);
    }

    public void run()
    {
        System.out.println("Добро пожаловать в Киносписок\n============================.");
        while (flag) {
            ShowMenu();
            useCommand(takeCommand());
        }
    }

    void ShowMenu() {
        System.out.println("" +
                "1.Показать Весь список фильмов\n" +
                "2.Найти фильм(ы) по названию\n" +
                "3.Добавить фильм\n" +
                "4.Выход");
    }

    String takeCommand() {
        System.out.print("Введите номер команды: ");
        return scanner.nextLine();
    }

    void useCommand(String command) {
        switch (command){
            case "1": {
                movieMap.print();
                break;
            }
            case "2": {
                findMovie();
                break;
            }
            case "3": {
                addMovie();
                break;
            }
            case "4": {
                System.out.println("Возвращайтесь к нам снова.");
                flag = false;
                break;
            }
            default: {
                System.out.println("\nТакой команды нет в меню\n");
                break;
            }

        }
    }


    void findMovie() {
        System.out.print("Введите название или часть названия фильма, который вы ищите:");
        ArrayList<String> findResult = movieMap.find(scanner.nextLine().toLowerCase());
        for (String movieName:findResult) {
            System.out.println(String.format("\n%s\n", movieMap.getMovie(movieName).print()));
        }
    }


    void addMovie() {
        System.out.println("Введите название фильма: ");
        String name = scanner.nextLine();
        System.out.println("Введите жанр фильма: ");
        String janre = scanner.nextLine();
        System.out.println("Введите описание фильма: ");
        String discription = scanner.nextLine();
        movieMap.add(new Movie(name, janre, discription));
    }

}


