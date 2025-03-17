public class AmberState extends State {
   
    public AmberState(TrafficLightModel model){
        super(model);
    }
    
    public boolean getAmber(){
        return true;
    }
    
    public boolean getGreen(){
        return false;
    }
    
    public boolean getRed(){
        return false;
    }
    
    public void change(){
        model.setState(model.getRedState());
    }
    
}