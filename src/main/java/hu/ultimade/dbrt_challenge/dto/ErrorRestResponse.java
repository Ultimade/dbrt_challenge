package hu.ultimade.dbrt_challenge.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ErrorRestResponse extends RestResponse{

    private String errorMessage;

    public ErrorRestResponse(String msg, String type, String errorMessage) {
        super(msg, type);
        this.errorMessage = errorMessage;
    }
}
