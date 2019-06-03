package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Test
    public void shawshankRedemption() {

        // Finding and printing Movie Name
        driver.get("https://www.imdb.com/title/tt0111161/");
        String movieName = driver.findElement(By.xpath("//*[@class='title_wrapper']/h1")).getText();
        movieName = movieName.replaceAll("[0-9-(-)]", "").trim();
        System.out.println("Movie name is " + movieName);

        // Finding and printing Release Date
        String releaseDate = driver.findElement(By.cssSelector(".subtext > a:last-child")).getText();
        releaseDate = releaseDate.substring(0, releaseDate.length() - 6).trim();
        System.out.println("Release date is " + releaseDate);

        // Finding and printing Movie duration
        String movieDuriationParse = driver.findElement(By.xpath("//*[@class='subtext']/time")).getText();
        movieDuriationParse = movieDuriationParse.replaceAll("[a-z-\\s]", "").trim();

        String firstChaToFindHours = movieDuriationParse.substring(0, 1); // parse movie hours
        int movieHoursToMinutes = Integer.parseInt(firstChaToFindHours) * 60; // getting minutes from film hours

        String movieDurationInMinutes = movieDuriationParse.substring(1); // parsing only min from movie duration
        int movieDuriationInMinutes = Integer.parseInt(movieDurationInMinutes); // String min to int min

        int totalMovieDurationInMinuytes = movieHoursToMinutes + movieDuriationInMinutes; // Total movie duration in Min
        long secondsMovie = TimeUnit.MINUTES.toSeconds(totalMovieDurationInMinuytes); // finding seconds from Movie numbers

        System.out.println("Movie duration is " + totalMovieDurationInMinuytes + " min");
        System.out.println("Movie duration in sec is " + secondsMovie + " sec");

        // Movie Rating
        String movieRating = driver.findElement(By.xpath("//*[@class='ratingValue']/strong/span")).getText();
        System.out.println("Movie rating is " + movieRating);

        //Movie type
        String movieType = driver.findElement(By.xpath("//*[@class='subtext']/a")).getText();
        System.out.println("Movie type is " + movieType);

        //Movie trailer link
        String movieTrailerLink = driver.findElement(By.xpath("//*[@class='slate']/a")).getAttribute("href");
        System.out.println("Link to Movie Trailer " + movieTrailerLink);

        //Movie Director
        String movieDirector = driver.findElement(By.xpath("//*[@class='credit_summary_item']/a")).getText();
        System.out.println("Movie directors is " + movieDirector);

        //Five Movie Actors
        driver.findElement(By.xpath("//*[@class='credit_summary_item'][3]/a[4]")).click(); // go to all Cast list
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='cast_list']/tbody/tr/td[2]/a"));
        for (int i = 0; i < 5; i++) {
            System.out.println("Movie actor is " + elements.get(i).getText());
        }
        driver.navigate().back();

        //Metascore Rating
        String metascoreRating = driver.findElement(By.xpath("//*[@class='metacriticScore score_favorable titleReviewBarSubItem']/span")).getText();
        System.out.println("Metascore rating of movie is " + metascoreRating);

        //Movie Reviews (users, critics and their sum
        String usersReview = driver.findElement(By.xpath("//*[@class='titleReviewBarItem titleReviewbarItemBorder']/div/span/a")).getText(); //Parse content of user reviews
        usersReview = usersReview.replaceAll("[a-z-\\s+,]", "").trim(); //replace words for int element
        int usersReviewInDouble = Integer.parseInt(usersReview);

        String criticsReview = driver.findElement(By.xpath("//*[@class='titleReviewBarItem titleReviewbarItemBorder']/div/span/a[2]")).getText(); //Parse content of critics review
        criticsReview = criticsReview.replaceAll("[a-z-\\s]", "").trim(); //replace words for int element
        int criticsReviewInDouble = Integer.parseInt(criticsReview);

        int totalMovieReviews = usersReviewInDouble + criticsReviewInDouble; // getting sum of users and criticts reviews

        System.out.println("Total Moview Teviews is " + totalMovieReviews);

        //Titles of 3 similar movies
        List<WebElement> similiarMovies = driver.findElements(By.cssSelector(".rec_page a > img"));
        for (int i = 0; i < 3; i++) {
            System.out.println("First similiar Movie is " + similiarMovies.get(i).getAttribute("title"));
        }

    }

}
