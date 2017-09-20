import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button bt=new Button("exit");
    private Button ad=new Button("add");
    private Label la=new Label("0");
    private int n=0;
    public MainFrame(){
        initComp();
    }

    private void initComp(){
        this.setBounds(100,120,400,300);
        this.add(bt);
        this.add(ad);
        this.add(la);
        bt.setBackground(Color.BLUE);
        ad.setBackground(Color.CYAN);
        bt.setBounds(150,110,80,30);
        ad.setBounds(150,80,80,30);
        la.setBounds(150,170,80,30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                la.setText(Integer.toString(n));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
