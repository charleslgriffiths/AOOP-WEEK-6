public class RedAmberState extends State {
   
    public RedAmberState(TrafficLightModel model){
        super(model);
    }
    
    public boolean getAmber(){
        return true;
    }
    
    public boolean getGreen(){
        return false;
    }
    
    public boolean getRed(){
        return true;
    }
    
    public void change(){
        model.setState(model.getGreenState());
    }
    
}