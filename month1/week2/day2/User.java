public class User 
{
    private String name;
    private int userId;
    
    public User(String name, int userId)
    {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public String toString()
    {
        return "\nName: " + name +
        " |\t(ID: " + userId + ")";
    }

    @Override
    public  boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode()
    {
        return Integer.hashCode(userId);
    }
}
