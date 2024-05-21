package Backend.Classroom.Repositories

import Backend.Classroom.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentInterface : JpaRepository<Student, Long> {
}