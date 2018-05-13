package family.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@WebService(portName = "FamilyDataImplPort", serviceName = "FamilyDataImplService", endpointInterface = "family.service.FamilyData", targetNamespace = "http://service.family/", wsdlLocation = "file:C:\\Users\\Dell\\Desktop\\inteca\\i\\com.inteca\\src\\main\\resources\\familydataimpl.wsdl")
public class FamilyEndpoint implements FamilyData {

	private FamilySQLService familySQLService;

	@Autowired
	public FamilyEndpoint(FamilySQLService familySQLService) {
		this.familySQLService = familySQLService;
	}

	@Override
	public FamilyMember readMother(String surname) {
		 return familySQLService.findMotherBySurnameAndTypeOfMember(surname);
	}

	@Override
	public void createChild(String name, String surname, String dateOfBirth) {
		 familySQLService.insertChild(name, surname, dateOfBirth);
	}

	@Override
	public FamilyMember readChild(String surname) {
		return familySQLService.findChildBySurnameAndTypeOfMember(surname);
			
	}

	@Override
	public FamilyMember readFather(String surname) {
		return familySQLService.findFatherBySurnameAndTypeOfMember(surname);
	}

	@Override
	public void createFather(String name, String surname, String dateOfBirth) {
		familySQLService.insertFather(name, surname, dateOfBirth);

	}

	@Override
	public void createMother(String name, String surname, String dateOfBirth) {
		familySQLService.insertMother(name, surname, dateOfBirth);

	}

}
