/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import java.util.ArrayList;
import model.Student;
import repository.IStudentRepository;
import repository.StudentRepository;
import view.Menu;
/**
 *
 * @author HP
 */
public class StudentInformationManager extends Menu<String>{
    static String[] mc = {"Manager student information", "Exit"};
    
    private Library library;
    private IStudentRepository studentRepository;
    
    ArrayList<Student> students = new ArrayList<>();
    
    public StudentInformationManager() {
        super("====== Collection Sort Program ======", mc);
        library = new Library();
        studentRepository = new StudentRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                studentRepository.display();
                break;
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    
}
