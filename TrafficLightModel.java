import java.util.Observable;

public class TrafficLightModel extends Observable {
    
    private AmberState amberState;
    private GreenState greenState;
    private RedAmberState redAmberState;
    private RedState redState;
    private State state;
    
    public boolean getRed(){
        return state.getRed();
    }
    
    public boolean getAmber(){
        return state.getAmber();
    }
    public boolean getGreen(){
        return state.getGreen();
    }
    
    public State getAmberState() {
        return amberState;
    }
    
    public State getGreenState() {
        return greenState;
    }
    
    public State getRedAmberState() {
        return redAmberState;
    }
    
    public State getRedState() {
        return redState;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void change(){
        state.change();
        setChanged();
        notifyObservers();
    }
    
    public void initialise() {
        amberState = new AmberState(this);
        greenState = new GreenState(this);
        redAmberState = new RedAmberState(this);
        redState = new RedState(this);
        state = redState;
        
        setChanged();
        notifyObservers();
    }
    
    public TrafficLightModel(){
        initialise();
    }
}
