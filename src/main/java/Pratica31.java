import static java.lang.Character.toUpperCase;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor
 */
public class Pratica31 {
    
    private static String MeuNome;
    private static Date inicio;
    private static GregorianCalendar dataNascimento;
    
    public static void main(String[] args) {

        MeuNome = "vICTor tHöLKen";
        inicio = new Date();

        String Maisculo = MeuNome.toUpperCase();
        String Sobrenome;
        char InicialNome;
        char InicialSobrenome;

        MeuNome = MeuNome.toUpperCase();

        System.out.println(MeuNome);

        Sobrenome = MeuNome.substring(8);
        Sobrenome = Sobrenome.toLowerCase();
        InicialSobrenome = MeuNome.charAt(7);
        InicialSobrenome = toUpperCase(InicialSobrenome);
        InicialNome = MeuNome.charAt(0);
        InicialNome = toUpperCase(InicialNome);

        System.out.println(InicialSobrenome + Sobrenome + ", " + InicialNome + ".");

        Calendar dataAtual = Calendar.getInstance();

        dataNascimento = new GregorianCalendar(1994, 9, 14);

        long dif = dataAtual.getTimeInMillis() - dataNascimento.getTimeInMillis();
        dif = dif/1000/60/60/24;
        
        System.out.println("Tempo em dias decorridos apartir do nascimento até hoje: " + dif);

        Date fim = new Date();

        long tempo = fim.getTime() - inicio.getTime();

        System.out.println(tempo + "ms");
    }

}
