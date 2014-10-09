package search_tree;
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
					tree.add(60);
					tree.add(20);
					tree.add(10);
					tree.add(40);
					tree.add(30);
					tree.add(50);
					tree.add(70);
					
					tree.add(5);
					tree.add(15);
					tree.add(80);
					tree.add(65);
					tree.add(62);
					tree.add(67);
					tree.add(85);
					tree.add(75);
					
					
					
					MainView frame = new MainView(tree, "Before");					
					tree.delete(20);
					
					MainView frame2 = new MainView(tree, "After delete 20");
//					
//					tree.delete(40);
//					
//					MainView frame3 = new MainView(tree, "After delete 40");
//					
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
		
		JTextField t = new JTextField(""+tree.overallRoot.value);
		t.setBounds(400, 50, 40, 20);
		t.setBackground(Color.GRAY);
		t.setEditable(false);
		p.add(t);
		
		height++;
		
		if (tree.overallRoot.left !=null && tree.overallRoot.right !=null) {
			JTextField t1l = new JTextField(""+tree.overallRoot.left.value);
			t1l.setBounds(400 - (height * 200), (height * 50) + 30, 40, 20);
			t1l.setBackground(Color.GRAY);
			t1l.setEditable(false);
			p.add(t1l);
			
			JTextField t1r = new JTextField(""+tree.overallRoot.right.value);
			t1r.setBounds(400 + (height * 200), (height * 50) + 30, 40, 20);
			t1r.setBackground(Color.GRAY);
			t1r.setEditable(false);
			p.add(t1r);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.right ==null) {
			JTextField t1r = new JTextField(""+tree.overallRoot.right.value);
			t1r.setBounds(400 + (height * 200), (height * 50) + 30, 40, 20);
			t1r.setBackground(Color.GRAY);
			t1r.setEditable(false);
			p.add(t1r);
		}
		else if (tree.overallRoot.left ==null && tree.overallRoot.right !=null) {
			JTextField t1r = new JTextField(""+tree.overallRoot.right.value);
			t1r.setBounds(400 + (height * 200), (height * 50) + 30, 40, 20);
			t1r.setBackground(Color.GRAY);
			t1r.setEditable(false);
			p.add(t1r);				
		}
		
		
		height++;
		
		// left side - height 2
		if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.right !=null) {
			JTextField t2ll = new JTextField(""+tree.overallRoot.left.left.value);
			t2ll.setBounds(400 - (height * 150), (height * 50) + 30, 40, 20);
			t2ll.setBackground(Color.GRAY);
			t2ll.setEditable(false);
			p.add(t2ll);
			
			JTextField t2lr = new JTextField(""+tree.overallRoot.left.right.value);
			t2lr.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t2lr.setBackground(Color.GRAY);
			t2lr.setEditable(false);
			p.add(t2lr);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.right ==null) {
			JTextField t2ll = new JTextField(""+tree.overallRoot.left.left.value);
			t2ll.setBounds(400 - (height * 150), (height * 50) + 30, 40, 20);
			t2ll.setBackground(Color.GRAY);
			t2ll.setEditable(false);
			p.add(t2ll);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left == null && tree.overallRoot.left.right != null) {
			JTextField t2lr = new JTextField(""+tree.overallRoot.left.right.value);
			t2lr.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t2lr.setBackground(Color.GRAY);
			t2lr.setEditable(false);
			p.add(t2lr);
		}
		
		// right side - height 2
		if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.right !=null) {
			JTextField t2rl = new JTextField(""+tree.overallRoot.right.left.value);
			t2rl.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t2rl.setBackground(Color.GRAY);
			t2rl.setEditable(false);
			p.add(t2rl);
			
			JTextField t2rr = new JTextField(""+tree.overallRoot.right.right.value);
			t2rr.setBounds(400 + (height * 150), (height * 50) + 30, 40, 20);
			t2rr.setBackground(Color.GRAY);
			t2rr.setEditable(false);
			p.add(t2rr);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.right ==null) {
			JTextField t2rl = new JTextField(""+tree.overallRoot.right.left.value);
			t2rl.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t2rl.setBackground(Color.GRAY);
			t2rl.setEditable(false);
			p.add(t2rl);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left ==null && tree.overallRoot.right.right !=null) {
			JTextField t2rr = new JTextField(""+tree.overallRoot.right.right.value);
			t2rr.setBounds(400 + (height * 150), (height * 50) + 30, 40, 20);
			t2rr.setBackground(Color.GRAY);
			t2rr.setEditable(false);
			p.add(t2rr);
		}
		
		
		height++;

		// far left side - height 3
		
		if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.left.left !=null && tree.overallRoot.left.left.right !=null) {
			JTextField t3lll = new JTextField(""+tree.overallRoot.left.left.left.value);
			t3lll.setBounds(400 - (height * 115), (height * 50) + 30, 40, 20);
			t3lll.setBackground(Color.GRAY);
			t3lll.setEditable(false);
			p.add(t3lll);
			
			JTextField t3llr = new JTextField(""+tree.overallRoot.left.left.right.value);
			t3llr.setBounds(400 - (height * 90), (height * 50) + 30, 40, 20);
			t3llr.setBackground(Color.GRAY);
			t3llr.setEditable(false);
			p.add(t3llr);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.left.left !=null && tree.overallRoot.left.left.right ==null) {
			JTextField t3lll = new JTextField(""+tree.overallRoot.left.left.left.value);
			t3lll.setBounds(400 - (height * 115), (height * 50) + 30, 40, 20);
			t3lll.setBackground(Color.GRAY);
			t3lll.setEditable(false);
			p.add(t3lll);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.left !=null && tree.overallRoot.left.left.left ==null && tree.overallRoot.left.left.right !=null) {			
			JTextField t3llr = new JTextField(""+tree.overallRoot.left.left.right.value);
			t3llr.setBounds(400 - (height * 90), (height * 50) + 30, 40, 20);
			t3llr.setBackground(Color.GRAY);
			t3llr.setEditable(false);
			p.add(t3llr);
		}
		
		
		// left side - height 3
		if (tree.overallRoot.left !=null && tree.overallRoot.left.right !=null && tree.overallRoot.left.right.left !=null && tree.overallRoot.left.right.right !=null) {
			JTextField t3lrl = new JTextField(""+tree.overallRoot.left.right.left.value);
			t3lrl.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t3lrl.setBackground(Color.GRAY);
			t3lrl.setEditable(false);
			p.add(t3lrl);
			
			JTextField t3lrr = new JTextField(""+tree.overallRoot.left.right.right.value);
			t3lrr.setBounds(400 - (height * 25), (height * 50) + 30, 40, 20);
			t3lrr.setBackground(Color.GRAY);
			t3lrr.setEditable(false);
			p.add(t3lrr);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.right !=null && tree.overallRoot.left.right.left !=null && tree.overallRoot.left.right.right ==null) {
			JTextField t3lrl = new JTextField(""+tree.overallRoot.left.right.left.value);
			t3lrl.setBounds(400 - (height * 50), (height * 50) + 30, 40, 20);
			t3lrl.setBackground(Color.GRAY);
			t3lrl.setEditable(false);
			p.add(t3lrl);
		}
		else if (tree.overallRoot.left !=null && tree.overallRoot.left.right !=null && tree.overallRoot.left.right.left ==null && tree.overallRoot.left.right.right !=null) {
			JTextField t3lrr = new JTextField(""+tree.overallRoot.left.right.right.value);
			t3lrr.setBounds(400 - (height * 25), (height * 50) + 30, 40, 20);
			t3lrr.setBackground(Color.GRAY);
			t3lrr.setEditable(false);
			p.add(t3lrr);
		}
		
		
		// right side - height 3

		if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.left.left !=null && tree.overallRoot.right.left.right !=null) {
			JTextField t3rll = new JTextField(""+tree.overallRoot.right.left.left.value);
			t3rll.setBounds(400 + (height * 25), (height * 50) + 30, 40, 20);
			t3rll.setBackground(Color.GRAY);
			t3rll.setEditable(false);
			p.add(t3rll);
			
			JTextField t3rlr = new JTextField(""+tree.overallRoot.right.left.right.value);
			t3rlr.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t3rlr.setBackground(Color.GRAY);
			t3rlr.setEditable(false);
			p.add(t3rlr);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.left.left !=null && tree.overallRoot.right.left.right ==null) {
			JTextField t3rll = new JTextField(""+tree.overallRoot.right.left.left.value);
			t3rll.setBounds(400 + (height * 25), (height * 50) + 30, 40, 20);
			t3rll.setBackground(Color.GRAY);
			t3rll.setEditable(false);
			p.add(t3rll);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.left !=null && tree.overallRoot.right.left.left ==null && tree.overallRoot.right.left.right !=null) {
			JTextField t3rlr = new JTextField(""+tree.overallRoot.right.left.right.value);
			t3rlr.setBounds(400 + (height * 50), (height * 50) + 30, 40, 20);
			t3rlr.setBackground(Color.GRAY);
			t3rlr.setEditable(false);
			p.add(t3rlr);
		}
		
		// far right side - height 3

		if (tree.overallRoot.right !=null && tree.overallRoot.right.right !=null && tree.overallRoot.right.right.left !=null && tree.overallRoot.right.right.right !=null) {
			JTextField t3rrl = new JTextField(""+tree.overallRoot.right.right.left.value);
			t3rrl.setBounds(400 + (height * 90), (height * 50) + 30, 40, 20);
			t3rrl.setBackground(Color.GRAY);
			t3rrl.setEditable(false);
			p.add(t3rrl);
			
			JTextField t3rrr = new JTextField(""+tree.overallRoot.right.right.right.value);
			t3rrr.setBounds(400 + (height * 115), (height * 50) + 30, 40, 20);
			t3rrr.setBackground(Color.GRAY);
			t3rrr.setEditable(false);
			p.add(t3rrr);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.right !=null && tree.overallRoot.right.right.left !=null && tree.overallRoot.right.right.right ==null) {
			JTextField t3rrl = new JTextField(""+tree.overallRoot.right.right.left.value);
			t3rrl.setBounds(400 + (height * 90), (height * 50) + 30, 40, 20);
			t3rrl.setBackground(Color.GRAY);
			t3rrl.setEditable(false);
			p.add(t3rrl);
		}
		else if (tree.overallRoot.right !=null && tree.overallRoot.right.right !=null && tree.overallRoot.right.right.left ==null && tree.overallRoot.right.right.right !=null) {
			JTextField t3rrr = new JTextField(""+tree.overallRoot.right.right.right.value);
			t3rrr.setBounds(400 + (height * 115), (height * 50) + 30, 40, 20);
			t3rrr.setBackground(Color.GRAY);
			t3rrr.setEditable(false);
			p.add(t3rrr);
		}		
	}
}
