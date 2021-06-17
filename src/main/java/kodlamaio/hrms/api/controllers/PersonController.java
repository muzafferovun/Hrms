package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.PersonEducationService;
import kodlamaio.hrms.business.abstracts.PersonExperiencesService;
import kodlamaio.hrms.business.abstracts.PersonLinkService;
import kodlamaio.hrms.business.abstracts.PersonProfessionService;
import kodlamaio.hrms.business.abstracts.PersonService;

import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Person;
import kodlamaio.hrms.entities.concretes.PersonProfession;
import kodlamaio.hrms.entities.concretes.PersonUser;
import kodlamaio.hrms.entities.concretes.SectorPosition;
import kodlamaio.hrms.entities.dtos.PersonEducationAddDto;
import kodlamaio.hrms.entities.dtos.PersonEducationGetDto;
import kodlamaio.hrms.entities.dtos.PersonExperiencesAddDto;
import kodlamaio.hrms.entities.dtos.PersonExperiencesGetDto;
import kodlamaio.hrms.entities.dtos.PersonLinkAddDto;
import kodlamaio.hrms.entities.dtos.PersonLinkGetDto;
import kodlamaio.hrms.entities.dtos.PersonProfessionAddDto;
import kodlamaio.hrms.entities.dtos.PersonProfessionGetDto;



@RestController
@RequestMapping("/api/person")
public class PersonController {
	private PersonService personService;
	private PersonExperiencesService personExperiencesService;
	private PersonProfessionService personProfessionService;
	private PersonEducationService personEducationService;
	private PersonLinkService personLinkService;
	@Autowired
	public PersonController(PersonService personService,PersonExperiencesService personExperiencesService
			,PersonProfessionService personProfessionService
			,PersonEducationService personEducationService
			,PersonLinkService personLinkService) {
		super();
		this.personService=personService;
		this.personExperiencesService=personExperiencesService;
		this.personProfessionService=personProfessionService;
		this.personEducationService=personEducationService;
		this.personLinkService=personLinkService;
	}
	@GetMapping("/getall")
	public DataResult<List<Person>> getAll(){
		return this.personService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody PersonUser personUser) {
		return this.personService.add(personUser);
	}
	@GetMapping("/getExperiences")
	public DataResult<List<PersonExperiencesGetDto>> getExperiences(@RequestParam int personId){
		return this.personExperiencesService.getExperiences(personId);
	}
	
	@PostMapping("/addExperiences")
	public List<Result> addExperiences(@RequestBody PersonExperiencesAddDto personExperiencesAddDto) {
		return this.personExperiencesService.addExperiences(personExperiencesAddDto);
	}
	@GetMapping("/getProfession")
	public DataResult<List<PersonProfessionGetDto>> getProfession(@RequestParam int personId){
		return this.personProfessionService.getProfession(personId);
	}
	
	@PostMapping("/addProfession")
	public List<Result> addProfession(@RequestBody PersonProfessionAddDto personProfessionAddDto) {
		return this.personProfessionService.addProfession(personProfessionAddDto);
	}
	@GetMapping("/getEducation")
	public DataResult<List<PersonEducationGetDto>> getEducation(@RequestParam int personId){
	
		return new SuccessDataResult<List<PersonEducationGetDto>>(this.personEducationService.getEducation(personId).getData());
		//return null;
	}
	
	@PostMapping("/addEducation")
	public List<Result> addEducation(@RequestBody PersonEducationAddDto personEducationAddDto) {
		return this.personEducationService.addEducation(personEducationAddDto);
	}
	
	@GetMapping("/getLinks")
	public DataResult<List<PersonLinkGetDto>> getLinks(@RequestParam int personId){
	
		return new SuccessDataResult<List<PersonLinkGetDto>>(this.personLinkService.getLinks(personId).getData());
		
	}
	
	@PostMapping("/addLink")
	public List<Result> addLink(@RequestBody PersonLinkAddDto personLinkAddDto) {
		return this.personLinkService.addLink(personLinkAddDto);
	}
	
}
