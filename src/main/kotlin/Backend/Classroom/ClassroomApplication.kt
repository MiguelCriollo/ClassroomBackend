package Backend.Classroom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClassroomApplication

fun main(args: Array<String>) {
	runApplication<ClassroomApplication>(*args)
}
