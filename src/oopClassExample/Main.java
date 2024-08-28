package oopClassExample;

public class Main {
	public static void main(String[] args) {
		Address a1 = new Address(
                "Horácio Nóbrega",
                "S/N",
                "",
                "Bela Vista",
                "Patos",
                "PB",
                "58704-440",
                "Brasil"
        );

        Person p1 = new Person(
                "José", "Freitas", 23, "123.456.789-00", a1
        );

        System.out.println("Pessoa 1: " + p1.getPerson());

        Person p2 = new Person();
        p2.setFirstName("Arthur");
        p2.setLastName("Melo");
        p2.setAge(32);
        p2.setCpf("987.654.321-00");
        
        Address a2 = new Address();
        a2.setStreet("Horácio Nóbrega");
        a2.setNumber("S/N");
        a2.setComplement("");
        a2.setNeighborhood("Bela Vista");
        a2.setCity("Patos");
        a2.setState("PB");
        a2.setPostalCode("58704-440");
        a2.setCountry("Brasil");

        /*
        p2.address.setStreet("Horácio Nóbrega");
        p2.address.setNumber("S/N");
        p2.address.setComplement("");
        p2.address.setNeighborhood("Bela Vista");
        p2.address.setCity("Patos");
        p2.address.setState("PB");
        p2.address.setPostalCode("58704-440");
        p2.address.setCountry("Brasil");
        */
        
        p2.setAddress(a2);

        System.out.println("Pessoa 2: " + p2.getPerson());
        
    }
}
