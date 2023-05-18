public abstract class Burger implements Item {

//    @Override
//    public String name() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}