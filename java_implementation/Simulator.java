import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border; 
public class Simulator
{ 
    private JFrame frame; 
  
    public static void main(String[] args) 
    { 
        Simulator sim = new Simulator(); 
        
     
        sim.frame =new JFrame(); 
          
        
        
        JButton button1 = new JButton("Calculate Cost"); 
        button1.setBounds(440, 50, 120, 50);
        
        JTextField count = new JTextField(20);
        
        
        JLabel label1 = new JLabel();
        label1.setText("<html> <br /> </html>"); 
        JLabel label2 = new JLabel();
        label2.setText("<html> <br /> </html>"); 
        JLabel label3 = new JLabel();
        label3.setText("<html> <br /> </html>"); 
        JLabel label4 = new JLabel();
        label4.setText("<html> <br /> </html>");
        
        
        JLabel labelx = new JLabel();
        labelx.setBounds(20, 40, 100, 40);
       
        
        JLabel detailLabel = new JLabel();
        detailLabel.setText("<html> <br /> </html>");
        
        
        Border border = BorderFactory.createLineBorder(Color.cyan, 1);
        label1.setBorder(border);label2.setBorder(border);label3.setBorder(border);label4.setBorder(border);

       
        sim.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        JPanel panel1 = new JPanel();
        
        panel1.add(count);
        panel1.add(button1);
        
        panel1.add(detailLabel);
        panel1.add(labelx);
        panel1.setBackground(Color.white);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 3);
        panel1.setBorder(border2);
        
        
        
