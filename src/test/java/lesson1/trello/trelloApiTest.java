package lesson1.trello;

import org.testng.annotations.Test;

import java.io.IOException;

public class trelloApiTest {

    @Test
    public void tryIt() throws IOException {

        TrelloApi trelloApi = new TrelloApi();
        trelloApi.getBoardLists("");
        trelloApi.createCard("");
    }


}
