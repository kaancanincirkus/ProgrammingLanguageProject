package kodlama.io.devs.odev.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateFrameworkRequests {
    private String name;
    private int pLanguageId;
}
