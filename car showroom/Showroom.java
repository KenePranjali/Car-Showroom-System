import java.util.*;
import java.sql.SQLOutput;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_cars_inStock=0;
    String manager_name;

    public void get_details(){

        System.out.print("Showroom Name = "+ showroom_name);
        System.out.print("Showroom Address = "+ showroom_address);
        System.out.print("Total Employee = "+ total_employee);
        System.out.print("Total Cars in Stocks = "+ total_cars_inStock);
        System.out.print("Manager name = "+ manager_name );
    }

    public void set_details(){

        Scanner sc=new Scanner (System.in);
        System.out.println("================ *** ENTER SHOWROOM DETAILS *** ================");
        System.out.println();
        System.out.print("Showroom Name = ");
        showroom_name=sc.nextLine();
        System.out.print("Showroom Address = ");
        showroom_address=sc.nextLine();
        System.out.print("Manager name = ");
        manager_name=sc.nextLine();
        System.out.print("Total Employee = ");
        total_employee=sc.nextInt();
        System.out.print("Total Cars in Stocks = ");
        total_cars_inStock=sc.nextInt();
    }

} 
