package search_tree_generics;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;


public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchTree tree = new SearchTree();
					
					tree.add("Joe", 80);
					tree.add("Jeff", 40);
					tree.add("Julie", 60);
					tree.add("Jason", 20);
					tree.add("Jenny", 120);
					tree.add("Jane", 10);
					tree.add("Jasper", 100);
					tree.add("Jonas", 70);					
					tree.add("Jules", 50);
					tree.add(true, 110);
					tree.add(10329, 90);
					tree.add(10.329, 30);
					tree.add("John", 5);
					tree.add("John", 15);
					tree.add("John", 25);
					tree.add("John", 35);
					tree.add("John", 45);
					tree.add("John", 55);
					tree.add("John", 65);
					tree.add("John", 75);
					tree.add("John", 150);
					tree.add("John", 140);
					tree.add("John", 85);
					tree.add("John", 95);
					tree.add("John", 105);
					tree.add("John", 115);
					tree.add("John", 135);
					tree.add("John", 145);
					tree.add("John", 160);
					tree.add("John", 155);
					tree.add("John", 165);
					
					MainView frame = new MainView(tree, "Before");
					
					tree.delete(40);
					
					MainView frame2 = new MainView(tree, "After delete 40");

					frame.setVisible(true);
					frame2.setVisible(true);
