public class Movie {
    String name;
    String janre;
    String description;


    public Movie(String nameValue, String janreValue, String discriptionValue) {
        name = nameValue;
        description = discriptionValue;
        janre = janreValue;
    }

    public Movie(String nameValue, String janreValue) {
        this(nameValue, janreValue, "");
    }

    public Movie(String nameValue) {
        this(nameValue, "");
    }

    public String getName() {
        return this.name;
    }

    public String getJanre(){
        return this.janre;
    }

    public String getDescription() {
        return this.description;
    }

    public String print() {
        StringBuilder myBuild = new StringBuilder();
        return myBuild.append(String.format("%s\n(Жанр: %s)\n%s",this.getName(),this.getJanre(),this.getDescription())).toString();
    }

}

