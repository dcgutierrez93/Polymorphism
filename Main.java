// Polymorphism allows actions to act differantly based on the actual action that
// the object is used.
class Movie {
    private String name;
    // Constructor
    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }

    // Getter for the name field.
    public String getName() {
        return name;
    }
}

// Create Movie Classes.
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    // Method
    public String plot() {
        return "A shark eats lots of people";
    }
}
class IndependanceDay extends Movie {

    public IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}
class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot Method.
}


public class Main {

    public static void main(String[] args) {
        for (int i = 1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                                " : " + movie.getName() + "\n" +
                                // How Polymorphism works. Looking at object called Movie
                                // has it got a plot method execute returns plot.
                                "Plot: " + movie.plot() + "\n");
        }
    }

    // Return a random movie.
    public static Movie randomMovie() {
        // Return Random Number.
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }
        return null;
    }
}
