package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachinDocumentProxy implements DocumentService{
    private final DocumentService real;
    private final Map<String,String> cache=new HashMap<>();

    public CachinDocumentProxy(DocumentService real) {
        this.real = real;
    }


    @Override
    public String read(String documentId){
        return cache.computeIfAbsent(documentId,k-> {
            try {
                return real.read(k);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void delete(String documentId) {
        real.delete(documentId);
        cache.remove(documentId);


    }
}
