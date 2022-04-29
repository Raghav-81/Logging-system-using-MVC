import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class View {
 
 private JFrame frame;
 private JLabel firstnameLabel;
 private JLabel lastnameLabel;
 private JLabel timeLabel;
 private JTextField firstnameTextfield;
 private JTextField lastnameTextfield;
 private JTextField timeTextfield;
 private JButton firstnameSaveButton;
 private JButton lastnameSaveButton;
 private JButton timeSaveButton;
 private JButton hello;
 private JButton bye;
 private JButton saytime;
 
 public View(String title) {
  frame = new JFrame(title);
  frame.getContentPane().setLayout(new BorderLayout());
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 150);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
  firstnameLabel = new JLabel("Firstname :");
  lastnameLabel = new JLabel("Lastname :");
  timeLabel = new JLabel("Time :");
  firstnameTextfield = new JTextField();
  lastnameTextfield = new JTextField();
  timeTextfield = new JTextField();
  firstnameSaveButton = new JButton("Save firstname");
  lastnameSaveButton = new JButton("Save lastname");
  timeSaveButton = new JButton("Save time");
  hello = new JButton("Hello!");
  bye = new JButton("Bye!");
  saytime = new JButton("Log");

  GroupLayout layout = new GroupLayout(frame.getContentPane());
  layout.setAutoCreateGaps(true);
  layout.setAutoCreateContainerGaps(true);
  layout.setHorizontalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameLabel)
    .addComponent(lastnameLabel).addComponent(timeLabel))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameTextfield)
    .addComponent(lastnameTextfield).addComponent(timeTextfield))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameSaveButton)
    .addComponent(lastnameSaveButton).addComponent(timeSaveButton))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
    .addComponent(bye).addComponent(saytime)));
  layout.setVerticalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
    .addComponent(firstnameTextfield).addComponent(firstnameSaveButton).addComponent(hello))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
    .addComponent(lastnameTextfield).addComponent(lastnameSaveButton).addComponent(bye))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(timeLabel)
    .addComponent(timeTextfield).addComponent(timeSaveButton).addComponent(saytime)));

  
    
  layout.linkSize(SwingConstants.HORIZONTAL, firstnameSaveButton, lastnameSaveButton, timeSaveButton);
  layout.linkSize(SwingConstants.HORIZONTAL, hello, bye, saytime);
  frame.getContentPane().setLayout(layout);
 }
 public JFrame getFrame() {
  return frame;
 }
 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
 public JLabel getFirstnameLabel() {
  return firstnameLabel;
 }
 public void setFirstnameLabel(JLabel firstnameLabel) {
  this.firstnameLabel = firstnameLabel;
 }
 public JLabel getLastnameLabel() {
  return lastnameLabel;
 }
 public void setLastnameLabel(JLabel lastnameLabel) {
  this.lastnameLabel = lastnameLabel;
 }

 public JLabel gettimeLabel() {
  return timeLabel;
 }
 public void settimeLabel(JLabel timeLabel) {
  this.timeLabel = timeLabel;
 }

 public JTextField getFirstnameTextfield() {
  return firstnameTextfield;
 }
 public void setFirstnameTextfield(JTextField firstnameTextfield) {
  this.firstnameTextfield = firstnameTextfield;
 }
 public JTextField getLastnameTextfield() {
  return lastnameTextfield;
 }
 public void setLastnameTextfield(JTextField lastnameTextfield) {
  this.lastnameTextfield = lastnameTextfield;
 }
 public void settimeTextfield(JTextField timeTextfield) {
  this.timeTextfield = timeTextfield;
 }
 public JTextField gettimeTextfield() {
  return timeTextfield;
 }

 
 public JButton getFirstnameSaveButton() {
  return firstnameSaveButton;
 }
 
 public void setFirstnameSaveButton(JButton firstnameSaveButton) {
  this.firstnameSaveButton = firstnameSaveButton;
 }
 public JButton getLastnameSaveButton() {
  return lastnameSaveButton;
 }
 public void setLastnameSaveButton(JButton lastnameSaveButton) {
  this.lastnameSaveButton = lastnameSaveButton;
 }

 public JButton gettimeSaveButton() {
  return timeSaveButton;
 }
 
 public void settimeSaveButton(JButton firstnameSaveButton) {
  this.timeSaveButton = timeSaveButton;
 }
 public JButton getHello() {
  return hello;
 }
 public void setHello(JButton hello) {
  this.hello = hello;
 }
 public JButton getBye() {
  return bye;
 }
 public void setBye(JButton bye) {
  this.bye = bye;
 }
 public JButton getsaytime() {
  return saytime;
 }
 public void setsaytime(JButton saytime) {
  this.saytime = saytime;
 }
}