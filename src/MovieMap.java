import java.util.ArrayList;
import java.util.HashMap;

public class MovieMap {
    HashMap<String, Movie> myMovieMap;

    MovieMap() {
        myMovieMap = new HashMap<>();
    }

    public void add(Movie movie) {
        //Подумать о дубликате ключа (одинаковые наименования у разных фильмов)
        myMovieMap.put(movie.getName(), movie);
    }

    public void print() {
        for (Movie movie: myMovieMap.values()
             ) {
            System.out.println(String.format("\n%s\n", movie.print()));
        }
    }

    public ArrayList<String> find(String question) {
        ArrayList<String> findList = new ArrayList();
        for (String movieName: myMovieMap.keySet()){
            if (movieName.toLowerCase().contains(question)) {
                findList.add(movieName);
            }
        }
        return findList;
    }

    public Movie getMovie(String movieName) {
        return myMovieMap.get(movieName);
    }
}
