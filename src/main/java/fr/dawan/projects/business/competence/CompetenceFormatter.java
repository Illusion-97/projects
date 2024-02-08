package fr.dawan.projects.business.competence;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Objects;

@Component
public class CompetenceFormatter implements Formatter<CompetenceDto> {
    @Override
    public CompetenceDto parse(String text, Locale locale) throws ParseException {
        CompetenceDto dto = new CompetenceDto();
        dto.setId(Long.parseLong(text));
        return dto;
    }

    @Override
    public String print(CompetenceDto object, Locale locale) {
        return Objects.toString(object.getId(), "0");
    }
}
