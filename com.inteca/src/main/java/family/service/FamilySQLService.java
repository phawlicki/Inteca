package family.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class FamilySQLService {

	 @Resource
	 private FamilySQLRepository familySQLRepository;
	 
	
	 public FamilySQLService(FamilySQLRepository familySQLRepository) {
		 this.familySQLRepository=familySQLRepository;
	 }
	 
	 
	 public void insertChild(String name, String surname, String date ) {
		 FamilyMember family=new FamilyMember();
		 family.setDateOfBirth(date);
		 family.setFmemberName(name);
		 family.setSurname(surname);
		 family.setTypeOfFmember("Child");
		 familySQLRepository.save(family);
		 
	 }
	 
	 
	 
	 public FamilyMember  findChildBySurnameAndTypeOfMember(String surname) {
		 return familySQLRepository.findBySurnameAndTypeOfFmember(surname, "Child");
	 }
	 
	 
	 
	 public void insertMother(String name, String surname, String date ) {
		 FamilyMember family=new FamilyMember();
		 family.setDateOfBirth(date);
		 family.setFmemberName(name);
		 family.setSurname(surname);
		 family.setTypeOfFmember("Mother");
		 familySQLRepository.save(family);
	 }
	 
	 public FamilyMember  findMotherBySurnameAndTypeOfMember(String surname) {
		 return familySQLRepository.findBySurnameAndTypeOfFmember(surname, "Mother");
	 }
	 
	 public void insertFather(String name, String surname, String date ) {
		 FamilyMember family=new FamilyMember();
		 family.setDateOfBirth(date);
		 family.setFmemberName(name);
		 family.setSurname(surname);
		 family.setTypeOfFmember("Father");
		 familySQLRepository.save(family);
	 }
	 
	 public FamilyMember  findFatherBySurnameAndTypeOfMember(String surname) {
		 return familySQLRepository.findBySurnameAndTypeOfFmember(surname, "Father");
	 }
	 
}
