import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class complaint extends JFrame implements ActionListener
{

JLabel l1=new JLabel("Complaint ID");
JLabel l2=new JLabel("Date");
JLabel l3=new JLabel("Name");
JLabel l4=new JLabel("Mobile No");
JLabel l5=new JLabel("Location");
JLabel l6=new JLabel("Complaint Box");
 
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JTextField t3=new JTextField();
JTextField t4=new JTextField();
JTextArea t5=new JTextArea();
JTextArea t6=new JTextArea();

JButton b1=new JButton("Submit");
JButton b2=new JButton("Add new complaint");

public complaint()
	{	
	setLayout(null);
	add(l1);
	l1.setBounds(50,25,100,30);
	l1.setForeground(Color.RED);
	l1.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l2);
	l2.setBounds(50,75,100,30);
	l2.setForeground(Color.RED);
	l2.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l3);
	l3.setBounds(50,125,100,30);
	l3.setForeground(Color.RED);
	l3.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l4);
	l4.setBounds(50,175,100,30);
	l4.setForeground(Color.RED);
	l4.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l5);
	l5.setBounds(50,225,100,30);
	l5.setForeground(Color.RED);
	l5.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l6);
	l6.setBounds(50,350,100,30);
	l6.setForeground(Color.RED);
	l6.setFont(new Font("Franklin Gothic", Font.BOLD, 16));

t1.setBounds(150,25,100,30);
add(t1);
t1.setFont(new Font("Franklin Gothic", Font.BOLD, 14));
t1.setBackground(Color.GRAY);
t1.setForeground(Color.GREEN);
t2.setBounds(150,75,100,30);
add(t2);
t2.setFont(new Font("Franklin Gothic", Font.BOLD, 14));
t2.setBackground(Color.GRAY);
t2.setForeground(Color.GREEN);
t3.setBounds(150,125,150,30); 
add(t3);
t3.setFont(new Font("Franklin Gothic", Font.BOLD, 14));
t3.setBackground(Color.GRAY);
t3.setForeground(Color.GREEN);
t4.setBounds(150,175,150,30);
add(t4);
t4.setFont(new Font("Franklin Gothic", Font.BOLD, 14));
t4.setBackground(Color.GRAY);
t4.setForeground(Color.GREEN);
t5.setBounds(50,260,300,90); 
add(t5);
t5.setFont(new Font("Franklin Gothic", Font.BOLD, 14));
t5.setBackground(Color.GRAY);
t5.setForeground(Color.GREEN);
t6.setBounds(50,380,300,90); 
add(t6);
t6.setFont(new Font("Franklin Gothic", Font.BOLD, 14));
t6.setBackground(Color.GRAY);
t6.setForeground(Color.GREEN);

	add(b1);
	b1.setBounds(65,500,80,30);
	b1.addActionListener(this);
	add(b2);
	b2.setBounds(150,500,150,30);
	

setSize(800,800);
setVisible(true);
	
	}




public void actionPerformed(ActionEvent e){
System.out.println("in");
	try{

	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cn=
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cms","cmspswd");
 
System.out.println("connected");
	PreparedStatement p=cn.prepareStatement("insert into complaint values(?,?,?,?,?,?)");
	p.setString(1,t1.getText());
	p.setString(2,t2.getText());
	p.setString(3,t3.getText());
	p.setInt(4,Integer.parseInt(t4.getText()));
	p.setString(5,t5.getText());
	p.setString(6,t6.getText());
	p.executeUpdate();
System.out.println("inserteeee");

	}

catch(Exception ex) {}


}






public static void main(String args[]) throws Exception  {
	new complaint();
	}
 }	








