package GUI;

import Main.Doctor;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;


public class MainGui extends JFrame {

        private ArrayList<Doctor> doctors;
        private ArrayList<Consultation> consultations;

        // Constructor
        public MainGui(ArrayList<Doctor> doctors,ArrayList<Consultation> consultations) {
                this.doctors = doctors;
                this.consultations=consultations;

                setTitle("Welcome");
                setSize(600, 600);
                setLayout(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                // Create the panel and set its layout


                // Create the label and set its text

                JLabel label = new JLabel("Welcome", SwingConstants.CENTER);
                label.setFont(new Font(Font.SERIF, Font.PLAIN,  30));
                label.setLayout(null);
                label.setBounds(200,50,200,50);
                label.setVisible(true);

                // Create the buttons
                JButton displayDoctorButton = new JButton("Display All Doctors");
                displayDoctorButton.setBackground(new Color(0x386C6C));
                displayDoctorButton.setLayout(null);
                displayDoctorButton.setBounds(200,155,200,50);
                displayDoctorButton.setVisible(true);


                JButton viewConButton = new JButton("View Consultation");
                viewConButton.setBackground(new Color(0x386C6B));
                viewConButton.setLayout(null);
                viewConButton.setBounds(200,295,200,50);
                viewConButton.setVisible(true);

                JButton chanelDoctorButton = new JButton("Chanel Your  Doctor ");
                chanelDoctorButton.setBackground(new Color(0x386C6C));
                chanelDoctorButton.setLayout(null);
                chanelDoctorButton.setBounds(200,430,200,50);
                chanelDoctorButton.setVisible(true);


                add(displayDoctorButton);
                add(viewConButton);
                add(chanelDoctorButton);
                add(label);


                // Add action listeners to the buttons
                displayDoctorButton.addActionListener(new DisplayButtonListener());
                viewConButton.addActionListener(new ViewButtonListner());
                chanelDoctorButton.addActionListener(new ChanelButtonListener());
        }

        // Inner class for display button listener
        class DisplayButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {

                        JFrame tabframe = new JFrame();
                        tabframe.getContentPane();
                        tabframe.setSize(800, 800);
                        tabframe.setVisible(true);
                        doctors.sort(new Comparator<Doctor>() {
                            @Override
                            public int compare(Doctor o1, Doctor o2) {
                                return o1.getSurname().compareTo(o2.getSurname());
                            }
                        });


                        DoctorModel tableM = new DoctorModel(doctors);
                        JTable table = new JTable(tableM);
                        JScrollPane sp = new JScrollPane(table);
                        tabframe.add(sp);


                }

        }

        class ChanelButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {

                        JFrame frame = new JFrame();
                        frame.setTitle("Chanel Your Doctor");
                        frame.setSize(1200,850);
                        frame.setLayout(null);
                        frame.setBackground(new Color(0x69695F));
                        frame.setVisible(true);


                        JLabel lab1 = new JLabel("Patient Details");
                        lab1.setFont(new Font(Font.SERIF, Font.PLAIN,  25));
                        lab1.setBounds(120,30,200,50);
                        frame.add(lab1);

                        //Name
                        JLabel lab2 = new JLabel("Patient Name : ");
                        lab2.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                        lab2.setBounds(90,95,200,50);
                        frame.add(lab2);


                        JLabel lab3 = new JLabel("Patient Surname : ");
                        lab3.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                        lab3.setBounds(90,190,200,30);
                        frame.add(lab3);


                        JLabel lab4 = new JLabel("Date Of Birth : ");
                        lab4.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                        lab4.setBounds(90,285,200,30);
                        frame.add(lab4);


                       JLabel lab7 = new JLabel(" Patient Mob No : ");
                       lab7.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                       lab7.setBounds(90,375,200,30);
                       frame.add(lab7);

                       JLabel lab6 = new JLabel("Patient ID No: ");
                       lab6.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                       lab6.setBounds(100,465,200,30);
                       frame.add(lab6);

                       JLabel labb = new JLabel("Doctors Details: ");
                       labb.setFont(new Font(Font.SERIF, Font.PLAIN,  25));
                       labb.setBounds(670,30,200,30);
                       frame.add(labb);


