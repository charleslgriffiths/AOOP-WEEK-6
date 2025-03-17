import javax.swing.*;
import java.awt.*;

public class TrafficLightFrame extends JFrame{
    
    public static void main(String [] args) {
        TrafficLightFrame frame = new TrafficLightFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public TrafficLightFrame() {
        super("MVC Traffic Light Example");
        TrafficLightModel model = new TrafficLightModel();
        SimpleTrafficLightView view = new SimpleTrafficLightView(model);
        ColorView colorView = new ColorView(model);
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
        
        contentPane.add(view);
        contentPane.add(colorView);
    }
}
