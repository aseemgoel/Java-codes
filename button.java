import java.awt.*;  
class button{  
button(){  
Frame f=new Frame();  
Button b=new Button("enter");  
b.setBounds(30,50,80,30);  
f.add(b);  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String args[]){  
button f=new button();  
}}
