package homework;

public class ConcretePersister implements Persister{
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
