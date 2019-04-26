package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;


/*
Написать программу которая выведет на экран информацию о фильме.
Ссылка на страницу фильма: https://www.imdb.com/title/tt0111161/

1. Название фильма
2. Дата выхода
3. Продолжительность фильма в минутах. Продолжительность фильма в секундах.
4. Рейтинг фильма
5. Жанр
6. Ссылку на трейлер фильма
7. Ссылку на постер фильма
8. Директора фильма
9. 5 Актеров фильма
10. Рейтинг Metascore
11. Кол-во ревью (отдельно пользовательских, отдельно критиков, сумму пользовательских и критиков)
12. Названия 3х "похожих" фильмов
*/

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
        String movieName = driver.findElement(By.xpath("//*[@class='title_wrapper']/h1")).getText();
        System.out.println("Movie name is " + movieName);

        // Finding and printing Release Date
        String releaseDate = driver.findElement(By.cssSelector(".subtext > a:last-child")).getText();
        System.out.println("Release date is " + releaseDate);

        // Finding and printing Release Date
        // WebElement releaseDate = driver.findElement(By.cssSelector(".subtext > a:last-child"));
        // System.out.println("is duration movie in Minutes " + releaseDate.getText());
    }
}