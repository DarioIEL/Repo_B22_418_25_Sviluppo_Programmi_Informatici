package lezione7_ENUM;

public enum EstensioneFile {

	PDF{
		public String estensione() {return ".pdf";}
		public boolean supportoImg() {return true;}		
	},
	
	GITHUB{
		public String estensione() {return ".md";}
		public boolean supportoImg() {return true;}
	},
	
	WORD{
		public String estensione() {return ".doc";}
		public boolean supportoImg() {return false;}
	};
	
	public abstract String estensione();
	public abstract boolean supportoImg();
}
