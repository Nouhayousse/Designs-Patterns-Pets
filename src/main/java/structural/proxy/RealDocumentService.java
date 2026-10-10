package structural.proxy;

public class RealDocumentService implements DocumentService{



    @Override
    public String read(String documentId)  {
        simulateSlowOperation();
        return "Contenu de "+ documentId;
    }

    private void simulateSlowOperation() {
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void delete(String documentId) {
        System.out.println("REAL Document "+documentId+" deleted !");

    }
}
