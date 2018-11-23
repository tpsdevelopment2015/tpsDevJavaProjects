import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class VocabularyList implements Serializable
{

	Date theDate;
	String gradeLevel;
	ArrayList <Word> theVocabList;
	
	
	public VocabularyList(Date date, String gradeLevel, ArrayList <Word> vocabList )
	{
		this.theDate = date;
		this.gradeLevel = gradeLevel;
		this.theVocabList = vocabList;		
	}
	
	public Date getTheDate() {
		return theDate;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public ArrayList<Word> getTheVocabList() {
		return theVocabList;
	}
	
}//end class
