package Books.Example;

public class Books {
	
		int id;
		String Name;
		String Author;
		String publisher;
		int quality;
		
		@Override
		public String toString() {
			return "Books [id=" + id + ", Name=" + Name + ", Author=" + Author + ", publisher=" + publisher
					+ ", quality=" + quality + "]";
		}
	
		public Books(int id, String name, String author, String publisher, int quality) {
			super();
			this.id = id;
			this.Name = name;
			this.Author = author;
			this.publisher = publisher;
			this.quality = quality;
		}

		
}
