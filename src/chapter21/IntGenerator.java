package chapter21;

public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancle() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
