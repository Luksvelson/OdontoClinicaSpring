package conf;

import java.beans.PropertyEditorSupport;
import java.text.Format;
import java.util.function.Function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class ControllerAdvicerInitBinder {

	    private static class Editor<T> extends PropertyEditorSupport {

	        private final Function<String, T> parser;
	        private final Format format;

	        public Editor(Function<String, T> parser, Format format) {

	            this.parser = parser;
	            this.format = format;
	        }

	        public void setAsText(String text) {

	            setValue(this.parser.apply(text));
	        }

	        public String getAsText() {

	            return format.format((T) getValue());
	        }
	    }
	    
	    @InitBinder
		public void initBinder(WebDataBinder binder) {   
		    binder.registerCustomEditor(LocalDate.class, new Editor<>(
	                        text -> LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE),
	                        DateTimeFormatter.ISO_LOCAL_DATE.toFormat()));
		}
}
