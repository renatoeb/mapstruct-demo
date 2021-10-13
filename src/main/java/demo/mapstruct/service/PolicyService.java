package demo.mapstruct.service;

import demo.mapstruct.dto.PolicyDto;
import demo.mapstruct.mapper.PolicyMapper;
import demo.mapstruct.model.Policy;
import demo.mapstruct.repository.PolicyRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PolicyService {

    private final PolicyRepository repository;

    private final PolicyMapper mapper;

    public void save(PolicyDto policyDto) {
        Policy policy = mapper.dtoToModel(policyDto);
        repository.save(policy);
    }

    public List<PolicyDto> findAll() {
        return mapper.modelsToDtos(repository.findAll());
    }

    public PolicyDto findOne(int id) {
        return mapper.modelToDto(repository.findById(id).orElse(null));
    }
}
