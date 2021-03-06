package koreatech.cse.domain.oauth2.naver;

        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;
        import javax.annotation.Generated;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @Generated("org.jsonschema2pojo")
        @JsonPropertyOrder({
        "name",
        "id"
})
public class NaverProfile {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "naverProfile{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}