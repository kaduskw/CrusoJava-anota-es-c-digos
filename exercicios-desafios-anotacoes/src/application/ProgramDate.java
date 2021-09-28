package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//Formato da data em GMT
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2021-09-28T11:12:07Z"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());//correspondente ao numero de milisegundos
		Date x3 = new Date(0L);//0 milisegundos
		Date x4 = new Date(1000L * 60L *60L * 5L);
		
		System.out.println();//Padrão UTC
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println("Y1 : " + sdf1.format(y1));
		System.out.println("Y2 : " + sdf2.format(y2));
		System.out.println("Y3 : " + sdf2.format(y3));
		System.out.println("X1 : " + sdf2.format(x1));
		System.out.println("X2 : " + sdf2.format(x2));
		System.out.println("X3 : " + sdf2.format(x3));//Imprime 3 horas atrasado por conta do fuso horario
		System.out.println("X4 : " + sdf2.format(x4));//5 horas da manha de 01/01/1970(-3 por conta do fuso da maquina)
		System.out.println();//Padrão GMT
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println("Y1 : " + sdf3.format(y1));
		System.out.println("Y2 : " + sdf3.format(y2));
		System.out.println("Y3 : " + sdf3.format(y3));
		System.out.println("X1 : " + sdf3.format(x1));
		System.out.println("X2 : " + sdf3.format(x2));
		System.out.println("X3 : " + sdf3.format(x3));
		System.out.println("X4 : " + sdf3.format(x4));
		
	}

}
