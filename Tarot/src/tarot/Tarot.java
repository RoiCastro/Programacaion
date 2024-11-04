/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarot;

/**
 *
 * @author roi.castrocalvar
 */
public class Tarot {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Tarot(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarot tarot = new tarot.Tarot(0, 0, 0);
        System.out.println("Tu numero del tarot es "+tarot.calculateTarot(28, 2, 500));
    }

    public boolean isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            return true;

        } else if (year % 400 == 0) {
            return true;

        } else {
            return false;
        }
    }

    public boolean checkDate(int day, int month, int year) {

        
        
        if(day>0){}else{ return false; }
        
        if (month <= 12 && month > 0) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day <= 31) {return true;} else { return false; }
                    
                case 4, 6, 9, 11:
                    if (day <= 30) {return true;} else { return false; }
                    
                case 2:
                    boolean leapYear = isLeapYear(year);
                    if (leapYear == true) {
                        if (day <= 29) {return true;} else { return false; }
                    } else {
                        if (day <= 28) {return true;} else { return false; }
                    }
            }

        }else{ return false; }
        return false;
        
    }

    public int calculateTarot(int day, int month, int year) {
        if (checkDate(day, month, year)){
            int number = day + month +year;
                    while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
            
            
            
            
            
            
            
            
            
            
        }else{
            System.out.println("Error algun dato no valido");
        }
        return 0;

    }
}