                       JLabel lab8 = new JLabel("Doctor Name: ");
                       lab8.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                       lab8.setBounds(650,95,200,30);
                       frame.add(lab8);

                       JLabel lab9= new JLabel("Appointment Date: ");
                       lab9.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                       lab9.setBounds(650,190,200,30);
                       frame.add(lab9);

                       JLabel lab10 = new JLabel("Consultation Start Time: ");
                       lab10.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                       lab10.setBounds(650,285,200,30);
                       frame.add(lab10);

                      JLabel laba = new JLabel("Hours : ");
                      laba.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                      laba.setBounds(650,375,200,30);
                      frame.add(laba);

                      JLabel lab = new JLabel("End Time: ");
                      lab.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                      lab.setBounds(650,700,200,30);
                      lab.setVisible(false);
                      frame.add(lab);

                      JLabel lab11 = new JLabel(" Is this your first consultation : ");
                      lab11.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                      lab11.setBounds(650,455,300,30);
                      frame.add(lab11);


                      JLabel lab12 = new JLabel("Notes: ");
                      lab12.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                      lab12.setBounds(650,555,200,30);
                      frame.add(lab12);

                      JLabel lab123 = new JLabel("Cost: ");
                      lab123.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                      lab123.setBounds(930,630,100,30);
                      frame.add(lab123);

                      JTextField co = new JTextField();
                      co.setBounds(980,630,60,30);
                      frame.add(co);

                     JButton newLab = new JButton("Book");
                     newLab.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                     newLab.setBounds(320,665,80,50);
                     frame.add(newLab);


                     JTextField t1 = new JTextField();
                     t1.setBounds(260,105,200,30);
                     frame.add(t1);

                     JTextField m = new JTextField();
                     m.setBounds(260,375,200,30);
                     frame.add(m);

                     JTextField t2 = new JTextField();
                     t2.setBounds(260,190,200,30);
                     frame.add(t2);

                     JTextField t3 = new JTextField();
                     t3.setBounds(260,285,200,30);
                     frame.add(t3);

                     JButton b1 = new JButton("CLICK");
                     b1.setBounds(461, 285, 70, 30);
                     frame.add(b1);
                     b1.addActionListener(new ActionListener() {
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               t3.setText(new Calander(frame).setPickedDate());

                           }
                       });

                     JTextField t4 = new JTextField();
                     t4.setBounds(750,700,200,30);
                     t4.setVisible(false);
                     frame.add(t4);

                     JTextField t5 = new JTextField();
                     t5.setBounds(260,460,200,30);
                     frame.add(t5);

                      String []dctrName=new String[10];
                      for (int i = 0; i < doctors.size(); i++) {
                        dctrName[i]=doctors.get(i).getName();
                      }
                      JComboBox c1=new JComboBox(dctrName);
                      c1.setSize(150,20);
                      c1.setBounds(850,97,200,30);
                      frame.add(c1);

                      JTextField t7 = new JTextField();
                      t7.setBounds(850,190,200,30);
                      frame.add(t7);

