package org.example.P16Meditator;

import org.example.P16Meditator.colleague.Button;
import org.example.P16Meditator.colleague.Checkbox;
import org.example.P16Meditator.colleague.TextFiled;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

    private Checkbox checkboxGuest;
    private Checkbox checkboxLogin;
    private TextFiled textUsername;
    private TextFiled textPasswd;
    private Button buttonOK;
    private Button buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        createColleagues();

        add(checkboxGuest);
        add(checkboxLogin);
        add(new Label("username:"));
        add(textUsername);
        add(new Label("password:"));
        add(textPasswd);
        add(buttonOK);
        add(buttonCancel);

        // 设置初始的启用/禁用状态
        colleagueChanged();

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    /**
     * 生成各个Colleague
     */
    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkboxGuest = new Checkbox("Guest", g, true);
        checkboxLogin = new Checkbox("Login", g, false);
        textUsername = new TextFiled("", 10);
        textPasswd = new TextFiled("", 10);
        textPasswd.setEchoChar('*');
        buttonOK = new Button("OK");
        buttonCancel = new Button("Cancel");

        // 设置Mediator
        checkboxGuest.setMediator(this);
        checkboxLogin.setMediator(this);
        textUsername.setMediator(this);
        textPasswd.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);

        // 设置Listener
        checkboxGuest.addItemListener(checkboxGuest);
        checkboxLogin.addItemListener(checkboxLogin);
        textUsername.addTextListener(textUsername);
        textPasswd.addTextListener(textPasswd);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    /**
     * 当有组员报告状态后，就开始处理相关联的状态变化
     */
    @Override
    public void colleagueChanged() {
        if(checkboxGuest.getState()) { // Guest状态
            textUsername.setColleagueEnable(false);
            textPasswd.setColleagueEnable(false);
            buttonOK.setColleagueEnable(true);
        } else { // Login状态
            textUsername.setColleagueEnable(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if(!textUsername.getText().isEmpty()) {
            textPasswd.setColleagueEnable(true);
            if(!textPasswd.getText().isEmpty()) {
                buttonOK.setColleagueEnable(true);
            } else {
                buttonOK.setColleagueEnable(false);
            }
        } else {
            textPasswd.setColleagueEnable(false);
            buttonOK.setColleagueEnable(false);
        }
    }
}
