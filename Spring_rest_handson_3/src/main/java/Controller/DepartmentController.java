package Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Department;

import Service.DepartmentService;



@RestController
	public class DepartmentController {

		@Autowired
		private DepartmentService departmentService;
		
		@RequestMapping(value="/departments", method = RequestMethod.GET)
		public List<Department> getAllDepartments(){
			
			return departmentService.getAllDepartments();
		}
	}


