package options;

public class Ivan extends characters implements Swimable {
    private int swim_limit;
    private final int RUN_LIMIT = 50;
    private final int SWIM_LIMIT = 100;

    public Ivan(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        swim_limit = SWIM_LIMIT;
    }
    public Ivan(String name, int run_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
        swim_limit = swim_limit;
    }

    @Override
    public String voice() {
        return "bonjor";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
}