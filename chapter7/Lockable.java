public interface Lockable {
    public void setKey(long key);
    public void lock(long key);
    public void unlock(long key);
    public boolean locked();
}