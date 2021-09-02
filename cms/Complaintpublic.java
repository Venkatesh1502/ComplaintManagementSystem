import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class Complaintpublic extends JFrame implements ActionListener 
	{
	JLabel l1=new JLabel("Name");
	JLabel l2=new JLabel("Mobile No");
	JLabel l3=new JLabel("Location");
	JLabel l4=new JLabel("Enter a Complaint:");
	JLabel l5=new JLabel();
	
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JTextField t3=new JTextField();
JTextArea t4=new JTextArea();

	JButton b1=new JButton("Submit");
	JButton b2=new JButton("Add new complaint");
	
	
	public Complaintpublic()
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
	l3.setBounds(50,125,105,30);
	l3.setForeground(Color.RED);
	l3.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l4);
	l4.setBounds(50,175,180,30);
	l4.setForeground(Color.RED);
	l4.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l5);
	l5.setBounds(50,335,230,30);
	l5.setForeground(Color.GREEN);
	l5.setFont(new Font("Franklin Gothic", Font.BOLD, 14));

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
t4.setBounds(50,210,300,90);
add(t4);
t4.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
t4.setBackground(Color.GRAY);
t4.setForeground(Color.BLUE);

add(b1);
b1.setBounds(65,310,80,30);
b1.addActionListener(this);
add(b2);
b2.setBounds(150,310,150,30);
b2.addActionListener(this);

	

JLabel art1=new JLabel();
ImageIcon img=new ImageIcon(new ImageIcon("E:/laptop//cms images//d10.png").getImage().getScaledInstance(399,399,Image.SCALE_DEFAULT));
art1.setIcon(img);
art1.setBounds(1,1,399,399);
add(art1);


setSize(400,400);
setVisible(true);
	
	}

public void actionPerformed(ActionEvent e){
System.out.println("in");
	try{

	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cn=
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cms","cmspswd");
 
System.out.println("connected");
	PreparedStatement p=cn.prepareStatement("insert into Complaintpublic values(?,?,?,?)");
	p.setString(1,t1.getText());
	p.setInt(2,Integer.parseInt(t2.getText()));
	p.setString(3,t3.getText());
	p.setString(4,t4.getText());
	p.executeUpdate();
System.out.println("inserteeee");

l5.setText("Your Complaint is successfully submitted");



	}

catch(Exception ex) {}

if(e.getSource()==b2) {
new Complaintpublic();
dispose();
}
}



	public static void main(String args[]) throws Exception {
	new Complaintpublic();
	}
 }	