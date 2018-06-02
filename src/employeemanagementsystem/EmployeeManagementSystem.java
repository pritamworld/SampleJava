/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

/**
 *
 * @author macstudent
 */
public class EmployeeManagementSystem 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        
        e1.setEmployeeId(1);
        e1.setEmployeeName("My Name");
        
        Arithmatic arithmatic = new Arithmatic();
        System.out.println(arithmatic.sum(10, 10, 100));
        System.out.println(arithmatic.sum(10, 10));
        System.out.println(arithmatic.sum(10.0f, 10));
        
    }
    
}
