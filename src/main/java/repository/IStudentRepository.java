/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Student;

/**
 *
 * @author HP
 */
public interface IStudentRepository {

    void addStudent(ArrayList<Student> students);

    void print(ArrayList<Student> students);

    void display();

}
