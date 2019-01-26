package auth;

import org.json.JSONObject;

import java.util.Objects;

public class User{

    private String name;
    private String surname;
    private int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public JSONObject getUserToJson(){
        JSONObject jsonUser = new JSONObject();
        jsonUser.put("name",name);
        jsonUser.put("surname",surname);
        jsonUser.put("age",age);
        return jsonUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                "}";
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}