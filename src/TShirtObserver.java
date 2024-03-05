import BusinessObjects.CEO;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TShirtObserver implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\nVD " + CEO.getName() + " har meddelats att " + evt.getPropertyName());
    }
}
