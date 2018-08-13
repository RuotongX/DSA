package task1CarParking;

import java.util.Iterator;

public abstract class AbstractCarList {
	public abstract void reset();
	public abstract boolean hasNext();
	public abstract Car get();
	public abstract Car next();
	final public Iterator<CarList> iterator() {
		return null;
	}
}
