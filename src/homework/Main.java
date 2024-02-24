package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report();

        // Создаем фабрику для создания Persister
        PersisterFactory persisterFactory = new PersisterFactory();
        Persister persister = persisterFactory.createPersister();

        // Сохраняем пользователя с использованием Persister
        persister.save(user);
    }
}