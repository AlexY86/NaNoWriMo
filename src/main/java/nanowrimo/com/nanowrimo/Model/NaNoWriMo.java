package nanowrimo.com.nanowrimo.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class NaNoWriMo {

    @Id
    private long id;

    private String name;

    private Date date;

    private Integer chapters;

    private Integer records;

    private Integer wordCount;


    public NaNoWriMo() {

    }

    
    public NaNoWriMo(String name, Date date, Integer chapters, Integer records, Integer wordCount){
        this.name = name;
        this.date = date;
        this.chapters = chapters;
        this.records = records;
        this.wordCount = wordCount;

    }

    @Id
    public long getId() {
        return id;
    }

    @Column(name = "name")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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




