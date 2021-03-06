package it.unisalento.pps.view.GUI;

import it.unisalento.pps.business.LoginBusiness;
import it.unisalento.pps.model.Utente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JFrame {
    private JPanel mainPnl;
    private JPanel northPnl;
    private JPanel centerPnl;
    private JPanel southPnl;
    private JLabel lblCredenziali;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;


//----------- ACTION LISTENER -------------

    public LoginFrame() {
        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento catturato!");

                if(e.getSource() instanceof JButton
                        || e.getSource() instanceof JTextField
                        || e.getSource() instanceof  JPasswordField) {

                    String username = getTxtUsername().getText();
                    String password = new String(getTxtPassword().getPassword());

                    Utente u = LoginBusiness.getInstance().effettuaLogin(username, password);

                    if (u != null) {
                        JOptionPane.showMessageDialog(null,"LOGIN OK!");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Il login non è andato a buon fine...");
                    }
                }
            }
        });
    }

    


    // getter and setter

    public JPanel getMainPnl() {
        return mainPnl;
    }

    public void setMainPnl(JPanel mainPnl) {
        this.mainPnl = mainPnl;
    }

    public JPanel getNorthPnl() {
        return northPnl;
    }

    public void setNorthPnl(JPanel northPnl) {
        this.northPnl = northPnl;
    }

    public JPanel getCenterPnl() {
        return centerPnl;
    }

    public void setCenterPnl(JPanel centerPnl) {
        this.centerPnl = centerPnl;
    }

    public JPanel getSouthPnl() {
        return southPnl;
    }

    public void setSouthPnl(JPanel southPnl) {
        this.southPnl = southPnl;
    }

    public JLabel getLblCredenziali() {
        return lblCredenziali;
    }

    public void setLblCredenziali(JLabel lblCredenziali) {
        this.lblCredenziali = lblCredenziali;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public void setLblUsername(JLabel lblUsername) {
        this.lblUsername = lblUsername;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }


}


