package nanowrimo.com.nanowrimo.DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class BooksDTO {


    private Long id; 
    private String name;
    private String date;
    private Integer chapters;
    private Integer records;
    private Integer wordCount;
    

    private static final SimpleDateFormat dateFormat
      = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Date getSubmissionDateConverted(String timezone) throws ParseException {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        return dateFormat.parse(this.date);
    }

    public void setSubmissionDate(Date date, String timezone) {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        this.date = dateFormat.format(date);
    }

}