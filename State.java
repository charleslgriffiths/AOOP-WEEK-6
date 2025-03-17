public abstract class State {
    public TrafficLightModel model;
    
    public State(TrafficLightModel model){
        this.model = model;
    }
    
    public abstract boolean getAmber();
    public abstract boolean getGreen();
    public abstract boolean getRed();
    public abstract void change();
    
}
