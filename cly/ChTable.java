package cly;
//��ʼ������һЩ���飬�洢�ؼ��֡�����������
public class ChTable 
{
    private String[] keyWord={"program","begin","end","if","then",
    		"else","const","procedure","var","do","while","call",
    		"read","write","odd"};

    private int symLength=100;
    private String[] symTable=new String[symLength];

    private int conLength=100;
    private String[] constTable=new String[conLength];

    public String[] getKeyWord()
    {
        return keyWord;
    }
    public String[] getSymTable()
    {
        return symTable;
    }
    public String[] getConstTable()
    {
        return constTable;
    }
}
