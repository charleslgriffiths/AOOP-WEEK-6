import java.awt.*;

public class ColorView extends AbstractTrafficLightView {
   
    public ColorView(TrafficLightModel model) {
        super(model);
    }
    
    protected void updateView() {
        repaint();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        TrafficLightModel model = getModel();
        
        g.setColor(model.getRed()?Color.RED:Color.LIGHT_GRAY);
        g.fillOval(5,0,20,20);
        
        g.setColor(model.getAmber()?Color.ORANGE:Color.LIGHT_GRAY);
        g.fillOval(5,23,20,20);
        
        g.setColor(model.getGreen()?Color.GREEN:Color.LIGHT_GRAY);
        g.fillOval(5,46,20,20);
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(40,70);
    }
    
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
    
    public Dimension getMaximumSize()
    {
        return getPreferredSize();
    }
}