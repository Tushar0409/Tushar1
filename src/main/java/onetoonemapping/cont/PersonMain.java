 package onetoonemapping.cont;

import onetoonemapping.dao.PersonDao;
import onetoonemapping.dto.AdharCard;
import onetoonemapping.dto.PanCard;
import onetoonemapping.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		
		AdharCard adharcard=new AdharCard();
		adharcard.setId(101);
		adharcard.setName("SunilFromPune");
		adharcard.setAddress("pune");
		
		
		Person person =new Person();
		person.setId(1);
		person.setName("Sunil");
		person.setPhone(2890l);
		person.setAddress("pune");
		person.setAdharCard(adharcard);
		PersonDao dao = new PersonDao();
//		dao.savePerson(person);
		dao.removePerson(1);
		 
		 
		
	}

}
