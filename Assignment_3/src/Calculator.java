import java.awt.*;
import java.applet.*;
 import java.awt.event.*;
 import java.awt.Label;


public class Calculator extends Applet implements ActionListener{
	   TextField text1,text2,res;
	   Label label1,label2,label3,label4,label5,label6,title;
	   Button b1,b2,b3,b4,clear,grad;
	   public void init(){
	     setLayout(null);


	       title = new Label("Basic calculator");
	 title.setBounds(80,10,140,30);
	 add(title);
	 title.setAlignment(title.CENTER);

	     label1 = new Label("Enter number 1: ");
	     label1.setBounds(30,50,150,30);
	     add(label1);

	     text1 = new TextField(5);
	     text1.setBounds(200,50,150,30);
	     add(text1);

	     label2 = new Label("Enter number 2: ");
	     label2.setBounds(30,90,150,30);
	     add(label2);

	     text2 = new TextField(5);
	     text2.setBounds(200,90,150,30);
	     add(text2);
	   
	     

	     label6 = new Label("Result is : ");
	     label6.setBounds(30,240,150,30);
	     add(label6);

	     res = new TextField(5);
	     res.setBounds(200,240,150,30);
	     add(res);
	     
	     
	     b1 = new Button("Sum");
	     b1.setBounds(200,320,150,30);
	     add(b1);

	     b2 = new Button("Diff");
	     b2.setBounds(200,370,150,30);
	     add(b2);
	     
	     b3 = new Button("Mul");
	     b3.setBounds(200,420,150,30);
	     add(b3);
	     
	     b4 = new Button("divide");
	     b4.setBounds(200,470,150,30);
	     add(b4);
	     
	     clear = new Button("Clear");
	     clear.setBounds(350,370,150,30);
	     add(clear);
	     
	   

	     b1.addActionListener(this);

	     b2.addActionListener(this);

	     b3.addActionListener(this);

	     b4.addActionListener(this);
	     clear.addActionListener(this);


	     }
	     public void actionPerformed(ActionEvent ae){
	     int num1=Integer.parseInt(text1.getText());
	     int num2=Integer.parseInt(text2.getText());
	   
	     
	      float add=(num1 + num2);
	      res.setText(Float.toString(add));
	      
	      float sub=(num1 - num2);
	      res.setText(Float.toString(sub));
	      
	      float mult=(num1 * num2);
	      res.setText(Float.toString(mult));
	      
	      float div=(num1 / num2);
	      res.setText(Float.toString(div));
	  
	     
	   
	if(ae.getSource() == clear)
	{
	  text1.setText("");
	  text2.setText("");
	   res.setText("");
	   text1.requestFocus();
	 }
	}
	}



