package demo.mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class PolicyDto {

    int id;
    String policyCode;
    String brokerName;
    String brokerDocumentNumber;
}
