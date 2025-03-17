import java.util.Observer;
import javax.swing.JPanel;

public abstract  class AbstractTrafficLightView extends JPanel 
                                                implements Observer {
    private TrafficLightModel model;
    public TrafficLightModel getModel() {
        return model;
    }
    
    protected abstract void updateView();
    
    public void update(java.util.Observable o, Object arg) {
        updateView();
    }
    
    public AbstractTrafficLightView(TrafficLightModel observedModel) 
    throws NullPointerException {
        if (observedModel == null)
            throw new NullPointerException();
        
        model = observedModel; 
        model.addObserver(this);
    }  
}
