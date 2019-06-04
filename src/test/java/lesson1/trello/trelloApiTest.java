package lesson1.trello;

import org.testng.annotations.Test;

import java.io.IOException;

public class trelloApiTest {

    @Test
    public void tryIt() throws IOException {

        TrelloApi trelloApi = new TrelloApi();
        trelloApi.getBoardLists("8peoj2k8");
        trelloApi.createCard("5cf699235067f56f9fa6b1fc");
    }


}
