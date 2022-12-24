package com.collegemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.collegemanagementsystem.domain.Course;
import com.collegemanagementsystem.domain.Student;
import com.collegemanagementsystem.service.CourseService;
import com.collegemanagementsystem.service.StudentService;
 
@Controller

public class StudentController {
@Autowired
    private StudentService service;
@Autowired
private CourseService services;
 @RequestMapping("/Student")
    
    @GetMapping("/addstudent")
    public String add(Model model) {
     List<Student> liststudent = service.listAll();
     List<Course> listcourse = services.listAll();
        model.addAttribute("listcourse", listcourse);
        model.addAttribute("liststudent", liststudent);
        model.addAttribute("student", new Student());
        return "addstudent";
    }
    
    
    @RequestMapping(value = "/Student/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std)
    {
        service.save(std);
        return "redirect:/student";
    }
    
 
    @RequestMapping("/Student/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("addstudent");
        @SuppressWarnings("unused")
		List<Course> listcourse = services.listAll();
        Student std = service.get(id);
        mav.addObject("student", std);
        return mav;
        
    }
    @RequestMapping("/Student/delete/{id}")
    public String deleteStudentPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "student";
    }
 
}
