import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanTest {

    public static void main(String[] args) throws Exception {
        // Create and configure the object mapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Serialize an Album object to JSON
        Album album = new Album(1, "The Beatles", "Abbey Road", 1969, 31.3f, "Rock");
        String albumJson = objectMapper.writeValueAsString(album);
        System.out.println(albumJson);

        // Deserialize a Quote object from JSON
        String quoteJson = "{\"id\":1,\"content\":\"I have a dream.\",\"author\":{\"firstName\":\"Martin\",\"lastName\":\"Luther King Jr.\"}}";
        Quote quote = objectMapper.readValue(quoteJson, Quote.class);
        System.out.println(quote);

        // Serialize an Author object to JSON
        Author author = new Author(1, "Jane", "Doe");
        String authorJson = objectMapper.writeValueAsString(author);
        System.out.println(authorJson);
    }
}

