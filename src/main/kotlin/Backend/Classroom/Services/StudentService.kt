package Backend.Classroom.Services

import Backend.Classroom.Dto.StudentRequest
import Backend.Classroom.Repositories.ClassroomRepository
import Backend.Classroom.Repositories.StudentInterface
import Backend.Classroom.entity.Classroom
import Backend.Classroom.entity.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class StudentService {
    @Autowired
    lateinit var studentInterface: StudentInterface
    @Autowired
    lateinit var classroomRepository: ClassroomRepository


    fun getAll():MutableList<Student>{
        return studentInterface.findAll()
    }

    @Transactional
    fun createStudent(students: StudentRequest):String{
        try {
            val classroom: Classroom= classroomRepository.findById(students.classroomId).get()
            for (student in students.students) {
                student.classroom=classroom
            }
            classroom.students.addAll(students.students)
            classroomRepository.save(classroom)
            return "Ok"
        }catch (e:NoSuchElementException){
            return "No Classroom"
        }catch (e:Exception){
            throw e
        }

    }
}