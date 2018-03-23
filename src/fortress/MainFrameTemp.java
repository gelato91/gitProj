package fortress;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import fortress.controllers.ProgramController;

public class MainFrameTemp extends JFrame{
	MainFrameTemp(ProgramController gc)
	{
		
		setVisible(true);
		setBounds(300,400,800,600);
		addMouseListener(gc);
		addKeyListener(gc);
		
		JPanel jp = (JPanel)this.getContentPane();
		jp.setBorder(LineBorder.createBlackLineBorder());
		jp.setBounds(20,10,700,500);
		
		JLabel jl = new JLabel("Label On JPanel");
		jp.add(jl);
		
	}
}
