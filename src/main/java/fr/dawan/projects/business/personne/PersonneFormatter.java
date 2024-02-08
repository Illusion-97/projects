package fr.dawan.projects.business.personne;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Objects;

@Component
public class PersonneFormatter implements Formatter<PersonneDto> {
    @Override
    public PersonneDto parse(String text, Locale locale) throws ParseException {
        PersonneDto dto = new PersonneDto();
        dto.setId(Long.parseLong(text));
        return dto;
    }

    @Override
    public String print(PersonneDto object, Locale locale) {
        return Objects.toString(object.getId(), "0");
    }
}
