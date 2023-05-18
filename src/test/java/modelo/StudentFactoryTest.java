package modelo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentFactoryTest {

    @Test
    public void testStudentBuilder() {
        FullName fullName = new FullName("Mano Menezes");
        Email email = new Email("mano.menezes@example.com");
        Cpf cpf = new Cpf("12345678901");
        Ra ra = new Ra(123456);

        Student student = new Student.StudentBuilder()
                .withFullName(fullName)
                .withEmail(email)
                .withCpf(cpf)
                .withRa(ra)
                .build();

        assertEquals(fullName, student.getName());
        assertEquals(email, student.getEmail());
        assertEquals(cpf, student.getCpf());
        assertEquals(ra, student.getRa());
    }
}
