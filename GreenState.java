public class GreenState extends State {
   
    public GreenState(TrafficLightModel model){
        super(model);
    }
    
    public boolean getAmber(){
        return false;
    }
    
    public boolean getGreen(){
        return true;
    }
    
    public boolean getRed(){
        return false;
    }
    
    public void change(){
        model.setState(model.getAmberState());
    }
    
}