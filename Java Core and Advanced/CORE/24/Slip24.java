// Write a Java Program to accept the details of Employee(Eno, EName,Sal) from the user and display it on the next Frame. (Use AWT)

import java.awt.*;
import java.awt.event.*;

class EmployeeDetails implements ActionListener {
    Frame f;
    Label empno, empname, sal, basic, hr;
    TextField tempno, tempname, tsal, tbasic, thr;
    Button next;

    EmployeeDetails() {
        f = new Frame("\t Employee Details:");
        empno = new Label("\t Employee Id:");
        empname = new Label("\t Employee Name:");
        sal = new Label("\t Employee Sal:");
        basic = new Label("\t Employee Basic:");
        hr = new Label("\t Employee Hr:");
        tempno = new TextField(20);
        tempname = new TextField(20);
        tsal = new TextField(20);
        tbasic = new TextField(20);
        thr = new TextField(20);
        next = new Button("Next");
        f.add(empno);
        f.add(tempno);
        f.add(empname);
        f.add(tempname);
        f.add(sal);
        f.add(tsal);
        f.add(basic);
        f.add(tbasic);
        f.add(hr);
        f.add(thr);
        f.add(next);
        next.addActionListener(this);
        f.setLayout(new FlowLayout());
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String empno, empname, sal, basic, hr;
        empno = tempno.getText();
        empname = tempname.getText();
        sal = tsal.getText();
        basic = tbasic.getText();
        hr = thr.getText();
        ;
        f.setVisible(false);
        new FrameDetails(empno, empname, sal, basic, hr);
    }
}

class FrameDetails extends Frame {
    Frame f;
    Label empno, empname, sal, basic, hr;
    TextField tempno, tempname, tsal, tbasic, thr;

    FrameDetails(String no, String name, String s, String add, String d) {
        f = new Frame("\t Payment Details:");
        empno = new Label("\t E-ID:");
        empname = new Label("\t E-Name:");
        sal = new Label("\t Salary:");
        basic = new Label("\t Basic:");
        hr = new Label("\t Hr:");
        tempno = new TextField(20);
        tempname = new TextField(20);
        tsal = new TextField(20);
        tbasic = new TextField(20);
        thr = new TextField(20);
        f.add(empno);
        f.add(tempno);
        f.add(empname);
        f.add(tempname);
        f.add(sal);
        f.add(tsal);
        f.add(basic);
        f.add(tbasic);
        f.add(hr);
        f.add(thr);
        tempno.setText(no);
        tempname.setText(name);
        tsal.setText(s);
        tbasic.setText(add);
        thr.setText(d);
        f.setLayout(new FlowLayout());
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

class Slip24 {
    public static void main(String args[]) {
        new EmployeeDetails();
    }
}