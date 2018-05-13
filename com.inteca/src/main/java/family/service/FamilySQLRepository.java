package family.service;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface FamilySQLRepository extends JpaRepository<FamilyMember, Long> {
	
	FamilyMember findBySurnameAndTypeOfFmember(String surname, String typeOfFmember);
	
}
