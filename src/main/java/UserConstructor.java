import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UserConstructor {

    JSONObject userDetails = new JSONObject();
    JSONArray hobbies = new JSONArray();
    private String name;
    private Integer age;
    private String email;


    public UserConstructor(String userName, Integer userAge, String userEmail, String[] hobbyList) {

        userDetails.put("name", this.name = userName);
        userDetails.put("age", this.age = userAge);
        userDetails.put("email", this.email = userEmail);
        userDetails.put("hobbies", this.hobbies = createJSONArray(hobbyList));

    }

    public JSONArray createJSONArray( String[] hobby){
        JSONArray hobbyList = new JSONArray();
        for (int i = 0; i < hobby.length; i++) {
            hobbyList.add(hobby[i]);
        }
        return hobbyList;
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }

    public JSONArray getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
