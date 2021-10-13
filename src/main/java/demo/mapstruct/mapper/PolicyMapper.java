package demo.mapstruct.mapper;

import demo.mapstruct.dto.PolicyDto;
import demo.mapstruct.model.Policy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PolicyMapper {

    @Mappings({
            @Mapping(target="id", source="idApolice"),
            @Mapping(target="policyCode", source="cdApoliceExterna"),
            @Mapping(target="brokerName", source="nmCorretor"),
            @Mapping(target="brokerDocumentNumber", source="nrDocumentoCorretor")
    })
    PolicyDto modelToDto(Policy policy);

    List<PolicyDto> modelsToDtos(List<Policy> policies);

    @InheritInverseConfiguration
    Policy dtoToModel(PolicyDto policyDto);

}
