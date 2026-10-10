package structural.proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        DocumentService real=new RealDocumentService();
        DocumentService cached = new CachinDocumentProxy(real);

        DocumentService asUser=new LoggingDocumentProxy(new ProtectionDocumentProxy(cached,"USER"));

        DocumentService asAdmin=new LoggingDocumentProxy(new ProtectionDocumentProxy(cached,"ADMIN"));

        System.out.println("1/  Cache : deux lectures du meme doc  ");
        System.out.println(asUser.read("doc-1"));
        System.out.println(asUser.read("doc-1"));

        System.out.println("2/ Protection : delete en user ");
        try {
            asUser.delete("doc-1");
        }catch (SecurityException e) {
            System.out.println("Refused : "+e.getMessage());
        }

        System.out.println("3/ Protection delete en ADMIN");
        asAdmin.delete("doc-1");

        System.out.println("4/ Invalidation du cache apres dele");
        System.out.println(asUser.read("doc-1"));


    }
}
