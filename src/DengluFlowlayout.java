import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DengluFlowlayout extends JFrame {
    public DengluFlowlayout() throws HeadlessException {
        JFrame frame = new JFrame();
        frame.setTitle ("顾客点菜");
        frame.setSize(450, 160);
        frame.setLocation (700,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 如果窗体内要添加其他的组件 按钮 输入框等 就需要先设置窗体的布局规则
// 一般使用流式布局
        FlowLayout flowLayout = new FlowLayout ();
        frame.setLayout (flowLayout);
// 创建组件对象
        JButton button = new JButton("确认"); // 按钮
        JButton button1=new JButton("用优惠券点单");
        JLabel nameJla = new JLabel("餐厅A或B");
        JTextField nameJtx = new JTextField();
        JLabel pwdJla = new JLabel("湘菜或川菜套餐");
        JTextField pwdJpf = new JTextField();
        Dimension dim = new Dimension(310,35);
        nameJtx.setPreferredSize(dim);
        pwdJpf.setPreferredSize(dim);

        frame.add(nameJla);
        frame.add(nameJtx);
        frame.add(pwdJla);
        frame.add(pwdJpf);
        frame.add(button);
        frame.add(button1);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rest=nameJtx.getText();
                String tp=pwdJpf.getText();
                if(rest.equals("A")||rest.equals("B")&&tp.equals("川菜")||tp.equals("湘菜"))
                    new Customer().serving(rest,tp);
                else System.out.println("输入信息有误，请重试");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rest=nameJtx.getText();
                String tp=pwdJpf.getText();
                if(rest.equals("A")||rest.equals("B")&&tp.equals("川菜")||tp.equals("湘菜"))
                    new Proxy(new Customer()).serving(rest,tp);
                else System.out.println("输入信息有误，请重试");
            }
        });
    }
}

