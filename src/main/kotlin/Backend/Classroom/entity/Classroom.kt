package Backend.Classroom.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.fasterxml.jackson.annotation.ObjectIdGenerators
import jakarta.persistence.*

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long = 0;

    var name:String? = null;
    @Column(name = "max_students")
    var maxStudents:Int? = null;

    @OneToMany(mappedBy = "classroom", cascade = [CascadeType.ALL])
    val students: MutableList<Student> = mutableListOf()
}