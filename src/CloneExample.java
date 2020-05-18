class Rectangle implements Cloneable{
		private int width;
		private int height;
		
		public Rectangle(int w, int h){
			width = w;
			height = h;
		}
		public void setWidth(int w) {
			width = w;
		}
		public void setHeight(int h) {
			height = h;
		}
		public int area() {
			return 2*width*height;
		}
		
		protected Rectangle clone() throws CloneNotSupportedException {
	        return (Rectangle) super.clone();
	    }
		public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Rectangle other = (Rectangle) obj;
	        if (this.width != other.width) {
	            return false;
	        }
	        if (this.height != other.height) {
	            return false;
	        }
	        return true;
	    }
	
	}


public class CloneExample {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(12,14);
		Rectangle copy = null;
		try {
			copy= rec.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("copy != rec : " +(copy != rec));
		System.out.println("copy.getClass() == rec.getClass() : " + (copy.getClass() == rec.getClass()));
		System.out.println("copy.equals(rec) : " + copy.equals(rec));
		System.out.println("rec area:"+rec.area());
		System.out.println("copy area:"+copy.area());
		rec.setHeight(10);
		rec.setWidth(20);
		System.out.println("rec area:"+rec.area());
		System.out.println("copy area:"+copy.area());


	}

}
