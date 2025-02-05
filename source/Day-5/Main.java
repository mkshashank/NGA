/*Create an interface UserService with a default method getWelcomeMessage(), which returns "Welcome, Guest!" if no name is provided. Implement a method getUser(String name)
that returns an Optional<String> representing the user's name. In the implementation, if the name is present, return a welcome message with the user's name; otherwise,
return the default message.Hint: Use Optional.ofNullable() and default methods in interfaces.*/
import java.util.*;

interface UserService 
{
    default String getWelcomeMessage() 
    {
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) 
    {
        return Optional.ofNullable(name);
    }

    public String getWelcomeMessage(String name) 
    {
        return getUser(name)
                .map(userName -> "Welcome, " + userName + "!")
                .orElse(getWelcomeMessage());
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        UserServiceImpl userService = new UserServiceImpl();

        System.out.println(userService.getWelcomeMessage("Ramu"));

        System.out.println(userService.getWelcomeMessage(null));
    }
}
