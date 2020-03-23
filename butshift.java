import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener 
{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, start;
	JLabel lw, ld;
	Font f;
	boolean st = false;
	int xsh=200, ysh=200;
	int xt, yt;
	int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8;
	FDemo() {
		f = new Font("Arial Black", Font.BOLD, 30);
		setFont(f);
		setLayout(null);
		
		start = new JButton("START");
		start.setSize(200,60);
		start.setLocation(150,20);
		start.setFont(f);
		add(start);
		
		b1 = new JButton("6");
		b1.setSize(100,100);
		b1.setLocation(100,100);
		x1=100; y1=100;
		b1.setFont(f);
		add(b1);
		b2 = new JButton("3");
		b2.setSize(100,100);
		b2.setLocation(200,100);
		x2=200; y2=100;
		b2.setFont(f);
		add(b2);
		b3 = new JButton("7");
		b3.setSize(100,100);
		b3.setLocation(300,100);
		x3=300; y3=100;
		b3.setFont(f);
		add(b3);
		b4 = new JButton("2");
		b4.setSize(100,100);
		b4.setLocation(100,200);
		x4=100; y4=200;
		b4.setFont(f);
		add(b4);
		b5 = new JButton("5");
		b5.setSize(100,100);
		b5.setLocation(300,200);
		x5=300; y5=200;
		b5.setFont(f);
		add(b5);
		b6 = new JButton("1");
		b6.setSize(100,100);
		b6.setLocation(300,300);
		x6=300; y6=300;
		b6.setFont(f);
		add(b6);
		b7 = new JButton("4");
		b7.setSize(100,100);
		b7.setLocation(100,300);
		x7=100; y7=300;
		b7.setFont(f);
		add(b7);
		b8 = new JButton("8");
		b8.setSize(100,100);
		b8.setLocation(200,300);
		x8=200; y8=300;
		b8.setFont(f);
		add(b8);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		start.addActionListener(this);
	}
	int x=1, var;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start) { st = true; }
		
		if(st) {
			if(e.getSource() == b1) {
				xt=x1; yt=y1;
				x1=xsh; y1=ysh;
				xsh=xt; ysh=yt;
				b1.setLocation(x1,y1);
			}
			if(e.getSource() == b2) {
				xt=x2; yt=y2;
				x2=xsh; y2=ysh;
				xsh=xt; ysh=yt;
				b2.setLocation(x2,y2);
			}
			if(e.getSource() == b3) {
				xt=x3; yt=y3;
				x3=xsh; y3=ysh;
				xsh=xt; ysh=yt;
				b3.setLocation(x3,y3);
			}
			if(e.getSource() == b4) {
				xt=x4; yt=y4;
				x4=xsh; y4=ysh;
				xsh=xt; ysh=yt;
				b4.setLocation(x4,y4);
			}
			if(e.getSource() == b5) {
				xt=x5; yt=y5;
				x5=xsh; y5=ysh;
				xsh=xt; ysh=yt;
				b5.setLocation(x5,y5);
			}
			if(e.getSource() == b6) {
				xt=x6; yt=y6;
				x6=xsh; y6=ysh;
				xsh=xt; ysh=yt;
				b6.setLocation(x6,y6);
			}
			if(e.getSource() == b7) {
				xt=x7; yt=y7;
				x7=xsh; y7=ysh;
				xsh=xt; ysh=yt;
				b7.setLocation(x7,y7);
			}
			if(e.getSource() == b8) {
				xt=x8; yt=y8;
				x8=xsh; y8=ysh;
				xsh=xt; ysh=yt;
				b8.setLocation(x8,y8);
			}
			if((x1==300 && x2==300 && x3==100 && x7==100 && x6==100 && x4==200 && x5==200 && x8==200) && (y1==200 && y5==200 && y7==200 && y8==100 && y3==100 && y2==300 && y4==300 && y6==300))  {var=1;}
			else if(x==50) {var=2;}
				
			if(var==1) {
				lw = new JLabel("You Wins");
				lw.setSize(200,100);
				lw.setLocation(150,500);
				lw.setFont(f);
				add(lw);
			}
			if(var==2) {
				ld = new JLabel("Game Over");
				ld.setSize(200,100);
				ld.setLocation(150,500);
				ld.setFont(f);
				add(ld);
			}
			}
			System.out.println("Button Clicked!!");
			System.out.println(x);
			x++;
		}
		
	}


class Buttshift {
	public static void main(String Args[]) 
	{
		FDemo f = new FDemo();
		f.setBackground(Color.cyan);
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(100,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}


/*
	We raise the prayers and illuminates the nights,
	Be you get infinite praise and your assets reach new heights;
	On this day your health be the best and you be all Diseases' frights,
	You attain all you're destined to have and your limits gets past, like the clouds crossing kites.
	
	Happy Dhanteras 
	By Sarthak Kale
*/