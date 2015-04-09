/**
 * 第四题
 * @author 王倩倩
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowsString {
	private static int x=200;
	private static int y=300;
	public static void main(String[] args) {
		JFrame jf=new JFrame("移动的文字");
		final JPanel jp=new JPanel(){
			public void paint(Graphics g){
				Graphics2D g2=(Graphics2D) g;
				g2.setColor(Color.white);
				g2.fillRect(0, 0, 500, 400);
				g2.setColor(Color.black);
				g2.drawString("helloWorld", x, y);
			}
		};
		jp.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				x=e.getX();
				y=e.getY();
				jp.repaint();
				
			}
		});
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
}
