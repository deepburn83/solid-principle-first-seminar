package homework;

public class PersisterFactory {
    public Persister createPersister() {
        return new ConcretePersister();
    }
}
