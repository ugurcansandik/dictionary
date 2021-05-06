public class Word
{
    String original;
    String translation;
    
    public Word(String original, String translation)
    {
        this.original = original;
        this.translation = translation;
    }
    
    public String getOriginal()
    {
        return this.original;
    }
    
    public void setOriginal(String original)
    {
        this.original = original;
    }
    
    public String getTranslation()
    {
        return this.translation;
    }
    
    public void setTranslation(String translation)
    {
        this.translation = translation;
    }
    
    @Override
    public String toString()
    {
        return ("Original => " + this.original + "\nTranslation => " + this.translation);
    }
}
