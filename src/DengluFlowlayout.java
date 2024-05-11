import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DengluFlowlayout extends JFrame {
    public DengluFlowlayout() throws HeadlessException {
        JFrame frame = new JFrame();
        frame.setTitle ("�˿͵��");
        frame.setSize(450, 160);
        frame.setLocation (700,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// ���������Ҫ������������ ��ť ������ ����Ҫ�����ô���Ĳ��ֹ���
// һ��ʹ����ʽ����
        FlowLayout flowLayout = new FlowLayout ();
        frame.setLayout (flowLayout);
// �����������
        JButton button = new JButton("ȷ��"); // ��ť
        JButton button1=new JButton("���Ż�ȯ�㵥");
        JLabel nameJla = new JLabel("����A��B");
        JTextField nameJtx = new JTextField();
        JLabel pwdJla = new JLabel("��˻򴨲��ײ�");
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
                if(rest.equals("A")||rest.equals("B")&&tp.equals("����")||tp.equals("���"))
                    new Customer().serving(rest,tp);
                else System.out.println("������Ϣ����������");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rest=nameJtx.getText();
                String tp=pwdJpf.getText();
                if(rest.equals("A")||rest.equals("B")&&tp.equals("����")||tp.equals("���"))
                    new Proxy(new Customer()).serving(rest,tp);
                else System.out.println("������Ϣ����������");
            }
        });
    }
}

