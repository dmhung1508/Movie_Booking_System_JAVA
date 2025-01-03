
package com.mycompany.UI;
import com.mycompany.movie.*;
import com.mycompany.database.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;

import javax.swing.*;


import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintTicket 
{
    public static void printTicket(String movie_name)
    {
        JFrame myFrame = new JFrame("Movie Ticket System");
        myFrame.setSize(400, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        Ticket(myFrame, movie_name);
        myFrame.setVisible(true);
    }
    public static String check_Hall()
    {
        boolean checkH = false;
        boolean checkG = false;
        for(String i: SeatUI.save_seat)
        {
            if(i.charAt(0) == 'H') checkH = true;
            else if(i.charAt(0) == 'G') checkG = true;
        }
        if(checkH && !checkG) return "1";
        if(!checkH && checkG) return "2";
        return "1, 2";
       
    }
    public static void Ticket(JFrame myFrame, String movie_name)
    {
        JPanel myTicket = new JPanel();
        myTicket.setLayout(null);
        myTicket.setBounds(40, 20, 300, 450);
        JPanel frame = new JPanel();
        frame.setLayout(null);
        frame.setBounds(0,0, 300, 80);
        frame.setBackground(Color.decode("#339966"));
        JLabel name_ticket = new JLabel(movie_name);
        name_ticket.setLayout(null);
        name_ticket.setFont(new Font("Arial", Font.PLAIN, 16));
        name_ticket.setForeground(Color.WHITE);
        name_ticket.setBounds(10,10, 300, 50);
        frame.add(name_ticket);
        myTicket.setBackground(Color.decode("#DDDDDD"));
        myTicket.add(frame);
        // in cho ngoi
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,81,300, 350);
        p2.setBackground(Color.gray);
        JLabel inf1 = new JLabel("Seat");
        inf1.setLayout(null);
        inf1.setBounds(10, 22, 30, 30);
        inf1.setFont(new Font("Arial", Font.PLAIN, 12));
        String seats = String.join(", ", SeatUI.save_seat);
        JLabel content_inf1 = new JLabel(seats);
        content_inf1.setLayout(null);
        content_inf1.setBounds(10, 40, 300, 30);
        content_inf1.setFont(new Font("Arial", Font.BOLD, 12));
        p2.add(inf1);
        p2.add(content_inf1);
        // in gia
        int quantity = SeatUI.save_seat.size();
        TicketPrice newTicket = new TicketPrice(quantity, 50000);
        JLabel inf2 = new JLabel("Price");
        inf2.setLayout(null);
        inf2.setBounds(10, 75, 30, 30);
        inf2.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel content_inf2 = new JLabel(newTicket.getTotalPrice());
        content_inf2.setLayout(null);
        content_inf2.setBounds(10, 93, 100, 30);
        content_inf2.setFont(new Font("Arial", Font.BOLD, 12));
        p2.add(inf2);
        p2.add(content_inf2);
        // in ngay xem
        JLabel inf3 = new JLabel("Date");
        inf3.setLayout(null);
        inf3.setBounds(130, 75, 30, 30);
        inf3.setFont(new Font("Arial", Font.PLAIN, 12));
        String date = Receipt.save_choosen_day.get(0) + "/12/2024";
        JLabel content_inf3 = new JLabel(date);
        content_inf3.setLayout(null);
        content_inf3.setBounds(115, 93, 100, 30);
        content_inf3.setFont(new Font("Arial", Font.BOLD, 12));
        p2.add(inf3);
        p2.add(content_inf3);
        // in hang ghe
        JLabel inf4 = new JLabel("Hall");
        inf4.setLayout(null);
        inf4.setBounds(250, 75, 30, 30);
        inf4.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel content_inf4 = new JLabel(check_Hall());
        content_inf4.setLayout(null);
        content_inf4.setBounds(253, 93, 100, 30);
        content_inf4.setFont(new Font("Arial", Font.BOLD, 12));
        p2.add(inf4);
        p2.add(content_inf4);
        // in rap xem
        JLabel inf5 = new JLabel("Cinema");
        inf5.setLayout(null);
        inf5.setBounds(10, 128, 50, 30);
        inf5.setFont(new Font("Arial", Font.PLAIN, 12));
        String cinema_name ="";
        for(String i: Receipt.selectedCinema)
        {
            if(i!=null)
            {
                cinema_name = i;
            }
        }
        System.out.println(Receipt.selectedCinema.size());
        JLabel content_inf5 = new JLabel(cinema_name);
        content_inf5.setLayout(null);
        content_inf5.setBounds(10, 146, 200, 30);
        content_inf5.setFont(new Font("Arial", Font.BOLD, 12));
        p2.add(inf5);
        p2.add(content_inf5);
        // in thoi gian bat dau
        JLabel inf6 = new JLabel("Time");
        inf6.setLayout(null);
        inf6.setBounds(240, 128, 50, 30);
        inf6.setFont(new Font("Arial", Font.PLAIN, 12));
        String time = Receipt.save_choosen_time.get(0);
        JLabel content_inf6 = new JLabel(time);
        content_inf6.setLayout(null);
        content_inf6.setBounds(240, 146, 200, 30);
        content_inf6.setFont(new Font("Arial", Font.BOLD, 12));
        p2.add(inf6);
        p2.add(content_inf6);
        
        JLabel line = new JLabel("------------------------------------------------------------------------");
        line.setLayout(null);
        line.setBounds(5, 190, 300, 30);
        p2.add(line);
        myTicket.add(p2);
        myFrame.add(myTicket);
//        return myTicket;
    }
}