        JRadioButton rb1 = new JRadioButton("Chicago Pizza:	"+ new ChicagoPizza(null,null,null).getBasePrice());
        JRadioButton rb2 = new JRadioButton("New York Pizza: "+ new NewYorkPizza(null,null,null).getBasePrice());
        JRadioButton rb3 = new JRadioButton("Greek Pizza: "+ new GreekPizza(null,null,null).getBasePrice());
        JRadioButton rb4 = new JRadioButton("Sicilian Pizza: "+ new SicilianPizza(null,null,null).getBasePrice());
        ButtonGroup bg=new ButtonGroup();  
        rb1.setSelected(true);
        bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);
        
        JRadioButton srb1 = new JRadioButton("Marinara Sauce: "+ new MarinaraSauce().getCost());
        JRadioButton srb2 = new JRadioButton("Plum Tomato Sauce: "+ new PlumTomatoSauce().getCost());
        JRadioButton srb3 = new JRadioButton("Barbecue Sauce: "+new BarbecueSauce().getCost());
        JRadioButton srb4 = new JRadioButton("Pumpkin Sauce: "+new PumpkinSauce().getCost());
        ButtonGroup bg2 =new ButtonGroup();  
        srb1.setSelected(true);
        bg2.add(srb1);bg2.add(srb2);bg2.add(srb3);bg2.add(srb4);
        
        
        JRadioButton crb1 = new JRadioButton("Reggiano Cheese: "+ new ReggianoCheese().getCheeseCost() );
        JRadioButton crb2 = new JRadioButton("Mozzarella Cheese: "+ new MozzarellaCheese().getCheeseCost());
        JRadioButton crb3 = new JRadioButton("Provolone Cheese: "+ new ProvoloneCheese().getCheeseCost());
        JRadioButton crb4 = new JRadioButton("Parmesan Cheese: "+ new ParmesanCheese().getCheeseCost() );
        ButtonGroup bg3 =new ButtonGroup();  
        crb1.setSelected(true);
        bg3.add(crb1);bg3.add(crb2);bg3.add(crb3);bg3.add(crb4);
        
        
        JRadioButton drb3 = new JRadioButton("Thick Crust Dough: "+ new ThickCrustDough().getCost());
        JRadioButton drb4 = new JRadioButton("Thin Crust Dough: "+ new ThinCrustDough().getCost());
        ButtonGroup bg4 =new ButtonGroup();  
        drb3.setSelected(true);
        bg4.add(drb3);bg4.add(drb4);
        
       
        JPanel panel2 = new JPanel();
        Border border3 = BorderFactory.createLineBorder(Color.RED, 3);
        panel2.setBorder(border3); 
        panel2.setBounds(0, 0, 500, 200);
        label1.setText("select the pizza you want:  ");
        panel2.add(label1);
        panel2.add(rb1);panel2.add(rb2);panel2.add(rb3);panel2.add(rb4);
        
        
        JPanel panel3 = new JPanel();
        Border border4 = BorderFactory.createLineBorder(Color.BLUE, 3);
        panel3.setBorder(border4);
        label2.setText("<html> select the cheese: <br /> 20% off with Chicago Pizza </html>");
        panel3.add(label2);
        panel3.add(crb1);panel3.add(crb2);panel3.add(crb3);panel3.add(crb4);
       
          
        JPanel panel4 = new JPanel();
        Border border5 = BorderFactory.createLineBorder(Color.BLUE, 3);
        panel4.setBorder(border5);
        label3.setText("<html> select the Sauce: <br /> 40% off with Greek Pizza </html>");
        panel4.add(label3);
        panel4.add(srb1);panel4.add(srb2);panel4.add(srb3);panel4.add(srb4);
        
        
        JPanel panel5 = new JPanel();
        Border border6 = BorderFactory.createLineBorder(Color.RED, 3);
        panel5.setBorder(border6);
        label4.setText("<html> select the Dough: <br /> 10% off with NewYork Pizza </html>");
        panel5.add(label4);
        panel5.add(drb3);panel5.add(drb4);
        
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        
        //panel1.setLayout(new BoxLayout(panel1));
        
        sim.frame.add(panel2, BorderLayout.NORTH);
        
        sim.frame.add(panel3,BorderLayout.EAST);
       
        sim.frame.add(panel4,BorderLayout.WEST);
        
        sim.frame.add(panel5,BorderLayout.SOUTH);
        
        sim.frame.add(panel1,BorderLayout.CENTER);
        
        sim.frame.setSize(700, 300); 
        
        sim.frame.setTitle("Pizza Order");
        
        sim.frame.setResizable(false);
        
        sim.frame.setVisible(true);
        
        
        button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//cheese Selection
				Cheese cheese = null;
				Sauce sauce = null;
				Dough dough = null;
				Pizza pizza = null;
				if(srb1.isSelected())
					sauce = new MarinaraSauce(); 
				else if(srb2.isSelected())
					sauce = new PlumTomatoSauce();
				else if(srb3.isSelected())
					sauce = new BarbecueSauce();
				else if(srb4.isSelected())
					sauce = new PumpkinSauce();
				
				if(crb1.isSelected())
					cheese = new ReggianoCheese();
				else if(crb2.isSelected())
					cheese = new MozzarellaCheese();
				else if(crb3.isSelected())
					cheese = new ProvoloneCheese();
				else if(crb4.isSelected())
					cheese = new ParmesanCheese();
				
				if(drb3.isSelected())
					dough = new ThickCrustDough();
				else if(drb4.isSelected())
					dough = new ThinCrustDough();
				
				if(rb1.isSelected())
					pizza = new ChicagoPizza(sauce,cheese,dough);
				else if(rb2.isSelected())
					pizza = new NewYorkPizza(sauce,cheese, dough);
				else if(rb3.isSelected())
					pizza = new GreekPizza(sauce,cheese, dough);
				else if(rb4.isSelected())
					pizza = new SicilianPizza(sauce,cheese, dough);
				
				try{
					int numPizza = Integer.parseInt(count.getText());
					
					if(numPizza==0)
						throw new IllegalArgumentException();
					
					detailLabel.setText(pizza.displayDetails());
					labelx.setText("<html> Amount to be Paid: "+pizza.calculateCost()*numPizza+" <br /> for "+ numPizza+" pizza </html>");
				}catch(NumberFormatException e){
					
					detailLabel.setText("Pelase enter vaid input.");
					labelx.setText("");
				}catch(IllegalArgumentException e){
					detailLabel.setText("minimum Quantity of Pizza is One.");
					labelx.setText("");
				}
				
			}	
        });
        
        
        
    }
    
    private class MyListener implements ActionListener{
    	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
    }
} 
