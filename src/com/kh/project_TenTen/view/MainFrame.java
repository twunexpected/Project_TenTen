package com.kh.project_TenTen.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
   public MainFrame() {
      
      this.setSize(400,700);
      
      //new OXQuiz1(this);
      new FindID(this);
      //new FindPW(this);

      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
   }
   
}