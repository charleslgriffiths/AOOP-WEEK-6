public class Controller implements ControllerInterface {
    
    private TrafficLightModel model;
    private SimpleTrafficLightView view;
    
    public Controller(TrafficLightModel theModel,
                      SimpleTrafficLightView theView) {
        model = theModel;
        view = theView;
    }
    
    public SimpleTrafficLightView getView () {
        return view;
    }
    
    public void change() {
        model.change();
    }
    
    public void initialise() {
        model.initialise();
    }
}
