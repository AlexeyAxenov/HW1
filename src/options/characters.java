package options;

public abstract class characters {
    protected String name;
    protected int run_limit;
    protected boolean passing;

    public abstract String voice();

    public boolean run(int length)  {
        { return run_limit >= length;}
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }

    public void setPassing(boolean passing){
        this.passing = passing;
    }
}