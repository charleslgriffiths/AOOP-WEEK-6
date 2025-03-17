import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTrafficLightView extends AbstractTrafficLightView 
                                    implements ActionListener {
    
    private ControllerInterface controller;
    private JTextField redField = new JTextField(3);
    private JTextField amberField = new JTextField(3);
    private JTextField greenField = new JTextField(3);
    private JLabel redLabel = new JLabel("Red");
    private JLabel amberLabel = new JLabel("Amber");
    private JLabel greenLabel = new JLabel("Green");
    private JButton changeButton = new JButton("Change");
    private JButton initialiseButton = new JButton("Initialise");
    
    
    public SimpleTrafficLightView(TrafficLightModel model)  {
        super(model);
        controller = new Controller(model, this);
        setLayout(new GridLayout(4,2));
        redField.setEditable(false);
        amberField.setEditable(false);
        greenField.setEditable(false);
        
        add(redLabel);
        add(redField);
        add(amberLabel);
        add(amberField);
        add(greenLabel);
        add(greenField);
        
        changeButton.addActionListener(this);
        add(changeButton);
       
        initialiseButton.addActionListener(this);
        add(initialiseButton);
        
        updateView();
    }
    
    public ControllerInterface getController()
    {
        return controller;
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == initialiseButton)
	    getController().initialise();
        else if (event.getSource() ==changeButton)
            getController().change();
    }
   
    protected void updateView() {
        TrafficLightModel model = getModel();
        redField.setText(model.getRed()?"ON":"OFF");
        amberField.setText(model.getAmber()?"ON":"OFF");
        greenField.setText(model.getGreen()?"ON":"OFF");
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(200,100);
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
