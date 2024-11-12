package apis;

import model.Response;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CallApi {

    public static void main(String[] args) {

        String url = "https://jsonplaceholder.typicode.com/posts/7";

        WebClient.Builder builder = WebClient.builder();

        String response = builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println("----------------------------------------1-------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(response);
        System.out.println("----------------------------------------2-------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        JSONObject jsonObject = new JSONObject(response);
        System.out.println("----------------------------------------3-------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(jsonObject);

        System.out.println("----------------------------------------4-------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Integer id = jsonObject.getInt("id");
        System.out.println("Id of the items gotten: " + id);

        Integer userId = jsonObject.getInt("userId");
        System.out.println("UserId of the items gotten: " + userId);

        String title = jsonObject.getString("title");
        System.out.println("Title of the items gotten: " + title);

        String body = jsonObject.getString("body");
        System.out.println("Body of the items gotten: " + body);

    }
}
