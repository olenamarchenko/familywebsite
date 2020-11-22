package app.service;

import app.repositories.FamilyMemberRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyMemberService {
    
    @Autowired
    private FamilyMemberRepository familyMemberRepository;
    
    public List list() {
        return familyMemberRepository.findAll();
    }
}
