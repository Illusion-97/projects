package fr.dawan.projects.business.annexe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnexeDto {
    private long id;
    private int version;
    private String name;
    private String extension;
    private String type;

}
