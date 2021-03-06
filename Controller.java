import javax.swing.JOptionPane;
import java.sql.*;
public class Controller {

 private Model model;
 private View view;
 public db_conn db_conn;
 public String fname1, lname1, time1;
 //calling fn db.db_insert(fname.....)
 public Controller(Model m, View v) {
  model = m;
  view = v;
  // fname1 = view.getFirstnameTextfield().getText();
  // lname1 = view.getLastnameTextfield().getText();
  // time1 = view.gettimeTextfield().getText();
  initView();
 }
 public void initView() {
  view.getFirstnameTextfield().setText(model.getFirstname());
  view.getLastnameTextfield().setText(model.getLastname());
  view.gettimeTextfield().setText(model.gettime());
 }
 public void initController() {
  view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
  view.getLastnameSaveButton().addActionListener(e -> saveLastname());
  view.gettimeSaveButton().addActionListener(e -> savetime());
  view.getHello().addActionListener(e -> sayHello());
  view.getBye().addActionListener(e -> /*sayBye()*/ db_conn.db_insert(view.getFirstnameTextfield().getText(), view.getLastnameTextfield().getText(), view.gettimeTextfield().getText()));
  view.getsaytime().addActionListener(e -> saysaytime());
  
 }
 private void saveFirstname() {
  
  model.setFirstname(view.getFirstnameTextfield().getText()); //Use this as argument for insert function
  JOptionPane.showMessageDialog(null, "Firstname saved : " + model.getFirstname(), "Info", JOptionPane.INFORMATION_MESSAGE); //Here call the fn
 }
 private void saveLastname() {
  
  model.setLastname(view.getLastnameTextfield().getText());//Use this as argument for insert function
  JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
 }
 private void savetime() {
  
  model.settime(view.gettimeTextfield().getText());//Use this as argument for insert function
  JOptionPane.showMessageDialog(null, "Time saved : " + model.gettime(), "Info", JOptionPane.INFORMATION_MESSAGE);
 }
 private void sayHello() {
  JOptionPane.showMessageDialog(null, "Hello " + model.getFirstname() + " " + model.getLastname(), "Info", JOptionPane.
    INFORMATION_MESSAGE);
 }
 private void sayBye() {
  System.exit(0);
 }
 
 private void saysaytime() {
  JOptionPane.showMessageDialog(null, "Logged at " + model.gettime(), "Info", JOptionPane.INFORMATION_MESSAGE);
 }

 public void db_conn(String Fname, String Lname, String time) {
  db_conn.db_insert(Fname, Lname, time);
}

 

}