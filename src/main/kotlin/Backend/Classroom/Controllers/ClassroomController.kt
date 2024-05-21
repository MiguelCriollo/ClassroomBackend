package Backend.Classroom.Controllers

import Backend.Classroom.Services.ClassroomService
import Backend.Classroom.entity.Classroom
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/classroom")
@CrossOrigin
class ClassroomController {
    @Autowired
    private lateinit var classroomService: ClassroomService

    @GetMapping("/all")
    fun getAllData(): MutableList<Classroom> {
        return classroomService.getAll()
    }

    @PostMapping("/create")
    fun createClassroom(@RequestBody classroom: Classroom) : String {
        return classroomService.createOne(classroom)
    }

}