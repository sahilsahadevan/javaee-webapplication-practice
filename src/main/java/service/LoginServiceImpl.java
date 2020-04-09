package service;

public class LoginServiceImpl implements LoginService {

    @Override
    public boolean isEmptyFields(String firstName, String lastName, String pwd) {
        return (firstName == null || firstName.isEmpty()) &&
                (lastName == null || lastName.isEmpty()) &&
                (pwd == null || pwd.isEmpty());
    }
}
