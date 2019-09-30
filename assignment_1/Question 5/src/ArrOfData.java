//class that represents the data in an array

public class ArrOfData
{
	private String instructions = "INSERT \r\n" + 
			"Afrati           \r\n" + 
			"Ojha             \r\n" + 
			"POP \r\n" + 
			"POP \r\n" + 
			"POP \r\n" + 
			"Ng               \r\n" + 
			"Ezeife           \r\n" + 
			"Paquet           \r\n" + 
			"Maher            \r\n" + 
			"Thulasiram       \r\n" + 
			"Zsaki            \r\n" + 
			"POP \r\n" + 
			"POP \r\n" + 
			"Serrano          \r\n" + 
			"Talia            \r\n" + 
			"Verbrugge        \r\n" + 
			"Voigt            \r\n" + 
			"Chen             \r\n" + 
			"Zhao             \r\n" + 
			"Fazzinga         \r\n" + 
			"Damigos          \r\n" + 
			"Zeier            \r\n" + 
			"Papatheodorou    \r\n" + 
			"Cuadrado-gallego \r\n" + 
			"Lee              \r\n" + 
			"POP \r\n" + 
			"Vieira           \r\n" + 
			"Fengxing         \r\n" + 
			"Chen             \r\n" + 
			"Assels           \r\n" + 
			"Asaduzzaman      \r\n" + 
			"Evermann         \r\n" + 
			"INSERT \r\n" + 
			"Hooshsadat       \r\n" + 
			"Pager            \r\n" + 
			"Selmaoui-folcher \r\n" + 
			"Vieira           \r\n" + 
			"Ivanova          \r\n" + 
			"Bellatreche      \r\n" + 
			"Wadii            \r\n" + 
			"Santos           \r\n" + 
			"Shershakov       \r\n" + 
			"Luo              \r\n" + 
			"Taherian         \r\n" + 
			"Muller           \r\n" + 
			"Mokhtar          \r\n" + 
			"Speicher         \r\n" + 
			"Al-azwari        \r\n" + 
			"Canahuate        \r\n" + 
			"Song             \r\n" + 
			"POP \r\n" + 
			"Cervantes        \r\n" + 
			"Takayama         \r\n" + 
			"Boehmann         \r\n" + 
			"POP \r\n" + 
			"Cercone          \r\n" + 
			"Waseem           \r\n" + 
			"Rabby            \r\n" + 
			"Harrati          \r\n" + 
			"Costa            \r\n" + 
			"INSeRT \r\n" + 
			"POP \r\n" + 
			"POP \r\n" + 
			"Petrov           \r\n" + 
			"Graefe           \r\n" + 
			"Cansian          \r\n" + 
			"Junior           \r\n" + 
			"Ribeiro          \r\n" + 
			"Fidalgo          \r\n" + 
			"Costa            \r\n" + 
			"Neves            \r\n" + 
			"Silva            \r\n" + 
			"POP \r\n" + 
			"POP \r\n" + 
			"POP \r\n" + 
			"POP ";
	
	private String[] instrArr = instructions.split("(\\s)+"); //data is added to the array, removing whitespace
	
	public String[] getData()
	{
		return instrArr; 	//returns the data
	}
}
