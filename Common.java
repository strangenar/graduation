//import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import javax.swing.*;
import java.util.*;

public final class Common
{
	private int countOfStudents = 137;
	public int windowWidth = 800;
	public int windowHeight = 400;
	public UniversityMap map;
	public List<Academician> academicans = new ArrayList<Academician>();
	public List<Speaker> speakers = new ArrayList<Speaker>();
	public List<Student> students = new ArrayList<Student>();
	private final String [] csci235StudentNames =
	{
	"Abay" , "Abilda" , "Abilkhaiyr" , "Ablan" , "Abylaikhan" , "Adil" , "Adilzhan" , "Adlet" , "Aidana" , "Aidyn" , "Aigerim" , "Aisana" ,
	"Akhmed" , "Akmyrza" , "Alan" , "Aldamzhar" , "Alexandra" , "Ali" , "Alibek" , "Alim" , "Alisher" , "Allan" , "Altair" , "Altynay" ,
	"Altynbek" , "Amangeldy" , "Amina" , "Anel" , "Angsar" , "Anuar" , "Ardan" , "Arman" , "Askhat" , "Assanali" , "Assem" , "Ayazhan" ,
	"Azamat" , "Azizkhan" , "Bagdat" , "Baglan" , "Bakdaulet" , "Bakdauren" , "Bakyt" , "Batyrbek" , "Batyrkhan" , "Bauyrzhan" , "Beibarys" ,
	"Bekzat" , "Bota" , "Damir" , "Dana" , "Danel" , "Daniyar" , "Darina" , "Dastan" , "Daulet" , "Dauren" , "Dnislam" , "Dulat" , "Eldar" ,
	"Emir" , "Galym" , "Gulnaz" , "Islam" , "Kamila" , "Kamilla" , "Karim" , "Kassym" , "Khadisha" , "Khafiz" , "Kuanysh" , "Kyran" , "Madi" ,
	"Madiyar" , "Magzhan" , "Makhambet" , "Mansur" , "Margulan" , "Maxim" , "Medet" , "Meirzhan" , "Miras" , "Mokhira" , "Murat" , "Nargiza" ,
	"Nartay" , "Nuradil" , "Nurbolat" , "Nurdaulet" , "Nurlan" , "Nursultan" , "Nurtileu" , "Olzhas" , "Rabbani" , "Raiymbek" , "Rakhat" ,
	"Ramazan" , "Ramilya" , "Rauan" , "Rollan" , "Rustem" , "Sabyr" , "Sagi" , "Saidgaffor" , "Saken" , "Salavat" , "Sandugash" , "Sanzhar" ,
	"Shapagat" , "Sherkhan" , "Shynggys" , "Shyngys" , "Tatyana" , "Temirlan" , "Temirzhan" , "Timur" , "Togzhan" , "Tomiris" , "Turgankhan" ,
	"Vladislav" , "Yeldos" , "Yerkali" , "Yerkhan" , "Yermek" , "Yernar" , "Yerzhan" , "Yussup" , "Zarina" , "Zhalgas" , "Zhanarys" , "Zhandos" ,
	"Zhangeldi" , "Zhannur" , "Zhansaya" , "Zhassulan" , "Zhibek" , "Zhuldyz"
	} ;	
	private final String [] academicanNames = 
	{
		"Nivelle","Temizer","Katsu","Tourassis"
	};
	private final String [] academicanFileNames = 
	{
		"Demo/HansDeNivelle.gif","Demo/SelimTemizer.gif","Demo/ShigeoKatsu.gif","Demo/VassiliosTourassis.gif"
	};
	private final String [] speakerNames = 
	{
		"Nazarbayev","Tokayev"
	};
	private final String [] speakerFileNames = 
	{
		"Demo/NursultanNazarbayev.gif","Demo/KassymJomartTokayev.gif"
	};
	public Common()
	{
		Vector2D vm = new Vector2D(0,0);
		State stateMap = new Stationary(vm);
		map = new UniversityMap("",vm,stateMap,this,"Demo/NUMap.jpg");

		Vector2D v = new Vector2D(10,20);
		State state = new ZigZag(v);
		
		for(int i = 0; i < this.countOfStudents; i++)
		{
			students.add(new Student(csci235StudentNames[i],v,state,this,""));
		}
		for(int i = 0; i < 4; i++)
		{
			academicans.add(new Academician(academicanNames[i],v,state,this,academicanFileNames[i]));
		}
		for(int i = 0; i < 2; i++)
		{
			speakers.add(new Speaker(speakerNames[i],v,state,this,speakerFileNames[i]));
		}
	}
	public int randomIt(int from, int to)
	{
		return 1;
	}
	public void stepAllEntities()
	{
		//for(int i = 0; i < this.countOfStudents; i++)

		Iterator studentsIterator = students.iterator();
		while(studentsIterator.hasNext())
		{
			((Student)studentsIterator.next()).step();
		}
		Iterator academicansIterator = academicans.iterator();
		while(academicansIterator.hasNext())
		{
			((Academician)academicansIterator.next()).step();
		}
	}
	public void drawAllEntities(Graphics2D g2d)
	{
		map.draw(g2d);
		Iterator studentsIterator = students.iterator();
		while(studentsIterator.hasNext())
		{
			((Student)studentsIterator.next()).draw(g2d);
		}
		Iterator academicansIterator = academicans.iterator();
		while(academicansIterator.hasNext())
		{
			((Academician)academicansIterator.next()).draw(g2d);
		}
	}
}



