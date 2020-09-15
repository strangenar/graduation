import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

import javax.swing.*;


public final class Common
{
	private int countOfStudents;
	public int windowWidth = 800;
	public int windowHeight = 400;
	public UniversityMap map;
	public List <Academician> academicans;
	public List <Speaker> speakers;
	public List <Student> students;
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
	}
	private final String [] academicanFileNames = 
	{
		"Demo/HansDeNivelle.jpg","Demo/SelimTemizer.jpg","Demo/ShigeoKatsu.jpg","Demo/VassiliosTourassis.jpg"
	}
	private final String [] speakerNames = 
	{
		"Nazarbayev","Tokayev"
	}
	private final String [] speakerFileNames = 
	{
		"Demo/NursultanNazarbayev.jpg","Demo/KassymJomartTokayev.jpg"
	}
	public Common()
	{
		Vector2D v = new Vector2D(400,200);
		State state = new ZigZag();
		
		for(int i = 0; i < this.countOfStudents; i++)
		{
			students.add(Student(csci235StudentNames[i],v,state,this,""));
		}
		for(int i = 0; i < 4; i++)
		{
			academicans.add(Academician(academicanNames[i],v,state,this,academicanFileNames[i]));
		}
		for(int i = 0; i < 2; i++)
		{
			speakers.add(Speaker(speakerNames[i],v,state,this,speakerFileNames[i]));
		}
	}
	public int randomIt(int from, int, to)
	{
		
	}
	public void stepAllEntities()
	{
		for(int i = 0; i < this.countOfStudents; i++)
		{
			students[i].step();
		}
		for(int i = 0; i < 4; i++)
		{
			academicans[i].spet();
		}
	}
	public void drawAllEntities(Graphics2D g2d)
	{
		for(int i = 0; i < this.countOfStudents; i++)
		{
			students[i].draw(g2d);
		}
		for(int i = 0; i < 4; i++)
		{
			academicans[i].draw(g2d);
		}
	}
}