//					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView(SearchTree tree, String s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel p = new JPanel();
		contentPane.add(p);
		p.setLayout(null);
		
		JLabel l = new JLabel(s);
		l.setBounds(10, 10, 100, 20);
		p.add(l);
		
		int height = 0;
		
		JTextField t = new JTextField(""+tree.overallRoot.key);
		t.setBounds(400, 50, 40, 20);
		t.setBackground(Color.GRAY);
		t.setEditable(false);
		p.add(t);
		
		height++;
		
		if (tree.overallRoot.left !=null && tree.overallRoot.right !=null) {
			JTextField t1l = new JTextField(""+tree.overallRoot.left.key);
			t1l.setBounds(400 - (height * 200), (height * 50) + 30, 40, 20);
			t1l.setBackground(Color.GRAY);
			t1l.setEditable(false);
			p.add(t1l);
			
			JTextField t1r = new JTextField(""+tree.overallRoot.right.key);
			t1r.setBounds(400 + (height * 200), (height * 50) + 30, 40, 20);
			t1r.setBackground(Color.GRAY);
			t1r.setEditable(false);
			p.add(t1r);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.right ==null) {
			JTextField t1r = new JTextField(""+tree.overallRoot.right.key);
			t1r.setBounds(400 + (height * 200), (height * 50) + 30, 40, 20);
			t1r.setBackground(Color.GRAY);
			t1r.setEditable(false);
			p.add(t1r);
		}
		else if (tree.overallRoot.left ==null && tree.overallRoot.right !=null) {
			JTextField t1r = new JTextField(""+tree.overallRoot.right.key);
			t1r.setBounds(400 + (height * 200), (height * 50) + 30, 40, 20);
			t1r.setBackground(Color.GRAY);
			t1r.setEditable(false);
			p.add(t1r);				
		}
		
		
		height++;
		
		// left side - height 2
		if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.right !=null) {
			JTextField t2ll = new JTextField(""+tree.overallRoot.left.left.key);
			t2ll.setBounds(400 - (height * 150), (height * 50) + 30, 40, 20);
			t2ll.setBackground(Color.GRAY);
			t2ll.setEditable(false);
			p.add(t2ll);
			
			JTextField t2lr = new JTextField(""+tree.overallRoot.left.right.key);
			t2lr.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t2lr.setBackground(Color.GRAY);
			t2lr.setEditable(false);
			p.add(t2lr);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.right ==null) {
			JTextField t2ll = new JTextField(""+tree.overallRoot.left.left.key);
			t2ll.setBounds(400 - (height * 150), (height * 50) + 30, 40, 20);
			t2ll.setBackground(Color.GRAY);
			t2ll.setEditable(false);
			p.add(t2ll);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left == null && tree.overallRoot.left.right != null) {
			JTextField t2lr = new JTextField(""+tree.overallRoot.left.right.key);
			t2lr.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t2lr.setBackground(Color.GRAY);
			t2lr.setEditable(false);
			p.add(t2lr);
		}
		
		// right side - height 2
		if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.right !=null) {
			JTextField t2rl = new JTextField(""+tree.overallRoot.right.left.key);
			t2rl.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t2rl.setBackground(Color.GRAY);
			t2rl.setEditable(false);
			p.add(t2rl);
			
			JTextField t2rr = new JTextField(""+tree.overallRoot.right.right.key);
			t2rr.setBounds(400 + (height * 150), (height * 50) + 30, 40, 20);
			t2rr.setBackground(Color.GRAY);
			t2rr.setEditable(false);
			p.add(t2rr);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.right ==null) {
			JTextField t2rl = new JTextField(""+tree.overallRoot.right.left.key);
			t2rl.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t2rl.setBackground(Color.GRAY);
			t2rl.setEditable(false);
			p.add(t2rl);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left ==null && tree.overallRoot.right.right !=null) {
			JTextField t2rr = new JTextField(""+tree.overallRoot.right.right.key);
			t2rr.setBounds(400 + (height * 150), (height * 50) + 30, 40, 20);
			t2rr.setBackground(Color.GRAY);
			t2rr.setEditable(false);
			p.add(t2rr);
		}
		
		
		height++;

		// far left side - height 3
		
		if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.left.left !=null && tree.overallRoot.left.left.right !=null) {
			JTextField t3lll = new JTextField(""+tree.overallRoot.left.left.left.key);
			t3lll.setBounds(400 - (height * 115), (height * 50) + 30, 40, 20);
			t3lll.setBackground(Color.GRAY);
			t3lll.setEditable(false);
			p.add(t3lll);
			
			JTextField t3llr = new JTextField(""+tree.overallRoot.left.left.right.key);
			t3llr.setBounds(400 - (height * 90), (height * 50) + 30, 40, 20);
			t3llr.setBackground(Color.GRAY);
			t3llr.setEditable(false);
			p.add(t3llr);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.left.left !=null && tree.overallRoot.left.left.right ==null) {
			JTextField t3lll = new JTextField(""+tree.overallRoot.left.left.left.key);
			t3lll.setBounds(400 - (height * 115), (height * 50) + 30, 40, 20);
			t3lll.setBackground(Color.GRAY);
			t3lll.setEditable(false);
			p.add(t3lll);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.left.left ==null && tree.overallRoot.left.left.right !=null) {			
			JTextField t3llr = new JTextField(""+tree.overallRoot.left.left.right.key);
			t3llr.setBounds(400 - (height * 90), (height * 50) + 30, 40, 20);
			t3llr.setBackground(Color.GRAY);
			t3llr.setEditable(false);
			p.add(t3llr);
		}
		
		
		// left side - height 3
		if (tree.overallRoot.left !=null && tree.overallRoot.left.right !=null && tree.overallRoot.left.right.left !=null && tree.overallRoot.left.right.right !=null) {
			JTextField t3lrl = new JTextField(""+tree.overallRoot.left.right.left.key);
			t3lrl.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t3lrl.setBackground(Color.GRAY);
			t3lrl.setEditable(false);
			p.add(t3lrl);
			
			JTextField t3lrr = new JTextField(""+tree.overallRoot.left.right.right.key);
			t3lrr.setBounds(400 - (height * 25), (height * 50) + 30, 40, 20);
			t3lrr.setBackground(Color.GRAY);
			t3lrr.setEditable(false);
			p.add(t3lrr);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.right !=null && tree.overallRoot.left.right.left !=null && tree.overallRoot.left.right.right ==null) {
			JTextField t3lrl = new JTextField(""+tree.overallRoot.left.right.left.key);
			t3lrl.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t3lrl.setBackground(Color.GRAY);
			t3lrl.setEditable(false);
			p.add(t3lrl);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.right !=null && tree.overallRoot.left.right.left ==null && tree.overallRoot.left.right.right !=null) {
			JTextField t3lrr = new JTextField(""+tree.overallRoot.left.right.right.key);
			t3lrr.setBounds(400 - (height * 25), (height * 50) + 30, 40, 20);
			t3lrr.setBackground(Color.GRAY);
			t3lrr.setEditable(false);
			p.add(t3lrr);
		}
		
		
		// right side - height 3

		if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.left.left !=null && tree.overallRoot.right.left.right !=null) {
			JTextField t3rll = new JTextField(""+tree.overallRoot.right.left.left.key);
			t3rll.setBounds(400 + (height * 25), (height * 50) + 30, 40, 20);
			t3rll.setBackground(Color.GRAY);
			t3rll.setEditable(false);
			p.add(t3rll);
			
			JTextField t3rlr = new JTextField(""+tree.overallRoot.right.left.right.key);
			t3rlr.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t3rlr.setBackground(Color.GRAY);
			t3rlr.setEditable(false);
			p.add(t3rlr);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.left.left !=null && tree.overallRoot.right.left.right ==null) {
			JTextField t3rll = new JTextField(""+tree.overallRoot.right.left.left.key);
			t3rll.setBounds(400 + (height * 25), (height * 50) + 30, 40, 20);
			t3rll.setBackground(Color.GRAY);
			t3rll.setEditable(false);
			p.add(t3rll);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.left.left ==null && tree.overallRoot.right.left.right !=null) {
			JTextField t3rlr = new JTextField(""+tree.overallRoot.right.left.right.key);
			t3rlr.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t3rlr.setBackground(Color.GRAY);
			t3rlr.setEditable(false);
			p.add(t3rlr);
		}
		
		// far right side - height 3

		if (tree.overallRoot.right !=null && tree.overallRoot.right.right !=null && tree.overallRoot.right.right.left !=null && tree.overallRoot.right.right.right !=null) {
			JTextField t3rrl = new JTextField(""+tree.overallRoot.right.right.left.key);
			t3rrl.setBounds(400 + (height * 90), (height * 50) + 30, 40, 20);
			t3rrl.setBackground(Color.GRAY);
			t3rrl.setEditable(false);
			p.add(t3rrl);
			
			JTextField t3rrr = new JTextField(""+tree.overallRoot.right.right.right.key);
			t3rrr.setBounds(400 + (height * 115), (height * 50) + 30, 40, 20);
			t3rrr.setBackground(Color.GRAY);
			t3rrr.setEditable(false);
			p.add(t3rrr);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.right !=null && tree.overallRoot.right.right.left !=null && tree.overallRoot.right.right.right ==null) {
			JTextField t3rrl = new JTextField(""+tree.overallRoot.right.right.left.key);
			t3rrl.setBounds(400 + (height * 90), (height * 50) + 30, 40, 20);
			t3rrl.setBackground(Color.GRAY);
			t3rrl.setEditable(false);
			p.add(t3rrl);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.right !=null && tree.overallRoot.right.right.left ==null && tree.overallRoot.right.right.right !=null) {
			JTextField t3rrr = new JTextField(""+tree.overallRoot.right.right.right.key);
			t3rrr.setBounds(400 + (height * 115), (height * 50) + 30, 40, 20);
			t3rrr.setBackground(Color.GRAY);
			t3rrr.setEditable(false);
			p.add(t3rrr);
		}
		
		height++;

		// far far far left
		if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.left !=null &&
				tree.overallRoot.left.left.left !=null && 
				tree.overallRoot.left.left.left.left !=null && tree.overallRoot.left.left.left.right !=null) {
			
			JTextField t4llll = new JTextField(""+tree.overallRoot.left.left.left.left.key);
			t4llll.setBounds(400 - (height * 95), (height * 50) + 30, 40, 20);
			t4llll.setBackground(Color.GRAY);
			t4llll.setEditable(false);
			p.add(t4llll);
			
			JTextField t4lllr = new JTextField(""+tree.overallRoot.left.left.left.right.key);
			t4lllr.setBounds(400 - (height * 85), (height * 50) + 30, 40, 20);
			t4lllr.setBackground(Color.GRAY);
			t4lllr.setEditable(false);
			p.add(t4lllr);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.left !=null &&
				tree.overallRoot.left.left.left !=null && 
				tree.overallRoot.left.left.left.left !=null && tree.overallRoot.left.left.left.right ==null) {
			
			JTextField t4llll = new JTextField(""+tree.overallRoot.left.left.left.left.key);
			t4llll.setBounds(400 - (height * 95), (height * 50) + 30, 40, 20);
			t4llll.setBackground(Color.GRAY);
			t4llll.setEditable(false);
			p.add(t4llll);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.left !=null &&
				tree.overallRoot.left.left.left !=null && 
				tree.overallRoot.left.left.left.left ==null && tree.overallRoot.left.left.left.right !=null) {

			JTextField t4lllr = new JTextField(""+tree.overallRoot.left.left.left.right.key);
			t4lllr.setBounds(400 - (height * 85), (height * 50) + 30, 40, 20);
			t4lllr.setBackground(Color.GRAY);
			t4lllr.setEditable(false);
			p.add(t4lllr);
		}
		
		// far far left
		if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.left !=null &&
				tree.overallRoot.left.left.right !=null && 
				tree.overallRoot.left.left.right.left !=null && tree.overallRoot.left.left.right.right !=null) {
				
			JTextField t4llrl = new JTextField(""+tree.overallRoot.left.left.right.left.key);
			t4llrl.setBounds(400 - (height * 70), (height * 50) + 30, 40, 20);
			t4llrl.setBackground(Color.GRAY);
			t4llrl.setEditable(false);
			p.add(t4llrl);
			
			JTextField t4llrr = new JTextField(""+tree.overallRoot.left.left.right.right.key);
			t4llrr.setBounds(400 - (height * 60), (height * 50) + 30, 40, 20);
			t4llrr.setBackground(Color.GRAY);
			t4llrr.setEditable(false);
			p.add(t4llrr);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.left !=null &&
				tree.overallRoot.left.left.right !=null && 
				tree.overallRoot.left.left.right.left !=null && tree.overallRoot.left.left.right.right ==null) {
				
			JTextField t4llrl = new JTextField(""+tree.overallRoot.left.left.right.left.key);
			t4llrl.setBounds(400 - (height * 70), (height * 50) + 30, 40, 20);
			t4llrl.setBackground(Color.GRAY);
			t4llrl.setEditable(false);
			p.add(t4llrl);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.left !=null &&
				tree.overallRoot.left.left.right !=null && 
				tree.overallRoot.left.left.right.left ==null && tree.overallRoot.left.left.right.right !=null) {

			JTextField t4llrr = new JTextField(""+tree.overallRoot.left.left.right.right.key);
			t4llrr.setBounds(400 - (height * 60), (height * 50) + 30, 40, 20);
			t4llrr.setBackground(Color.GRAY);
			t4llrr.setEditable(false);
			p.add(t4llrr);
		}
		
		// far left
		if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.right !=null &&
				tree.overallRoot.left.right.left !=null && 
				tree.overallRoot.left.right.left.left !=null && tree.overallRoot.left.right.left.right !=null) {
				
			JTextField t4lrll = new JTextField(""+tree.overallRoot.left.right.left.left.key);
			t4lrll.setBounds(400 - (height * 45), (height * 50) + 30, 40, 20);
			t4lrll.setBackground(Color.GRAY);
			t4lrll.setEditable(false);
			p.add(t4lrll);
			
			JTextField t4lrlr = new JTextField(""+tree.overallRoot.left.right.left.right.key);
			t4lrlr.setBounds(400 - (height * 35), (height * 50) + 30, 40, 20);
			t4lrlr.setBackground(Color.GRAY);
			t4lrlr.setEditable(false);
			p.add(t4lrlr);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.right !=null &&
				tree.overallRoot.left.right.left !=null && 
				tree.overallRoot.left.right.left.left !=null && tree.overallRoot.left.right.left.right ==null) {
				
			JTextField t4lrll = new JTextField(""+tree.overallRoot.left.right.left.left.key);
			t4lrll.setBounds(400 - (height * 45), (height * 50) + 30, 40, 20);
			t4lrll.setBackground(Color.GRAY);
			t4lrll.setEditable(false);
			p.add(t4lrll);
		}		
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.right !=null &&
				tree.overallRoot.left.right.left !=null && 
				tree.overallRoot.left.right.left.left ==null && tree.overallRoot.left.right.left.right !=null) {

			JTextField t4lrlr = new JTextField(""+tree.overallRoot.left.right.left.right.key);
			t4lrlr.setBounds(400 - (height * 35), (height * 50) + 30, 40, 20);
			t4lrlr.setBackground(Color.GRAY);
			t4lrlr.setEditable(false);
			p.add(t4lrlr);
		}
		
		// left
		if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.right !=null &&
				tree.overallRoot.left.right.right !=null && 
				tree.overallRoot.left.right.right.left !=null && tree.overallRoot.left.right.right.right !=null) {
				
			JTextField t4lrrl = new JTextField(""+tree.overallRoot.left.right.right.left.key);
			t4lrrl.setBounds(400 - (height * 20), (height * 50) + 30, 40, 20);
			t4lrrl.setBackground(Color.GRAY);
			t4lrrl.setEditable(false);
			p.add(t4lrrl);
			
			JTextField t4lrrr = new JTextField(""+tree.overallRoot.left.right.right.right.key);
			t4lrrr.setBounds(400 - (height * 10), (height * 50) + 30, 40, 20);
			t4lrrr.setBackground(Color.GRAY);
			t4lrrr.setEditable(false);
			p.add(t4lrrr);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.right !=null &&
				tree.overallRoot.left.right.right !=null && 
				tree.overallRoot.left.right.right.left !=null && tree.overallRoot.left.right.right.right ==null) {
				
			JTextField t4lrrl = new JTextField(""+tree.overallRoot.left.right.right.left.key);
			t4lrrl.setBounds(400 - (height * 20), (height * 50) + 30, 40, 20);
			t4lrrl.setBackground(Color.GRAY);
			t4lrrl.setEditable(false);
			p.add(t4lrrl);
		}
		else if (tree.overallRoot.left !=null &&
				tree.overallRoot.left.right !=null &&
				tree.overallRoot.left.right.right !=null && 
				tree.overallRoot.left.right.right.left ==null && tree.overallRoot.left.right.right.right !=null) {
			
			JTextField t4lrrr = new JTextField(""+tree.overallRoot.left.right.right.right.key);
			t4lrrr.setBounds(400 - (height * 10), (height * 50) + 30, 40, 20);
			t4lrrr.setBackground(Color.GRAY);
			t4lrrr.setEditable(false);
			p.add(t4lrrr);
		}
		
		// right
		if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.left !=null &&
				tree.overallRoot.right.left.left !=null && 
				tree.overallRoot.right.left.left.left !=null && tree.overallRoot.right.left.left.right !=null) {
				
			JTextField t4rlll = new JTextField(""+tree.overallRoot.right.left.left.left.key);
			t4rlll.setBounds(400 + (height * 10), (height * 50) + 30, 40, 20);
			t4rlll.setBackground(Color.GRAY);
			t4rlll.setEditable(false);
			p.add(t4rlll);
			
			JTextField t4rllr = new JTextField(""+tree.overallRoot.right.left.left.right.key);
			t4rllr.setBounds(400 + (height * 20), (height * 50) + 30, 40, 20);
			t4rllr.setBackground(Color.GRAY);
			t4rllr.setEditable(false);
			p.add(t4rllr);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.left !=null &&
				tree.overallRoot.right.left.left !=null && 
				tree.overallRoot.right.left.left.left !=null && tree.overallRoot.right.left.left.right ==null) {
				
			JTextField t4rlll = new JTextField(""+tree.overallRoot.right.left.left.left.key);
			t4rlll.setBounds(400 + (height * 10), (height * 50) + 30, 40, 20);
			t4rlll.setBackground(Color.GRAY);
			t4rlll.setEditable(false);
			p.add(t4rlll);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.left !=null &&
				tree.overallRoot.right.left.left !=null && 
				tree.overallRoot.right.left.left.left ==null && tree.overallRoot.right.left.left.right !=null) {

			JTextField t4rllr = new JTextField(""+tree.overallRoot.right.left.left.right.key);
			t4rllr.setBounds(400 + (height * 20), (height * 50) + 30, 40, 20);
			t4rllr.setBackground(Color.GRAY);
			t4rllr.setEditable(false);
			p.add(t4rllr);
		}

		// far right
		if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.left !=null &&
				tree.overallRoot.right.left.right !=null && 
				tree.overallRoot.right.left.right.left !=null && tree.overallRoot.right.left.right.right !=null) {
				
			JTextField t4rlrl = new JTextField(""+tree.overallRoot.right.left.right.left.key);
			t4rlrl.setBounds(400 + (height * 35), (height * 50) + 30, 40, 20);
			t4rlrl.setBackground(Color.GRAY);
			t4rlrl.setEditable(false);
			p.add(t4rlrl);
			
			JTextField t4rlrr = new JTextField(""+tree.overallRoot.right.left.right.right.key);
			t4rlrr.setBounds(400 + (height * 45), (height * 50) + 30, 40, 20);
			t4rlrr.setBackground(Color.GRAY);
			t4rlrr.setEditable(false);
			p.add(t4rlrr);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.left !=null &&
				tree.overallRoot.right.left.right !=null && 
				tree.overallRoot.right.left.right.left !=null && tree.overallRoot.right.left.right.right ==null) {
				
			JTextField t4rlrl = new JTextField(""+tree.overallRoot.right.left.right.left.key);
			t4rlrl.setBounds(400 + (height * 35), (height * 50) + 30, 40, 20);
			t4rlrl.setBackground(Color.GRAY);
			t4rlrl.setEditable(false);
			p.add(t4rlrl);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.left !=null &&
				tree.overallRoot.right.left.right !=null && 
				tree.overallRoot.right.left.right.left ==null && tree.overallRoot.right.left.right.right !=null) {

			JTextField t4rlrr = new JTextField(""+tree.overallRoot.right.left.right.right.key);
			t4rlrr.setBounds(400 + (height * 45), (height * 50) + 30, 40, 20);
			t4rlrr.setBackground(Color.GRAY);
			t4rlrr.setEditable(false);
			p.add(t4rlrr);
		}
		
		// far far right
		if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.right !=null &&
				tree.overallRoot.right.right.left !=null && 
				tree.overallRoot.right.right.left.left !=null && tree.overallRoot.right.right.left.right !=null) {
				
			JTextField t4rrll = new JTextField(""+tree.overallRoot.right.right.left.left.key);
			t4rrll.setBounds(400 + (height * 60), (height * 50) + 30, 40, 20);
			t4rrll.setBackground(Color.GRAY);
			t4rrll.setEditable(false);
			p.add(t4rrll);
			
			JTextField t4rrlr = new JTextField(""+tree.overallRoot.right.right.left.right.key);
			t4rrlr.setBounds(400 + (height * 70), (height * 50) + 30, 40, 20);
			t4rrlr.setBackground(Color.GRAY);
			t4rrlr.setEditable(false);
			p.add(t4rrlr);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.right !=null &&
				tree.overallRoot.right.right.left !=null && 
				tree.overallRoot.right.right.left.left !=null && tree.overallRoot.right.right.left.right ==null) {
				
			JTextField t4rrll = new JTextField(""+tree.overallRoot.right.right.left.left.key);
			t4rrll.setBounds(400 + (height * 60), (height * 50) + 30, 40, 20);
			t4rrll.setBackground(Color.GRAY);
			t4rrll.setEditable(false);
			p.add(t4rrll);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.right !=null &&
				tree.overallRoot.right.right.left !=null && 
				tree.overallRoot.right.right.left.left ==null && tree.overallRoot.right.right.left.right !=null) {
			
			JTextField t4rrlr = new JTextField(""+tree.overallRoot.right.right.left.right.key);
			t4rrlr.setBounds(400 + (height * 70), (height * 50) + 30, 40, 20);
			t4rrlr.setBackground(Color.GRAY);
			t4rrlr.setEditable(false);
			p.add(t4rrlr);
		}
		
		// far far far right
		if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.right !=null &&
				tree.overallRoot.right.right.right !=null && 
				tree.overallRoot.right.right.right.left !=null && tree.overallRoot.right.right.left.right !=null) {
				
			JTextField t4rrrl = new JTextField(""+tree.overallRoot.right.right.right.left.key);
			t4rrrl.setBounds(400 + (height * 85), (height * 50) + 30, 40, 20);
			t4rrrl.setBackground(Color.GRAY);
			t4rrrl.setEditable(false);
			p.add(t4rrrl);
			
			JTextField t4rrrr = new JTextField(""+tree.overallRoot.right.right.right.right.key);
			t4rrrr.setBounds(400 + (height * 95), (height * 50) + 30, 40, 20);
			t4rrrr.setBackground(Color.GRAY);
			t4rrrr.setEditable(false);
			p.add(t4rrrr);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.right !=null &&
				tree.overallRoot.right.right.right !=null && 
				tree.overallRoot.right.right.right.left !=null && tree.overallRoot.right.right.left.right ==null) {
				
			JTextField t4rrrl = new JTextField(""+tree.overallRoot.right.right.right.left.key);
			t4rrrl.setBounds(400 + (height * 85), (height * 50) + 30, 40, 20);
			t4rrrl.setBackground(Color.GRAY);
			t4rrrl.setEditable(false);
			p.add(t4rrrl);
		}
		else if (tree.overallRoot.right !=null &&
				tree.overallRoot.right.right !=null &&
				tree.overallRoot.right.right.right !=null && 
				tree.overallRoot.right.right.right.left ==null && tree.overallRoot.right.right.left.right !=null) {
				
			JTextField t4rrrr = new JTextField(""+tree.overallRoot.right.right.right.right.key);
			t4rrrr.setBounds(400 + (height * 95), (height * 50) + 30, 40, 20);
			t4rrrr.setBackground(Color.GRAY);
			t4rrrr.setEditable(false);
			p.add(t4rrrr);
		}

		
				
	}
}
