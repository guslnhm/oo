public abstract class Pessoa{
    protected String nome;
    protected String telefone;
    protected String email;
    
    public abstract void setNome(String nome);
    public abstract void setTelefone(String telefone);
    public abstract void setEmail(String emamil);
    /*ATENCAO: DEFINIR A ASSINATURA DOS METODOS ABSTRATOS NA SUPERCLASSE,
    ISTO EH, DEFINIR QUAIS OS TIPOS DE PARAMETROS ESPERA RECEBER
    E ACHO QUE Q QUANTIDADE TAMBEM. EM RESUMO, ASSINATURA DEVE SER IDENTICA.*/
}