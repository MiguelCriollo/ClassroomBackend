package Backend.Classroom.Repositories

import Backend.Classroom.entity.Classroom
import org.springframework.data.jpa.repository.JpaRepository

interface ClassroomRepository : JpaRepository<Classroom, Long> {
    fun findByName(name : String) : Classroom?

}