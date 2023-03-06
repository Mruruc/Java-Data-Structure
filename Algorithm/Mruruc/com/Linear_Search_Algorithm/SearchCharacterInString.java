package Mruruc.com.Linear_Search_Algorithm;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchCharacterInString {

    public static boolean searchChar(String str,char element){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==element){
                return true;
            }
        }
        return false;
    }

    @Test
    public void test(){
        String str="Omer Uruc";
        char element1='u';
        assertTrue(SearchCharacterInString.searchChar(str,element1));
        char element2='a';
        assertFalse(SearchCharacterInString.searchChar(str,element2));
    }
}
