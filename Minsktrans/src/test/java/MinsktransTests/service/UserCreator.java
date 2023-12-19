package MinsktransTests.service;

import MinsktransTests.model.User;

public class UserCreator {
    public static final String USER_EMAIL = "wretnryrht";
    public static final String password = "wretnryrht";

    public static User withCredFromProperty()
    {
        return new User(USER_EMAIL, password);
    }
}
