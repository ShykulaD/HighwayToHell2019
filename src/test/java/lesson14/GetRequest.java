package lesson14;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

import javax.lang.model.util.Elements;
import java.io.IOException;
import java.time.OffsetDateTime;

public class GetRequest {


    @Test

    public void tryIt() throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url("https://www.imdb.com/chart/top").build();
        Response response = client.newCall(request).execute();
        String html = response.body().string();
   //     System.out.println(html);

        Document document = Jsoup.parse(html);
     //   Elements elements = document.select(".title", "a");
    }

}
