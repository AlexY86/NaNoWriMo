package nanowrimo.com.nanowrimo.Model;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
@EntityScan
@Table
public class NaNoWriMo {

    private long id;

    private String bookName;

    private Date date;

    private Integer chapters;

    private Integer records;

    private Integer wordCount;


    public NaNoWriMo() {

    }

    
    public NaNoWriMo(String bookName, Date date, Integer chapters, Integer records, Integer wordCount){
        this.bookName = bookName;
        this.date = date;
        this.chapters = chapters;
        this.records = records;
        this.wordCount = wordCount;

    }

    @Id
    @GeneratedValue(value = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public NaNoWriMo(long id) {
        this.id = id;
    }


    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "bookName")
    public String getbookName(){
        return bookName;
    }

    public void setName(String bookName){
        this.bookName = bookName;
    }

    @Column(name = "date")
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Column(name = "chapters")
    public Integer getChapters(){
        return chapters;
    }

    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    @Column(name = "records")
    public Integer getRecords(){
        return records;
    }

    public void setRecords(Integer records){
        this.records = records;
    }

    @Column(name = "wordCount")
    public Integer getWordCount(){
        return wordCount;
    }

    public void setWordCount(Integer wordCount){
        this.wordCount = wordCount;
    }
}




