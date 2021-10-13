package demo.mapstruct.mapper;

import demo.mapstruct.dto.PolicyDto;
import demo.mapstruct.model.Policy;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-13T18:46:19-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class PolicyMapperImpl implements PolicyMapper {

    @Override
    public PolicyDto modelToDto(Policy policy) {
        if ( policy == null ) {
            return null;
        }

        PolicyDto policyDto = new PolicyDto();

        policyDto.setId( policy.getIdApolice() );
        policyDto.setPolicyCode( policy.getCdApoliceExterna() );
        policyDto.setBrokerName( policy.getNmCorretor() );
        policyDto.setBrokerDocumentNumber( policy.getNrDocumentoCorretor() );

        return policyDto;
    }

    @Override
    public List<PolicyDto> modelsToDtos(List<Policy> policies) {
        if ( policies == null ) {
            return null;
        }

        List<PolicyDto> list = new ArrayList<PolicyDto>( policies.size() );
        for ( Policy policy : policies ) {
            list.add( modelToDto( policy ) );
        }

        return list;
    }

    @Override
    public Policy dtoToModel(PolicyDto policyDto) {
        if ( policyDto == null ) {
            return null;
        }

        Policy policy = new Policy();

        policy.setIdApolice( policyDto.getId() );
        policy.setCdApoliceExterna( policyDto.getPolicyCode() );
        policy.setNmCorretor( policyDto.getBrokerName() );
        policy.setNrDocumentoCorretor( policyDto.getBrokerDocumentNumber() );

        return policy;
    }
}
