import org.json.simple.JSONObject;

public class UserConstructor {

    JSONObject userDetails = new JSONObject();
    private String name;
    private Integer age;
    private String email;

    public UserConstructor(String userName, Integer userAge, String userEmail) {

        userDetails.put("name", this.name = userName);
        userDetails.put("age", this.age = userAge);
        userDetails.put("email", this.email = userEmail);
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }
}
