/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        System.out.println("Student Name: Nur Izzati Hadfina Binti Mohd Ridzuan");
        System.out.println("Student ID: S84787");
        
        double mark1= 37.0;
        double mark2= 40.0;
        double totalMark= mark1 + mark2;
        System.out.println("Total Mark:" + totalMark);
        
        if (totalMark>=80){
            System.out.println("Excellent");
        }
        else if (totalMark>=50){
             System.out.println("Good");
        }
        else{
            System.out.println("Needs Improvement");
        }            
    }
}
