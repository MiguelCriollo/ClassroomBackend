package Backend.Classroom.Services

import Backend.Classroom.Repositories.ClassroomRepository
import Backend.Classroom.entity.Classroom
import Backend.Classroom.entity.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClassroomService {
    @Autowired
    lateinit var classroomRepository: ClassroomRepository

    fun getAll():MutableList<Classroom> {
        return classroomRepository.findAll()
    }

    fun createOne(classroom: Classroom):String{
        return try {
            classroomRepository.save(classroom)
            "Corrent"
        }catch (e : Exception){
            throw e
        }

    }
}