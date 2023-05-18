package modelo;

public class Student {
    private FullName fullName;
    private Email email;
    private Cpf cpf;
    private Ra ra;

    private Student(FullName fullName, Email email, Cpf cpf, Ra ra) {
        this.fullName = fullName;
        this.email = email;
        this.cpf = cpf;
        this.ra = ra;
    }

    public static class StudentBuilder {
        private FullName fullName;
        private Email email;
        private Cpf cpf;
        private Ra ra;

        public StudentBuilder withFullName(FullName fullName) {
            this.fullName = fullName;
            return this;
        }

        public StudentBuilder withEmail(Email email) {
            this.email = email;
            return this;
        }

	  public StudentBuilder withCpf(Cpf cpf) {
		this.cpf = cpf;
		return this;
	  }
	  
	  public StudentBuilder withRa(Ra ra) {
		  this.ra = ra;
		  return this;
	  }

        public Student build() {
            return new Student(fullName, email, cpf, ra);
        }
    }


public FullName getName() {
    return fullName;
}

public Email getEmail() {
	return email;
	}

public Cpf getCpf() {
	return cpf;
	}


public Ra getRa() {
	return ra;
	}
}


