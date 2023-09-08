import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Game2 class containing the game logic and methods for the game - "Guess The Movie"
 */
public class Game2 {
    public static void main(String[] args) throws IOException {
//Cach1 dung Scanner
        List<String> movies= new ArrayList<>();
        File movieDatabase = new File("movies.txt");
        try {
            Scanner movieDatabaseScanner = new Scanner(movieDatabase);
            while (movieDatabaseScanner.hasNextLine()) {
                String line = movieDatabaseScanner.nextLine();
                movies.add(line);
            }
            movieDatabaseScanner.close();

            //Returns a string with a random movie title from the list.
        int movieIndex = (int) (Math.random()*movies.size());
        String randomMovies = movies.get(movieIndex);
            System.out.println(randomMovies);
        String results = randomMovies.replaceAll("[a-zA-Z]","_") ;
            System.out.println("You are guessing: "+ results);

       int wrong = 0;
        for (int i = 0; i < results.length(); i++){
            System.out.print("Guess a letter: ");
            Scanner scanner= new Scanner(System.in);
            String letter = scanner.nextLine().toLowerCase();

            if (randomMovies.toLowerCase().contains(letter.toLowerCase()))
            {

            }
        for
        }


        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }



  /* Cach2  dung readLine
        File file = new File ("movies.txt");
        try{
            BufferedReader br= Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null){
                    break;
                } else {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("File does not exist!");
        }

   */
        // cach3 dung readALLLines
/*
    File file = new File("movies.txt");
    try {
        List<String> allText = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
        for (String line : allText){
            System.out.println(line);
        }
    } catch (FileNotFoundException e){
        System.out.println("File does not exist!");
    }


 */
    }
}


