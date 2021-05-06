public class Dictionary
{
    Word[] dictionary = new Word[100];
    static int dictionarySize = 0;
    static String returnStatement = "";
   
    public Dictionary(Word[] dictionary)
    {
        this.dictionary = dictionary;
    }
    
    public Word[] getDictionary()
    {
        return this.dictionary;
    }
    
    public void addWord1(String original, String translation)
    {
        Word wordObject = new Word(original,translation);
        dictionary[dictionarySize] = wordObject;
        dictionarySize++;
    }
    
    public void addWord2(Word wordObject)
    {
        dictionary[dictionarySize] = wordObject;
        dictionarySize++;
    }
    
    public String translate(String original)
    {
        for(int i = 0; i < 100; i++)
        {
            if(dictionary[i].getOriginal() == original)
            {
                return dictionary[i].getTranslation();
            }
        }
        return ("Yok");
    }
    
    @Override
    public String toString()
    {
        for(int i = 0; i < 100; i++)
        {
            returnStatement += "(" + dictionary[i].getOriginal() + "," + dictionary[i].getTranslation() + ")\n";
        }
        
        return returnStatement;
    }
}
