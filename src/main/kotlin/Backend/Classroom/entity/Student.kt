package Backend.Classroom.entity

import com.fasterxml.jackson.annotation.*
import jakarta.persistence.*


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long = 0;

    var name:String? = null;
    var age:Int? = null;

    @ManyToOne
    @JoinColumn(name = "class_id")
    @JsonIgnore
    var classroom:Classroom? = null;

    @JsonGetter("classroomId")
    fun getClassroomId(): Long? {
        return classroom?.id
    }

}