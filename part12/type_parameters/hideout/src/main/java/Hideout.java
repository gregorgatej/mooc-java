public class Hideout<T> {
    private T hideout;

    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }

    public T takeFromHideout() {
        T takenOut = this.hideout;
        this.hideout = null;

        return takenOut;
    }

    public boolean isInHideout() {
        if (hideout == null) return false;

        return true;
    }
}