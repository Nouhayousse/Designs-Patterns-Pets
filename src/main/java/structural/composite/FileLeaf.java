package structural.composite;

public class FileLeaf implements FileSystemComponent{
    private final String name;
    private final long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println( indent + name + "( "+ size+ "ko )");

    }
}
