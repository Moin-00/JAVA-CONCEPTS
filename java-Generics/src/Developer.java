public class Developer implements Employee{
    @Override
    public void name() {
        System.out.println("I am "+"developer "+ "From Class :-"+this.getClass().getName());
    }
}
