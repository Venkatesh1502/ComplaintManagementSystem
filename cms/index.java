import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class hp extends JFrame implements ActionListener
	{
	JLabel l1=new JLabel("Complaint Management System");
	JButton b1=new JButton("Admin");
	JButton b2=new JButton("Master");
	JButton b3=new JButton("WarIncharge");
	JButton b4=new JButton("Public");
	
	public hp()
	{	
	setLayout(null);
	add(l1);
	l1.setBounds(3,3,400,45);
	l1.setForeground(Color.WHITE);
	l1.setFont(new Font("Franklin Gothic", Font.BOLD, 26));
	
	add(b1);
	b1.setBounds(930,10,100,45);
	b1.setBackground(Color.BLACK);
	b1.setForeground(Color.GREEN);
	b1.setFont(new Font("Franklin Gothic", Font.BOLD, 18));
	
	add(b2);
	b2.setBounds(1030,10,100,45);
	b2.setBackground(Color.BLACK);
	b2.setForeground(Color.GREEN);
	b2.setFont(new Font("Franklin Gothic", Font.BOLD, 18));	

	add(b3);
	b3.setBounds(1130,10,120,45);
	b3.setBackground(Color.BLACK);
        b3.setForeground(Color.GREEN);
	b3.setFont(new Font("Franklin Gothic", Font.BOLD, 13));	
	
	add(b4);
	b4.setBounds(1250,10,100,45);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.GREEN);
	b4.setFont(new Font("Franklin Gothic", Font.BOLD, 18));	
	b4.addActionListener(this);

JLabel art1=new JLabel();
ImageIcon img=new ImageIcon(new ImageIcon("E:/laptop//cms images//d4.jpeg").getImage().getScaledInstance(1360,60,Image.SCALE_DEFAULT));
art1.setIcon(img);
art1.setBounds(1,1,1360,60);
add(art1);

JLabel art2=new JLabel();
ImageIcon img2=new ImageIcon(new ImageIcon("E:/laptop//cms images//d6.jpg").getImage().getScaledInstance(1360,700,Image.SCALE_DEFAULT));
art2.setIcon(img2);
art2.setBounds(1,60,1360,700);
add(art2);


setSize(1370,900);
setVisible(true);
	
	}

public void actionPerformed(ActionEvent e)	
	{
	
if(e.getSource()==b4) {
new Registerlogin();

}
}


	public static void main(String args[]) {
	new hp();
	}
 }	