public class Hr implements Employee<Hr>{
    @Override
    public void name() {
        System.out.println("I am "+"Hr "+ "From Class :-"+this.getClass().getName());
    }
}
