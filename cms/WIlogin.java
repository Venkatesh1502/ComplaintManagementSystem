import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class WIlogin extends JFrame implements ActionListener 
	{
	JLabel l1=new JLabel("Ward ID");
	JLabel l2=new JLabel("Password");
	JLabel l3=new JLabel();
JTextField t1=new JTextField();
JPasswordField t2=new JPasswordField();
	JButton b1=new JButton("Sign in");
	
	
	public WIlogin()
	{	
	setLayout(null);
	add(l1);
	l1.setBounds(50,50,100,30);
	l1.setForeground(Color.RED);
	l1.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l2);
	l2.setBounds(50,90,100,30);
	l2.setForeground(Color.RED);
	l2.setFont(new Font("Franklin Gothic", Font.BOLD, 16));
	add(l3);
	l3.setBounds(65,165,280,20);
	l3.setForeground(Color.RED);

t1.setBounds(160,50,100,30);
add(t1);
t2.setBounds(160,90,100,30);
add(t2);

add(b1);
b1.setBounds(170,130,80,30);
b1.addActionListener(this);

	

JLabel art1=new JLabel();
ImageIcon img=new ImageIcon(new ImageIcon("E:/laptop//cms images//d9.jpg").getImage().getScaledInstance(399,349,Image.SCALE_DEFAULT));
art1.setIcon(img);
art1.setBounds(1,1,399,349);
add(art1);


setSize(400,350);
setVisible(true);
	
	}



public void actionPerformed(ActionEvent e)	
	{
	try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cms","cmspswd");
PreparedStatement pt=con.prepareStatement("select wardid,password from wardapproval where wardid=? and password=?");
pt.setInt(1,Integer.parseInt(t1.getText()));
pt.setInt(2,Integer.parseInt(t2.getText()));
ResultSet rs=pt.executeQuery();
int ch=0;
String u=t1.getText();
String p=t2.getText();

while(rs.next())
{
String du=rs.getString(1);
String dp=rs.getString(2);
if(du.equals(u) && dp.equals(p))
ch=1;
}	
if(ch==1)

{


l3.setText("Signin successful");

}
else
{

l3.setText("Email or PassWord is Incorrect please check");	
}
}
catch(Exception ex) {}
}

	


	public static void main(String args[]) throws Exception {
	new WIlogin();
	}
 }	