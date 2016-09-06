package graphql;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticlesController {
    private static List<Article> articleList = new ArrayList<>();

    @RequestMapping("/random")
    public Article getRandomArticle() throws UnknownHostException {
        Article article = new Article();
        article.setTitle("Houston Ship Channel closed after tanker fire, fuel spill");
        article.setContent("DEER PARK, Texas (AP) — A portion of the Houston Ship Channel is closed to all traffic after a tanker caught fire and spilled fuel oil. The U.S. Coast Guard said in a news release Tuesday that a mile of the channel is closed and it has yet to determine when it will reopen. The Coast Guard says the 810-foot tanker Aframax River notified officials that a tank carrying fuel for the vessel was punctured and caught fire around midnight Tuesday. The oil tanker wasn't carrying any freight when the incident happened. The fire has been extinguished and no one was injured. Petty Officer 3rd Class Dustin Williams says the Coast Guard is trying to determine how much fuel was spilled and what caused the puncture.");
        return article;
    }
}
