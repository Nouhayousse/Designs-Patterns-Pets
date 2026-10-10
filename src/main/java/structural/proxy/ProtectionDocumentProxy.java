package structural.proxy;

import javax.print.Doc;

public class ProtectionDocumentProxy implements DocumentService {
    private final DocumentService real;
    private final String userRole;

    public ProtectionDocumentProxy(DocumentService real, String userRole) {
        this.real = real;
        this.userRole = userRole;
    }


    @Override
    public String read(String documentId) throws InterruptedException {
        return real.read(documentId);
    }

    @Override
    public void delete(String documentId) {
        if(userRole.equals("ADMIN"))
            real.delete(documentId);
        else
            throw new SecurityException("Suppression refused for role : "+userRole);

    }
}
