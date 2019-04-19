package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class TheShawshankRedemption extends BaseWrapper {

    private String movieDuriationInMinutes;
    private String movieDuriationInSeconds;
    private String movieRating;
    private String typeOfMovie;
    private String movieTrailer;
    private String moviePoster;
    private String fiveMovieActors;
    private String metascoreRating;
    private String reviewsNumber; // Кол-во ревью (отдельно пользовательских, отдельно критиков, сумму пользовательских и критиков)
    private String namesOfThreeSimiliarMovies; //Названия 3х "похожих" фильмов

    @Test
    public void shawshankRedemption() {

        // Finding and printing Movie Name
        driver.get("https://www.imdb.com/title/tt0111161/");
        WebElement movieName = driver.findElement(By.xpath("//*[@class='title_wrapper']/h1"));
        System.out.println("Movie name is " + movieName.getText());

        // Finding and printing Release Date
        WebElement releaseDate = driver.findElement(By.cssSelector(".subtext > a:last-child"));
        System.out.println("Release date is " + releaseDate.getText());

        // Finding and printing Release Date
       // WebElement releaseDate = driver.findElement(By.cssSelector(".subtext > a:last-child"));
       // System.out.println("is duration movie in Minutes " + releaseDate.getText());
    }
}