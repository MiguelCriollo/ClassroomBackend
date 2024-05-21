package Backend.Classroom.Dto

import Backend.Classroom.entity.Student

data class StudentRequest(
    val classroomId:Long,
    val students:List<Student>

)
