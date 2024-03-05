import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SkirtObserver implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\nCEO har meddelats att " + evt.getPropertyName() +".");
    }
}
