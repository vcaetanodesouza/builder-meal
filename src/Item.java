public interface Item {
    public String name();
    public Packing packing();
    public float price();

    public void add(Item item);
}
