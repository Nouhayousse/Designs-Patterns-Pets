package structural.composite;

public class Client {
    public static void main(String[] args){
        Directory root = new Directory("project");
        Directory src=new Directory("src");
        Directory docs=new Directory("docs");

        src.add(new FileLeaf("Main.java",12));
        src.add(new FileLeaf("Utils.java",8));
        src.add(new FileLeaf("readme.md",3));

        root.add(src);
        root.add(docs);
        root.add(new FileLeaf("pom.xml",5));

        root.print("");
        System.out.println("Taille totale : "+ root.getSize() + " ko ");
        System.out.println("Taille de src : "+ src.getSize()+" ko");
        System.out.println("Taille d'un fichier : "+ new FileLeaf("a",7).getSize()+ " ko ");
    }
}
