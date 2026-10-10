package structural.proxy;

public interface DocumentService {
    String read(String documentId) throws InterruptedException;
    void delete(String documentId);
}
