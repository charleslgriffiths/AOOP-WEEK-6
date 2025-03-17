public class RedState extends State {
   
    public RedState(TrafficLightModel model){
        super(model);
    }
    
    public boolean getAmber(){
        return false;
    }
    
    public boolean getGreen(){
        return false;
    }
    
    public boolean getRed(){
        return true;
    }
    
    public void change(){
        model.setState(model.getRedAmberState());
    }
    
}

