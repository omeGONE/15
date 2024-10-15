package org.example

fun main() {
    val student: Student = Student()

    student?.let { it ->
        it.hi()
        it.bye()
        it.name = "123"
    }
    student?.apply {
        hi()
        bye()

    }

    val stringDtudent = student?.run {
        hi()
        bye()
        lastname
    }
    println(stringDtudent)

    val nameStudent = with(Student()) {
        bye()
        hi()
        123
    }
    println(nameStudent)

    val StudentCringe = Student().also { st ->
        st.hi()
        st.bye()
        st.name = "hello"
        Math.PI
    }
    println(StudentCringe.name)
}