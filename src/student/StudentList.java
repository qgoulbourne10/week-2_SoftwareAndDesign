/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Megha Patel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] studList=new Student[3];
        Scanner input=new Scanner(System.in);
        
        for(int i=0; i<3;i++)
        {
            studList[i]=new Student();
            System.out.println("Enter student id: ");
            studList[i].setStudId(input.nextInt());
            input.nextLine();
            
            System.out.println("Enter student name: ");
            studList[i].setStudName(input.nextLine());
            
            System.out.println("Enter student program: ");
            studList[i].setProgName(input.nextLine());
                   
        }
        
        for(int i=0;i<3;i++)
        {
            System.out.println("student id: "+ studList[i].getStudId()+"Student name: "+studList[i].getStudName()+
                                    "Student program: "+ studList[i].getProgName());
            System.out.println("");
        
        
        }
        
    }

}
