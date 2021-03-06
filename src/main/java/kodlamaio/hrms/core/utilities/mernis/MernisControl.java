package kodlamaio.hrms.core.utilities.mernis;

import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Person;

public class MernisControl {
	public MernisControl() {
		
	}
	public Result checkPerson(Person person) {
		String hata="";
		if(person.getName().length()<2) hata=hata+"Ad alanı enaz 2 karakter olmalı.";
		if(person.getSurname().length()<2) hata=hata+"Soyad alanı enaz 2 karakter olmalı.";
		if(person.getDate_of_birth().length()<4) hata=hata+"yıl hatalı.";
		if(!checkNationalIdentity(person.getNational_identity()))  hata=hata+"National identity hatalı.";
		
		if(hata=="") {
			return new SuccessResult("");
		}
		else {
			return new ErrorResult(hata);
		}
	}
	public boolean checkNationalIdentity(String nationalIdentity) {
		if(nationalIdentity.length()!=11) return false;
         else
        {
            return true;
        }

  
		
	
	}
}
