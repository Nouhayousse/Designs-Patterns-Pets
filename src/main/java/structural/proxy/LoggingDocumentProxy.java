package structural.proxy;

public class LoggingDocumentProxy implements DocumentService{
    private final DocumentService real;

    public LoggingDocumentProxy(DocumentService real) {
        this.real = real;
    }

    @Override
    public String read(String documentId) throws InterruptedException {
        long start=System.nanoTime();
        try {
            return real.read(documentId);
        }finally {
            log("read ",documentId,start);
        }

    }

    private void log(String method, String documentId, long start) {
        long ms=(System.nanoTime()-start)/1_000_000;
        System.out.println("[LOG] "+method+" ("+documentId+" ) en "+ms+" ms" );
    }

    @Override
    public void delete(String documentId) {
        long start=System.nanoTime();
        try{
            real.delete(documentId);
        }finally {
            log("delete",documentId,start);
        }

    }
}
