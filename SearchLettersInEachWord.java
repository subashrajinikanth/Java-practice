/*
 * input	: sentence = This article has exposed new technologies and analytics
 * 			  search word of letter = 'at'
 * 			(search the letters in 'Sentence' string in each word)
 * output	: article
 * 			  analytics 
*/
public class SearchLettersInEachWord {

	public static void main(String[] args) {
		String sentence = "This article has exposed new technologies and analytics";
		String[] SearchWordOfLetters = { "a", "t" };

		String[] splitedSentence = sentence.split(" ");
		int n = splitedSentence.length;
		boolean a = false,b=false;
		boolean result =false;
		for (int i = 0; i < n; i++) {
			String word = splitedSentence[i];
			//System.out.println("-->"+word);
			if(word.contains(SearchWordOfLetters[0]) && word.contains(SearchWordOfLetters[1])) {
				System.out.println(word);
			}

		}
		

	}

}
