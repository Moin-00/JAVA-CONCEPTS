public class Admin implements Employee<Admin>{

    @Override
    public void name() {
        System.out.println("I am "+"Admin "+ "From Class :-"+this.getClass().getName());
    }
}
