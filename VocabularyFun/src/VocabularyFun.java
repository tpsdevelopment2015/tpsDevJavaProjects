import java.util.ArrayList;

//This program was written to help my children with their vocabulary homework
public class VocabularyFun {

	public static void main(String[] args) {
		
		ArrayList <Word> myList = new <Word> ArrayList();
		myList.add(new Word("Run","To move your feet fast."));
		myList.add(new Word("Walk","To move your feet slow."));
		myList.add(new Word("Crawl","To move on hands and feet."));
		
		VocabularyList theList = new VocabularyList(null,null,myList);
		
		
		for(Word myWord : theList.getTheVocabList())
		{
			System.out.println(myWord.getWord() +": "+ myWord.getDefinition());		
		}
		
		
		
	}//end mail 

}//end class
