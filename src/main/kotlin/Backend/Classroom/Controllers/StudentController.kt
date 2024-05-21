package Backend.Classroom.Controllers

import Backend.Classroom.Dto.StudentRequest
import Backend.Classroom.Services.ClassroomService
import Backend.Classroom.Services.StudentService
import Backend.Classroom.entity.Classroom
import Backend.Classroom.entity.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
@CrossOrigin
class StudentController {
    @Autowired
    private lateinit var studentService: StudentService

    @GetMapping("/all")
    fun getAllData(): MutableList<Student> {
        return studentService.getAll()
    }

    @PostMapping("/create")
    fun createStudentWithClass(@RequestBody students:StudentRequest):String{
        return studentService.createStudent(students)
    }

}