                      JButton b2 = new JButton("CLICK");
                      b2.setBounds(1050, 190, 70, 30);
                      frame.add(b2);
                      b2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            t7.setText(new Calander(frame).setPickedDate());

                        }
                    });

                    String []startTimearray=new String[18];
                    for (int i =1; i <12; i++) {
                        startTimearray[i]= String.valueOf(i);
                    }

                    JComboBox t8 = new JComboBox(startTimearray);
                    t8.setBounds(850,285,200,30);
                    frame.add(t8);


                    String []hours=new String[100];
                    for (int i = 0; i <10; i++) {
                        hours[i]= String.valueOf(i+1);

                    }

                    JComboBox aa=new JComboBox(hours);
                    aa.setBounds(850,375,200,30);
                    frame.add(aa);

                    aa.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int getStartTime =Integer.parseInt(t8.getSelectedItem().toString());
                            int patHours =Integer.parseInt(aa.getSelectedItem().toString());
                            int endTime =getStartTime+patHours;
                            t4.setText(String.valueOf(endTime));
                        }
                    });


                    JButton btYes = new JButton("Yes");
                    btYes.setBounds(910, 455, 55, 30);
                    frame.add(btYes);
                    btYes.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int hourscal= Integer.parseInt(aa.getSelectedItem().toString());
                            int finalCost=hourscal*15;
                            co.setText(String.valueOf(finalCost));


                        }
                    });

                    JButton btNo = new JButton("No");
                    btNo.setBounds(970, 455, 55, 30);
                    frame.add(btNo);
                    btNo.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int hourscalNo= Integer.parseInt(aa.getSelectedItem().toString());
                            int finalCost=hourscalNo*25;
                            co.setText(String.valueOf(finalCost));


                        }
                    });

                    JTextField t9 = new JTextField();
                    t9.setBounds(850,375,200,30);
                    frame.add(t9);

                    JTextField t10 = new JTextField();
                    t10.setBounds(850,555,200,30);
                    frame.add(t10);

                    newLab.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            System.out.println("book doctor start");

                            Consultation consultation1 = new Consultation();
                            consultation1.setDocName(c1.getSelectedItem().toString());
                            consultation1.setDate(t7.getText());
                            consultation1.setStTime(t8.getSelectedItem().toString());
                            consultation1.setNotes(t10.getText());
                            consultation1.setEnTime(t4.getText());
                            consultation1.setPatName(b1.getText());
                            consultation1.setCost(Integer.parseInt(co.getText()));
                            consultation1.setPatDOB(t3.getText());
                            consultation1.setPatMobNo(Integer.parseInt(m.getText()));
                            consultation1.setPatSurName(b2.getText());

                            if (consultations.isEmpty()){
                                consultations.add(consultation1);
                            }else {
                                for (Consultation consultation:consultations) {
                                    if (consultation.getDocName().equals(consultation1.getDocName())){
                                        if (consultation.getConDate().equals(consultation1.getConDate())){
                                            int c1= Integer.parseInt(consultation.getStTime());
                                            int c2= Integer.parseInt(consultation.getEnTime());
                                            int d1= Integer.parseInt(consultation1.getEnTime());
                                            int d2= Integer.parseInt(consultation1.getStTime());
                                            if (c1>d1 || c2<d2){
                                                consultations.add(consultation1);
                                            }else{
                                                System.out.println("this doctor is book..");
                                                JOptionPane.showMessageDialog(null, "booked");
                                            }
                                        }else{
                                            consultations.add(consultation1);
                                        }

                                    }else {
                                        consultations.add(consultation1);
                                    }
                                }
                            }


                        }
                    });


                }

        }

    // Inner class for view consultation listener

        class ViewButtonListner implements ActionListener{
            public void actionPerformed(ActionEvent e){

                JFrame frame2 = new JFrame();
                frame2.setTitle("View Consultation");
                frame2.setSize(900,500);
                frame2.setLayout(null);
                frame2.setBackground(new Color(0x69695F));
                frame2.setVisible(true);

                JLabel lab = new JLabel("Enter Your Name :");
                lab.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                lab.setBounds(100,80,200,30);
                frame2.add(lab);

                JTextField t1 = new JTextField();
                t1.setBounds(300,80,200,30);
                frame2.add(t1);

                JLabel lab2 =new JLabel("Enter your Surname :");
                lab2.setFont(new Font(Font.SERIF, Font.PLAIN,  20));
                lab2.setBounds(100,140,200,30);
                frame2.add(lab2);

                JTextField t2 = new JTextField();
                t2.setBounds(300,140,200,30);
                frame2.add(t2);

                JButton but = new JButton("SUBMIT");
                but.setBounds(250,240,95,30);
                frame2.add(but);

                but.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame table1 = new JFrame();
                        table1.getContentPane();
                        table1.setSize(1300, 800);
                        table1.setVisible(true);

                        if (consultations != null && !consultations.isEmpty()) {
                            for (Consultation consultation:consultations) {
                                if (consultation.getPatName().equals(t1.getText()) && consultation.getPatSurName().
                                        equals(t2.getText())){
                                    consultations.add(consultation);
                                } else {
                                    //JOptionPane.showMessageDialog(null, "No old consultationyoyoyoy your");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No consultations available");
                        }

                        ConsultationModel tableM = new ConsultationModel(consultations);
                        JTable table = new JTable(tableM);
                        JScrollPane sp = new JScrollPane(table);
                        table1.add(sp);



                    }
                }
                );





            }
        }



}










