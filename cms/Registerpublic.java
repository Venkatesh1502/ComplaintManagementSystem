import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class Registerpublic extends JFrame implements ActionListener
	{
	JLabel l1=new JLabel("Name");
	JLabel l2=new JLabel("Email");
	JLabel l3=new JLabel("Password");
	JLabel l4=new JLabel("Phone No");
	JLabel l5=new JLabel("Address");
	JLabel l6=new JLabel("City");
	JLabel l7=new JLabel("State");
	JLabel l8=new JLabel("Pincode");
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JPasswordField t3=new JPasswordField();
JTextField t4=new JTextField();
JTextField t5=new JTextField();
JTextField t6=new JTextField();
JTextField t7=new JTextField();
JTextField t8=new JTextField();
	JButton b1=new JButton("Submit");
	
	
	public Registerpublic()
	{	
	setLayout(null);
	add(l1);
	l1.setBounds(100,50,100,30);
	l1.setForeground(Color.GRAY);
	l1.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l2);
	l2.setBounds(100,100,100,30);
	l2.setForeground(Color.GRAY);
	l2.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l3);
	l3.setBounds(100,150,100,30);
	l3.setForeground(Color.GRAY);
	l3.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l4);
	l4.setBounds(100,200,100,30);
	l4.setForeground(Color.GRAY);
	l4.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l5);
	l5.setBounds(100,250,100,30);
	l5.setForeground(Color.GRAY);
	l5.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l6);
	l6.setBounds(100,300,100,30);
	l6.setForeground(Color.GRAY);
	l6.setFont(new Font("Franklin Gothic", Font.BOLD, 16));	
	add(l7);
	l7.setBounds(100,350,100,30);
	l7.setForeground(Color.GRAY);
	l7.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l8);
	l8.setBounds(100,400,100,30);
	l8.setForeground(Color.GRAY);
	l8.setFont(new Font("Franklin Gothic", Font.BOLD, 16));

t1.setBounds(220,50,100,30);
add(t1);
t2.setBounds(220,100,100,30);
add(t2);
t3.setBounds(220,150,100,30);
add(t3);
t4.setBounds(220,200,100,30);
add(t4);
t5.setBounds(220,250,100,30);
add(t5);
t6.setBounds(220,300,100,30);	
add(t6);
t7.setBounds(220,350,100,30);
add(t7);
t8.setBounds(220,400,100,30);
add(t8);

add(b1);
b1.setBounds(170,460,80,30);
b1.addActionListener(this);
	

JLabel art1=new JLabel();
ImageIcon img=new ImageIcon(new ImageIcon("E:/laptop//cms images//d8.jpg").getImage().getScaledInstance(890,600,Image.SCALE_DEFAULT));
art1.setIcon(img);
art1.setBounds(1,1,890,600);
add(art1);


setSize(600,600);
setVisible(true);
	
	}

public void actionPerformed(ActionEvent e){
System.out.println("in");
	try{

	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cn=
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cms","cmspswd");
 
System.out.println("connected");
	PreparedStatement p=cn.prepareStatement("insert into Registerpublic values(?,?,?,?,?,?,?,?)");
	p.setString(1,t1.getText());
	p.setString(2,t2.getText());
	p.setString(3,t3.getText());
	p.setInt(4,Integer.parseInt(t4.getText()));
	p.setString(5,t5.getText());
	p.setString(6,t6.getText());
	p.setString(7,t7.getText());
	p.setInt(8,Integer.parseInt(t8.getText()));
	p.executeUpdate();
System.out.println("inserteeee");
{
new Registerlogin();
setVisible(false);
dispose();
}

	}

catch(Exception ex) {}
	}



	public static void main(String args[]) throws Exception {
	new Registerpublic();
	}
 }	